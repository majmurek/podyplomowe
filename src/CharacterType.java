public class CharacterType {

    public static void main(String[] args) {
    showInfo('a');
    showInfo('b');
    showInfo('A');
    showInfo('c');
    showInfo('B');
    showInfo('d');
    showInfo('e');


    }

    public static void showInfo(char c) {
        System.out.println("Kod znaku '" + c + "' to: " + (int)c);
    }
}
