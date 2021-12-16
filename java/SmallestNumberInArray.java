public class SmallestNumberInArray {
    public static void main(String args[]) {
        int[] arr={4,5,6,7,8,1,2};
        int small = arr[0];
        for(int i =0 ;i<arr.length; i++) {
            if(arr[i] < small){
                small = arr[i];
            }else
                continue;

        }
        System.out.println(small);
    }
}
