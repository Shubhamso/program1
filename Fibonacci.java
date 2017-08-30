class fib{
int a=0,b=1,count=0;

public void process(){
System.out.println(""+a+""+b);
for (int i=2;i<10;i++){
count=a+b;
System.out.println(""+count);
a=b;
b=count;
}
}
}
public class Fibonacci{

public static void main(String args[])
{
fib f = new fib();
f.process();
}
}