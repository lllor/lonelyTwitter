package ca.ualberta.cs.lonelytwitter;

//import currentmod;

public class MoodSad extends currentmod {
    MoodSad(){
        super();
    }
    MoodSad(String message){
        super(message);
    }

    public int mood(){
        return 2;
    }

    @Override
    public String getMessage(){
        String str = "I'm sad";
        return str;
    }
}
