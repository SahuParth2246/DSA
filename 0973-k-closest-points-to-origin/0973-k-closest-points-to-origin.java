class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int distance =0;
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        int index=0;
        for(int [] num : points){
            distance = num[0]*num[0] + num[1]*num[1];
            heap.offer(new int[]{distance, index});
            if(heap.size()>k)heap.poll();
            index++;

        }
        int[][] result = new int[k][2];
        for(int i = 0; i < k; i++){
            result[i] = points[heap.poll()[1]];
        }
        return result;

    }
}