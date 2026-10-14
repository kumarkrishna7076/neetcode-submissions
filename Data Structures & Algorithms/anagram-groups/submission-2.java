class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String,List<String>> map = new HashMap<>();

       for(String str:strs){
        char [] arr = str.toCharArray();
        Arrays.sort(arr);
        String strKey = new String(arr);
        map.computeIfAbsent(strKey,k->new ArrayList<>()).add(str);
       }
       List<List<String>> result = new ArrayList<>();
       for(Map.Entry<String,List<String>> entry : map.entrySet()){
           result.add(entry.getValue());
       }
       return result;
    }
}
