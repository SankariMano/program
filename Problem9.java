import java.util.*;
public class Problem9{
    public static void main(String[] args) throws IOException {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       List<Integer> x=new<Integer> ArrayList();
       Integer y;
                for(int i=100;i<=999;i++)
               {
                  if((i%6)==0) {
                     y=i;
                     x.add(y) ;
                  }
               }
         System.out.println(x);
 }
    
}
