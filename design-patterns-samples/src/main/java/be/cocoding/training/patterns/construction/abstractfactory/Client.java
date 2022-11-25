package be.cocoding.training.patterns.construction.abstractfactory;

import be.cocoding.training.patterns.construction.abstractfactory.factory.AbstractFactory;
import be.cocoding.training.patterns.construction.abstractfactory.factory.FactoryProducer;
import be.cocoding.training.patterns.construction.abstractfactory.models.Resume;

public class Client {

    public static void main(String[] args) {
        AbstractFactory factory = FactoryProducer.getFactory("modern");
        Resume resume = factory.createResume();
        System.out.println("Get resume of type: " + resume.getClass());
    }

}
