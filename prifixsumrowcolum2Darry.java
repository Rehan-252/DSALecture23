import java.util.Scanner;

public class prifixsumrowcolum2Darry {
        static void printmatrix(int arry[][]){
        for(int i = 0; i < arry.length; i++){
            for(int j = 0; j < arry[i].length; j++){
                System.out.print(arry[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    static void prifixsum(int arry[][]){
        //for row
        for(int i = 0; i < arry.length; i++){
            for(int j = 1; j<arry[i].length; j++){
                arry[i][j] += arry[i][j-1];
            }
        }
        // for column
        for(int i = 1; i < arry.length; i++){
            for(int j = 0; j<arry[i].length; j++){
                arry[i][j] += arry[i-1][j];
            }
        }
    }
    
    static int rectangulsum(int arry[][], int l1, int l2, int r1, int r2){
        int ans = 0,up = 0,left = 0,upleft = 0;
        int sum = arry[l2][r2];
        if(l1 >= 1)
        up = arry[l1-1][r2];
        if(r1 >= 1)
        left = arry[l2][r1-1];

        if(l1 >= 1 && r1 >= 1){
        upleft = arry[l1-1][r1-1];
        }
        ans = sum - up - left + upleft;
        
        return ans;
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
        
        prifixsum(arry);
        printmatrix(arry);
        int l1 = 3, l2 = 5, r1 = 1, r2 = 4;
        int ans = rectangulsum(arry, l1, l2, r1, r2);
        System.out.println("Ans is " + ans);
        in.close();
    }
}
