package edu.ntudp.fit;

import edu.ntudp.fit.controller.StructureCreator;
import edu.ntudp.fit.controller.UniversityCreator;
import edu.ntudp.fit.model.Structure;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world! Beginning work");
        StructureCreator universityCreator = new UniversityCreator();
        Structure university = universityCreator.createRandomly();
        System.out.println(university);
    }
}