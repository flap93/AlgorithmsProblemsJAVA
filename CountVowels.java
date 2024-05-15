public class CountVowels {
 
  public static int countVowels(String str) {
    String vowels = "aeiouAEIOU";
    int count = 0;

    for (int i = 0; i < str.length(); i++) {
        if (vowels.indexOf(str.charAt(i)) != -1) {
            count++;
        }
    }

    return count;
}

public static void main(String[] args) {
    System.out.println(countVowels("hello world")); // Output: 3
    System.out.println(countVowels("OpenAI is amazing")); // Output: 7
}
}
