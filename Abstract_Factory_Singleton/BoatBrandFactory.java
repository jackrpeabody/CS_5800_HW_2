package Abstract_Factory_Singleton;

public class BoatBrandFactory extends TransportationFactory{
    public static BoatFactory getBoatFactory(String type){
        if(type.equalsIgnoreCase("searay factory")){
            return SeaRayFactory.getInstance();
        }
        else if(type.equalsIgnoreCase("mastercraft factory")){
            return MastercraftFactory.getInstance();
        }
        else if(type.equalsIgnoreCase("bertram factory")){
            return BertramFactory.getInstance();
        }
        else{
            System.out.println("Please specify a valid type");
            return null;
        }
    }

    public BoatFactory createBoatFactoryObj(String type){
        BoatFactory boat_factory = getBoatFactory(type);
        return boat_factory;
    }

    public AirplaneFactory createAirplaneFactoryObj(String type){return null;}
    public CarFactory createCarFactoryObj(String type){return null;}

    public void getDescription(){
        System.out.println("Boat factories:\n");
    }
}