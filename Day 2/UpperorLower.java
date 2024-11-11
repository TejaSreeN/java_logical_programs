import java.util.Scanner;
class UpperorLower
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a character:");
char ch=sc.next().charAt(0);
if (ch >= 'a' && ch <= 'z') 
{
System.out.println(ch + " is Lower Case Letter");
}
else if(ch >= 'A' && ch <= 'Z')
{
System.out.println(ch + " Upper Case Letter");
}

else
{
System.out.println(ch+ " Digit or Special character");
}
}
}