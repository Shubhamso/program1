class Emp{

private int sal;

public void setemp(int count){
sal=count;
}

public int getemp(){
return sal;
}
}
public class Trial{
public static void main(String [] args){
Emp a = new Emp();
a.setemp(3);
System.out.println(""+a.getemp());
}
}