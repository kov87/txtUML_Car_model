package car.main.gear;

import java.io.IOException;

import car_diagram.Back_to_Neutral;
import car_diagram.Gear;
import car_diagram.Going_Forward;
import car_diagram.Going_reverse;
import hu.elte.txtuml.api.model.Action;
import hu.elte.txtuml.api.model.execution.ModelExecutor;

public class Main {
	
	static Gear gear;
	
	static void init(){
		gear = Action.create(Gear.class);
		Action.start(gear);
	}
	
	public static void main(String[] args) throws IOException {
		ModelExecutor.create().setTraceLogging(true).start(Main::init).awaitInitialization();
		//System.in.read();
		Action.send(new Going_Forward(), gear);
		Action.send(new Back_to_Neutral(), gear);
		Action.send(new Going_reverse(), gear);
		Action.send(new Back_to_Neutral(), gear);
		
		
		
		
		
	}
}


