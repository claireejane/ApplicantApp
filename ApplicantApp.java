//**************************************************************************************************************************************************************//
//  ApplicantApp.java                                                                                                                                           //
//                                                                                                                                                              //
//  Claire Jane T00783917                                                                                                                                       //
//  Sept 14, 2025                                                                                                                                               //
//  COMP 1231 Assignment 4 Question 1                                                                                                                           //
//  This driver class prints outputs designed to match the sample exhibits, creating applicants, adding them to a group, and then performing various operations //   
//  on the group, such as removing those that do not meet the standard threshhold, removing the applicant last in the list and sorting all remaining applicants.//
//**************************************************************************************************************************************************************//

import java.util.Iterator;
public class ApplicantApp {
    public static void main(String[] args){
    //Standard applicant for comparisons
    Applicant standard = new Applicant("Test",59);
    //Rest of applicants
    Applicant a1 = new Applicant("Jae", 80);
    Applicant a2 = new Applicant("Claire", 63);
    Applicant a3 = new Applicant("Cath", 60);
    Applicant a4 = new Applicant("Steph", 85);
    Applicant a5 = new Applicant("Rick", 61);
    Applicant a6 = new Applicant("Sophie", 50);
    Applicant a7 = new Applicant("Smudge", 30);
    Applicant a8 = new Applicant("Charlie", 52);
    Applicant a9 = new Applicant("Diane", 83);

    //Initializes them and adds them to a group
    Group<Applicant> candidates = new Group<>();
    candidates.addToGroup(a1);
    candidates.addToGroup(a2);
    candidates.addToGroup(a3);
    candidates.addToGroup(a4);
    candidates.addToGroup(a5);
    candidates.addToGroup(a6);
    candidates.addToGroup(a7);
    candidates.addToGroup(a8);
    candidates.addToGroup(a9);

    //Begins to execute similar to sample exhibit, printing all of the applicants, unordered, then their amount.
    System.out.println("The following applicants are applying for the job:");
    System.out.println(candidates.toString());
    System.out.println(String.format("Total number of applicants = %d \n", candidates.getNumberOfMembers()));

    //Compares and sorts applicants who do not fulfill requirements, removing them, then printing the remaining who do.
    System.out.println("Applicants who do not fulfill typing speed test requirement:");
    Iterator<Applicant> iterator = candidates.getMembers().iterator();
    while(iterator.hasNext()){
        Applicant applicant = iterator.next();
        if((applicant.compareTo(standard))>=0){
            System.out.println("Remove: " + applicant.toString());
            iterator.remove();
        }
    }
    System.out.println("\nCandidates who have fulfilled typing speed test requirement:");
    if(candidates.hasNoMember()){
        System.out.println("No candidate has been selected!");
    }else{
        System.out.println(candidates.toString());
    }
    //Removes the last candidate
    System.out.println("\nThe following candidate who submitted the application last has been removed from the list:");
    if(candidates.hasNoMember()){
        System.out.println("No candidate in the list.");
    }else{
        System.out.println("Remove: " + candidates.removeFromGroup().toString());
    }
    //Sorts the candidates in descending order
    System.out.println("\nThe candidates are sorted in a descending order based on their typing speed :");
    if(candidates.hasNoMember()){
        System.out.println("No candidate in the list.");
    }else{
        candidates.getMembers().sort(null);
        System.out.println(candidates.toString());
    }
}
}
