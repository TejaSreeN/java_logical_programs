import java.util.*;
class Nestedif
{
public static void main(String args[])
{
int a=40,b=50,c=60;

System.out.println("a=40");
System.out.println("b=50");
System.out.println("c=60");

if(a>b)
{
if(a>c)
{
System.out.println("a is big");
}
else
{
System.out.println("c is big");
}
}
else
{
if(b>c)
{
System.out.println("b is big");
}
else
{
System.out.println("c is big");
}
}
}
}