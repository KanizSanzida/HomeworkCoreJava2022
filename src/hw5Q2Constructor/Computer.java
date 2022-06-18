package hw5Q2Constructor;

public class Computer {
	public String brand;
	public String model;
	public String operatingSystem;
	public int price;
	public char grade;
	public boolean madeInUSA;

	public Computer() {
		System.out.println("This is from default constructor of Computer Class");
	}
	public Computer( String brand, String model, String operatingSystem, int price, char grade, boolean madeInUSA) {
		System.out.println("My Brand: "+brand +"\nModel: "+model +"\nOperating system: "+ operatingSystem+ "\nPrice: "+price +"\nGrade: "+grade + "\nMade in USA: "+madeInUSA);
	}





}
