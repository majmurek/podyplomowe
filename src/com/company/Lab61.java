
public class Lab61 {
    int height;
    int weight;
    int depth;

}

class Wyswietl{
    public static void main(String[] args) {
        Lab61 lab = new Lab61();
        lab.height = 150;
        lab.weight = 45;
        lab.depth = 32;
        System.out.println("Wzrost: " + lab.height);
        System.out.println("Waga: " + lab.weight);
        System.out.println("Głębokość: " + lab.depth);
    }
}