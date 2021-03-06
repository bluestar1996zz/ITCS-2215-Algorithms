import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Brandon on 6/11/2016.
 *
 * The main list used to populate the skip list
 */
public class Main {

    public static void main(String args[]){

        ArrayList<Integer> temp = new ArrayList<Integer>();

        //Read the file and populate the arrayList
        try {
            /*
                NOTE: This is a relative path
             */
            Scanner scan = new Scanner(new File("numInput.txt"));
            while(scan.hasNextInt()) {
                temp.add(scan.nextInt());
            }
        } catch (Exception e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }

        SkipList skippy = new SkipList(temp.remove(0), temp.remove(0));

        //Add the integers to the skip list
        for (int i: temp){
            skippy.add(i);
        }

        //Print out the levels
        skippy.printLevels();


    }
}
