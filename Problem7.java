import java.io.*;
public class Problem7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String a=br.readLine();
        String b=br.readLine();
        if(a.equalsIgnoreCase(b))
        {
            System.out.println("Identical");
        }  else   
         System.out.println("Not Identical");
 }
    
}
