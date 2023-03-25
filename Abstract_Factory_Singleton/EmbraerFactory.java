package Abstract_Factory_Singleton;

public class EmbraerFactory extends AirplaneFactory{

    final String BRAND_NAME = "Embraer";

    private static EmbraerFactory factory = null;
    
    private EmbraerFactory(){}

    public static EmbraerFactory getInstance(){
        if(factory == null){
            factory = new EmbraerFactory();
        }
        return factory;
    }
    
    @Override
    public void build(){
        System.out.println(BRAND_NAME + " built a " + FACTORY_TYPE + ".");
    }

    @Override
    public void repair(){
        System.out.println(BRAND_NAME + " repaired a " + FACTORY_TYPE + ".");
    }

    @Override
    public void restore(){
        System.out.println(BRAND_NAME + " restored a " + FACTORY_TYPE + ".");
    }
    
}
