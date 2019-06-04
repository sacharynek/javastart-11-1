import java.util.Arrays;
import java.util.Scanner;

public class SubjectArray {

    private Subject[] tab;

    SubjectArray(int length) {
        this.tab = new Subject[length];
    }

    private boolean contains(Subject subject) {
        boolean flag = false;
        for (Subject sub : tab) {
            if (subject.equals(sub)) {
                flag = true;
            }
        }

        return flag;
    }

    private void add(Subject subject, int position) {
        this.tab[position] = subject;
    }

    private Subject createSubject() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj nazwe przedmiotu");
        String name = scanner.nextLine();
        System.out.println("Podaj ilość punktów ects");
        int ects = scanner.nextInt();
        System.out.println("Podaj ilość godzin w semestrze");
        int hours = scanner.nextInt();

        return new Subject(name, ects, hours);
    }

    @Override
    public String toString() {
        return "SubjectArray{" +
                "tab=" + Arrays.toString(tab) +
                '}';
    }

    private int getTabLength() {
        return this.tab.length;
    }

    void fillTab() {
        boolean flag = true;
        int counter = 0;
        while (flag) {
            Subject sub = createSubject();
            if (!contains(sub)) {
                add(sub, counter);
                counter++;
                System.out.println("obiet został dodany: " + sub);
            } else {
                System.out.println("Obiekt nie został dodany! Wpisz dane ponownie");
            }
            if (counter >= getTabLength()) {
                flag = false;
                System.out.println("tablica jest pełna! Kończymy pracę!");
            }
        }
    }
}
