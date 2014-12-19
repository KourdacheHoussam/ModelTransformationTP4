package fr.houssam.transformation.perform;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.types.*;
import org.eclipse.uml2.uml.Class;

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

import fr.houssam.transformation.model.statemachine.Behavior;
import fr.houssam.transformation.model.statemachine.CallEvent;
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
		EList<Behavior> behaviors = (EList<Behavior>) maclass.getClassifierBehavior();
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
			EPackage.Registry.INSTANCE.put("'http://www.eclipse.org/uml2/5.0.0/UML",UMLPackage.eINSTANCE);
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("uml", new XMIResourceFactoryImpl());
			resource = (new ResourceSetImpl()).createResource(uriUri);
			XMLResource.XMLMap xmlMap = new XMLMapImpl();
			xmlMap.setNoNamespacePackage(pack);
			Map<String, XMLMap> options = new HashMap<String, XMLMap>();
			options.put(XMLResource.OPTION_XML_MAP, xmlMap);
			resource.load(options);
		} catch (Exception e) {
			System.err.println("ERREUR chargement du mod�le : " + e + "\n");
			e.printStackTrace();
		}
		return resource;
	}

	/**
	 * Sauvegarde du modele genere
	 */
	public static void SaveModel(String uri, EObject data) {
		Resource resource = null;
		try {
			URI uriUri = URI.createURI(uri);
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
			resource = (new ResourceSetImpl()).createResource(uriUri);
			resource.getContents().add(data);
			resource.save(Collections.EMPTY_MAP);
			System.err.println("Saved :) !");
		} catch (Exception e) {
			System.err.println("ERREUR lors de la sauvegarde du mod�le : " + e);
			e.printStackTrace();
		}
	}

	/**
	 * Main Class
	 * 
	 * @param args
	 * @throws IOException 
	 */

	public static void main(String[] args) throws IOException {

		System.err.println("****************************");
		System.err.println("*** Model Transformation ***");
		System.err.println("****************************");

		// Je charge l'intance uml.uml de mon m�ta-modele
		Resource resource = loadModel("model/modelpapyrus.uml", UMLPackage.eINSTANCE);
		if(resource !=null){
			System.err.print("Le mod�le est charg�.\n \n ");
		}
		if (resource == null) {
			System.err.print("Erreur de chargement du mod�le. \n");
		}
		
		
		// Instruction recuperant le modele sous forme d'arbre � partir de la classe racine Model
		Model initialModel=(Model)resource.getContents().get(0);			
		// Creation d'un package
		org.eclipse.uml2.uml.Package newPackage=UMLFactory.eINSTANCE.createPackage();
		//Creation d'un model 2 
		Model newModel=(Model) UMLFactory.eINSTANCE.createModel();
				
		//Ajout du package ds le model
		newModel.setName(initialModel.getName());
		newPackage.setName("PackOne");
		newModel.getPackagedElements().add(newPackage);
		
		//Get the name of class model
		PackageableElement  modelPackage_SM=(PackageableElement) initialModel.getPackagedElement("MyStateMachine");
		
		org.eclipse.uml2.uml.Class c = (org.eclipse.uml2.uml.Class) initialModel.getPackagedElements().get(1);
		
		
		//Abstract class :TD
		org.eclipse.uml2.uml.Class abstractClass=(org.eclipse.uml2.uml.Class) UMLFactory.eINSTANCE.createClass();
		abstractClass.setIsAbstract(true);
		abstractClass.setName("State");
		
		//First Main Class
		org.eclipse.uml2.uml.Class theClass=UMLFactory.eINSTANCE.createClass();
		theClass.setName(c.getName());
		
		//Ajout des properties dans la class
		for(Property currentProperty : c.getOwnedAttributes()){
			Property newProperty=UMLFactory.eINSTANCE.createProperty();
			newProperty.setName(currentProperty.getName());
			newProperty.setVisibility(currentProperty.getVisibility());
			theClass.getOwnedAttributes().add(newProperty);
		}
		//Ajout des operations dans la classe
		for(org.eclipse.uml2.uml.Operation currentOperation : c.getOwnedOperations()){
			org.eclipse.uml2.uml.Operation newOperation=(org.eclipse.uml2.uml.Operation) UMLFactory.eINSTANCE.createOperation();
			newOperation.setName(currentOperation.getName());
			newOperation.setVisibility(currentOperation.getVisibility());
			theClass.getOwnedOperations().add(newOperation);
		}
		
		//Get the states
		org.eclipse.uml2.uml.StateMachine stateMachine=(org.eclipse.uml2.uml.StateMachine) initialModel.getPackagedElements().get(1);
		org.eclipse.uml2.uml.Region region=(org.eclipse.uml2.uml.Region)stateMachine.getRegions().get(0);
		
		// Vertices LOOOOP
		for(org.eclipse.uml2.uml.Vertex currentVertex: region.getSubvertices()){
			org.eclipse.uml2.uml.Class stateClass=UMLFactory.eINSTANCE.createClass();
			stateClass.setName(currentVertex.getName());
			org.eclipse.uml2.uml.Generalization generalization=UMLFactory.eINSTANCE.createGeneralization();
			generalization.setGeneral(abstractClass);
			stateClass.getGeneralizations().add(generalization);
			newPackage.getPackagedElements().add(stateClass);
		}
		
		//bind to abstract class
		org.eclipse.uml2.uml.Property bindIt=UMLFactory.eINSTANCE.createProperty();
		bindIt.setType(abstractClass);
		bindIt.setName("state");
		bindIt.setVisibility(null);
		
		newPackage.getPackagedElements().add(theClass);
		newPackage.getPackagedElements().add(abstractClass);
		
		
		
		/*************************
		 * Les sorties consoles
		 *************************/
		System.out.println(" Nom du model : "+initialModel.getName()+"\n");		
		System.out.println(" Nom du package SM : "+modelPackage_SM.getName()+"\n");
		System.out.println(" Class c name: "+theClass.getName()+"\n");
		System.out.println(" State machine  name: "+stateMachine.getName()+"\n");
		System.out.println(" Region  name: "+region.getName()+"\n");
	
		
		
		/** SAVE the model **/
		
		SaveModel("generatedmodel/generated.xmi", newModel);		
	}
}
