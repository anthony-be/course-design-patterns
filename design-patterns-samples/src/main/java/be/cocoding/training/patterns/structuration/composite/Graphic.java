package be.cocoding.training.patterns.structuration.composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Graphic {

    private final List<Graphic> children = new ArrayList<>();

    public abstract void draw();

    public void add(Graphic child) {
        if(child!=null){
            children.add(child);
        }
    }

    public void remove(Graphic child) {
        children.remove(child);
    }

    public List<Graphic> getChildren() {
        return Collections.unmodifiableList(children);
    }
}
