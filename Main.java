import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    System.out.println(breakString("black widow", 3));
  }

  public static ArrayList<Character> createArray() {
    ArrayList<Character> vowelsArray = new ArrayList<>();
    char[] primArr = {'a', 'e', 'i', 'o', 'u'};
    for (char c : primArr) {
      vowelsArray.add(c);
    }
    return vowelsArray;
  }

  public static String breakString(String text, int n) {
    ArrayList<Character> myArr = createArray();
    StringBuilder sb = new StringBuilder();
    if (n < 1) {
      n = 1;
    }
    for (int i = 0; i < text.length(); i++) {
      if (!myArr.contains(text.charAt(i))) {
        sb.append(text.charAt(i));
      }
      if (myArr.contains(text.charAt(i))) {
        sb.append(String.valueOf(text.charAt(i)).repeat(n));
      }
    }
    return sb.toString();
  }
}

