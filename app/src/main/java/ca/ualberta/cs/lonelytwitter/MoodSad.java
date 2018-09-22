package ca.ualberta.cs.lonelytwitter;

//import currentmod;

import java.util.Date;

public class MoodSad extends currentmod {
    MoodSad(){
        super();
    }
    MoodSad(Date date){
        super(date);
    }



    @Override
    public String getMessage(){
        String str = "I'm sad";
        return str;
    }
}
