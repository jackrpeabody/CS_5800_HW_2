package Abstract_Factory_Singleton;

public class PorscheFactory extends CarFactory{

    final String BRAND_NAME = "Porsche";

    private static PorscheFactory factory = null;
    
    private PorscheFactory(){}

    public static PorscheFactory getInstance(){
        if(factory == null){
            factory = new PorscheFactory();
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
