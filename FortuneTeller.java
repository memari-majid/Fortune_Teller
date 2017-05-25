
//import java.util.Random;
//import java.util.ArrayList;
import java.util.*;

public class FortuneTeller {
	//////// fields /////////////////
	private ArrayList fortuneList = new ArrayList();
	// private String[] fortuneArray = {"You will go on a trip",
	// "You will make a new friend",
	// "You will get sick",
	// "You will get a new pet",
	// "You will eat some food",
	// "You will take up a new hobby",
	// "You will get a boat",
	// "You will break up with your friend",
	// "You will sleep too late",
	// "You will have fun today"};
	private String pickedFortune = null;
	private Random randNumGen = new Random();

	//////////////// constructors ////////////////
	public FortuneTeller() {
		this.fortuneList.add("You will have fun today");
		this.fortuneList.add("You will sleep too late");
		this.fortuneList.add("You will break up with your friend");
		this.pickFortune();
	}

	////////////// method //////////////////////
	public String toString() {
		return "Your fortune is: " + this.pickedFortune;
	}

	public void showFortune() {
		if (this.fortuneList.size() > 0) {

			// use SimpleOutput to show the picked fortune
			SimpleOutput.showInformation("Your fortune is: " + this.pickedFortune);
			this.fortuneList.remove(this.pickedFortune);
			if (this.fortuneList.size() > 0)
				this.pickFortune();
			// int index =
			// this.randNumGen.nextInt(this.fortuneArray.length);
			// this.pickedFortune = this.fortuneArray[index];
		} else {
			SimpleOutput.showInformation("No more fortunes");
		}
	}

	private void pickFortune() {

		// int index =
		// this.randNumGen.nextInt(this.fortuneArray.length);
		// this.pickedFortune = this.fortuneArray[index];
		int index = this.randNumGen.nextInt(this.fortuneList.size());
		this.pickedFortune = (String) this.fortuneList.get(index);
	}

	public static void main(String[] args) {
		FortuneTeller teller = new FortuneTeller();
		teller.showFortune();
		teller.showFortune();
		teller.showFortune();
		teller.showFortune();
	}

}