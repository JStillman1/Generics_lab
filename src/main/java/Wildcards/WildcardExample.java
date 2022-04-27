package Wildcards;

import java.util.ArrayList;
import java.util.List;

public class WildcardExample {

    //<T extends Father> means we only accept types that extend the Father class, i.e. Father and Child
    //Could equivalently use static void ____ (List<? extends Father> t )
    public static <T extends Father> void printNames_fathersAndChildrenOnly(List<T> t){
        System.out.println(t);
    }

//    public static <T extends Grampa> void printNames_all(List<T> t){
//        System.out.println(t);
//    }

    //List<? extends Grampa> t allows any (wildcard) type that extends Grampa, i.e. Grampa, Father, Child
    public static void printNames_all(List<? extends Grampa> t){
        System.out.println(t);
    }


    // List<? super Father> means it allows any class that is a super class to Father, i.e. Father, Grampa
    //Here we can't use static <T super Father>
    public static void printNames_grampasAndFathersOnly(List<? super Father> t){
        System.out.println(t);
    }



    public static void main(String[] args) {
        List <Grampa> grampas = List.of(
                new Grampa("Christopher"),
                new Grampa("John"),
                new Grampa("Stewart")
        );
        List <Father> fathers = List.of(
                new Father("Tim"),
                new Father("Dave"),
                new Father("Kyle")
        );
        List <Child> children = List.of(
                new Child("Henry"),
                new Child("Noah"),
                new Child("James")
        );

        WildcardExample wildEx = new WildcardExample();

        wildEx.printNames_all(grampas);
        wildEx.printNames_all(fathers);
        wildEx.printNames_all(children);

        wildEx.printNames_fathersAndChildrenOnly(fathers);
        wildEx.printNames_fathersAndChildrenOnly(children);
        //wildEx.printNames_fathersAndChildrenOnly(grampas);

        wildEx.printNames_grampasAndFathersOnly(grampas);
        wildEx.printNames_grampasAndFathersOnly(fathers);
        //wildEx.printNames_grampasAndFathersOnly(children);





    }



}
