package hw4Q2JavaVariables;

public class AboutMe {
	public byte myage;
	public short myaptnumber;
	public long myBankBalance;
	public double myGPA;
	public int myNum;
	public float myFloatNum;
	public char mySex;
	public boolean myStatus;
	public String myName;

	public AboutMe() {
		System.out.println("This is all about me: ");
	}

	public void aboutme() {
		System.out.println("My name: " + myName + "\nMy Age: " + myage + "\nMy APTnumber: " + myaptnumber
				+ "\nMy Bank Balance: " + myBankBalance + "\n My Sex: " + mySex + "\nMy GPA: " + myGPA
				+ "\nUS Citizen? Ans: " + myStatus);
	}
}
