package Abstract_Factory_Singleton;

public class AirbusFactory extends AirplaneFactory{

    final String BRAND_NAME = "Airbus";

    private static AirbusFactory factory = null;
    
    private AirbusFactory(){}

    public static AirbusFactory getInstance(){
        if(factory == null){
            factory = new AirbusFactory();
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
