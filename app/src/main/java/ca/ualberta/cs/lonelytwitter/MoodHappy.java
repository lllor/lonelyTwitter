package ca.ualberta.cs.lonelytwitter;

//import currentmod;

import java.util.Date;

public class MoodHappy extends currentmod {
    MoodHappy(){
        super();
    }
    MoodHappy(Date date){
        super(date);
    }


    @Override
    public String getMessage(){
        String str = "I'm happy";
        return str;
    }
}
