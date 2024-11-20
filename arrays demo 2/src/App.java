import java.util.Scanner;

public class App {
    private static void printArr() {
        System.out.println("Your list of numbers is: ");
        for(int i = 0; i<nums.length; i++) {
            System.out.println(nums[i] + ",");

    }
    // output the last value with a new line
    System.out.println(nums[nums.length-1] + ".");
    
    public static void main(String[] args) throws Exception {
        private Scanner imp = new Scanner(System.in);
        private int[] nums = null; //declaring the array

        System.out.println("How many numbers would you like to input? ");
        int SIZE = imp.nextInt();

        nums = new int[SIZE];
        
        for(int i = 0; i < nums.length; i++) {
            System.out.println("Please enter an integer");
            nums[i] = imp.nextInt();
        }
        printArr();
        for(int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * 2;

        }
        printArr();


    }


}
}
