import java.util.Scanner;

public class input {
    public static void main(String[] args){
    System.out.println("Tacking Input form user");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number 1:");
    int a = sc.nextInt();
    System.out.println("Enter number 2");
    int b = sc.nextInt();
    int sum =a+b;
    System.out.println("Thes numbers sum" +sum);
    }
}
