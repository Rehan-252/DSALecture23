import java.util.Scanner;
class Sumof2Darry{
    static void printmatrix(int arry[][]){
        for(int i = 0; i < arry.length; i++){
            for(int j = 0; j < arry[i].length; j++){
                System.out.print(arry[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    static int rectangulsum(int arry[][], int l1, int l2, int r1, int r2){
        int sum = 0;
        for(int i = l1; i <= l2; i++){
            for(int j = r1; j <= r2; j++){
                sum += arry[l1][r1];
            }
        }

        return sum;
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of rows and column");
        int row = in.nextInt();
        int col = in.nextInt();
        int arry[][] = new int [row][col];

        for(int i = 0; i < arry.length; i++){
            for( int j = 0; j < arry[i].length; j++){
                arry[i][j] = 1;
            }
        }
        
        printmatrix(arry);

        int l1 = 3, l2 = 5, r1 = 1, r2 = 4;

        int ans = rectangulsum(arry, l1, l2, r1, r2);
        System.out.println("Ans is " + ans);
        in.close();
    }
}