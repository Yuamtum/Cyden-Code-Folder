public class App {
    public static void main(String[] args) throws Exception {
        int num  =0;
        while (num>0){
            System.out.println(num);
            num --;

        //num = num = 1;
            

        }
        // game loop or program loop
        boolean game = true; //trigger vairable
        while(game){
            //program code or game code or calculations
            System.out.println("hello universe");
            // kill switch, play again method
            System.out.println("Do you wanr to play again?");
            String userinput = "no"; // getting user respnose
            
            
        if (userinput.equals("no")) {
            game = false; // Trigger game to end 
        }
        }

        // Standard For loop in Java
        // three conditions
        // F0r(where we start; where we end, step size)
        for (int 1 = 10; 1>0; 1--) {
            System.out.println("The number is" + 1);
        }

        //Equivillant While 
        int x = 0;
        while(x>0) {
            System.out.println("The number is" + x);
            x--;
        }
    }
}
