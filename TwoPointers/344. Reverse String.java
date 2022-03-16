class Solution {
    public void reverseString(char[] s) {
        
        int left = 0;
        int right = s.length - 1;
        while (left < right){
            s[left] ^= s[right]; //构造 a ^ b 的结果，并放在 a 中
            s[right] ^= s[left]; //将 a ^ b 这一结果再 ^ b ，存入b中，此时 b = a, a = a ^ b
            s[left] ^= s[right]; //a ^ b 的结果再 ^ a ，存入 a 中，此时 b = a, a = b 完成交换
            left++;
            right--;
        }
        
    }
}
