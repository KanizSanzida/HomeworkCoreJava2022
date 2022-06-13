package hw3JavaVariables;

public class AboutMe {
	public byte myage = 22; // variable Initialized
	public short myaptnumber; // variable declared
	public long myBankBalance = 9223372036854775807l; // variable Initialized
	public double myGPA = 3.54; // variable Initialized
	public int myNum = 5; // variable Initialized
	public float myFloatNum = 5.99f; // variable Initialized
	public char myLetter; // variable declared
	public boolean myBool = true; // variable Initialized
	public String myText = "Hello"; // variable Initialized

	public static void main(String[] args) {
		AboutMe aboutme = new AboutMe();
		System.out.println("My age is " + aboutme.myage);
		System.out.println("My message is " + aboutme.myText);
		System.out.println("My GPA is " + aboutme.myGPA);
	}

}
