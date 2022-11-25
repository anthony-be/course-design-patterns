package be.cocoding.training.patterns.construction.abstractfactory.factory;

import be.cocoding.training.patterns.construction.abstractfactory.models.Resume;
import be.cocoding.training.patterns.construction.abstractfactory.models.ResumeModern;

public class ModernFactory implements AbstractFactory {
    public Resume createResume() {
        return new ResumeModern();
    }
}
