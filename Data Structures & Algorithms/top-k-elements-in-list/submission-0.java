class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        List<Integer> result =  map.entrySet().stream()
        .sorted(Map.Entry.<Integer,Integer>comparingByValue().reversed())
        .map(Map.Entry::getKey)
        .collect(Collectors.toList());
        int [] output = new int[k];
        for(int i=0;i<k;i++){
            output[i]=result.get(i);
        }
        return output;
    }
}
