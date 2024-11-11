import java.util.*;
class Marks
{
public static void main(String args[])
{
String stdname;
int stdno;
int p;
int c;
int m;
int total;
float avgm;

Scanner s=new Scanner(System.in);

System.out.println("Enter student number:");
stdno=s.nextInt();
System.out.println("Enter student name:");
stdname=s.next();
 System.out.println("Enter physics marks out of 50m:");
p=s.nextInt();
System.out.println("Enter chemistry marks out of 50m:");
c=s.nextInt();
System.out.println("Enter maths marks out of 50m:");
m=s.nextInt();

total=p+m+c;
avgm=total/3;

System.out.println("Student number:"+stdno);
System.out.println("Student name"+stdname);
System.out.println("Maths marks:"+m);
System.out.println("Physics marks:"+p);
System.out.println("Chemistry marks:"+c);
System.out.println("Total marks:"+total);
System.out.println("Average marks:"+avgm);
}
}
