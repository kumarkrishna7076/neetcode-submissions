class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i =0;
        int j=numbers.length-1;

        while(i<j){
            int first = numbers[i];
            int second = numbers[j];
            int sum = first+second;
            if(sum==target){
                return new int[]{i+1,j+1};
            }
            if(sum>target){
               j--;
            }else if(sum<target){
                i++;
            }
        }

        return new int[]{};
    }
}
