public class App {
    
String st = "at";
for(int a=0; a<st.length(); a++)
{
   for(int b=1;b<=a;b++){
      System.out.print(" ");
   }
   for(int c=a;c<=st.length()/2+1;c++){
      System.out.print(st.charAt(a));
   }
}
}