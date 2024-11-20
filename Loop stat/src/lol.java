import java.util.Scanner;



public class lol
 {
    public int count, stop;
    


    public stat( count, stop) {

        
        Scanner no = new Scanner(System.in);
        System.out.println("Give a number you would like to start with:: ");
        count = no.nextInt();
        System.out.println("Give another number larger than your start:: ");
        stop = nno.nextInt();

        for(int i = 0; i<stop.length; i++) {
            if(stop[i] < stop) {
                count++;
            }
        }
    
        sum = o;
        for(int i = 0; i<stop.length; i++) {
            sum = sum + stop[i];   
        }
        System.out.println("The sum is: " + sum);

        

    }
}
