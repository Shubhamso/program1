public class Cement{
	
	public Cement(String name){
	 System.out.println("Cement Name="+name);
     }
	 public Cement(String name ,int quantity){
		 int Price=10;
		System.out.println("\n Your Order is : Cement Type "+name);
		System.out.println("Quantity in Bags"+quantity);
		Price=Price*quantity;
		System.out.println("Total Price"+Price);		
	 }

	 public static void main(String args[]) {
		 InputStreamReader s1= new InputStreamReader(System.in);
		String a=s1.readline();
Cement cm = new Cement(a);
	Cement total= new Cement("Ambuja",20);
	System.out.println(""+cm);
}

}