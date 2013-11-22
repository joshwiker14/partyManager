
public class People {
	
	private String fullName;
	private String disLikes;
	private String likes;
    // constructor
	public People(String fName, String lName){
		fullName = fName + " " + lName; 
	}

	public void setfullName (String name, String name2){
		this.fullName = name+ " " + name2;
	}
	
	public void setdisLike (String food){
		this.disLikes = food;
	}
	
	public void setlikes (String food2){
		this.likes = food2;
	}
	
	public String getdislikes(){
		return this.likes;
	}
	
	public String getfullName(){
		return this.fullName;
	}
	
	public String getdisLikes(){
		return this.disLikes;
	}
	
}
