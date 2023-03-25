package Abstract_Factory_Singleton;

public abstract class CarFactory implements Buildable, Repairable, Restorable{
    String FACTORY_TYPE = "car";
}
