package NumberLettersCount;

public class Solution {
    public static void main(String[] args) {
        String reponse = "";
        for(int i = 0; i<1000;i++){
            reponse += inString(i);

        }
        System.out.println(reponse.length()+11);
    }

    static String inString(int number){
        int first;
        int second;
        int third;
        String rep = "";
        String and;

        first = number/100;
        second = (number/10)%10;
        third = number%10;

        if(third == 0 && second == 0) and = "";
        else and = "and";
        switch (third){
            case 1: rep = "one"; break;
            case 2: rep = "two"; break;
            case 3: rep = "three"; break;
            case 4: rep = "four"; break;
            case 5: rep = "five"; break;
            case 6: rep = "six"; break;
            case 7: rep = "seven"; break;
            case 8: rep = "eight"; break;
            case 9: rep = "nine"; break;

        }
        switch (second){
            case 1: {
                switch (third){
                    case 0: rep = "ten"; break;
                    case 1: rep = "eleven"; break;
                    case 2: rep = "twelve"; break;
                    case 3: rep = "thirteen"; break;
                    case 4: rep = "fourteen"; break;
                    case 5: rep = "fifteen"; break;
                    case 6: rep = "sixteen"; break;
                    case 7: rep = "seventeen"; break;
                    case 8: rep = "eighteen"; break;
                    case 9: rep = "nineteen"; break;
                }
                break;
            }
            case 2: rep = "twenty"+rep; break;
            case 3: rep = "thirty"+rep; break;
            case 4: rep = "forty"+rep; break;
            case 5: rep = "fifty"+rep; break;
            case 6: rep = "sixty"+rep; break;
            case 7: rep = "seventy"+rep; break;
            case 8: rep = "eighty"+rep; break;
            case 9: rep = "ninety"+rep; break;

        }

        switch (first){

            case 1: rep = "onehundred"+and+rep; break;
            case 2: rep = "twohundred"+and+rep; break;
            case 3: rep = "threehundred"+and+rep; break;
            case 4: rep = "fourhundred"+and+rep; break;
            case 5: rep = "fivehundred"+and+rep; break;
            case 6: rep = "sixhundred"+and+rep; break;
            case 7: rep = "sevenhundred"+and+rep; break;
            case 8: rep = "eighthundred"+and+rep; break;
            case 9: rep = "ninehundred"+and+rep; break;
        }
        return rep;
    }
}
