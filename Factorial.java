class fact{
int num,count=1;

public void getnum(int n){
this.num=n;
}
public void function(){
for(int i=num;num>=1;i--){

 count=count*num;

}
}
public void show(){
System.out.println(""+count);
}
}



public class Factorial{

public static void main(String[] args){

fact f = new fact();
f.getnum(3);
f.show();
}
}