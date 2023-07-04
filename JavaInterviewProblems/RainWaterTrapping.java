public class SoRainWaterTrapping {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int trap(final int[] A) {
        int n = A.length;
        int[] pfMax = new int[n];
        int[] sfMax = new int[n];
        pfMax[0] = A[0];sfMax[n-1]=A[n-1];
        for(int i=1; i<n; i++) pfMax[i] = Math.max(pfMax[i-1],A[i]);
        for(int i=n-2; i>=0; i--) sfMax[i] = Math.max(sfMax[i+1],A[i]);
        int ans = 0;
        for(int i=1; i<n-1; i++) {
            int h = Math.min(pfMax[i-1],sfMax[i+1]);
            ans+=Math.max(h-A[i],0);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] elevationMap = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int trappedWater = trapWater(elevationMap);
        System.out.println("Amount of water trapped: " + trappedWater);
    }
}