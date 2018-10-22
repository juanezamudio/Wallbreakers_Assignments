class Solution {

    /**
     * This problem was pretty straight forward. It is easier to use a HashSet than
     * a HashMap since we only have use for the key itself.
     * 
     * Time Estimate: 2 minutes
     */
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        Set<Character> set = new HashSet<Character>();
        
        for (char c : J.toCharArray()) {
            set.add(c);
        }
        
        for (char c : S.toCharArray()) {
            if (set.contains(c)) {
                count++;
            }
        }
        
        return count;
    }

    /**
     * This problem was a little tricky at first. I was a little confused at first about
     * how I was going to get the transformations set given the letter-mapping list.
     * The ability to get the index of the letter-to-morse map by subtracting 'a' was
     * useful because it prevented me from creating a map that mapped every letter to
     * its corresponding morse code. That's the other way I would've done it.
     * 
     * Time Estimate: 15 minutes
     */
    public int uniqueMorseRepresentations(String[] words) {
        
        String[] code = new String[] { ".-","-...","-.-.","-..",".","..-.",
                                       "--.","....","..",".---","-.-",".-..",
                                       "--","-.","---",".--.","--.-",".-.",
                                       "...","-","..-","...-",".--","-..-",
                                       "-.--","--.."};
        
        Set<String> set = new HashSet<String>();
        
        for (String word : words) {
            StringBuilder result = new StringBuilder();
            for (char c : word.toCharArray()) {
                result.append(code[c - 'a']);
            }
            set.add(result.toString());
        }
        
        return set.size();
    }

    /**
     * This one was tricky because it was difficult to check for when there was a
     * possibility of an endless loop. How would one be able to check if there was
     * an infinite loop without going into an infinite loop? The answer came when
     * I realized that the add() function for a Set returns a boolean. Thus, we can
     * check whether or not the number has already been in the set and if so then we
     * know that we were in a cycle and could return false.
     * 
     * Time Estimate: 25 minutes
     */
    public boolean isHappy(int n) {
        int result = 0;
        int mod = 0;
        HashSet<Integer> set = new HashSet<Integer>();
        while (set.add(n)) {
            
            while (n > 0) {
                mod = n % 10;
                result += mod * mod;
                n /= 10;
            }
            
            n = result;
            result = 0;
            
            if (n == 1) { 
                return true;
            }
        }
        
        return false;
    }

    /**
     * I tried to do this with a HashSet at first and it just wasn't working because
     * not only did we have to compare the lists against one another, we also had to
     * compare the lists against themselves to look for repeated words within the
     * string itself. With this in mind, the best way to do this is to keep count of
     * the words in both A and B.
     * 
     * Time Estimate: 15 minutes
     */
    public String[] uncommonFromSentences(String A, String B) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        List<String> result = new LinkedList<String>();
        
        for (String s : A.split(" ")) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        
        for (String s : B.split(" ")) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        
        for (String key : map.keySet()) {
            if (map.get(key) == 1) {
                result.add(key);
            }
        }
        
        return result.toArray(new String[result.size()]);
    }
}