package lecture6;

public class StringExample {
    public static void main(String[] args) {
        String name = "Bob";
        //String lastName = new String("Ivanov");
        name.isEmpty();
        boolean isContains = name.contains("b");
        System.out.println(isContains);
        name.toLowerCase();
        char [] chars = name.toCharArray();
        char charone = name.charAt(0);
        char chartwo = name.charAt(1);
        char charthree = name.charAt(2);
        System.out.println(charone);

        name.codePointAt(0);

        String helloJava = "Hello.Java!";
        name.substring(3);

        String trim = helloJava.trim();
        System.out.println(trim.length());

        String replaceChar = helloJava.replace('a', 'o');

        System.out.println(replaceChar);

        String replaceChar1 = helloJava.replaceFirst("a", "e");
        System.out.println(replaceChar1);

        String replaceChar4 = helloJava.replaceFirst("a", "e");
        System.out.println(replaceChar4);

        String adminUser = "admin";
        String guestUser = "admin";

        //boolean equals = adminUser == guestUser;
        boolean equals = adminUser.equals(guestUser);
        System.out.println(equals);

      //  int compare = adminUser.compareTo(guestUser);

        String hello = "Hello student";
        String[] split = hello.split(" ");







    }
}
