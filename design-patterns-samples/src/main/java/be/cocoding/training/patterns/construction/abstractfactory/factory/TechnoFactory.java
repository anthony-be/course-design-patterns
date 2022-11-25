package be.cocoding.training.patterns.construction.abstractfactory.factory;

import be.cocoding.training.patterns.construction.abstractfactory.models.Resume;
import be.cocoding.training.patterns.construction.abstractfactory.models.ResumeTechno;

public class TechnoFactory implements AbstractFactory {
    public Resume createResume() {
        return new ResumeTechno();
    }
}
