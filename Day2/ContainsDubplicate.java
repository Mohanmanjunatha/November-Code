package Day2;
class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashMap<Integer, Boolean> map =new HashMap<>();


        for (int i=0;i<nums.length;i++){
            int num=nums[i];

            if (map.containsKey(num)){
                return true;
            }

            map.put(num,true);
        }


        return false;



    }
}