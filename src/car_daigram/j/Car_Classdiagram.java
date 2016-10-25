package car_daigram.j;


import hu.elte.txtuml.api.layout.ClassDiagram;
import hu.elte.txtuml.api.layout.Row;
import hu.elte.txtuml.api.layout.Column;
import car_diagram.Auto_gear;
import car_diagram.Car;
import car_diagram.Engine;
import car_diagram.Engine_type;
import car_diagram.Family_car;
import car_diagram.Fuel;
import car_diagram.Gear;
import car_diagram.Luxury_car;
import car_diagram.Manufacturer;
import car_diagram.Manul_gear;
import car_diagram.Model;
import car_diagram.Sport_car;
import car_diagram.Type;
import car_diagram.Wheels;
import car_diagram.Car_owner;
import car_diagram.Electric;



public class Car_Classdiagram extends ClassDiagram {
    
	@Row({Model.class, Car_owner.class ,Manufacturer.class, Wheels.class, Engine.class})
	@Column({Manufacturer.class, Car.class})
	@Column({Wheels.class, Gear.class})
	@Column({Car_owner.class, Type.class})
	@Row({Sport_car.class, Family_car.class, Luxury_car.class,Manul_gear.class, Auto_gear.class, Fuel.class, Electric.class})
	@Column({Engine.class, Engine_type.class})
	

	
	class Car_diagramLayout extends Layout{}
}
