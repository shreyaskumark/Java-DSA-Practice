import java.util.Scanner;

public class TowerOfHanoiDemo{
    public static int count = 0;
    public static void main(String[] args) {
        System.out.print("Enter the number of discs : ");
        Scanner sc = new Scanner(System.in);

        int discs = sc.nextInt();
        sc.close();
        int source = 1, aux = 2, dest = 3;
        toh(discs, source, dest, aux);
        System.out.println("Number of operations : "+count);
    }

    public static void toh(int discs, int source , int dest, int aux){
        if(discs == 1){
            System.out.println("Moving disc "+discs+" from rod "+source+" to rod "+dest);
            count++;
            return;
        }

        toh(discs - 1, source, aux, dest);
        System.out.println("Moving disc "+discs+" from rod "+source+" to rod "+dest);
        count++;
        toh(discs - 1, aux, dest, source);
    }
}