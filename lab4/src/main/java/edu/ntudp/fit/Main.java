package edu.ntudp.fit;

import edu.ntudp.fit.controller.JsonManager;
import edu.ntudp.fit.controller.StructureCreator;
import edu.ntudp.fit.controller.UniversityCreator;
import edu.ntudp.fit.model.Structure;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Hello world! Beginning work");
        StructureCreator universityCreator = new UniversityCreator();
        Structure university = universityCreator.createRandomly();
        JsonManager jsonManager = new JsonManager<>(Structure.class);
        jsonManager.writeToFile(university, "test.json");
    }
}