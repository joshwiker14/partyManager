package partymanager;

import java.util.Scanner;
import java.util.ArrayList;

public class PartyManager {

    /**
     *
     * @param args
     */
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
                if (like.isEmpty()) {
                    loadingLikes = false;
                } else {
                    person.addLike(like);
                }
            }

            while (loadingDislikes) {
                System.out.print("Dislikes (blank line to end): ");
                String dislike = input.nextLine();
                if (dislike.isEmpty()) {
                    loadingDislikes = false;
                } else {
                    person.addDislike(dislike);
                }
            }

            attendees.add(person);

            System.out.print("\nAny more people (y/n)? ");
            String more = input.nextLine();

            loadingPeople = (more.equals("y"));
        }

        // create supplies based on likes and dislikes
        // dump list of attendees
        System.out.println("\n\nParty Attendees:");
        for(Persons person: attendees) {
	    System.out.println(person.getFullName());
        }

        // dump list of supplies people like
        System.out.println("\nPeople's Likes:");
        for(Persons person: attendees) {
            System.out.println(person.getLikesList());
        }
        
        // dump list of supplies people don't like
        System.out.println("\nPeople's Dislikes:");
        for(Persons person: attendees) {
            System.out.println(person.getDislikesList());
        }
    }

}
