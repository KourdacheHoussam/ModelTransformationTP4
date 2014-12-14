package fr.houssam.transformation.perform;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import model.ModelPackage;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLMapImpl;

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

	// private BasicClass classToTransform;

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
	 * Recuperer toutes les machines � �tats: prenant en parametre une classe,
	 * et qui retourne les machines a etat la decrivant.
	 */
	@SuppressWarnings("null")
	public static ArrayList<StateMachine> getAllStateMachines(Class maclass) {
		// on r�cup�re la liste de tous les comportenment de la classe
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
	 * m�thode prenant en parametre une machine a etats et qui verifie qu'elle
	 * est correctement formee pour notre exercice, c'est-a-dire qu'elle ne
	 * contient qu'une seule r�gion.
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
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
					"uml", new XMIResourceFactoryImpl());
			resource = (new ResourceSetImpl()).createResource(uriUri);
			XMLResource.XMLMap xmlMap = new XMLMapImpl();
			xmlMap.setNoNamespacePackage(pack);
			Map options = new HashMap();
			options.put(XMLResource.OPTION_XML_MAP, xmlMap);
			resource.load(options);
		} catch (Exception e) {
			System.out.println("Erreur de chargemement du model : " + uri);
			e.printStackTrace();
		}
		return resource;
	}

	/**
	 * Sauvegarde du modele genere
	 */
	public static void SaveModel(String uri, EObject root) {
		Resource resource = null;
		try {
			URI uriUri = URI.createURI(uri);
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
					"statemachine", new XMIResourceFactoryImpl());
			resource = (new ResourceSetImpl()).createResource(uriUri);
			resource.getContents().add(root);
			resource.save(null);
		} catch (Exception e) {
			System.out.println("Erreur lors de la sauvagarde du modele");
			e.printStackTrace();
		}
	}

	/**
	 * Main Class
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		Resource resource;
		try {
			// Je charge l'intance uml.uml de mon m�ta-modele
			resource = loadModel("umlmodel/uml.uml", ModelPackage.eINSTANCE);
			if (resource == null) {
				System.err.print("Erreur de chargement du mod�le");
			}
			// Instruction recuperant le modele sous forme d'arbre � partir de
			// la classe racine Model
			//Model umlp=(Model)resource.getContents().get(0);
			String nomModel;
			
		} catch (Exception e) {
			System.out.println("Some problem");
			e.printStackTrace();
		}
	}
}
