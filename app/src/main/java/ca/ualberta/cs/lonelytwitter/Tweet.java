package ca.ualberta.cs.lonelytwitter;
import java.util.ArrayList;
import java.util.Date;
import ca.ualberta.cs.lonelytwitter.currentmod;
public abstract class Tweet {
    private Date date;
    private String message;
    ArrayList<currentmod> MoodList = new ArrayList<currentmod>();
    Tweet(){
        this.date = new Date();
        this.message = "defautl";
    }

    Tweet (String message){
        this.date = new Date();
        this.message = message;

    }
}
