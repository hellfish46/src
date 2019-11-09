package Lecture7Hometask;

public class App {
    public static void main(String[] args) {
        Fraction basicCalculator = new Fraction(12.6, 6.0);
         double divide = basicCalculator.divide();
         double multiple = basicCalculator.multiple();
         double minus = basicCalculator.minus();
         double adding = basicCalculator.plus();

        System.out.println(divide);
        System.out.println(multiple);
        System.out.println(minus);
        System.out.println(adding);
        System.out.println(basicCalculator.toString());




    }
}
