package edu.ntudp.fit.model;

import java.util.List;

public class Group extends Structure<Student> {

    public Group(String name) {
        super(name);
    }
    public Group(String name, Human head) {
        super(name, head);
    }
    public Group(String nameOfStructure, Human headOfStructure, List<Student> childOfStructure) {
        super(nameOfStructure, headOfStructure, childOfStructure);
    }
}
