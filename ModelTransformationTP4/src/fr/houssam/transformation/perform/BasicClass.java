package fr.houssam.transformation.perform;

import fr.houssam.transformation.model.statemachine.StateMachine;

public class BasicClass {
	private StateMachine statemachine;
	
	public BasicClass(){}
	
	public StateMachine getStatemachine() {
		return statemachine;
	}

	public void setStatemachine(StateMachine statemachine) {
		this.statemachine = statemachine;
	}
	
}
