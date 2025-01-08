public class App {
    public static void main(String[] args) throws Exception {
        int one[] = {1,2,3,4,5,6,7,8,8,10};

        int two[] = {11,12,13,14,15,16,17,18,19,20};


        //find sum of arrays
        int yea =0;
        int sum = 0;
        for(int i = 0; i<one.length; i++) {
            sum = sum + one[i];
                
            }
        for(int i = 0; i<two.length; i++) {
            yea = yea + two[i];
        }
    
        System.out.println("The sum for array one is " + sum);
        System.out.println("The sum for array two is " + yea);
 
        

        //counting
        int even =  0;
        for(int i = 0; i<one.length; i++) {
            if(one[i] % 2 ==0) {
                even++;

            }
        
        }
        int ctwo = 0;
        for (int i = 0; i<two.length; i++) {
            if(two[i] % 2 ==0) {
                ctwo++;
            }
        }



        System.out.println("There are " + ctwo + "  even numbers in list two");
        System.out.println("There are " + even + "  even numbers in list one");
        


    }
}


    


