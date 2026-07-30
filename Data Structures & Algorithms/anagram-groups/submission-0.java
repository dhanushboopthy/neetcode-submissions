class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        for(int i= 0; i < strs.length;i++)
        {
            String s = strs[i];
            char[] c = s.toCharArray();
            Arrays.sort(c);
            s = new String(c);
            if(!map.containsKey(s))
            {
                map.put(s,res.size());
                res.add(new ArrayList<>());
            }
            res.get(map.get(s)).add(strs[i]);
        }
        return res;
    }
}
