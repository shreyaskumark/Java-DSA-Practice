class Print1toNRecursion{
    public static void main(String[] args) {
       printNums(3);
    }

    public static void printNums(int num){
        if ( num == 1){
        System.out.println(num);
        return;
        }

        // For N to 1 print here
        // System.out.println(num);
        printNums(num - 1);

        // For 1 to N print here
        System.out.println(num);

    }
}