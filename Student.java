class Student implements Cloneable{
int a;
String name;
Student(int a,String name){
this.a=a;
this.name=name;
}
public Object clone() throws CloneNotSupportedException{
	return super.clone();
}
public static void main(String [] args){
	try{
Student s = new Student(1,"ajay");
Student s2 =(Student)s.clone();

System.out.println(""+s.name,+""+s.a);
System.out.println(""+s2.name,+""+s2.a);
	}Catch(CloneNotSupportedException c){
		
		
	}

}
}