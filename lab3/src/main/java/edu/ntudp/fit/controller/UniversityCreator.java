package edu.ntudp.fit.controller;

import edu.ntudp.fit.model.*;

import java.util.ArrayList;
import java.util.List;

public class UniversityCreator extends StructureCreator<Faculty>{

    public UniversityCreator() {
        super("University", "Faculty");
    }

    @Override
    public University create(String nameOfStructure, Human headOfStructure, List childOfStructure) {
        return new University(nameOfStructure, headOfStructure, childOfStructure);
    }

    @Override
    public List<Faculty> createChildList(Integer length, String nameOfStructure) {
        List<Faculty> childList = new ArrayList<>(length);
        Creatable facultyCreator = new FacultyCreator();
        for (int i = 0; i < length; i++) {
            System.out.printf("Creating the %s of %s %s...\n", childType, structureType, nameOfStructure);
            childList.add((Faculty) facultyCreator.create());
        }
        return childList;
    }

    @Override
    public University createRandomly() {
        return new University("NTU", new HumanCreator().createRandomly(), createChildListRandomly());
    }

    @Override
    public List<Faculty> createChildListRandomly() {
        List<Faculty> childList = new ArrayList<>(2);
        Creatable facultyCreator = new FacultyCreator();
        for (int i = 0; i < 2; i++) {
            childList.add((Faculty) facultyCreator.createRandomly());
        }
        return childList;
    }
}
