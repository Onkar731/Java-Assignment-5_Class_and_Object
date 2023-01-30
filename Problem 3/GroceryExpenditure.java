import java.util.Scanner;

public class GroceryExpenditure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // creating an array of months
        int [][]months = new int[12][];

        // accepting data from the user
        for(int i = 0; i < months.length; i++) {
            System.out.print("Enter how many items you have purchased in " + (i+1) + " month : " );
            months[i] = new int[sc.nextInt()];

            System.out.println("Enter purchased amount : ");
            for(int j = 0; j < months[i].length; j++) {
                months[i][j] = sc.nextInt();
            }
        }

        // closing resource
        sc.close();
        
        int totalExpenditure = 0;
        int monthNumber = -1;

        for(int i = 0; i < months.length; i++) {
            int monthExpenditure = 0;
            for(int j = 0; j < months[i].length; j++) {
                monthExpenditure += months[i][j];
            }

            if(monthExpenditure > totalExpenditure) {
                totalExpenditure = monthExpenditure;
                monthNumber = i+1;
            }
        }

        // printing month number
        System.out.println("Month in which expenditure is most : " + monthNumber);
    }
}
