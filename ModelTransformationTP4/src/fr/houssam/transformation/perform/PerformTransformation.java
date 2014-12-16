package fr.houssam.transformation.perform;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EFactory;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.types.*;

import model.ModelPackage;

import org.eclipse.emf.common.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.XMLResource.XMLMap;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLMapImpl;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.types.*;
import org.eclipse.uml2.types.*;

import fr.houssam.transformation.model.statemachine.Behavior;
import fr.houssam.transformation.model.statemachine.CallEvent;
import fr.houssam.transformation.model.statemachine.Class;
import fr.houssam.transformation.model.statemachine.Operation;
import fr.houssam.transformation.model.statemachine.Region;
import fr.houssam.transformation.model.statemachine.State;
import fr.houssam.transformation.model.statemachine.StateMachine;
import fr.houssam.transformation.model.statemachine.StatemachineFactory;
import fr.houssam.transformation.model.statemachine.StatemachinePackage;
import fr.houssam.transformation.model.statemachine.Transition;
import fr.houssam.transformation.model.statemachine.Trigger;
import fr.houssam.transformation.model.statemachine.Vertex;

public class PerformTransformation {

	/** Perform the tranforomation:main class */

	public static void performIT(Class maclass) {
		// Je charge l'instance map.xmi du meta-modle maps.ecore
		Resource resource = loadModel("model/StateMachine.ecore",
				StatemachinePackage.eINSTANCE);
		if (resource == null) {
			System.err.println(" Erreur de chargement du modele");
		}
		// Instruction recuperant le modele sous forme d'arbre a partir de la
		// classe racine "class"
		Class uml = (Class) resource.getContents().get(0);
		StatemachineFactory.eINSTANCE.createRegion();
	}

	/**
	 * Ajout des etats
	 * 
	 * @param sm
	 */
	public static void AddStates(StateMachine sm) {
		ArrayList<State> states = collecteStates(sm);
		for (int i = 0; i < states.size(); i++) {
			State s = StatemachineFactory.eINSTANCE.createState();
		}
	}

	/**
	 * Ajout des operations
	 * 
	 * @param sm
	 */
	public static void AddOperations(StateMachine sm) {
		ArrayList<Operation> ops = collecteStatesTriggeredOperations(sm);
		for (int i = 0; i < ops.size(); i++) {
			Operation o = StatemachineFactory.eINSTANCE.createOperation();

		}
	}

	/**
	 * Recuperer toutes les machines à états: prenant en parametre une classe,
	 * et qui retourne les machines a etat la decrivant.
	 */
	@SuppressWarnings("null")
	public static ArrayList<StateMachine> getAllStateMachines(Class maclass) {
		// on récupère la liste de tous les comportenment de la classe
		EList<Behavior> behaviors = maclass.getOwnedBehavior();
		// bahaviors with statemachine type
		EList<Behavior> statebehaviors = null;
		ArrayList<StateMachine> results = new ArrayList<StateMachine>();
		// on parcours les comportements
		for (int i = 0; i < behaviors.size(); i++) {
			if (behaviors.get(i) instanceof StateMachine) {
				statebehaviors.add(behaviors.get(i));
				results.add((StateMachine) behaviors.get(i));
			}
		}
		return results;
	}

	/**
	 * méthode prenant en parametre une machine a etats et qui verifie qu'elle
	 * est correctement formee pour notre exercice, c'est-a-dire qu'elle ne
	 * contient qu'une seule région.
	 */
	public static boolean checkStateMachine(StateMachine sm) {
		return sm.getRegion().size() == 1;
	}

	/**
	 * Ecrivez en pseudo code une methode prenant en parametre une machine a
	 * etat bien formee pour notre exercice, et qui retourne la liste des etats
	 * la composant.
	 */

	@SuppressWarnings("null")
	public static ArrayList<State> collecteStates(StateMachine sm) {
		ArrayList<State> results = null;
		if (checkStateMachine(sm)) {
			EList<Region> regions = sm.getRegion();
			Region r = regions.get(0);
			EList<Vertex> vertexes = r.getSubvertex();
			for (int j = 0; j < vertexes.size(); j++) {
				if (vertexes.get(j) instanceof State) {
					results.add((State) vertexes.get(j));
				}
			}
		}
		return results;
	}

	/**
	 * Ecrivez en pseudo code une methode prenant en parametre une machine a
	 * etat bien formee pour notre exercice, et qui retourne la liste des
	 * operations se trouvant comme trigger dans la machine a etat
	 */

	public static ArrayList<Operation> collecteStatesTriggeredOperations(
			StateMachine sm) {
		ArrayList<Operation> ops = new ArrayList<Operation>();
		if (checkStateMachine(sm)) {
			EList<Region> regions = sm.getRegion();
			Region r = regions.get(0);
			EList<Transition> transitions = r.getTransition();
			for (int i = 0; i < transitions.size(); i++) {
				Transition t = transitions.get(i);
				EList<Trigger> triggers = t.getTrigger();
				for (int j = 0; j < triggers.size(); j++) {
					Trigger tr = triggers.get(j);
					CallEvent e = (CallEvent) tr.getEvent();
					ops.add(e.getOperation());
				}
			}
		}
		return ops;
	}

	/**
	 * d'une methode qui appliquerait le patron State a une classe donnee
	 */
	public static void setStatePattern(Class maclass) {

	}

	/**
	 * Load the ecore model
	 * 
	 * @param model
	 */
	@SuppressWarnings("unchecked")
	public static Resource loadModel(String uri, EPackage pack) {
		Resource resource = null;
		try {
			URI uriUri = URI.createURI(uri);
			EPackage.Registry.INSTANCE.put("'http://www.eclipse.org/uml2/5.0.0/UML",UMLPackage.eINSTANCE);
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("uml", new XMIResourceFactoryImpl());
			resource = (new ResourceSetImpl()).createResource(uriUri);
			XMLResource.XMLMap xmlMap = new XMLMapImpl();
			xmlMap.setNoNamespacePackage(pack);
			Map<String, XMLMap> options = new HashMap<String, XMLMap>();
			options.put(XMLResource.OPTION_XML_MAP, xmlMap);
			resource.load(options);
		} catch (Exception e) {
			System.err.println("ERREUR chargement du modèle : " + e + "\n");
			e.printStackTrace();
		}
		return resource;
	}

	/**
	 * Sauvegarde du modele genere
	 */
	public static void SaveModel(String uri, StateMachine data) {
		Resource resource = null;
		try {
			URI uriUri = URI.createURI(uri);
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
			resource = (new ResourceSetImpl()).createResource(uriUri);
			resource.getContents().add(data);
			resource.save(Collections.EMPTY_MAP);
		} catch (Exception e) {
			System.err.println("ERREUR lors de la sauvegarde du modèle : " + e);
			e.printStackTrace();
		}
	}

	/**
	 * Main Class
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		System.err.println("****************************");
		System.err.println("*** Model Transformation ***");
		System.err.println("****************************");

		// Je charge l'intance uml.uml de mon méta-modele
		Resource resource = loadModel("model/modelpapyrus.uml", UMLPackage.eINSTANCE);
		if(resource !=null){
			System.err.print("Le modèle est chargé ");
		}
		if (resource == null) {
			System.err.print("Erreur de chargement du modèle");
		}
		// Instruction recuperant le modele sous forme d'arbre à partir de la classe racine Model
		Model umlp=(Model)resource.getContents().get(0);		
		
		String nomModel=umlp.getName();
		
		EList<PackageableElement> package_element=umlp.getPackagedElements();
		System.out.println("\n \n Nom du modèle est : " + nomModel);
		for(int v=0; v<package_element.size(); v++){
			System.out.println("\n \n Nom du modèle est : " + package_element. );
		}
		System.out.println("\n \n Nom du modèle est : " + package_element. );
		
		
		/**********************
		 ** SAVE the model ****
		 **********************/
		StatemachinePackage.eINSTANCE.eClass();
		StatemachineFactory factory=StatemachineFactory.eINSTANCE;
		
		//Creation du contenu du model : une machine à état et une region
		StateMachine machine=factory.createStateMachine();
		Region region=factory.createRegion();
		
		
		
		umlp.getImportedPackages();
		
		//SaveModel("model/generated.ecore", machine);
		
	}
}
