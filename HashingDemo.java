import java.util.Scanner;

public class HashingDemo {
    public static void main(String[] args) {

    //Number Hashing 

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int size = sc.nextInt();

        int[] input = new int[size];
        int[] hash = new int[size+1];

        //Pre-compute
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<size;i++){
            input[i] = sc.nextInt();
            hash[input[i]]++;
        }

        //Fetch
        System.out.println("Enter count of numbers to check frequency");
        int count = sc.nextInt();
        while(count != 0){
            System.out.println("Enter the number");
            int num = sc.nextInt();
            System.out.println("Frequency : "+hash[num]);
            count--;
            }

    //Character hashing

        System.out.println("Enter String");
        String str = sc.next();
        
        int[] chash = new int[26];

        //Pre-compute
        for(int i=0;i<str.length();i++){
            chash[str.charAt(i) - 'a']++; 
        }

        //Fetch
        System.out.println("Enter count of characters to check frequency");
        int ccount = sc.nextInt();
        while(ccount != 0){
            System.out.println("Enter the character");
            char ch = sc.next().charAt(0);
            System.out.println("Frequency : "+chash[ch - 'a']);
            ccount--;
        }
        sc.close();
        }
    }
