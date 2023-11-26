import java.util.Scanner;

public class Array {
    public static void Arrayprint(int arr[][],int num){
        for(int i = 0; i < num ; i++){
            for(int j = 0; j <num ; j++){
                System.out.printf("%d ",arr[i][j]);
            }
            System.out.printf("\n");
        }
    }

    public static void Transpose(int arr[][],int num){
        int arr1[][] = new int[num][];
        for(int i = 0 ; i < num ; i++){
            arr1[i] = new int[num];
        }
        int a = 0;
        for(int i = 0; i < num ; i++){
            int b = 0;
            for(int j = num-1; j >= 0 ; j--){
                //System.out.printf("%d ",arr[j][i]);
                arr1[a][b] = arr[j][i];
                b+=1;
            }
            a+=1;
        }
        for(int i = 0; i < num ; i++) {
            for (int j = 0; j < num; j++) {
                arr[i][j] = arr1[i][j];
            }
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int num = sc.nextInt();
        int arr[][] = new int[num][];
        for(int i = 0; i < num; i++){
            arr[i] = new int[num];
        }
        System.out.println("enter the values of matrix : ");
        for(int i = 0 ; i < num ; i++){
            for(int j = 0 ; j < num ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        Arrayprint(arr,num);
        Transpose(arr,num);
        Arrayprint(arr,num);
    }
}