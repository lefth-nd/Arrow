package drill;

public class nine {
    public static void main(String[] args){

        int[] array = {9, 6, 9, 9, 1, 8};
        System.out.println(arrayCountNines(array));

    }

    public static int arrayCountNines(int[] nums){
        int result = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 9){
                result = result + 1;
            }
        }
        return result;

    }
}
