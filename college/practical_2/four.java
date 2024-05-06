package practical_2;

public class four {
    public static int[][] sumArray(int arrA[][], int arrB[][]){
        int i =0;
        int m =0; 
        int j = 0;
        int n = 0;
        int k = 0;
        int p =0;
        int[][] sumArray = new int[arrA.length][arrB.length];
        while(i<arrA.length && m <arrA.length && j<arrB.length && n<arrB.length){
            sumArray[k][p] = arrA[i][m] + arrB[j][n];
            k++; p++;
            j++; n++;
            i++; m++;
        }

        return sumArray;
    }
    public static void printarr(int arr[][]) {
        for(int i= 0; i<arr.length; i++){
            for(int j =0; j<arr.length; j++){
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int[][] arrA = new int[3][3];
                arrA[0][0] = 1;
                arrA[0][1] = 2;
                arrA[0][2] = 3;
                arrA[1][0] = 4;
                arrA[1][1] = 5;
                arrA[1][2] = 6;
                arrA[2][0] = 7;
                arrA[2][1] = 8;
                arrA[2][2] = 9;
         
        int[][] arrB = new int[3][3];
                arrB[0][0] = 1;
                arrB[0][1] = 2;
                arrB[0][2] = 3;
                arrB[1][0] = 4;
                arrB[1][1] = 5;
                arrB[1][2] = 6;
                arrB[2][0] = 7;
                arrB[2][1] = 8;
                arrB[2][2] = 9;
          
        int[][] sum = new int[3][3];
        printarr(arrA);
        printarr(arrB);
        sum = sumArray(arrA, arrB);
        printarr(sum);
    }
}
