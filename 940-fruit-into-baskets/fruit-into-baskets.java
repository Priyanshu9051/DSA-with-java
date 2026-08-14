class Solution {
    public int totalFruit(int[] f) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int i = 0;
        int maxCount = 0;

        for (int j = 0; j < f.length; j++) {

            // Add current fruit
            map.put(f[j], map.getOrDefault(f[j], 0) + 1);

            // More than 2 different fruits
            while (map.size() > 2) {

                map.put(f[i], map.get(f[i]) - 1);

                if (map.get(f[i]) == 0) {
                    map.remove(f[i]);
                }

                i++;
            }

            // Current valid window
            maxCount = Math.max(maxCount, j - i + 1);
        }

        return maxCount;
    }
}