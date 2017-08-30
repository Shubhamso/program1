//program of swaapping without using third variable
import java.util.Scanner;

class swap{
private int a,b;

public void swapp(int c, int d){

this.a=c;
this.b=d;
}
public int beforeswap(){
System.out.println("value of a is"+a);
System.out.println("value of b is"+b);
System.out.println("");
	return 0;
}

public int afterswap(){
a=a+b;
b=a-b;
a=a-b;

System.out.println("value of a is"+a);
System.out.println("value of b is"+b);
return 0;
}
}

public class Swappingnum{
public static void main(String [] args){
Scanner s= new Scanner(System.in);
System.out.println("Enter any two number");
int a1= s.nextInt();
int b1= s.nextInt(); 
swap s1= new swap();
s1.swapp(a1,b1);
s1.beforeswap();

s1.afterswap();
}
}