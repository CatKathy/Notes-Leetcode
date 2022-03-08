# 189. Rotate Array

```java
class Solution {
    public void rotate(int[] nums, int k) {
        //copy一个新的数组
        //copy[i]的元素赋值到nums[i+k]
        int[] copy = Arrays.copyOf(nums, nums.length);
        for(int i = 0; i < nums.length; i++){
            int index = (i+k) % nums.length;
            nums[index] = copy[i];
        }
    }
}
```
