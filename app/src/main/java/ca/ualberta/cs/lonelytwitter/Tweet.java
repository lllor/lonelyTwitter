package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by shida3 on 1/19/17.
 * @see ca.ualberta.cs.lonelytwitter.Tweetable
 * @see ca.ualberta.cs.lonelytwitter.TweetTooLongException
 */

public abstract class Tweet implements Tweetable{
    /**
     * The Date of current Tweet
     */
    private Date date;
    /**
     * The message that the use entered
     */
    private String message;

    /**
     * The default constructor, save the user's message with a default date
     * @param message gjhg
     */
    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    /**
     * The constructor, save the user's message with a entering date
     * @param date is the date which provide by user
     * @param message is the message which provide by user
     */
    public Tweet(Date date, String message){
        this.message = message;
        this.date = date;
    }

    /**
     * The method that will return the Date of some message in Date type
     * @return date which belong to the significant Tweet Object
     */
    public Date getDate() {
        return date;
    }

    /**
     * This method will change the date of some message = date,
     * @param date which is proved by user
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * This method will return the significant Tweet's message
     * @return message
     */
    public String getMessage() {
        return message;
    }

    /**
     * The method will check the valid of message and save/throw the message
     * @param message which provided by user
     * @throws TweetTooLongException if a long tweet has be fined
     */
    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() > 140){
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    /**
     * This method will be implement in NormalTweet & Important Tweet
     * @return a boolean type variable
     */
    public abstract Boolean isImportant();

    /**
     * This method will combine date and message into a string
     * @return a string like  20180930 | HellWorld
     */
    @Override
    public String toString(){
        return date.toString() + " | " + message;
    }

}
