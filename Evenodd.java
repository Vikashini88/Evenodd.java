import java.util.Scanner ;
class Evenodd
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
if(a%2==0)
System.out.println("\nThe given number "+a+" is EVEN");
else
System.out.println("\nThe given number "+a+" is ODD");
}}