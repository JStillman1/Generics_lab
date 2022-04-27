package Create_Simple_Class;

public class Main {
    public static void main(String[] args) {
        Box boxWithoutRestrictions = new Box();
        Box<Integer> boxForIntegers = new Box();

        boxWithoutRestrictions.set(3);
        System.out.println(boxWithoutRestrictions.get());
        boxWithoutRestrictions.set("Test");
        System.out.println(boxWithoutRestrictions.get());

        boxForIntegers.set(4);
        System.out.println(boxForIntegers.get());

    }
}
