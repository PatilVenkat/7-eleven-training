import java.util.Scanner;

 class hello {
    

static int a,b;
static Scanner sc = new Scanner(System.in);
static void input1()
{
System.out.print("Enter First Number: ");
a = sc.nextInt();
System.out.print("Enter Second Number: ");
b = sc.nextInt();
}
static void input2()
{
System.out.print("Enter a Number: ");
a = sc.nextInt();
}
static int add(int a,int b)
{
return a+b;
}
static int sub(int a,int b)
{
return a-b;
}
static int mul(int a,int b)
{
return a*b;
}
static int div(int a,int b)
{
return a/b;
}

public static void main(String[] args) {
    System.out.println("enter the choice");
    System.out.println("1.addition 2.subtraction 3.multiplication 4.division");
    int m = sc.nextInt();


switch(m)
{
case 1:
input1();
System.out.println(add(a,b));
break;
case 2:
input1();
System.out.println(sub(a,b));
break;
case 3:
input1();
System.out.println(mul(a,b));
break;
case 4:
input1();
System.out.println(div(a,b));
break;
}
}
 }
