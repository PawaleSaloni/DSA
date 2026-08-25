public class MinElement {

    public static void main(String[] args) {
        
        int[] arr = {10,66,43,1,90,45,67,9};
        
        int min = arr[0];

        for(int i = 0; i < arr.length; i++){

            if (arr[i]< min) {
                min = arr[i];
            }
        }
        System.out.println("Mininum Element = " + min);
    }
    
}
