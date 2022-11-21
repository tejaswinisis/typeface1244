import java.util.*;
public class Main {

 public static String convertToBase3(int N){
 String result = "";
 while(N>0){
 int rem = N%3;
 N = N/3;
 result = rem + result;
 }
 return result;
 }

 public static void main(String[] args) {
 int N ;
 Scanner sc=new Scanner(System.in);
 N=sc.nextInt();
 System.out.println(convertToBase3(N));
 
 }
}
