/*
 * Pascals Triangle
 * Variation 1: Given row number r and column number c. Print the element at position (r, c) in Pascal’s triangle.
 * Variation 2: Given the row number n. Print the nth row of Pascal’s triangle.
 * Variation 3: Given the number of rows n. Print the first n rows of Pascal’s triangle.
 * //     1
 * //    1 1
 * //   1 2 1
 * //  1 3 3 1
 * // 1 4 6 4 1
 * //1 5 1010 5 1
 */

public class PascalsTriangle {
  public static void main(String[] args) {
    int row = 5 , c =3;
    printTriangle1(row-1, c-1);

    int rowN = 5;
    printTriangle2(rowN);

    printTriangle3(rowN);
  }  

  public static void printTriangle1(int row, int col){
    int fact = 1;
    for(int i = 0;i < col;i++){
      fact *= row - i;
      fact /= i+1;
    }
    System.out.println(fact);
  }

  public static void printTriangle2(int row){
    int fact = 1;
    System.out.print(fact+" ");
    for(int i = 1;i < row;i++){
      fact *= (row-i);
      fact /= i;
      System.out.print(fact+" ");
    }
  }

  public static void printTriangle3(int row){
    for(int i = 0; i <= row;i++){
      int fact = 1;
      System.out.print(fact+" ");
      for(int j = 1;j < i;j++){
        fact *= (i-j);
        fact /= j;
        System.out.print(fact+" ");
      }
      System.out.println();
    }
  }
}