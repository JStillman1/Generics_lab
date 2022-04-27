package Generic_Interface;

public class Main {
    public static void main(String[] args) {
        StringAndInteger testSAI = new StringAndInteger();
        GenericInterface<String, Integer> testGen = new StringAndInteger();

        System.out.println(testSAI.doSomeOperations("5"));
        System.out.println(testSAI.doReverseOperations(3));

        System.out.println(testGen.doSomeOperations("5"));
        System.out.println(testGen.doReverseOperations(3));
    }
}
