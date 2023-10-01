package RedRover.M16_L;

import java.util.HashMap;
import java.util.Map;

public class Likes {

    /*
    key: value
    likes: 20,
    laugh: 15,
    care: 35,
    heart: 60
     */
    Map<String, Integer> likes = new HashMap<>();

    /**
     * Record somebody liking the post
     * @param likeType the type of like given
     */
    public void addLike (String likeType){
        int counter = likes.getOrDefault(likeType,0);
        counter ++;
        likes.put(likeType, counter);
    }

    public int getTotalLikes(){
        int total = 0;
        for (int count : likes.values()){
            total = total + count;
        }
        return total;
    }

    public void printTypes(){
        for(String likeType: likes.keySet()){
            System.out.println(likeType);
        }
    };


    public void printable(){
        System.out.println(likes);

    }

}
