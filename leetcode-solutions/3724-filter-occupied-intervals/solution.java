class Solution {
    public List<List<Integer>> filterOccupiedIntervals(int[][] occupiedIntervals, int freeStart, int freeEnd) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(occupiedIntervals,(a,b)-> a[0]-b[0]);
        int Start = occupiedIntervals[0][0];
        int End = occupiedIntervals[0][1];

        
        int n = occupiedIntervals.length;
        for(int i=1; i<n; i++) {
            if(occupiedIntervals[i][0]<=End+1) {
                End=Math.max(End, occupiedIntervals[i][1]);
            }else{
                addInterval(ans,Start, End,freeStart, freeEnd);
                Start= occupiedIntervals[i][0];
                End= occupiedIntervals[i][1];
            }
        }
        addInterval(ans,Start,End,freeStart,freeEnd);
        return ans;
    }

    private void addInterval(List<List<Integer>> Ans, int start, int end, int fStart, int fEnd) {

        if(end<fStart || start>fEnd) {
            Ans.add(Arrays.asList(start, end));
            return;
        }
        if(start<fStart) {
            Ans.add(Arrays.asList(start, fStart - 1));
        }
        if(end>fEnd) {
            Ans.add(Arrays.asList(fEnd + 1, end));
        }
    }
}
