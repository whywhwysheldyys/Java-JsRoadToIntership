package second_practice.advanced03.oop02.modifiers.practice.packageB;

import second_practice.advanced03.oop02.modifiers.practice.packageA.Parent;

public class Child extends Parent {
    public void checkAccess() {
        //System.out.println(privateVar);
        //'privateVar' has private access in 'second_practice.advanced03.oop02.modifiers.practice.packageA.Parent'
        //не скомпилируется потому что имеет приватный модификатор

        //System.out.println(defaultVar);
        //'defaultVar' is not public in 'second_practice.advanced03.oop02.modifiers.practice.packageA.Parent'. Cannot be accessed from outside package
        //не скомпилируется потому что имеет модификатор default, будет работать только в своем пакете

        System.out.println(protectedVar);
        //работает тк дочерний пакет

        System.out.println(publicVar);
        //работает тк публичный
    }
}