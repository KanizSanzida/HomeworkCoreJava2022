package hw4Q2JavaVariables;

public class AboutMeTest {

	public static void main(String[] args) {
		AboutMe aboutMe = new AboutMe();
		aboutMe.myName = "Peyal";
		aboutMe.myage = 22;
		aboutMe.myaptnumber = 344;
		aboutMe.myBankBalance = 4459856l;
		aboutMe.myGPA = 3.45;
		aboutMe.mySex = 'F';
		aboutMe.aboutme();

		AboutMe alex = new AboutMe();
		alex.myName = "Alex";
		alex.myage = 28;
		alex.myaptnumber = 54;
		alex.myBankBalance = 57754459856l;
		alex.myGPA = 3.02;
		alex.mySex = 'M';
		alex.myStatus = true;
		alex.aboutme();

	}

}
