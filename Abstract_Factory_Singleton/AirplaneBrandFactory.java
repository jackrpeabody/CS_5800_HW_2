package Abstract_Factory_Singleton;

public class AirplaneBrandFactory extends TransportationFactory{
    public static AirplaneFactory getAirplaneFactory(String type){
        if(type.equalsIgnoreCase("airbus factory")){
            return AirbusFactory.getInstance();
        }
        else if(type.equalsIgnoreCase("boeing factory")){
            return BoeingFactory.getInstance();
        }
        else if(type.equalsIgnoreCase("embraer factory")){
            return EmbraerFactory.getInstance();
        }
        else{
            System.out.println("Please specify a valid type");
            return null;
        }
    }

    public AirplaneFactory createAirplaneFactoryObj(String type){
        AirplaneFactory airplane_factory = getAirplaneFactory(type);
        return airplane_factory;
    }

    public BoatFactory createBoatFactoryObj(String type){return null;}
    public CarFactory createCarFactoryObj(String type){return null;}

    public void getDescription(){
        System.out.println("Airplane factories:\n");
    }
}