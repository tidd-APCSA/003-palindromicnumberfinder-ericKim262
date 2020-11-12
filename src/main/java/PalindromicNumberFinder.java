public class PalindromicNumberFinder {
    private int num;

    // constructor
    public PalindromicNumberFinder(int num){
        this.num = num;
    }

    // accessor/getter method
    public int getNum(){
        return this.num;
    }

    // // this method should find the next palindromic number
    public int searchForPalindromicNum(int num){
      Integer numer = new Integer(num);
      String snum = Integer.toString(num);
      boolean tf = true;
      while(tf == true){
        numer++;
        if(testPalindromicNum(numer)){
          tf = false;
        }
      }
      return numer;
    }

    // // this is a helper method for searchForPalindromicNum. It's purpose is to test if a number is actually a palindrome
    public boolean testPalindromicNum(int num){
      String numr = Integer.toString(num);
      boolean tof;
      String ohaf = "";
      for(int i = 0; i < numr.length() / 2 + 1; i++){
        ohaf += numr.substring(numr.length() - i - 1, numr.length() - i);
      }
      if((numr.substring(0, numr.length() / 2 + 1).equals(ohaf))){
        tof = true;
      }else{
        tof = false;
      }
      return tof;
    }

    // this is a helper method for testPalindromicNum. It should reverse the number and return it.
    public String reverseNum(int num){
      String number = Integer.toString(num);
      String newN = "";
      for(int i = 0; i < number.length(); i++){
        newN += number.substring(number.length() - i - 1, number.length() - i);
      }
      return newN;
    }


    @Override
    public String toString(){
        return "You'd have to drive " + searchForPalindromicNum(this.num) + " miles";
    }
}
