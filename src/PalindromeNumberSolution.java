public class PalindromeNumberSolution {
    public boolean isPalindrome(int input) {
        long reverseValue = 0;
        if (reverseValue== input)
            return  true;
        long manipulatedValue = input;
        manipulatedValue=input<0?manipulatedValue * -1: manipulatedValue;

        long modulusResult = 0;
        while ( manipulatedValue!= 0) {
            modulusResult =manipulatedValue%  10;
            reverseValue *=  10;
            reverseValue+=modulusResult;
            manipulatedValue/=10;
        }

        if(input == reverseValue)
            return input*reverseValue>0;
        else
            return false;


    }
}
