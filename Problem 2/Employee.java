public class Employee {
    private long id;
    private String name;
    private float salary;
    private float commission;
    private static int totalEmployees;
    
    public Employee(long id, String name, float salary, float commission) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.commission = commission;
        totalEmployees++;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }

    public float getCommission() {
        return commission;
    }

    public static int getTotalEmployees() {
        return totalEmployees;
    }
}
