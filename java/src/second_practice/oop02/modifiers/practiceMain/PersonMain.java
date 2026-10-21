package second_practice.oop02.modifiers.practiceMain;

import second_practice.oop02.modifiers.practice.Person;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("Andrey", 13, "qweqwe@gmail.com", "123123");

        //System.out.println(person.publicName);
        //System.out.println(person.protectedAge); // сработает тк в том же пакете(если перенести в practice)
        //System.out.println(person.defaultEmail); // сработает тк в том же пакете(если перенести в practice)
        //System.out.println(person.passportNumber); // вызовет ошибку
    }
}