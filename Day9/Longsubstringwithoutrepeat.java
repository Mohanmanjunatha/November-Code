// here we create a HashSet to store the vallues
//we need a variable to store the max length and a left pointer
// we will use array loop as right pointer
//for loop to access each element of the array
// for each element check if that element is present
//if not present then we keep adding it using for loop and hashset and keep incrementing the max length
// when we find the re4peated char then we should remove the like
//if we have abcbca and we find b repeated then we have to remove till we remove b and for that wile loop runs 2 times so l will be 2 pointing to next start window
// after removing wwe will add new character to it .
// by this time we will have the maximum
//max is right array-left pointer +1 its like an logest  string window or the length


public class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> charSet = new HashSet<>();
        int l = 0;
        int res = 0;

        for (int r = 0; r < s.length(); r++) {
            while (charSet.contains(s.charAt(r))) {
                charSet.remove(s.charAt(l));
                l++;
            }
            charSet.add(s.charAt(r));
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}