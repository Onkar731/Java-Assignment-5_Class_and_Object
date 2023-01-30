import java.util.Scanner;

public class PrintJavaEmployeeSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // accepting input from the user
		System.out.print("Enter number of employee's : ");
		int n = sc.nextInt();

        // creating array of java employee class
		JavaEmployee []emp = new JavaEmployee[n];

        // getting employee data from the user
        for(int i = 0; i < emp.length; i++) {
            System.out.print("Enter employee id : ");
			long id = sc.nextInt();

			System.out.print("Enter employee department : ");
			sc.nextLine();
			String department = sc.next();

			System.out.print("Enter employee salary : ");
			float salary = sc.nextFloat();

            // creating an object of JavaEmployee class
			emp[i] = new JavaEmployee(id , department, salary);
        }

        // closing resources
        sc.close();

        // printing salary of each JavaEmployee
        for(JavaEmployee e : emp) {
            System.out.println("Salary of " + e.getDepartment() + " is : " + e.getSalary());
        }
    }
}
