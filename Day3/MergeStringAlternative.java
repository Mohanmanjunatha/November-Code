package Day3;

// class Solution {
//     public String mergeAlternately(String word1, String word2) {
//     int m=word1.length();
//     int n=word2.length();

//     char[] s1= word1.toCharArray();
//     char[] s2= word2.toCharArray();
//     StringBuilder result=new StringBuilder();
//      int i=0;
//      int j=0;
//      while(i<m||j<n){
//         if(i<m){
//             result.append(word1.charAt(i++));

//         }
//         if (j<n){
//             result.append(word2.charAt(j++));
//         }

//      }

//      return result.toString();

//     }
// }


//Solution 2
class Solution
{
    public String mergeAlternately(String word1, String word2) {
        char[] s1 = word1.toCharArray();
        char[] s2 = word2.toCharArray();
        int m = word1.length();
        int n = word2.length();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < Math.max(m, n); i++) {
            if (i < m) {
                result.append(s1[i]);
            }
            if (i < n) {
                result.append(s2[i]);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String word1 = "abc";
        String word2 = "pqr";
        String merged = solution.mergeAlternately(word1, word2);
        System.out.println("Merged string: " + merged);  // Expected output: "apbqcr"
    }
}
