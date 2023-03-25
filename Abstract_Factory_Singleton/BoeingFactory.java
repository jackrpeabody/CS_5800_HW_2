package Abstract_Factory_Singleton;

public class BoeingFactory extends AirplaneFactory{

    final String BRAND_NAME = "Boeing";

    private static BoeingFactory factory = null;
    
    private BoeingFactory(){}

    public static BoeingFactory getInstance(){
        if(factory == null){
            factory = new BoeingFactory();
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