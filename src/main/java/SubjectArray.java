import java.util.Arrays;

public class SubjectArray {

    private Subject[] tab;

    SubjectArray(int length) {
        this.tab = new Subject[length];
    }

    boolean contains(Subject subject) {
        boolean flag = false;
        for (Subject sub : tab) {
            if (subject.equals(sub)) {
                flag = true;
                break;
            }
        }

        return flag;
    }

    boolean add(Subject subject, int position) {
        this.tab[position] = subject;
        return true;
    }

    @Override
    public String toString() {
        return "SubjectArray{" +
                "tab=" + Arrays.toString(tab) +
                '}';
    }

    int getTabLength() {
        return this.tab.length;
    }


}
