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
      String str = "";
      boolean tf;
       for(int i = 0; i < String.valueOf(numer).length() / 2 + 1; i++){
        str += String.valueOf(numer).substring(String.valueOf(numer).length() - i - 1, String.valueOf(numer).length() - i);
      }
      if((String.valueOf(numer).substring(0, String.valueOf(numer).length() / 2 + 1).equals(str))){
        tf = true;
      }else{
        tf = false;
      }
      if(tf == true){
        numer++;
        tf = false;
      }
      while(tf == false){
        numer++;
        tf = true;
      }
      for(int i = 0; i < String.valueOf(numer).length() / 2 + 1; i++){
        str += String.valueOf(numer).substring(String.valueOf(numer).length() - i - 1, String.valueOf(numer).length() - i);
      }
      if((String.valueOf(numer).substring(0, String.valueOf(numer).length() / 2 + 1).equals(str))){
        tf = true;
      }else{
        tf = false;
      }
      return numer;
    }

    // // this is a helper method for searchForPalindromicNum. It's purpose is to test if a number is actually a palindrome
    public boolean testPalindromicNum(int num){
      Integer numr = new Integer(num);
      boolean tof;
      String ohaf = "";
      for(int i = 0; i < String.valueOf(numr).length() / 2 + 1; i++){
        ohaf += String.valueOf(numr).substring(String.valueOf(numr).length() - i - 1, String.valueOf(numr).length() - i);
      }
      if((String.valueOf(numr).substring(0, String.valueOf(numr).length() / 2 + 1).equals(ohaf))){
        tof = true;
      }else{
        tof = false;
      }
      return tof;
    }


    // this is a helper method for testPalindromicNum. It should reverse the number and return it.
    public String reverseNum(int num){
      Integer number = new Integer(num);
      String newN = "";
      for(int i = 0; i < String.valueOf(number).length(); i++){
        newN += String.valueOf(number).substring(String.valueOf(number).length() - i - 1, String.valueOf(number).length() - i);
      }
      return newN;
    }


    @Override
    public String toString(){
        return "You'd have to drive " + searchForPalindromicNum(this.num) + " miles";
    }
}
