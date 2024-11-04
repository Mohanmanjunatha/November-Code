package Day5;

//Optimized:
//
//here we are supposed to check if they are matching bracket exist and if are in proper order
//
//bruteforce :
//
//here replacing braces O(n)
//
//while loop takes O(n)
//
//so it will be O(n*n)
//
//```java
//        if (s.isEmpty()){
//        return true;
//        }
//int length;
//        do {
//length=s.length();
//s=s.replace("()","")
//                .replace("[]", "")
//                .replace("{}","");
//        }
//                while(length!=s.length());
//        return s.isEmpty();
//        }
//                ```
//
//Optimized:
//
//steps:

// 1. push all the brackets in hashmap
//2. in for loop take the first element of that string
//3. compare in hashmap if its open or closed
//4. if open push into stack else check if stack is empty
//5. at last take out the top element compare it with element on map if they are same brackert
//6. return false if not
//7. at last check if the stack is emopty and return false
class Solution {
    public boolean isValid(String s) {

        HashMap<Character,Character> map=new HashMap<>();
        map.put('}','{');
        map.put(')','(');
        map.put(']','[');

        Stack<Character> stack=new Stack<>();
        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);

            if (!map.containsKey(c)){
                stack.push(c);

            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char top=stack.pop();
                if (top!=map.get(c)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}