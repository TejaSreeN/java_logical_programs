import java.util.Scanner;

public class GrossSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter basic salary: ");
        double basicSalary = scanner.nextDouble();

        double hra, da, grossSalary;

        if (basicSalary <= 10000) {
            hra = basicSalary*0.20;
            da = basicSalary*0.80;
        } else if (basicSalary <= 20000) {
            hra = basicSalary*0.25;
            da = basicSalary*0.90;
        } else {
            hra = basicSalary*0.30;
            da = basicSalary*0.95;
        }

        grossSalary = basicSalary + hra + da;
        
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + grossSalary); 

    }
}