
public class mularr {
    public static void main(String[] args) {
        int row=5;
        int col=5;
        int arr[][]=new int[row][col];  
        for(int i=0;i<arr.length;i++){
             for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
             }
             System.out.println("");
        }
        System.out.println("***********************");
        int arr1[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[0].length;j++){
               System.out.print(arr1[i][j]+" ");
            }
            System.out.println("");
       }
    }
}
