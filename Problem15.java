import java.io.*;
import java.util.*;
public class Problem {
    public static void main(String[] args) throws IOException {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      
       System.out.println("Enter the number");
        Integer x=Integer.parseInt(br.readLine());
        Integer y=Integer.parseInt(br.readLine());
              
               System.out.println("Enter operation to be performed:");
               Character c=(char)br.read();
               switch(c){
                   case '+':
                      System.out.println(x+y);
                      break;
                   case '-':
                        System.out.println(x-y);
                        break;
                   case '/':
                       System.out.println(x/y);
                       break;
                   case '*':
                       System.out.println(x*y);
                       break;
                   default:
                       System.out.println("Invalid Input");
               }
               
 }
    
}
