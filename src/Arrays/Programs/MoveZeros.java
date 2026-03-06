package Arrays.Programs;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        int index = 0;

        // Moving all Non Zero elements towards front
        for(int i=0; i<arr.length; i++){
            if(arr[i] !=0){
                arr[index] = arr[i];
                index++;
            }
        }

        // Filling remaining zeros
        while(index < arr.length){
            arr[index] = 0;
            index++;
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
