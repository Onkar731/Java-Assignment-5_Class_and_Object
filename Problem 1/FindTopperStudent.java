import java.util.Scanner;

public class FindTopperStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // accepting data from the user
        System.out.print("Enter how many student records you want to store : ");
        int N = sc.nextInt();
        
        // creating an array of students 
        Student []students = new Student[N];
        
        // accepting student data from the user
        for(int i = 0; i < students.length; i++) {
            System.out.print("Enter student name : ");
            sc.nextLine();
            String name = sc.nextLine();
            
            System.out.print("Enter student roll number : ");
            int rollNo = sc.nextInt();

            System.out.print("Enter student total marks : ");
            int totalMarks = sc.nextInt();

            // creating student object
            students[i] = new Student(name, rollNo, totalMarks);
        }

        // closing resource
        sc.close();

        // findng topper student
        boolean flag = true;
        int totalMarks = 0;
        Student topper = null;

        for(Student s : students) {
            if(flag) {
                totalMarks = s.getTotalMarks();
                topper = s;
                flag = false;
            } else {
                if(s.getTotalMarks() > totalMarks) {
                    topper = s;
                }
            }
        }

        // printing topper's details
        System.out.println("Name : " + topper.getName());
        System.out.println("Roll Number : " + topper.getRollno());
        System.out.println("Total Marks : " + topper.getTotalMarks());
    }
}
