package ca.ualberta.cs.lonelytwitter;

//import currentmod;

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
