import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        SubjectArray sa = new SubjectArray(3);
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        int counter = 0;

        while (flag) {

            System.out.println("Podaj nazwe przedmiotu");
            String name = scanner.nextLine();

            System.out.println("Podaj ilość punktów ects");
            int ects = scanner.nextInt();
            System.out.println("Podaj ilość godzin w semestrze");
            int hours = scanner.nextInt();
            scanner.nextLine();

            Subject sub = new Subject(name, ects, hours);
            if (!sa.contains(sub)) {
                sa.add(sub, counter);
                counter++;
                System.out.println("obiet został dodany: " + sub);
            } else {
                System.out.println("Obiekt nie został dodany! Wpisz dane ponownie");
            }
            if (counter >= sa.getTabLength()) {
                flag = false;
                System.out.println("tablica jest pełna! Kończymy pracę!");
            }
        }
        System.out.println(sa);

    }


}
