import java.util.ArrayList;


public class Persons {
	
	private String fullName;
	private ArrayList<String> likes;
	private ArrayList<String> dislikes;

	public People(String fName, String lName){
		fullName = fName + " " + lName; 
	}
	
	public void setFullName (String name, String name2){
		this.fullName = name+ " " + name2;
	}
	
	public ArrayList<String> getLikesList() {
		return Likes;
	}
	
	public void setLikes (ArrayList<String> food2){
		this.likes = food2;
	}
	
	public String getFullName(){
		return this.fullName;
	}
	
	public ArrayList<String> getDislikesList() {
		return dislikes;
	}

	public void setDislikes(ArrayList<String> dislikes) {
		this.dislikes = dislikes;
	}
	public void addLike(String food){
		likes.add(food);
	}
	public void removeLike(String food){
		likes.remove(food);
	}
	
	public void addDislike(String food) {
		dislikes.add(food);
	}
	
	public void removeDislike(String food) {
		dislikes.remove(food);
	}
}
