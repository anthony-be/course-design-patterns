package be.cocoding.training.patterns.construction.abstractfactory.factory;

import be.cocoding.training.patterns.construction.abstractfactory.models.Resume;
import be.cocoding.training.patterns.construction.abstractfactory.models.ResumeClassic;

public class ClassicFactory implements AbstractFactory {
    public Resume createResume() {
        return new ResumeClassic();
    }
}
