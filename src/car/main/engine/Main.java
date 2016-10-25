package car.main.engine;
import java.io.IOException;

import car_diagram.Engine;
import car_diagram.EngineOff;
import car_diagram.EngineOn;
import hu.elte.txtuml.api.model.Action;
import hu.elte.txtuml.api.model.execution.ModelExecutor;

public class Main {
	static Engine engine;
	
	static void init(){
			engine = Action.create(Engine.class);
			Action.start(engine);
	}

	public static void main(String[] args) throws IOException {
		ModelExecutor.create().setTraceLogging(true).start(Main::init);
		System.in.read();
		Action.send(new EngineOn(), engine);
		Action.send(new EngineOff(), engine);
		
		// TODO Auto-generated method stub

	}

}
