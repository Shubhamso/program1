import java.io.*;
public class EmpDetails{
String name;
int salary;
int age;
//double salary;

public EmpDetails(String name){
this.name=name;
}
public EmpDetails(int age){
this.age=age;
}

public void printdetails(){
System.out.println("name="+name+"age"+age+"salary"+salary);
}
}
