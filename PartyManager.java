package partymanager;

import java.util.Scanner;
import java.util.ArrayList;

public class PartyManager {

    public static void main(String[] args) {

        ArrayList<Persons> attendees = new ArrayList<>();
        ArrayList<Supplies> supplies = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        Boolean loadingPeople = true;

        // load people
        while (loadingPeople) {
            Boolean loadingLikes = true;
            Boolean loadingDislikes = true;

            System.out.print("First name: ");
            String firstName = input.nextLine();
            System.out.print("Last name: ");
            String lastName = input.nextLine();

            Persons person = new Persons(firstName, lastName);

            while (loadingLikes) {
                System.out.print("Likes (blank line to end): ");
                String like = input.nextLine();
                if (like.equals("")) {
                    loadingLikes = false;
                } else {
                    person.addLike(like);
                }
            }

            while (loadingDislikes) {
                System.out.print("Dislikes (blank line to end): ");
                String dislike = input.nextLine();
                if (dislike.equals("")) {
                    loadingDislikes = false;
                } else {
                    person.addDislike(dislike);
                }
            }

            attendees.add(person);

            System.out.print("any more people (y/n)? ");
            String more = input.nextLine();

            loadingPeople = (more.equals("y"));
        }

        // create supplies based on likes and dislikes
        // dump list of attendees
        System.out.print("\nParty Attendees:\n");
        for(Persons person: attendees) {
	    System.out.print(person.getFullName());
            System.out.print("\n");
        }

        // dump list of supplies people like
        System.out.print("\nPeople's Likes:\n");

        // dump list of supplies people don't like
        System.out.print("\nPeople's Dislikes:\n");
    }

}
