//**************************************************************************************************************************************************************//
//  Applicant.java                                                                                                                                                //
//                                                                                                                                                              //
//  Claire Jane T00783917                                                                                                                                       //
//  Sept 14, 2025                                                                                                                                               //
//  COMP 1231 Assignment 4 Question 1                                                                                                                           //
//  This class represents an Applicant with a name and typing speed in wpm. It implements the Comparable interface to allow for sorting based on typing speed.  //   
//  The class includes methods for getting and setting the applicant's name and typing speed, as well as a toString method for displaying the information.      //
//**************************************************************************************************************************************************************//


public class Applicant implements Comparable<Applicant>{
    private String name;
    private int typingSpeed;

//Constructor
    public Applicant(String name, int typingSpeed){
        this.name = name;
        this.typingSpeed = typingSpeed;
    }
//Getters
    public String getName(){
        return name;
    }

    public int getTypingSpeed(){
        return typingSpeed;
    }
//Setters

    public void setName(String name){
        this.name = name;
    }

    public void setTypingSpeed(int typingSpeed){
        this.typingSpeed = typingSpeed;
    }

//Custom compareTo function
    @Override
    public int compareTo(Applicant other){
        return Integer.compare(other.typingSpeed, this.typingSpeed);
    }

//Custom toString for oneliners about each applicant
    @Override 
    public String toString(){
        return String.format("Name=%s;   Typing Speed(words/min)=%d", name, typingSpeed);
    }

}
