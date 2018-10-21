class Solution {

    /**
     * What are the pros and cons of doing this in two for-loops? Would it have been
     * more efficient to do it in place using a quicksort algorithm and is that something we should
     * already know how to do?
     * 
     * Time Estimate: 20 minutes
     */
    public int[] sortArrayByParity(int[] A) {
        int[] result = new int[A.length];
        int counter = -1;
        
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                result[++counter] = A[i];
            }
        }
        
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 != 0) {
                result[++counter] = A[i];
            }
        }
        
        return result;
    }

    /**
     * How to approach this differently to get better space complexity?
     * 
     * Time Estimate: 15 minutes
     */
    public int[][] transpose(int[][] A) {
        int[][] result = new int[A[0].length][A.length];
        
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                result[j][i] = A[i][j];
            }
        }
        
        return result;
    }

    /**
     * Is there a more efficient way to do this maybe with one line in the for-loop
     * and no if or switch statement?
     * 
     * Time Estimate: 5 minutes
     */
    public int[][] flipAndInvertImage(int[][] A) {
        int[][] result = new int[A.length][A[0].length];
        
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                result[i][j] = A[i][A.length - 1 - j];
                
                switch (result[i][j]) {
                    case 1: 
                        result[i][j] = 0;
                        break;
                    case 0: 
                        result[i][j] = 1;
                        break;
                }
            }
        }
        
        return result;
    }

    /**
     * Not Finished Yet...
     */
    public int longestIncreasingPath(int[][] matrix) {
        int counter = 0;
        int max;
        
        
        for (int i = 0; i < matrix.length; i++) {   
            for (int j = 0; j < matrix[i].length; j++) {
                max = matrix[i][j];
                for (int k = j; k < matrix[i].length; k++) {
                    if (matrix[i][k] <= max) {
                        
                    }
                }
            }
        }
        
        return counter;
    }

    /**
     * Best way to approach this if you get stuck logic wise. This was kind of tricky.
     * 
     * Time Estimate: 30 minutes
     */
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<Integer>();
        int num;
        int mod;
        boolean checker;
        
        for (int i = left; i <= right; i++) {
            num = i;
            checker = true;
            
            while (num != 0) {
                mod = num % 10;
                num /= 10;
                
                if (mod == 0 || i % mod != 0) {
                    checker = false;
                    break;
                }
            }
            
            if (checker) {
                result.add(i);}
        }
        
        return result;
    }

    /**
     * This one was pretty simple. Just have to pay attention to variables!
     * 
     * Time Estimate: 5 minutes
     */
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<String>();
        String num;
        
        for (int i = 1; i <= n; i++) {
            num = String.valueOf(i);
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(num);
            }
        }
        
        return result;
    }

    /**
     * Not Finished Yet...
     */
    public int[] plusOne(int[] digits) {
        int carry = 0;
        int[] lengthVar = new int[digits.length + 1];
        
        for (int i = digits.length; i >= 0; i--) {
            if ((digits[digits.length - 1] + 1) % 10 == 0) {
                carry++;
            } else {
                digits[digits.length - 1] = digits[digits.length - 1] + 1;
            }
        }
        
        lengthVar[0] = carry;

        return lengthVar;
        
        return digits;
    }

    /**
     * This one was tricky. You have to think of a formula pretty quickly.
     * What is the best way to go about this in an interview?
     * 
     * Time Estimate: 15 minutes
     */
    public int titleToNumber(String s) {
        int result = 0;
        
        for (char c : s.toCharArray()) {
            int digit = c - 'A' + 1;
            
            result *= 26;
            result += digit;
        }
        
        return result;
    }

    /**
     * Pretty straight forward!
     * 
     * Time Estimate: 3 minutes
     */
    public boolean isPowerOfTwo(int n) {
        if (n == 0) return false;
        
        while (n != 1) {
            if (n % 2 != 0) {
                return false;
            }
            n /= 2;
        }
        
        return true;
    }

    /**
     * Many ways to do this (iteratively, StringBuilder, etc.).
     * 
     * Time Estimate: 2 minutes
     */
    public String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    /**
     * This took longer than expected due to syntax and class related errors
     * 
     * Time Estimate: 20 minutes
     */
    public boolean detectCapitalUse(String word) {
        
        if (word.toUpperCase().equals(word)) {
            return true;
        }
        
        if (word.toLowerCase().equals(word)) {
            return true;
        }
        
        if (Character.isUpperCase(word.charAt(0))) {
            return word.substring(1).equals(word.substring(1).toLowerCase());
        }
        
        return false;
    }

    /**
     * This one wasn't too bad. Pretty straightforward if you use pre-defined
     * library methods and StringBuilder/StringBuffer
     * 
     * Time Estimate: 8 minutes
     */
    public String reverseWords(String s) {
        String[] split = s.split(" ");
        StringBuilder result = new StringBuilder();
        
        for (String item : split) {
            StringBuilder temp = new StringBuilder(item);
            result.append(temp.reverse().toString());
            result.append(" ");
        }
        
        result.deleteCharAt(result.length() - 1);
        
        return result.toString();
    }

    /**
     * This one was kind of fun to play with. I just recently learned how to work
     * with regular expressions so this was fun to test my knowledge. I think there 
     * is a character class for the Regex used but I couldn't find it.
     *  
     * Time Estimate: 8 minutes
     */
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[-?,\"\';!():`.@#\\s]+", "").toLowerCase();
        
        return s.equals(new StringBuilder(s).reverse().toString());
    }


    /**
     * I like what I did hear but it looks a little verbose and maybe not is
     * not optimized. The runtime is long at 39ms and its space complexity is
     * not very good either. I think it is creative and it allowed me to not
     * have to work with two points and a String array.
     * 
     * Time Estimate: 20 minutes
     */
    public String reverseVowels(String s) {
        Set<Character> set = new HashSet(Arrays.asList('a', 'e', 'i', 'o', 
                                                       'u', 'A', 'E', 'I', 
                                                       'O', 'U'));

        String vowels = s.replaceAll("[^aeiouAEIOU]+", "");
        String reversed = new StringBuilder(vowels).reverse().toString();
        StringBuilder result = new StringBuilder();
        int counter = 0;
        
        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                result.append(reversed.charAt(counter));
                counter++;
            } else {
                result.append(c);
            }
        }
        
        return result.toString();
    }


    /**
     * This is probably my favorite problem thus far because I got to kind of
     * think through an algorithm that was clear and worked simply in my head
     * and in code. It was interesting to read a little bit about the different
     * approaches that one could take to solve this problem 
     * (https://leetcode.com/articles/longest-common-prefix/).
     * 
     * Time Estimate: 10 minutes
     */
    public String longestCommonPrefix(String[] strs) {
        int min = Integer.MAX_VALUE;
        String prefix = "";
        
        for (String string : strs) {
            if (string.length() < min) {
                min = string.length();
                prefix = string;
            }
        }
        
        while (min >= 0) {
            for (String string : strs) {
                if (!string.startsWith(prefix)) {
                    prefix = prefix.substring(0, prefix.length() - 1);
                    break;
                }
            }
            
            min--;
        }
        
        return prefix;
    }
}