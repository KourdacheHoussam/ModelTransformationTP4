package fr.houssam.transformation.perform;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLMapImpl;

import fr.houssam.transformation.model.statemachine.Behavior;
import fr.houssam.transformation.model.statemachine.Class;
import fr.houssam.transformation.model.statemachine.Region;
import fr.houssam.transformation.model.statemachine.State;
import fr.houssam.transformation.model.statemachine.StateMachine;
import fr.houssam.transformation.model.statemachine.Vertex;

public class PerformTransformation {
	
	/** Perform the tranforomation:main class */
	public static void performIT(Class maclass){
		
	}
	
	/**
	 * Recuperer toutes les machines à états: prenant en parametre une classe, et qui retourne
	 * les machines a etat la decrivant.
	 */
	@SuppressWarnings("null")
	public static ArrayList<StateMachine> getAllStateMachines(Class maclass){
		//on récupère la liste de tous les comportenment de la classe
		EList<Behavior> behaviors=maclass.getOwnedBehavior();
		// bahaviors with statemachine type
		EList<Behavior> statebehaviors=null;
		ArrayList<StateMachine> results=new ArrayList<StateMachine>();
		//on parcours les comportements
		for(int i=0; i<behaviors.size(); i++){
			if(behaviors.get(i) instanceof StateMachine ){
				statebehaviors.add(behaviors.get(i));
				results.add((StateMachine) behaviors.get(i));
			}
		}
		return results;		
	}	
	/**
	 * méthode prenant en parametre une machine a etats et qui
	 * verifie qu'elle est correctement formee pour notre exercice, c'est-a-dire qu'elle ne contient qu'une seule
	 * région.
	 */
	public static boolean checkStateMachine(StateMachine sm){		
		return sm.getRegion().size() ==1;
	}	
	
	/**
	 * Ecrivez en pseudo code une methode prenant en parametre une machine a etat bien
	 * formee pour notre exercice, et qui retourne la liste des etats la composant.
	 */
	
	public static ArrayList<State> collecteStates(StateMachine sm){
		ArrayList<State> results = null;
		if(checkStateMachine(sm)){
			EList<Region> regions=sm.getRegion();
			Region r=regions.get(0);
			EList<Vertex> vertexes=r.getSubvertex();
			for(int j=0; j<vertexes.size(); j++){
				if(vertexes.get(j) instanceof  State){
					results.add((State) vertexes.get(j));
				}
			}
		}
		return results;
	}
	
	
	/**
	 * Ecrivez en pseudo code une methode prenant en parametre une machine a etat bien
	 * formee pour notre exercice, et qui retourne la liste des operations se trouvant comme trigger dans la
	 * machine a etat
	 */
	
	public static ArrayList<State> collecteStatesTriggered(StateMachine sm){
		
		return  null;
	}
	
	
	
	/**
	 *  Load the ecore model
	 *  @param model
	 */
	public static Resource loadModel(String model, String uri, EPackage pack){
		Resource resource=null;
		try{
			Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		    Map<String, Object> m = reg.getExtensionToFactoryMap();
		    m.put("statemachine", new XMIResourceFactoryImpl()); 
			
		    //Récupérer une nouvelle resourceSet
		    ResourceSet resSet=new ResourceSetImpl();
			URI file_uri=URI.createURI(uri); //crée une uri
		    //création de la resource
		    resource=resSet.createResource(file_uri);
		    
		    XMLResource.XMLMap xmlMap=new XMLMapImpl();
		    xmlMap.setNoNamespacePackage(pack);
		    
		    Map options=new HashMap();
		    options.put(XMLResource.OPTION_XML_MAP, xmlMap);
		    resource.load(options);//charge le model		    
		    
		}catch(Exception e){
			System.out.println("Erreur de chargemement du model : "+model);
			e.printStackTrace();
		}
		return resource;
	}
	
	/**
	 * Sauvegarde du modele genere
	 */
	public static void SaveModel(String uri,EObject root ){
		Resource resource=null;
		try{
			URI uriUri=URI.createURI(uri);
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("statemachine", new XMIResourceFactoryImpl());
		    resource = (new ResourceSetImpl()).createResource(uriUri);		    
		    resource.getContents().add(root);
		    resource.save(null);
		}catch(Exception e){
			System.out.println("Erreur lors de la sauvagarde du modele");
			e.printStackTrace();
		}
	}
	
	
	
}
