package ca.ualberta.cs.lonelytwitter;

//import currentmod;

public class MoodHappy extends currentmod {
    MoodHappy(){
        super();
    }
    MoodHappy(String message){
        super(message);
    }

    public int mood(){
        return 1;
    }
    @Override
    public String getMessage(){
        String str = "I'm happy";
        return str;
    }
}
