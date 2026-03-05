package Arrays.Basics;
// Finding max in the Array
public class FindMaximum {
    public static void main(String[] args) {
        int[] arr = {5, 12, 7, 15, 3};

        int max = arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Maximum is: " + max);
    }
}
