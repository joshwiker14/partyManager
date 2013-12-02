import java.util.Scanner;
import java.util.ArrayList;
import Persons;
import Supplies;

public class Main {

    private ArrayList<Persons> attendees;
    private ArrayList<Supplies> supplies;

    public void main(String[] args) {

	Scanner input = new Scanner(System.in);
	Boolean loadingPeople = True;

	// load people
	while (loadingPeople) {
	    Boolean loadingLikes = True;
	    Boolean loadingDislikes = True;

	    System.out.print("First name: ");
	    String firstName = input.nextLine();
	    System.out.print("Last name: ");
	    String lastName = input.nextLine();

	    Persons person = new Persons(firstName, lastName);

	    while (loadingLikes) {
		System.out.print("Likes (blank line to end): ");
		String like = input.nextLine();
		if (like == "") {
		    loadingLikes = False;
		} else {
		    person.addLike(like);
		}
	    }

	    while (loadingDislikes) {
		System.out.print("Dislikes (blank line to end): ");
		String dislike = input.nextLine();
		if (dislike == "") {
		    loadingDislikes = False;
		} else {
		    person.addDislike(dislike);
		}
	    }

	    attendees.add(person);

	    System.out.print("any more people (y/n)? ");
	    String more = input.nextLine();

	    loadingPeople = (more == "y");
	}

	// create supplies based on likes and dislikes

	// dump list of attendees
	System.out.print("\nParty Attendees:\n");
	foreach (Persons person : attendees) {
	    System.out.print(person.getFullName());
	    System.out.print("\n");
	}

	// dump list of supplies people like
	System.out.print("\nPeople's Likes:\n");

	// dump list of supplies people don't like
	System.out.print("\nPeople's Dislikes:\n");
    }
}
