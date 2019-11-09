package lecture7;

public class Lecture7 {
    public static void main(String[] args) {
        Phone phone = new Phone("iPhone","11 Pro","IOs", 10.5,5.5,120);
        phone.setBrand("iPhone");
        phone.setModel("11 Pro");
        phone.setOs("IOs");
        phone.setHeight(10.5);
        phone.setWidth(5.5);
        phone.setWeight(120);
        System.out.println();

        Phone samsung = new Phone();
        samsung.setBrand("Samsung");
        phone.setModel("Galaxy x10");
        phone.setOs("Android");
        phone.setHeight(12.7);
        phone.setWidth(6.3);
        phone.setWeight(130);

        System.out.println(samsung.toString());


    }
}
