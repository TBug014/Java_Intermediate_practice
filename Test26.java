// User input using Buffereader and Scanner

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test26 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a Number : ");
        
        // BufferReader

        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);
        // int num =Integer.parseInt(bf.readLine());

        // Scanner
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(num);
    }
}
