//Husam Muneeb
//March 3,2020
//CS 3010
//Task #2
import java.util.Scanner; //Scanner
public class TowerOfHanoi {
	public static void main(String args[])   
    { 
    	Scanner kb=new Scanner(System.in); //Scanner variable
    
        System.out.print("Number of Disks?: ");
        int n=kb.nextInt(); //Number of discs from user. 
        long startTime = System.currentTimeMillis(); 
        towerOfHanoi(n, 'A', 'C', 'B');  // calling the method for the number of discs and Rods A,B,C .
        long endTime = System.currentTimeMillis(); 
        
        System.out.println("\nTime it took to move the discs from rod to rod " + 
                (endTime-startTime) + " milliseconds");
    } 
	public static void towerOfHanoi(int n, char fromRod, char ToRod, char MiddleRod) 
    { 
        if (n == 1) //If the number of disks are equal to 1 
        { 
            System.out.println("Move disk 1 from rod " +  fromRod + " to rod " + ToRod); //Print out each disc moving from 1 rod to the other. 
            return; //return from which rod, and the rod the disk is moving to 
        } 
        towerOfHanoi(n-1, fromRod, MiddleRod, ToRod); //Recursive method of calling the tower to keep moving the discs from rod to rod.
        System.out.println("Disk " + n + " from rod " +  fromRod + " to rod " + ToRod);  //Return the disc number and which rods its being moved from
        towerOfHanoi(n-1, MiddleRod, ToRod, fromRod); //Recursive call to keep moving the discs from rod to rod. 
    }   
} 
       
