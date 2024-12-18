package JAVA101;
import java.util.Scanner;
public class onyedinci_ornek {
    public static void main(String[] args) {
        int a ,i , top=0,counter=0,ort=0;
        Scanner input = new Scanner(System.in);

        System.out.print("sayı giriniz: ");
        a = input.nextInt();

        for(i=0;i<=a;i++){
            if((i%3==0) && (i%4==0)){
                top+=i;
                counter ++;
            }
        }
        ort=top/counter;
        System.out.println("3e ve 4e bölünen sayıların ortalaması: "+ort);
    }
}