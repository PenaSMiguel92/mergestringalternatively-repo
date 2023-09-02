public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.mergeAlternately("abc", "pqr"));
        System.out.println(sol.mergeAlternately("ab", "pqrs"));
        System.out.println(sol.mergeAlternately("abcd", "pq"));
    }
}