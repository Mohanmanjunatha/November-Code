//Trapping Rainwater
// we use two arrays here to calculate left tallest for current block
// we also calculate right tallest for each block to make sure the threshold till where the water can hold
//we have to store these two in seperate arrays using max function and two loops from left and right side
//once its done, from the picture we have for each block the height of left and right building
//so from those 2 we take the minimum value and subtract the current block to find out the amount of water we can store
//at the end we add all these findings for each block to return the answer


class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int left[]=new int[n];
        int right[]=new int[n];
        left[0]=height[0];
        for (int i=1;i<n;i++){
            left[i]=Math.max(left[i-1],height[i]);
        }
        right[n-1]=height[n-1];

        for (int j=n-2;j>=0;j--){
            right[j]=Math.max(right[j+1],height[j]);
        }
        int ans=0;
        for (int i=0;i<n;i++)
        {
            ans=ans+(Math.min(left[i],right[i])-height[i]);
        }
        return ans;
    }
}