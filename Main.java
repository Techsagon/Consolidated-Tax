import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter you income: ");
        int income = input.nextInt();
        int temp = 0, tax = 0;
        if(income < 10000){
            System.out.println("You owe $" + tax + " in taxes.");
        } else {
            if(income > 40000){
                temp = income - 40000;
                tax += temp * 25 / 100;
                income -= temp;
            }
            if(income > 20000){
                temp = income - 20000;
                tax += temp * 10 / 100;
                income -= temp;
            }
            if(income > 10000){
                temp = income - 10000;
                tax += temp * 5 / 100;
                income -= temp;
            }
            System.out.print("You owe $" + tax + " in taxes.");
            
        }
    }
}
