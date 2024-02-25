public class FactorialRecursion {
    public static void main(String[] args) {
        System.out.println(printFactorial(5));
    }

    public static int printFactorial(int num){
        if (num == 1)
        return 1;

        return num * printFactorial(num - 1);
    }
}
