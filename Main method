import java.util.Scanner;

public class PersonsTest
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      
      System.out.print("First name: ");
      String firstName = input.nextLine();
      
      System.out.print("Last name: ");
      String lastName = input.nextLine();
      
      System.out.print("Dislikes: ");
      String Dislike = input.nextLine();
      
      System.out.print("Likes: ");
      String Like = input.nextLine();
      
      Persons person = new Persons(firstName, lastName);
      
      person.setLikes(Like);
      person.setDislikes(Dislike);
     
      String fullName = firstName + " " + lastName;
      //verification
      if (person.getDislike() != Dislike)
      {
         System.out.print("Dislike:%d%n " person.getDislike());
      }
      
      if (person.getLike() != Like)
      {
         System.out.print("Like:%d%n " person.getLike()); 
      }
      
      if (person.getFullName() != fullname)
      {
         System.out.print("Full Name:%d%n " person.getFullName());
      }

    }
}
