class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
          return false;

        int n=s.length();  
        Map<Character,Integer> map = new HashMap<>();
        
        for(int i=0;i<n;i++){
            Character c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(int i=0;i<n;i++){
            Character c=t.charAt(i);
            if(map.containsKey(c)){
                if(map.get(c)==1){
                    map.remove(c);
                }else{
                     map.put(c,map.get(c)-1);
                }
            }
             
        }

        if(map.isEmpty()){
            return true;
        }else{
            return false;
        }



    }
}
