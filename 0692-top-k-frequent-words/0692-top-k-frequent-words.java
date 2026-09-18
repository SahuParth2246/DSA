class Solution {
    class Pair {
        String word;
        int value;

        Pair(String word, int value) {
            this.word = word;
            this.value = value;
        }
    }

    public List<String> topKFrequent(String[] words, int k) {

        HashMap<String, Integer> map = new HashMap<>();

        for (String s : words) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }


        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a, b) -> {
                if (a.value != b.value)
                    return Integer.compare(a.value, b.value);

                return b.word.compareTo(a.word);
            }
        );

        for (String s : map.keySet()) {
            pq.add(new Pair(s, map.get(s)));

            if (pq.size() > k) {
                pq.poll();
            }
        }

        LinkedList<String> ans = new LinkedList<>();

        while (!pq.isEmpty()) {
            ans.addFirst(pq.poll().word);
        }

        return ans;
    }
}