class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> list = new ArrayList<>();
        int len = digits.length;
        int carry =1;
        for(int i=len-1;i>=0;i--){
           int temp = digits[i]+carry;
           if(temp>9){
             list.add(0);
             carry = 1;
           }else{
            list.add(temp);
            carry=0;
           }
        }
        if(carry!=0)
         list.add(carry);
       Collections.reverse(list);
       int [] result = list.stream().mapToInt(Integer::intValue).toArray();
       return result;
    }
}
