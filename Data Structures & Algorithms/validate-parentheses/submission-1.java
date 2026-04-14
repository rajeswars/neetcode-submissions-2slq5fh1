class Solution 
{
    public boolean isValid(String s) 
    {
        Map<Character, Character> mp = new HashMap<>();
        mp.put(')', '(');
        mp.put('}', '{');
        mp.put(']', '[');

        Stack<Character> st = new Stack<>();

        for(char c : s.toCharArray())
        {
            if(mp.containsKey(c))
            {
                if (st.isEmpty() || st.peek() != mp.get(c))
                {
                    return false;
                }
                st.pop();
            }

            else
            {
                st.push(c);
            }
        }
        return st.isEmpty();
    }
}
