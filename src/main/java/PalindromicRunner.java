public class PalindromicRunner {
    public static void main(String[] args) {
        // be sure you're testing each method as you work then produce your final output using the toString method
        PalindromicNumberFinder numb = new PalindromicNumberFinder(82128);
        System.out.println(numb.searchForPalindromicNum(numb.getNum()));
        System.out.println(numb.testPalindromicNum(numb.getNum()));
        System.out.println(numb.reverseNum(numb.getNum()));
    }
}
