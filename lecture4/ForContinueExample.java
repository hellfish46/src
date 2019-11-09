package lecture4;

public class ForContinueExample {
    public static void main(String[] args) {
        String[] students = {"Steve","Ihor","Anna", "Victor", "Bob"};
        for (int i = 0;i < students.length;i++){
            String student = students[i];

            if(student.equals("Victor")){
                continue;
            }
            System.out.println(students[i]);


        }


    }
}
