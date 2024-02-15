public class Patterns{
public static void main(String[] args) {
    int n = 3;

    //1
    for(int i=0;i<n;i++){
        for(int j = 0;j<n;j++){
            System.out.print("* ");
        }
        System.out.println();
    }

    //2
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }

    //3
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    //4
    for(int i=1;i<=5;i++){
        for(int j=n-i+1;j>=1;j--){
            System.out.print("* ");
        }
        System.out.println();
    }

    //5
      for(int i=1;i<=5;i++){
        for(int j=1;j<=n-i+1;j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }

    //6
    for(int i=0;i<n;i++){
        for(int j=0;j<n-i-1;j++){
            System.out.print(" ");
        }
        for(int j=0;j<2*i + 1;j++){
            System.out.print("*");
        }
        for(int j=0;j<n-i-1;j++){
            System.out.print(" ");
        }
        System.out.println();
    }

    //7
    for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            System.out.print(" ");
        }
        for(int j=0;j<=2*(n-(i+1));j++){
            System.out.print("*");
        }
        for(int j=0;j<=i;j++){
            System.out.print(" ");
        }
        System.out.println();
    }

    //8
    for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            System.out.print(" ");
        }
        for(int j=0;j<=2*(n-(i+1));j++){
            System.out.print("*");
        }
        for(int j=0;j<=i;j++){
            System.out.print(" ");
        }
        System.out.println();
    }


    //9
    for(int i=0;i<n;i++){
        for(int j=0;j<n-i-1;j++){
            System.out.print(" ");
        }
        for(int j=0;j<2*i + 1;j++){
            System.out.print("*");
        }
        for(int j=0;j<n-i-1;j++){
            System.out.print(" ");
        }
        System.out.println();
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            System.out.print(" ");
        }
        for(int j=0;j<=2*(n-(i+1));j++){
            System.out.print("*");
        }
        for(int j=0;j<=i;j++){
            System.out.print(" ");
        }
        System.out.println();
    }

    //10
    int num10 = 1;
    for(int i=1;i<=2*n-1;i++){
        if(i > n)
        num10--;
        else
        num10 += 1;

    for(int j=1;j<num10;j++){
        System.out.print("*");
        }
        System.out.println();
    }


    //11
    int num11 = 1;
    for(int i=0;i<n;i++){
        if(i%2 == 0)
        num11 = 1;
        else
        num11 = 0;
        for(int j=0;j<=i;j++){
            System.out.print(num11+" ");
            num11 = 1 - num11;
        }
        System.out.println();
    }


    //12
    int space = 2*(n-1);
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }

        for(int j=0;j<space;j++){
            System.out.print(" ");
        }

        for(int j=i;j>0;j--){
            System.out.print(j);
        }
        System.out.println();
        space -= 2;
    }

    //13
    int num13 = 1;
    for(int i=0;i<=n;i++){
        for(int j=0;j<=i;j++){
            System.out.print(num13+++" ");
        }
        System.out.println();
    }

    //14
    for(int i=0;i<n;i++){
        for(char c = 'A';c <= 'A' + i;c++){
            System.out.print(c+" ");
        }
        System.out.println();
    }

    //15
    for(int i=0;i<n;i++){
        for(char c = 'A';c <= 'A' + n - (i+1);c++){
            System.out.print(c+" ");
        }
        System.out.println();
    }

    //16
    char c = 'A';
    for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            System.out.print((char)(c+i));
        }
        System.out.println();
    }


    //17
    for(int i=0;i<n;i++){
        char ch = 'A' - 1;

        for(int j=0;j<n-i-1;j++){
            System.out.print(" ");
        }

        for(int j=0;j<2*i+1;j++){
            if(j > i){
                ch = (char)(ch - 1);
                System.out.print(ch);
            }
            else{
            ch = (char)(ch + 1);
            System.out.print(ch);
        }
    }

        for(int j=0;j<n-i-1;j++){
            System.out.print(" ");
        }
        System.out.println();
    }


    //18
    char ch = (char)('A' + n-1);
    for(int i=0;i<n;i++){
        for(int j=i;j>=0;j--){
            System.out.print((char)(ch-j)+" ");
        }
        System.out.println();
    }

    //19
    for(int i=0;i<n;i++){
        for(int j=0;j<n-i;j++){
            System.out.print("*");
        }

        for(int j =0;j < i*2;j++){
            System.out.print(" ");
        }

        for(int j=0;j<n-i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            System.out.print("*");
        }

        for(int j=0;j < 2*(n-i-1);j++){
            System.out.print(" ");
        }

        for(int j=0;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }

    //20
    for(int i=0;i<=n;i++){
        for(int j=0;j<i;j++){
            System.out.print("*");
        }
        for(int j=0;j<2*(n-i);j++){
            System.out.print(" ");
        }
        for(int j=0;j<i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<n-i-1;j++){
            System.out.print("*");
        }
        for(int j=0;j<2*(i+1);j++){
            System.out.print(" ");
        }
        for(int j=0;j<n-i-1;j++){
            System.out.print("*");
        }
        System.out.println();
    }


    //21
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(i==0 || j==0 || i==n-1 || j ==n-1){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }


    //22
    for(int i=0;i<2*n-1;i++){
        for(int j=0;j<2*n-1;j++){
            int left = j;
            int right = 2*n -2 -j;
            int top = i;
            int bottom = 2*n -2 - i;

            int num22 = Math.min(Math.min(left,right),Math.min(top,bottom));

            System.out.print((n - num22)+" ");
        }
        System.out.println();
    }

    }
}