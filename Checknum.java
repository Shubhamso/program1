import java.util.Scanner;
class Number{
int n;

public Number(int num){
this.n=num;
}

public void check(){
if(n%2==0){
System.out.println("Given number is even");
}
else{
System.out.println("Given number is odd");
}
}


}


public class Checknum{

public static void main(String [] args){
Scanner s= new Scanner(System.in);
int s2=s.nextInt();

Number n1=new Number(s2);
n1.check();
}
}