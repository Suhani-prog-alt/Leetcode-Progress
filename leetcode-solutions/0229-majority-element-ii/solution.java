class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int c1 = 0, c2 = 0;
        int count1 = 0, count2= 0;
        for(int i = 0 ;i<nums.length; i++){
            if(nums[i] == c1){
                count1++;
            }
            else if(nums[i] == c2){
                count2++;
            }
            else if (count1 == 0){
                c1 = nums[i];
                count1 = 1;
            }
            else if(count2 == 0){
                c2 = nums[i];
                count2 = 1;
            }
            else{
                count1--;
                count2--;
            }
        }

        // for verifying
        count1 = 0;
        count2 = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == c1) count1++;
            if(nums[i] == c2) count2++;
        }


        List<Integer> ll = new ArrayList<Integer>();
        if(c1!=c2){
            if(count1>nums.length/3) ll.add(c1);
            if(count2>nums.length/3) ll.add(c2);
        }
        else{
            if(count1>nums.length/3) ll.add(c1);
        }

        return ll;
    }
}
