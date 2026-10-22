package second_practice.advanced03.oop02.modifiers.practice.packageB;

import second_practice.advanced03.oop02.modifiers.practice.packageA.Parent;

public class Unrelated {
    public void checkAccess() {
        Parent parent = new Parent();

        //parent.privateVar
        //не скомпилируется виден только внутри своего класса

        //parent.defaultVar
        //не скомпилируется виден только внутри своего пакета

        //parent.protectedVar
        //не скомпилируется виден только внутри своего и дочерних пакетов

        System.out.println(parent.publicVar);
        //скомпилируется, публичный доступ

    }
}