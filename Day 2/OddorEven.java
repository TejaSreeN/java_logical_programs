import java.util.*;
class OddorEven{
public static void main(String args[]){
int num;
Scanner s=new Scanner(System.in);
System.out.println("enter a number:");
num=s.nextInt();
if(num%2==0){
System.out.println(num+" is Even");
}
else
System.out.println(num+" is odd.");
}
} 