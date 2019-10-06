package students;

public class Student {
    private String name;
    private String secondname;
    private String language;

    public Student(String name, String secondname, String language) {
        this.name = name;
        this.secondname = secondname;
        this.language = language;
    }

    public Student(String name, String secondname) {
        this.name = name;
        this.secondname = secondname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", secondname='" + secondname + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}
