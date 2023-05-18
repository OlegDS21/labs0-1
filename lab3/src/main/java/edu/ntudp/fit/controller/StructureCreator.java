package edu.ntudp.fit.controller;

import edu.ntudp.fit.model.Creature;
import edu.ntudp.fit.model.Entity;
import edu.ntudp.fit.model.Human;
import edu.ntudp.fit.model.Structure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class StructureCreator<C extends Entity> implements Creatable{

    public String structureType;
    public String childType;

    public StructureCreator(String structureType, String childType) {
        this.structureType = structureType;
        this.childType = childType;
    }

    @Override
    public Structure create() {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Input the Name of created %s: ", structureType);
        String nameOfStructure = scanner.next();

        System.out.printf("Creating the Head of %s %s...\n", structureType, nameOfStructure);
        Human headOfStructure = new HumanCreator().create();

        System.out.printf("Input the Quantity of %s in the %s: ", childType, structureType);
        int childLength = scanner.nextInt();

        return create(nameOfStructure, headOfStructure, createChildList(childLength, nameOfStructure));
    }

    public abstract Structure create(String nameOfStructure, Human headOfStructure, List<C> childOfStructure);

    public abstract List<C> createChildList(Integer length, String nameOfStructure);

    public abstract Structure createRandomly();

    public abstract List<C> createChildListRandomly();
}
