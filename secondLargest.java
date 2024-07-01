public class secondLargest {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println(secondLar(arr));
    }
    static int secondLar(int arr[]){
        int firstL=-1000000000;
        int secondL=-1000000000;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>firstL){
                secondL= firstL;
                firstL=arr[i];
            }else if (arr[i] > secondL && arr[i] != firstL){
                secondL= arr[i];
            }
        }
        return secondL;
    }
}
