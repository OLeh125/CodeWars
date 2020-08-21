import java.util.ArrayList;
import java.util.List;
import java.util.logging.SocketHandler;

public class Kata3
{
    public static long nextBiggerNumber(long n)
    {
        System.out.println(n);
        char[] chars = (n+"").toCharArray();
        int [] integers = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            String s = chars[i] + "";
            integers[i] = Integer.parseInt(s);
        }
        List<String> ints =permute(integers);
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();
        List<String> list4 = new ArrayList<>();

        for (int i = 0; i < ints.size(); i++) {
            list2.add(ints.get(i).replace(", ",""));
            list3.add(list2.get(i).replace("[",""));
            list4.add(list3.get(i).replace("]",""));

        }
        ints.removeAll(ints);
        list2.removeAll(list2);
        list3.removeAll(list3);


        int [] ar = new int[list4.size()];
        for (int i = 0; i < list4.size(); i++) {
            ar [i] = Integer.parseInt(list4.get(i));
        }


        int min = Integer.MAX_VALUE;
        for(int i = 0; i < ar.length; i ++){
            if (ar[i]> n){
           if(ar[i]<min){
               min = ar[i];
            }
            }


    }
        if (min == Integer.MAX_VALUE){
            min = -1;
        }
        return min ;
}

    public static List<String> permute(int[] nums) {
        List<String> result = new ArrayList<>();
        helper(0, nums, result);
        return result;
    }

    private static void helper(int start, int[] nums, List<String> result){
        if(start==nums.length-1){
            ArrayList<Integer> list = new ArrayList<>();
            for(int num : nums){
                list.add(num);
            }
            result.add(list+"");
            return;
        }

        for(int i=start; i<nums.length; i++){
            swap(nums, i, start);
            helper(start+1, nums, result);
            swap(nums, i, start);
        }
    }

    private static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}