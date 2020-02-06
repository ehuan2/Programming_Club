import java.util.*;

public class Main {

    // this problem is the data structures problem
    // it involves the triangle data structure, and the way to solve it seems to simply
    // be to reducing the structure into smaller versions of it

    public static int findMax(int[] ar){ // want to find the max of the array
        Arrays.sort(ar);
        return ar[ar.length-1];
    }

    // the triangle is going to be held within a matrix, essentially a grid
    static int[][]triangle;

    public static int[][] reduceTriangle(int[][]oldTriangle){ // reduces the triangle data structure by one
        int newLength = oldTriangle.length-1;
        int[][] next = new int[newLength][newLength];

        for (int i = 0; i < newLength; i++) {
            for (int j = 0; (j+i) < newLength; j++) {
                int[]values = new int[]{oldTriangle[i][j], oldTriangle[i][j+1], oldTriangle[i+1][j]};
                next[i][j] = findMax(values);
            }
        }
        return next;
    }


    public static int findSum(int n){ // is going to find the sum of the reduced amount (and reduces it n number of times)

        for (int i = 0; i < n; i++) {
            triangle = reduceTriangle(triangle);
        }
        int sum = 0;

        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; (j+i) < triangle.length; j++) {
                sum += triangle[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int reduceAmount = scan.nextInt()-1;



        triangle = new int[num][num];



        int x = 0;
        int y = -1;

        for (int i = 0; i < ((num+1)*num/2); i++) {

            x -= 1;
            y += 1;

            if(x < 0){
                x = y;
                y = 0;
            }



            triangle[x][y] = scan.nextInt();

        }

        System.out.println(findSum(reduceAmount));



    }

}
