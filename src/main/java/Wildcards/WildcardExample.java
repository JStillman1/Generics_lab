package Wildcards;

import java.util.ArrayList;
import java.util.List;

public class WildcardExample {

    public static <T> void printNames_fathersAndChildrenOnly(List<Father> t){
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

        wildEx.printNames_fathersAndChildrenOnly(fathers);





    }

}
