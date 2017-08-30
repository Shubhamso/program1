class Triangle{

double area;
int height;
int length;
public static void main(String [] args ){
int i=0;
Triangle ta = new Triangle[4];
while(i<4){
	
	ta[x].height=(x+1)*2;
	ta[x].length=x+4;
	ta[x].setarea();
	System.out.println("triangle"+x+",area");
	System.out.println("="+ta[x].area);
	i++;

	}
int y=x;	
x=27;

Triangle t5=ta[2];
ta[2].area=343;
System.out.println("y="+y);
System.out.println(",t5 area="+t5.area);
}
void setarea(){
	area=(height*length)/2;
}
}