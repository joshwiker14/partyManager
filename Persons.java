package partymanager;

import java.util.ArrayList;

/**
 *
 * @author josh
 */
public class Persons {

    private String fullName;
    private ArrayList<String> likes;
    private ArrayList<String> dislikes;

    /**
     *
     */
    public Persons() {
        likes = new ArrayList<>();
        dislikes = new ArrayList<>();
    }

    /**
     *
     * @param fName
     * @param lName
     */
    public Persons(String fName, String lName) {
        likes = new ArrayList<>();
        dislikes = new ArrayList<>();
        setFullName(fName, lName);
    }

    /**
     *
     * @param name
     * @param name2
     */
    public void setFullName(String name, String name2) {
        this.fullName = name + " " + name2;
    }

    /**
     *
     * @return
     */
    public ArrayList<String> getLikesList() {
        return likes;
    }

    /**
     *
     * @param food2
     */
    public void setLikes(ArrayList<String> food2) {
        this.likes = food2;
    }

    /**
     *
     * @return
     */
    public String getFullName() {
        return this.fullName;
    }

    /**
     *
     * @return
     */
    public ArrayList<String> getDislikesList() {
        return dislikes;
    }

    /**
     *
     * @param dislikes
     */
    public void setDislikes(ArrayList<String> dislikes) {
        this.dislikes = dislikes;
    }

    /**
     *
     * @param food
     */
    public void addLike(String food) {
        likes.add(food);
    }

    /**
     *
     * @param food
     */
    public void removeLike(String food) {
        likes.remove(food);
    }

    /**
     *
     * @param food
     */
    public void addDislike(String food) {
        dislikes.add(food);
    }

    /**
     *
     * @param food
     */
    public void removeDislike(String food) {
        dislikes.remove(food);
    }
}
