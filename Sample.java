import java.util.Scanner;

class Sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of array: ");
        int n = sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }      
        int first=arr[0];
        int second=arr[0];
        for(int i=0;i<arr.length;i++){
            if(first<arr[i]){
                second=first;
                first=arr[i];
            }else{
                if (arr[i] > second && arr[i]!= first) {
                    second = arr[i];
                }
            }
        }
        System.out.println("second largest :"+second);
    }
}

        