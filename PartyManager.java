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

        // create supplies
        boolean gettingSupplies = false;
        boolean gettingDescription = true;
        
        System.out.println("\nLet's add some supplies.");
        do
        {
            Supplies supply = new Supplies();
            String name;
            int amount;
            String type;
            String description;
            String descriptionLine;
            
            System.out.print("New supply name: ");
            name = input.nextLine();
            supply.setItem(name);
            
            System.out.print("What kind of supply?: ");
            type = input.nextLine();
            supply.setItemType(type);
            
            System.out.print("How many?: ");
            amount = input.nextInt();
            supply.setAmount(amount);
            input.nextLine();
            
            description = "";
            do
            {
                System.out.print("What is it for?: ");
                descriptionLine = input.nextLine();
                
                if(descriptionLine.isEmpty())
                {
                    gettingDescription = false;
                }
                else
                {
                    description += descriptionLine;
                }
            }
            while(gettingDescription == true);
            
            supplies.add(supply);
            
            System.out.print("Any more supplies?(y/n): ");
            String more = input.nextLine();
            if(more.equals("n"))
            {
                gettingSupplies = false;
            }
        }
        while(gettingSupplies == true);
        
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
        
        // Print supplies
    }

}
