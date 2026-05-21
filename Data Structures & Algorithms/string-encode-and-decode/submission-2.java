class Solution {

    public String encode(List<String> strs) {
        StringBuilder builder = new StringBuilder();

        for(String s : strs){
            builder.append(s.length());
            builder.append('#');
            builder.append(s);
        }

        return builder.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        int skip = 0;
        StringBuilder buff = new StringBuilder();
        while(i < str.length()){
            while(str.charAt(i) != '#'){
                buff.append(str.charAt(i));
                i++;
            }
            skip = Integer.parseInt(buff.toString());
            buff.setLength(0);
            res.add(str.substring(i+1, i + 1 + skip));
            i += skip + 1;
        }

        return res;
    }
}
