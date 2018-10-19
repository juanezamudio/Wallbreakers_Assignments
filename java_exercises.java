class Exercises {

    /**
     * Day 6, Exercise 30
     */
    public static boolean isValidWebAddress(String webAddress) {
        String pattern = "(http|https)://(www.)*\\w+\\.(com|org|net)";
        return webAddress.matches(pattern);
    }

    public static void main (String[] args) {
        System.out.println(isValidWebAddress("https://infosys.net"));
    }
}