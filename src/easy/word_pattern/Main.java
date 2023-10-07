package easy.word_pattern;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String pattern = "abba";
        String s = "dog cat cat dog";
        boolean result = solution.wordPattern(pattern, s);
        System.out.println(result);
    }
}
