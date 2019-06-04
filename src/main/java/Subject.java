import java.util.Objects;

public class Subject {

    private String name;
    private int hoursPerSemester, ects;

    Subject(String name, int hoursPerSemester, int ects) {
        this.name = name;
        this.hoursPerSemester = hoursPerSemester;
        this.ects = ects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHoursPerSemester() {
        return hoursPerSemester;
    }

    public void setHoursPerSemester(int hoursPerSemester) {
        this.hoursPerSemester = hoursPerSemester;
    }

    public int getEcts() {
        return ects;
    }

    public void setEcts(int ects) {
        this.ects = ects;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Subject subject = (Subject) o;
        return hoursPerSemester == subject.hoursPerSemester &&
                ects == subject.ects &&
                Objects.equals(name, subject.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hoursPerSemester, ects);
    }

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", hoursPerSemester=" + hoursPerSemester +
                ", ects=" + ects +
                '}';
    }
}
