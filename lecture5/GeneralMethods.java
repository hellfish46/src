package lecture5;

public class GeneralMethods {
    public static void main(String[] args) {

        //double result = 25d + 273.16;
      //  System.out.println("C to K" + result);
        celsiumToKelvin(10d);
        double kilometers = metersToKilometres(100.0);
        String message = distanceCompare(kilometers);
        System.out.println(message);



    }

    public static void celsiumToKelvin(double celsium){
        double result = celsium + 273.16;
        System.out.println("C to K" + result);
    };

    public static double metersToKilometres(double meters){
        double result = meters / 1000d;
        System.out.println("meters to kilometers " + result);
        return result;
    }

    public static String distanceCompare(double kilometers){
        String message;
        if(kilometers > 0.7) {
            message = "correct distance !";
        } else if (kilometers < 0.5){
            message = "Excellent !";
        } else {
            message = "Bad distance";
        }
        return message;
    }
}
