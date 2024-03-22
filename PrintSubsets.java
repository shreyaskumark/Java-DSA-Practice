import java.util.Scanner;

public class PrintSubsets{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");

        String input = sc.next();
        sc.close();
        subsets(input, "");
    }

    public static void subsets(String input, String output){
        if( input == ""){
            System.out.println(output);
            return;
        }

        String output1 = output;
        String output2 = output;

        output2 += input.charAt(0);
        input = input.substring(1,input.length());

        subsets(input, output1);
        subsets(input, output2);

        return;

    }
}