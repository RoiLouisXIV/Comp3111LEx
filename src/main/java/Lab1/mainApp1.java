package Lab1;
/* Comp3111Lex\Lab1\mainApp1.java
Main application for Lab1 exercise */
public class mainApp1 {
    public static void main(String[] args) { //First super useful comment, public is optional here
        int b = 2; //this is another super useful comment but anyway b = 2
        int n = 11;
        //bunch of System.out.println, did you know that you can type sout and then enter as a shortcut ?
        System.out.println("Program ..starting...");
        System.out.println("1+1 = " + 2);
        System.out.println(b+" to power "+n+" = "+ myLibrary.Power(b,n));
        System.out.println(n+"! = " + myLibrary.factorial(n));
        System.out.println("Program ..Ended …");
    }
}