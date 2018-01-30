package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Irasykite 2 skaicius");
	int a = sc.nextInt();
	int b = sc.nextInt();
	System.out.println("Suma: " + suma(a,b));
	System.out.println("Suma: " + suma((float) a, (float) b));
	System.out.println("Skirtumas: " + skirtumas (a,b));
	System.out.println("Skirtumas: " + skirtumas ((float) a, (float) b));
    }
    public static int suma(int a,int b){
        return (a+b);
    }
    public static float suma (float a, float b){
        return (a + b);
    }
    public static int skirtumas (int a, int b){
        return (a-b);
    }
    public static float skirtumas (float a, float b){
        return (a-b);
    }
}
