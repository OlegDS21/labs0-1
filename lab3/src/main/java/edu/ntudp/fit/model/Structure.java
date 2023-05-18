package edu.ntudp.fit.model;

import java.util.List;
import java.util.Objects;

public class Structure<C> implements Entity {
    private String nameOfStructure;
    private Human headOfStructure;
    private List<C> childOfStructure;

    public Structure(String name) {
        this.nameOfStructure = name;
    }

    public Structure(String name, Human head) {
        this.nameOfStructure = name;
        this.headOfStructure = (Human) head;
    }

    public Structure(String nameOfStructure, Human headOfStructure, List<C> childOfStructure) {
        this.nameOfStructure = nameOfStructure;
        this.headOfStructure = headOfStructure;
        this.childOfStructure = childOfStructure;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Structure)) return false;
        Structure structure = (Structure) o;
        return Objects.equals(nameOfStructure, structure.nameOfStructure) && Objects.equals(headOfStructure, structure.headOfStructure) && Objects.equals(childOfStructure, structure.childOfStructure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfStructure, headOfStructure, childOfStructure);
    }
}
