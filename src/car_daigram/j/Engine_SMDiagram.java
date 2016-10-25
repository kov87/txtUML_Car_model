package car_daigram.j;




import car_diagram.Engine;
import car_diagram.Engine.Init;
import car_diagram.Engine.Off;
import car_diagram.Engine.On;


import hu.elte.txtuml.api.layout.Column;
import hu.elte.txtuml.api.layout.Row;
import hu.elte.txtuml.api.layout.StateMachineDiagram;


public class Engine_SMDiagram extends StateMachineDiagram<Engine> {

	
	@Row({Init.class, Off.class})
	@Column({Off.class, On.class})
	class Car_diagramLayout extends Layout{}

}
