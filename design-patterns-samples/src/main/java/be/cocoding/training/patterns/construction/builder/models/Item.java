package be.cocoding.training.patterns.construction.builder.models;

import be.cocoding.training.patterns.construction.builder.models.pack.Packaging;

public interface Item {
    String name();
    Packaging packaging();
    float price();
}
