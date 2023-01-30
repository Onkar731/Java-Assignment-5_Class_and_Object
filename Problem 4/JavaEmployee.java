public class JavaEmployee {
    private long id;
    private String department;
    private float salary;
    private float bonus;

    public JavaEmployee(long id, String department, float salary) {
        this.id = id;
        this.department = department;
        this.salary = salary;

        if(department.equals("Manager")) {
            this.bonus = 25000;
        } else if(department.equals("HR")) {
            this.bonus = 20000;
        } else {
            this.bonus = 18000;
        }
    }
    
    public long getId() {
        return id;
    }
    
    public String getDepartment() {
        return department;
    }

    public float getSalary() {
        return (float)salary+bonus;
    }
}