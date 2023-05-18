package edu.ntudp.fit.model;

import java.util.List;

public class Faculty extends Structure<Department>{

    public Faculty(String name) {
        super(name);
    }

    public Faculty(String name, Human head) {
        super(name, head);
    }

    public Faculty(String nameOfStructure, Human headOfStructure, List<Department> childOfStructure) {
        super(nameOfStructure, headOfStructure, childOfStructure);
    }
}
