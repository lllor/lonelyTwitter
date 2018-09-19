package ca.ualberta.cs.lonelytwitter;
import java.util.ArrayList;
import java.util.Date;
public abstract class currentmod {
    private Date date;
    private String message;
    private ArrayList mood;

    currentmod(){
        this.date = new Date();
        this.message = "I am a default message";
    }

    currentmod(String message){
        this.date = new Date();
        this.message = message;
    }

    public Date getDate() {return this.date;}

    public abstract String getMessage();




}
