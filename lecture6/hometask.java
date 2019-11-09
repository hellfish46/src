package lecture6;

public class hometask {
    public static void main(String[] args) {
        String code = "NX6BYU56UX6CV6BNt7NM 287430";

        String[] stringArr = code.split(" ");
        String isThereLowerCase = stringArr[0].toUpperCase();
        if (!stringArr[0].equals(isThereLowerCase)){
            System.out.println("FALSE");
        }
        String onlyNumbers = stringArr[0].replaceAll("\\D+","");
        int first = Integer.parseInt("" + onlyNumbers.charAt(0)+onlyNumbers.charAt(1));
        int second = Integer.parseInt("" + onlyNumbers.charAt(2)+onlyNumbers.charAt(3));
        int third = Integer.parseInt("" + onlyNumbers.charAt(4)+onlyNumbers.charAt(5));
        int result = first * second * third;
        int codeInt = Integer.parseInt(stringArr[1]);
        if (result == codeInt){
            System.out.println("true");
        } else {
            System.out.println("false");
        }





    }
};
