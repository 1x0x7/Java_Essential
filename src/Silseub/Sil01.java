package Silseub;
import java.util.Scanner;

public class Sil01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수 10개>>");
        int[] num = new int[10];
        for (int i = 0; i < 10; i++) {
            num[i] = scanner.nextInt();
        }
        scanner.close();
    StringBuilder sb = new StringBuilder();
    for(int i = 0;i<10;i++){
        if(num[i]!=0 && num [i]%3==0){
            if(i>0 && sb.length()!=0){
                sb.append(", ");
            }
            sb.append(num[i]);
        }
    }
    System.out.println(sb);
    }

}
