package Abstract_Factory_Singleton;

public class SeaRayFactory extends BoatFactory{

    final String BRAND_NAME = "SeaRay";

    private static SeaRayFactory factory = null;
    
    private SeaRayFactory(){}

    public static SeaRayFactory getInstance(){
        if(factory == null){
            factory = new SeaRayFactory();
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

