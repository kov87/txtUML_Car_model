package car_daigram.j;


import car_diagram.Gear;
import car_diagram.Gear.Forward;
import car_diagram.Gear.Init;
import car_diagram.Gear.Neutral;
import car_diagram.Gear.Reverse;
import hu.elte.txtuml.api.layout.Column;
import hu.elte.txtuml.api.layout.Row;
import hu.elte.txtuml.api.layout.StateMachineDiagram;


public class Gear_SMDiagram extends StateMachineDiagram <Gear>{
	
	@Row({Init.class,Neutral.class,Forward.class})
	@Column({Forward.class,Reverse.class})
	class Car_diagramLayout extends Layout{}

}


