import java.util.*;
class Bill
{
public static void main(String args[])
{
String pname;
int pno;
float pcost,pqnt,bill;

Scanner s=new Scanner(System.in);

System.out.println("Enter product number:");
pno=s.nextInt();
System.out.println("Enter product name:");
pname=s.next();
System.out.println("Enter product cost:");
pcost=s.nextFloat();
System.out.println("Enter product quantity:");
pqnt=s.nextFloat();

bill=pcost*pqnt;

System.out.println("product number:"+pno);
System.out.println("product name"+pname);
System.out.println("product cost:"+pcost);
System.out.println("Product quantity:"+pqnt);
System.out.println("total bill:"+bill);

}
}