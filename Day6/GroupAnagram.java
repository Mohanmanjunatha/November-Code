// create a map
// iterate through the strings and get the first strings
// create an arrauy of size 26 to store these in sequesce
// then create one more loop to go through ecch element
// for each element assign space i n array using ascii

//best
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> sortedWordsMap = new HashMap<>();

        for (String word : strs) {
            char[] wordChars = word.toCharArray();
            Arrays.sort(wordChars);
            String sortedCharsWord = String.valueOf(wordChars);
            if (!sortedWordsMap.containsKey(sortedCharsWord)) {
                sortedWordsMap.put(sortedCharsWord, new ArrayList<>());
            }
            sortedWordsMap.get(sortedCharsWord).add(word);
        }

        return new ArrayList<>(sortedWordsMap.values());
    }
}

// public class Solution {
//     public List<List<String>> groupAnagrams(String[] strs) {

//         Map<String, List<String>> res =new HashMap<>();

//         for (String s:strs){
//             int [] count =new int[26];
//             for (char c:s.toCharArray()){
//                 count[c-'a']++;
//             }
//             String key=Arrays.toString(count);
//             res.putIfAbsent(key, new ArrayList<>());
//             res.get(key).add(s);
//         }

//         return new ArrayList<>(res.values());

//     }
// }