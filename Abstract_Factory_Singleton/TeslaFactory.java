package Abstract_Factory_Singleton;

public class TeslaFactory extends CarFactory{

    final String BRAND_NAME = "Tesla";
    
    private static TeslaFactory factory = null;
    
    private TeslaFactory(){}

    public static TeslaFactory getInstance(){
        if(factory == null){
            factory = new TeslaFactory();
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
