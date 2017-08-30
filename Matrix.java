public class Matrix{
public static void main(String [] args){
//int [][] a=new int[3][3], 
//int [][] b= new int [3][3];

int [][] a= { {1,2,3},{4,5,6},{7,8,9}};


int [][] b= { {1,2,3},{4,5,6},{7,8,9}};
int [][] c= new int[3][3];
for(int i=0;i<3;i++){
	for(int j=0;j<3;j++){
	System.out.print(" "+a[i][j]);
	
}
System.out.println("");
}

System.out.println("");
for(int i=0;i<3;i++){
	for(int j=0;j<3;j++){
	System.out.print(" "+b[i][j]);
	
}
System.out.println("");
}

System.out.println("Sum of two matrix is ");


System.out.println("");
for(int i=0;i<3;i++){
	for(int j=0;j<3;j++){
		a[i][j]=a[i][j]+b[i][j];
	System.out.print(" "+a[i][j]);
	
}
}
System.out.println("Traspose of matrix\n");
for(int i=0;i<3;i++){
	for(int j=0;j<3;j++){
		a[i][j]=a[i][j]+b[i][j];
	System.out.print(" "+a[j][i]);
	
}
}
}
}