import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks for Physics: ");
        int phy= scanner.nextInt();

        System.out.print("Enter marks for Chemistry: ");
        int chem = scanner.nextInt();

        System.out.print("Enter marks for Biology: ");
        int bio = scanner.nextInt();

        System.out.print("Enter marks for Mathematics: ");
       
 int math = scanner.nextInt();

        System.out.print("Enter marks for Computer: ");
        int comp = scanner.nextInt();
      
  int totalMarks = phy + chem + bio+ math + comp;
int percentage=totalMarks/5;
        
        char grade;
        if (percentage>=90) {
            grade = 'A';
        } else if (percentage>=80) {
            grade = 'B';
        } else if (percentage>=70) {
            grade = 'C';
        } else if (percentage>=60) {
            grade = 'D';
        } else if (percentage>=40) {
            grade = 'E';
        } else {
            grade = 'F';
        }
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}