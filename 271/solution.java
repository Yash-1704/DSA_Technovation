class Solution {
    public String encode(ArrayList<String> strs) {
        StringBuilder ans = new StringBuilder();

        for (String str : strs) {
            ans.append(str.length()).append("#").append(str);
        }

        return ans.toString();
    }

    public ArrayList<String> decode(String s) {
        ArrayList<String> ans = new ArrayList<>();
        int i = 0;

        while (i < s.length()) {
            int j = i;

            while (s.charAt(j) != '#') {
                j++;
            }

            int len = Integer.parseInt(s.substring(i, j));
            ans.add(s.substring(j + 1, j + 1 + len));

            i = j + 1 + len;
        }

        return ans;
    }
}
