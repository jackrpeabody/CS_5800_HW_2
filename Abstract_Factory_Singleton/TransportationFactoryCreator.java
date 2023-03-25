package Abstract_Factory_Singleton;

public class TransportationFactoryCreator {
    
    public static TransportationFactory createTransportationFactory(String type){
        if(type.equalsIgnoreCase("car factory")){
            return new CarBrandFactory();
        }
        else if(type.equalsIgnoreCase("airplane factory")){
            return new AirplaneBrandFactory();
        }
        else if(type.equalsIgnoreCase("boat factory")){
            return new BoatBrandFactory();
        }
        else{
            System.out.println("Please specify a valid type");
            return null;
        }
    }
}
