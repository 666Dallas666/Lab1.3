package com.company;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num = reader.readLine();
        int num1 = Integer.parseInt(num);
        System.out.println(Factorial(num1));
    }
    static int Factorial(int a) {
        int fact = 1;
        for(int i = 1; i <=a; i++){
            fact = fact*i;
        }
        return fact;
    }
}
