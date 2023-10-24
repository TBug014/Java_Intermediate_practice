// Try with resources

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test27 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        int num = 0;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }
        // Whenever we want to close resourse we use finally 
        // finally{
        //     br.close();
        // }
    }
}
