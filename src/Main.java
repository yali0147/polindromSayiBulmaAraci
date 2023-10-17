import java.util.Scanner;
public class Main {
    static boolean isPolindrome(int number){
        int temp=number,reverseNumber=0,lastNumber;
        while(temp!=0) {
            lastNumber=temp%10;
            reverseNumber=(reverseNumber*10)+lastNumber;
            temp/=10;
        }
        if (number == reverseNumber) {
            System.out.println(number+" ' Sayıası Polindrom Sayıdır.");
            return true ;
        }else {
            System.out.println(number+" ' Sayıası Polindrom Sayı değildir.");
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println("Polindrom Sayı Bulma Aracı");

        Scanner inp =new Scanner(System.in);
        System.out.print("Sorgulmak istediğiniz Sayıyı Giriniz : ");
        int inpNumber = inp.nextInt();
        System.out.println(isPolindrome(inpNumber));
    }
}