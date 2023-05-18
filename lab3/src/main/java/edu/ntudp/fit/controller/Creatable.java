package edu.ntudp.fit.controller;

import edu.ntudp.fit.model.Entity;

public interface Creatable {
    Entity create();
    Entity createRandomly();
}
