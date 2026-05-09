/*
Top K Frequent Elements

Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

 

Sample Test Case :

Input: nums = [1,1,1,2,2,3], k = 2

Output: [1,2]


*/

class TopKFreq {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> frq = new HashMap<>();
        for(int n: nums){
            frq.put(n, frq.getOrDefault(n, 0) + 1);
        }

        List<Integer>[] buckets = new List[nums.length+1];
        for(int num : frq.keySet()){
            int f = frq.get(num);
            if(buckets[f] == null) buckets[f]= new ArrayList<>();
            buckets[f].add(num);
        } 

        int[] result = new int[k];
        int idx = 0;
        for(int i = buckets.length-1;i >= 0 && idx <k;i--){
            if(buckets[i] != null){
                for(int num : buckets[i]){
                    result[idx++]= num;
                    if(idx== k) break;
                }
            }
        }
        return result;
    }
}