class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int nums [] = new int [arr.length];
        for(int i = 0; i<arr.length; i++){
            nums[i] = arr[i];
        }
        Arrays.sort(nums);
        Map<Integer, Integer> mp = new HashMap<>();
        int k = 1;
        for(int i = 0; i<nums.length; i++){
            if(mp.containsKey(nums[i]))k--;
            mp.put(nums[i],mp.getOrDefault(nums[i],k++));
        }
        for(int j = 0; j<arr.length; j++){
            arr[j] = mp.get(arr[j]);
        }
        return arr;
    }
}
