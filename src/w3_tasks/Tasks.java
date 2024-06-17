package w3_tasks;

public class Tasks {
    public static void main(String[] args) {
        // Count number of words in string

/*
        int sumWords = 1; // 1- it's last word, because no whitespace after last word
        String str = "Some     Lorem      Impsum text with some number of words";
        String stringWithoutWhitespaces = str.replaceAll(" +", " "); // " +" - any number of whitespace
        char[] strArr = stringWithoutWhitespaces.toCharArray();
        System.out.println(strArr);
        for (char letter: strArr) {
            if (letter == ' ') {
                sumWords++;
            }
        }
        System.out.println(sumWords);
*/
/*
        // Count number of words in string - EASY WAY
        String str = "Some     Lorem      Impsum text with some number of words";
        int numberWords = str.split("\\s+").length;
        System.out.println(numberWords);
*/
    }



}
