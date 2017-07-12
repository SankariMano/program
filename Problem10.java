import java.io.*;
import java.util.*;
public class Problem10 {
    public static void main(String[] args) throws IOException {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      
       
        Integer distance,speed,speed1,total,time,time1;
        distance=500;
        System.out.println("Speed");
        speed1=Integer.parseInt(br.readLine());
        speed=Integer.parseInt(br.readLine());
        time=(distance*1000)/(speed);
        time1=(distance*1000)/(speed);
        if(time<time1)
        System.out.println("time");
        else        
        System.out.println("time1");
 }
  
}
