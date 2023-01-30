
public class FindLowestPaidEmployee {
    public static void main(String[] args) {

        // creating objects of employee
        Employee e2 = new Employee(101, "Raj Kaloge", 51000f, 1000f);
        Employee e3 = new Employee(102, "Rohan Punekar", 25000f, 7000f);
        Employee e1 = new Employee(100, "Onkar Shengule", 85000f, 15000f);
        Employee e4 = new Employee(103, "Yogesh Ghuge", 55000f, 8000f);

        Employee[] emp = { e1, e2, e3, e4 };

        // printing total number of employees in company
        System.out.println("Total number of employees in company are : " + Employee.getTotalEmployees());

        // findng lowest paid Employee
        boolean flag = true;
        float totalSalary = 0;
        Employee lowestPaidEmployee = null;

        for (Employee e : emp) {
            if (flag) {
                totalSalary = e.getSalary() * e.getCommission();
                lowestPaidEmployee = e;
                flag = false;
            } else {
                if(e.getSalary()*e.getCommission() < totalSalary) {
                    lowestPaidEmployee = e;
                    totalSalary = e.getSalary() * e.getCommission();
                }
            }
        }

        // printing topper's details
        System.out.println("Name : " + lowestPaidEmployee.getName());
        System.out.println("Id : " + lowestPaidEmployee.getId());
        System.out.println("Salary : " + (float)(lowestPaidEmployee.getSalary()*lowestPaidEmployee.getCommission()));
    }

}
