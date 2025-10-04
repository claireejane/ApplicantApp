//**************************************************************************************************************************************************************//
//  Group.java                                                                                                                                                  //
//                                                                                                                                                              //
//  Claire Jane T00783917                                                                                                                                       //
//  Sept 14, 2025                                                                                                                                               //
//  COMP 1231 Assignment 4 Question 1                                                                                                                           //
//  This class represents a group of applicants, allowing for adding, removing, and managing members. It provides methods to add and remove members,            //
//  check the number of members, and retrieve the list of members. The class uses generics to allow for different types of members to use the group.            //                                                                          
//**************************************************************************************************************************************************************//

import java.util.ArrayList;

public class Group <T> {
//Declares array list to hold group members
    private ArrayList<T> aList;
//Initializes aList as a new, empty array list
    public Group(){
        aList = new ArrayList<>();
    }
//Adds a member to the group
    public void addToGroup(T t){
        aList.add(t);
    }
//Removes the last member from the group
    public T removeFromGroup(){
        //if(aList.isEmpty()){
        //    throw new IllegalStateException("No candidate in the list.");
        //} Don't need this anymore, as it is handled in ApplicantApp
        return aList.remove(aList.size()-1);
    }
//Removes a specific member from the group
    public T removeFromGroup(T t){
        //if(aList.isEmpty()){
        //    throw new IllegalStateException("No candidate in the list.");
        //} Don't need this anymore, as it is handled in ApplicantApp
        return aList.remove(aList.indexOf(t));
    }
//Gives the size of the list
    public int getNumberOfMembers(){
        return aList.size();
    }
//Returns the actual array list
    public ArrayList<T> getMembers(){
        return aList;
    }
//Checks if the array list is empty
    public boolean hasNoMember(){
        return aList.isEmpty(); 
    }
//Prints all the information strings for each member
    @Override
    public String toString(){
        String result = "";
        for (T member : aList) {
            result += member.toString() + "\n";
        }
        return result;
    }
}
