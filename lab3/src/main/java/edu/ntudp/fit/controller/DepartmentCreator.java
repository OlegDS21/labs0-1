package edu.ntudp.fit.controller;

import edu.ntudp.fit.model.*;

import java.util.ArrayList;
import java.util.List;

public class DepartmentCreator extends StructureCreator<Group> {
    public DepartmentCreator() {
        super("Department", "Group");
    }

    @Override
    public Department create(String nameOfStructure, Human headOfStructure, List childOfStructure) {
        return new Department(nameOfStructure, headOfStructure, childOfStructure);
    }

    @Override
    public List<Group> createChildList(Integer length, String nameOfStructure) {
        List<Group> childList = new ArrayList<>(length);
        Creatable groupCreator = new GroupCreator();
        for (int i = 0; i < length; i++) {
            System.out.printf("Creating the %s of %s %s...\n", childType, structureType, nameOfStructure);
            childList.add((Group) groupCreator.create());
        }
        return childList;
    }

    @Override
    public Department createRandomly() {
        return new Department("PZKS", new HumanCreator().createRandomly(), createChildListRandomly());
    }

    @Override
    public List<Group> createChildListRandomly() {
        List<Group> childList = new ArrayList<>(2);
        Creatable groupCreator = new GroupCreator();
        for (int i = 0; i < 2; i++) {
            childList.add((Group) groupCreator.createRandomly());
        }
        return childList;
    }
}
