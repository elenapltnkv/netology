package base_java.cycles;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
int sum =0;
        while (true){
            System.out.println("Введите число или end для завершения программы");
            String input = scanner.nextLine();
            if(input.equals("end")){
                //System.out.println("Ваше число: "+sum);
                break;
            }
            int x = Integer.parseInt(input);
            sum+=x;
            //
        }
        System.out.println("Ваше число: "+sum);
    }
}
