package edu.ntudp.fit.controller;

import edu.ntudp.fit.model.Human;
import edu.ntudp.fit.model.Sex;

import java.util.Scanner;

public class HumanCreator implements Creatable {

    final String NAME = "Name";
    final String SURNAME = "Surname";
    final String PATRONYMIC = "Patronymic";
    final String SEX = "Sex";

    @Override
    public Human create() {
        Scanner scanner = new Scanner(System.in);
        String name = getString(scanner, NAME);
        String surname = getString(scanner, SURNAME);
        String patronymic = getString(scanner, PATRONYMIC);
        Sex sex = getSex(scanner);

        return new Human(name, surname, patronymic, sex);
    }

    public Human create(String name, String surname, String patronymic, Sex sex) {
        return new Human(name, surname, patronymic, sex);
    }

    public Human createRandomly() {
        return new Human("Ivan", "Ivanov", "Ivanovych", Sex.MALE);
    }
    protected String getString(Scanner scanner, String nameOfParam) {
        System.out.printf("Input the %s of created Human: ", nameOfParam);
        return scanner.next();
    }
    protected Sex getSex(Scanner scanner) {
        System.out.printf("Input the %s of created Human[%s/%s]: ", SEX, Sex.MALE, Sex.FEMALE);
        String providedSex = scanner.next().toUpperCase();
        for (Sex sex: Sex.values()) {
            if (sex.name().equals(providedSex)) {
                return sex;
            }
        }
        return Sex.MALE;
    }
}
