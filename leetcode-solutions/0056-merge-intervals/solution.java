class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)-> Integer.compare(a[0], b[0]));
        ArrayList<int []> list = new ArrayList<>();
        int si = intervals[0][0];
        int ei = intervals[0][1];

        for (int i = 1; i<intervals.length; i++){
            if(ei>=intervals[i][0]){
                ei = Math.max(ei, intervals[i][1]);
            }else{
                int [] a = {si, ei};
                list.add(a);
                si = intervals[i][0];
                ei = intervals[i][1];
                
            }
        }
        int [] a = {si, ei};
        list.add(a);
        return list.toArray(new int[list.size()][]);
    }
}
