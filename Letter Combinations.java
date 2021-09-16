// https://leetcode.com/problems/letter-combinations-of-a-phone-number

class Solution {
    private HashMap<Character, String> keymap;
    private List<String> results;
    
    public List<String> letterCombinations(String digits) {
        keymap = new HashMap();
        results = new ArrayList();
        if(digits.length() == 0)
            return results;
        
        keymap.put('2', "abc");
        keymap.put('3', "def");
        keymap.put('4', "ghi");
        keymap.put('5', "jkl");
        keymap.put('6', "mno");
        keymap.put('7', "pqrs");
        keymap.put('8', "tuv");
        keymap.put('9', "wxyz");
        
        putLetter(digits, "");
        
        return results;
    }
    
    public void putLetter(String digits, String prev_char) {
        if(digits.length() == 0) {
            results.add(prev_char);
            return;
        }
        String leftover_digits = digits.substring(1);
        for(char c : keymap.get(digits.charAt(0)).toCharArray()) {
            StringBuilder sb = new StringBuilder();
            sb.append(prev_char);
            sb.append(c);
            putLetter(leftover_digits, sb.toString());
        }
    }
}