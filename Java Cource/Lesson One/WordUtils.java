
public class WordUtils {
    
    public static String reverseWords(String inputText) {
        String[] words = inputText.split(" ");
        String reversedString = "";
        for (int i = words.length - 1; i >= 0; i--) {
            reversedString += words[i] + " ";
        }
        return reversedString.trim();
    }

    public static void main(String[] args) {
        System.out.println("Ввод пустой строки - " + WordUtils.reverseWords(""));
        System.out.println("Ввод одного слова - " + WordUtils.reverseWords("word"));
        System.out.println("Ввод двух слов - " + WordUtils.reverseWords("два слова"));
    }   
}

