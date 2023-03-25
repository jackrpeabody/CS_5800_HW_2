package Abstract_Factory_Singleton;

public class Client {
    
    public static void main(String[] args){

        /*
        Create all three of the car factories and all three of the airplane factories. Then attempt to create a second Tesla factory and Airbus factory.
        */

        TransportationFactory airplane_brand_factory = TransportationFactoryCreator.createTransportationFactory("airplane factory");

        airplane_brand_factory.getDescription();
        AirplaneFactory airbus_factory = airplane_brand_factory.createAirplaneFactoryObj("airbus factory");
        airbus_factory.build();
        AirplaneFactory boeing_factory = airplane_brand_factory.createAirplaneFactoryObj("boeing factory");
        boeing_factory.repair();
        AirplaneFactory embraer_factory = airplane_brand_factory.createAirplaneFactoryObj("embraer factory");
        embraer_factory.restore();
        System.out.println();


        TransportationFactory car_brand_factory = TransportationFactoryCreator.createTransportationFactory("car factory");

        car_brand_factory.getDescription();
        CarFactory tesla_factory = car_brand_factory.createCarFactoryObj("tesla factory");
        tesla_factory.build();
        CarFactory honda_factory = car_brand_factory.createCarFactoryObj("honda factory");
        honda_factory.repair();
        CarFactory porsche_factory = car_brand_factory.createCarFactoryObj("porsche factory");
        porsche_factory.restore();
        System.out.println();

        TransportationFactory boat_brand_factory = TransportationFactoryCreator.createTransportationFactory("boat factory");

        boat_brand_factory.getDescription();
        BoatFactory sea_ray_factory = boat_brand_factory.createBoatFactoryObj("searay factory");
        sea_ray_factory.build();
        BoatFactory mastercraft_factory = boat_brand_factory.createBoatFactoryObj("mastercraft factory");
        mastercraft_factory.repair();
        BoatFactory bertram_factory = boat_brand_factory.createBoatFactoryObj("bertram factory");
        bertram_factory.restore();

        System.out.println("\nAttempt to create a second Tesla factory and Airbus factory:\n");
        CarFactory tesla_factory2 = car_brand_factory.createCarFactoryObj("tesla factory");
        System.out.println("tesla_factory hashcode: " + tesla_factory.hashCode() + ", tesla_factory2 hashcode: " + tesla_factory2.hashCode());
        AirplaneFactory airbus_factory2 = airplane_brand_factory.createAirplaneFactoryObj("airbus factory");
        System.out.println("airbus_factory hashcode: " + airbus_factory.hashCode() + ", tairbus_factory2 hashcode: " + airbus_factory2.hashCode());

    

    }

}
