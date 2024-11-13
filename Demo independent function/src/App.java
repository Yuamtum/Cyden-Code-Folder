public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        System.out.println(" 4 double is " + numDouble(num:4));
        System.out.println("4 double is " + numDouble(num:2));
        System.out.println("4 double is " + numDouble(num:17));
        System.out.println("4 double is " + numDouble(num:1313));
    }


    public static int numDouble(int num) {
        int ans = num * 2;

        return ans;
    }
}
