package Day3;

// class Solution{
//     public int[] twoSum(int[] nums, int target){
//         for(int j=0;j<nums.length;j++){
//             for (int i=j+1;i<nums.length;i++)
//             {
//                 int sum=nums[i]+nums[j];
//                 if(sum==target){
//                     return new int[]{i,j};
//                 }
//             }
//         }
//         return new int[]{};
//     }
// }

//numbers{1,8,2,15,5}
//target[13]
// will take the first element subtract it with target and see if difference matches any element then
// those 2 elements will be the pair
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            int curr=nums[i];
            int diff=target-curr;
            if (map.containsKey(diff)){
                return new int[]{map.get(diff),i};
            }
            map.put(curr,i);
        }
        return new int[] {};
    }
}





