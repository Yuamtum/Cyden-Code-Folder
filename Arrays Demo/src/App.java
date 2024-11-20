import javafx.scene.input.ScrollEvent;

public class App {
    public static void main(String[] args) throws Exception {
        
        //list of data(solution set)
        //Declare the array


        String[] names = {"wolf", "Sutter", "cook","fox","golden"};
        int[] scores = {9000, 7001, 1337, 2038, 4096};
        
        
        // int[] scores = null;
        // String[] names = null;


        //create  or initialize the array

        // scores = new int[10];
        // names = new String[10];

        //assign values of array
        names[0] = "wolf";
        scores[0] = 9000;


        //array length property
        System.out.println("Scores length is " + names.length);


        //output
        for (int i = 0; i< names.length; i++)
        System.out.println(names[i] + ": " + scores[i]);

        //output in reverse order
        for (int i = names.length-1; i >=0; i--) {
            System.out.println(names[i] + ": " + scores[i]);
        }
        //find the sum of the array
        int sum = 0;
        for (int i = 0; i < names.length; i++) {
            sum = sum + scores[i];
        }
        System.out.println("The sum is " + sum);
        
        //count elements of an array
        int count = 0;
        for (int i = 0; i<scores.length; i++) {
            if(scores[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("There are " + count + "even nummbers");if
    }

}
