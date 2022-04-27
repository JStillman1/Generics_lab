package Wildcards;

import java.util.ArrayList;
import java.util.List;

public class WildcardExample {

    public static <T extends Father> void printNames_fathersAndChildrenOnly(List<T> t){
        System.out.println(t);
    }

//    public static <T extends Grampa> void printNames_all(List<T> t){
//        System.out.println(t);
//    }
    public static void printNames_all(List<? extends Grampa> t){
        System.out.println(t);
    }


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
