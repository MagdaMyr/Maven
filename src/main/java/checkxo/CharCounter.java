package checkxo;

public class CharCounter {

    public static boolean checkXO(String word) {
        word = word.toLowerCase();
        int sumX = 0;
        int sumO = 0;

        for (char c : word.toCharArray()) {
            if (c == 'x') {
                sumX++;
            } else if (c == 'o') {
                sumO++;
            }
        }

        return sumX == sumO;
    }

}
