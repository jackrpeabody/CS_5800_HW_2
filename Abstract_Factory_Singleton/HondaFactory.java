package Abstract_Factory_Singleton;

public class HondaFactory extends CarFactory{

    final String BRAND_NAME = "Honda";

    private static HondaFactory factory = null;
    
    private HondaFactory(){}

    public static HondaFactory getInstance(){
        if(factory == null){
            factory = new HondaFactory();
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
