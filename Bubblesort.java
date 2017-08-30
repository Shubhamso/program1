import java.util.Scanner;
import java.util.*;

class sort{

int n,i,temp=0,j;
public void getdata(int[] num){
int x=num.length;

for(i=0;i<x;i++){

for(j=1;j<x-i;j++){

if(num[j-1]>num[j]){

temp=num[j-1];
num[j-1]=num[j];
num[j]=temp;
}
}
}
}
}


public class Bubblesort{

public static void main(String [] args){


int arr[]={31,22,35,43,15,24};

System.out.println("Before Sorting");

for(int i=0;i<arr.length;i++){
	
	System.out.println(""+arr[i]);
}
sort ab=new sort();
ab.getdata(arr);
	System.out.println("After Sorting");

	
for(int i=0;i<arr.length;i++){
	
	System.out.println(""+arr[i]);
}
	}
}