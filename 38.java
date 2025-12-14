class Solution {
    public String countAndSay(int n) {
        String s = "1";
        for(int i =1;i<n;i++)
        {
            s = helper(s);
        }
        return s;
    }

    public String helper(String s)
    {
        StringBuilder sb = new StringBuilder();
        char prev = s.charAt(0);
        int c = 1;
        for(int i = 1;i<s.length();i++)
        {
            if(s.charAt(i) == prev)
            {
                c++;
            }else
            {
                sb.append(c);
                sb.append(prev);
                prev = s.charAt(i);
                c = 1;
            }
        }
        sb.append(c);
        sb.append(prev);
        return sb.toString();
    }
}
