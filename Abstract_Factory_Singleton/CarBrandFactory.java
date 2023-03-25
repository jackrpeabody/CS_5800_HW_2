package Abstract_Factory_Singleton;

public class CarBrandFactory extends TransportationFactory{
    public static CarFactory getCarFactory(String type){
        if(type.equalsIgnoreCase("honda factory")){
            return HondaFactory.getInstance();
        }
        else if(type.equalsIgnoreCase("porsche factory")){
            return PorscheFactory.getInstance();
        }
        else if(type.equalsIgnoreCase("tesla factory")){
            return TeslaFactory.getInstance();
        }
        else{
            System.out.println("Please specify a valid type");
            return null;
        }
    }

    public CarFactory createCarFactoryObj(String type){
        CarFactory car_factory = getCarFactory(type);
        return car_factory;
    }

    public AirplaneFactory createAirplaneFactoryObj(String type){return null;}
    public BoatFactory createBoatFactoryObj(String type){return null;}

    public void getDescription(){
        System.out.println("Car factories:\n");
    }
}
