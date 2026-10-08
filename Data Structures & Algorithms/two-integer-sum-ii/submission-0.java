class Solution {
    public int[] twoSum(int[] numbers, int target) {

        Map<Integer,Integer> map = new HashMap<>();
        int n=numbers.length;
        for(int i=0;i<n;i++){
            map.put(numbers[i],i);
        }
        int result[];
        for(int i=0;i<n;i++){
            int second = target-numbers[i];
            if(map.containsKey(second)){
                if(map.get(second)>i)
                  return new int[]{i+1,map.get(second)+1};
                   
            }
        }

        return new int[]{};
        
    }
}
