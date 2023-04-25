package submissions;
public class BalancedBracketTester {
    public static void main(String[] args) {
        BalancedBracket balanced = new BalancedBracket();

        System.out.println(balanced.checkBalance("()"));
        System.out.println(balanced.checkBalance("(()())"));
        System.out.println(balanced.checkBalance("((((()(())))))"));
        System.out.println(balanced.checkBalance("(()"));
        System.out.println(unbalanced.checkBalance("())"));
        System.out.println(unbalanced.checkBalance("(()()))"));
        System.out.println(unbalanced.checkBalance("((((()(()))))))"));
        System.out.println(unbalanced.checkBalance(")(()"));
    }
}
