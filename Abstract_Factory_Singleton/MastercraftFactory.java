package Abstract_Factory_Singleton;

public class MastercraftFactory extends BoatFactory{

    final String BRAND_NAME = "Mastercraft";

    private static MastercraftFactory factory = null;
    
    private MastercraftFactory(){}

    public static MastercraftFactory getInstance(){
        if(factory == null){
            factory = new MastercraftFactory();
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