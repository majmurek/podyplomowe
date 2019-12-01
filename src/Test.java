public class Test {

    public static void main(String[] args) {

        String[] dogs = {"Burek", "Pluto", "Azor"};
        String[] people = {"Ania", "Wojtek", "Dorota"};
        String[] cats = {"Filemon", "Mruczek", "Klakier"};
        String[][] names = {dogs, people, cats};

        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                System.out.print(names[i][j] + " ");
            }
            System.out.println();

        }

    }
}



