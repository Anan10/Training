class Bottle{
	String brand="Bisleri";
	int capacity;
	int price;
}
class TestBottle{

	public static void main(String[] args) {
		System.out.println("Bottle in making:");

		Bottle b1=new Bottle();
		b1.capacity=500;
		b1.price=12;
	    System.out.println("capacity of Bottle is"+b1.capacity+"price of Bottle:"+b1.price);

		Bottle b2=new Bottle();
		b2.capacity=1000;
		b2.price=15;
		System.out.println("Bottle is of brand:"+b2.brand+"capacity of:"+b2.capacity+"price is:"+b2.price);

		Bottle b3=new Bottle();
		
		b3.capacity=1500;
		b3.price=18;
		System.out.println("Bottle is of brand:"+b3.brand+"capacity is:"+b3.capacity+"price is"+b3.price);
	}
}