package partymanager;

import java.util.ArrayList;

public class Persons {

    private String fullName;
    private ArrayList<String> likes;
    private ArrayList<String> dislikes;

    public Persons() {
        likes = new ArrayList<>();
        dislikes = new ArrayList<>();
    }
    public Persons(String fName, String lName) {
        likes = new ArrayList<>();
        dislikes = new ArrayList<>();
        setFullName(fName, lName);
    }

    public void setFullName(String name, String name2) {
        this.fullName = name + " " + name2;
    }

    public ArrayList<String> getLikesList() {
        return likes;
    }

    public void setLikes(ArrayList<String> food2) {
        this.likes = food2;
    }

    public String getFullName() {
        return this.fullName;
    }

    public ArrayList<String> getDislikesList() {
        return dislikes;
    }

    public void setDislikes(ArrayList<String> dislikes) {
        this.dislikes = dislikes;
    }

    public void addLike(String food) {
        likes.add(food);
    }

    public void removeLike(String food) {
        likes.remove(food);
    }

    public void addDislike(String food) {
        dislikes.add(food);
    }

    public void removeDislike(String food) {
        dislikes.remove(food);
    }
}
