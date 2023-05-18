package edu.ntudp.fit.controller;

import edu.ntudp.fit.model.Human;
import edu.ntudp.fit.model.Sex;
import edu.ntudp.fit.model.Student;

import java.util.Scanner;

public class StudentCreator extends HumanCreator {
    @Override
    public Student create() {
        Scanner scanner = new Scanner(System.in);
        String name = getString(scanner, NAME);
        String surname = getString(scanner, SURNAME);
        String patronymic = getString(scanner, PATRONYMIC);
        Sex sex = getSex(scanner);

        return new Student(name, surname, patronymic, sex);
    }

    @Override
    public Student create(String name, String surname, String patronymic, Sex sex) {
        return new Student(name, surname, patronymic, sex);
    }

    @Override
    public Student createRandomly() {
        return new Student("Kyrylo", "Kumchenko", "Volodymyrovych", Sex.MALE);
    }
}
