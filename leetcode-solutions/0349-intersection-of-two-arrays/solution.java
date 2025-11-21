class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> ll = new ArrayList<>();
        for(int i = 0; i<nums1.length; i++){
            if(IsIn(nums2, nums1[i])){
                ll.add(nums1[i]);
            }
        }
        Set<Integer> l = new HashSet<>(ll);
        List<Integer> list = new ArrayList<>(l);

        int n = list.size();
        int [] arr = new int [n];
        int i = 0;
        for(int ele : list){
            arr[i] = ele;
            i++;
        }
        return arr;
    }

    public static boolean IsIn(int [] arr, int k){
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==k){
                return true;
            }
        }
        return false;
    }
}
