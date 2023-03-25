package Abstract_Factory_Singleton;

public abstract class TransportationFactory {
    abstract void getDescription();
    abstract AirplaneFactory createAirplaneFactoryObj(String type);
    abstract BoatFactory createBoatFactoryObj(String type);
    abstract CarFactory createCarFactoryObj(String type);
}
