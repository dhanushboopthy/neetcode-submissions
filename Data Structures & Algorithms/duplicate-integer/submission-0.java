class Solution {
    public boolean hasDuplicate(int[] nums) {
        java.util.HashMap<Integer, Integer> freq = new java.util.HashMap<>();

        for (int i : nums) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }

        for (java.util.Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > 1) {
                return true;
            }
        }

        return false;
    }
}