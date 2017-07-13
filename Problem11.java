              import java.io.*;
import java.util.*;
public class Problem11{
    public static void main(String[] args) throws IOException {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      
       
        Integer distance,speed,speed1,total,time,l,b;
        System.out.println("Speed");
        speed1=Integer.parseInt(br.readLine());
        System.out.println("time");        
         time=Integer.parseInt(br.readLine());
       speed=(speed1*1000)/60;
       distance=(speed*time)/2;
      Integer x=distance/10;
      l=3*x;
      b=2*x;
      Integer total=l*b;
       
        
              
               System.out.println(total);
                              
 }
  
}

