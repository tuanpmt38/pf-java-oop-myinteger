public class MyIntegerTest {
    public static void testMyInteger(boolean condition) {
        if (condition) {
            System.out.println("success");
        } else {
            System.out.println("failed");
        }
    }

    public static void main(String[] args) {
        MyInteger myInteger = new MyInteger(11);
        testMyInteger(myInteger.isEven());
        testMyInteger(myInteger.isOld());
        testMyInteger(myInteger.isPrime());
        testMyInteger(myInteger.isEven(6));
        testMyInteger(myInteger.isOld(5));
        testMyInteger(myInteger.equals(10));

    }
}
