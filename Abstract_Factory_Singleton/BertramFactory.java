package Abstract_Factory_Singleton;

public class BertramFactory extends BoatFactory{

    final String BRAND_NAME = "Bertram";

    private static BertramFactory factory = null;
    
    private BertramFactory(){}

    public static BertramFactory getInstance(){
        if(factory == null){
            factory = new BertramFactory();
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