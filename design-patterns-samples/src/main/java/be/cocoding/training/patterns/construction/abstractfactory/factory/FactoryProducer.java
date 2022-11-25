package be.cocoding.training.patterns.construction.abstractfactory.factory;

public class FactoryProducer {

    public static AbstractFactory getFactory(String type){
        AbstractFactory factory;
        if( "classic".equals(type) ){
            factory = new ClassicFactory();
        }else if("modern".equals(type)){
            factory = new ModernFactory();
        }else if("techno".equals(type)){
            factory = new TechnoFactory();
        }else {
            throw new IllegalArgumentException("Unknown type: " + type);
        }
        return factory;
    }

}
