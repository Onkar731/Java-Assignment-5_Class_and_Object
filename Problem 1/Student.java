// creating student class
public class Student {
    private String name;
    private int rollno;
    private int totalMarks;

    public Student(String name, int rollno, int totalMarks) {
        this.name = name;
        this.rollno = rollno;
        this.totalMarks = totalMarks;
    }

    public String getName() {
        return name;
    }

    public int getRollno() {
        return rollno;
    }

    public int getTotalMarks() {
        return totalMarks;
    }
}

