import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CalculatorInnerClass {
    public static final Scanner SCANNER=new Scanner(System.in);
    public static void main(String[] args) {

        Calculator biFunction=new Calculator();
        System.out.println("Please enter the numbers");
        int a=nextInt();
        int b=nextInt();
        printCalculator(biFunction,a,b);


    }
    public static void printCalculator(BiFunction biFunction,Integer a,Integer b){
        int option=-1;
        while (option!=0){
            System.out.println("Please choose an option: 1 - addition; 2 - deduction; 3 - multiplication; 4 - division; 5 -exit");

            option=SCANNER.nextInt();

            switch (option){
                case 1:{
                    System.out.println(+(biFunction.a(a)+biFunction.b(b)));
                    break;
                }
                case 2:{
                    System.out.println(+(biFunction.a(a)-biFunction.b(b)));
                    break;
                }
                case 3:{
                    System.out.println(+(biFunction.a(a)*biFunction.b(b)));
                    break;
                }
                case 4:{
                    System.out.println(+(biFunction.a(a)/biFunction.b(b)));
                }
                case 5:{
                    System.exit(5);
                }
                default: {
                    System.out.println("Option not found!");
                }
            }
        }
    }
    private static int nextInt() {
        boolean ok = false;
        int i = 0;
        while (!ok) {
            try {
                i = next();
                ok = true;
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter the number!\nTry again");
            } catch (IOException e) {
                // ignore
            }
        }
        return i;
    }

    private static int next() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader.readLine());
    }

    private static class Calculator implements BiFunction{
        @Override
        public int a(Integer a) {
            return a;
        }

        @Override
        public int b(Integer b) {
            return b;
        }

    }
}
