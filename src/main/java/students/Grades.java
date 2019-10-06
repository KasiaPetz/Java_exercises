package students;

import java.util.List;

//matematyka, fizyka, angielski
public class Grades {

    private List<List<Integer>> gradesList;

    public Grades(List<List<Integer>> gradesList) {
        this.gradesList = gradesList;
    }

    public List<List<Integer>> getGradesList() {
        return gradesList;
    }

    public void setGradesList(List<List<Integer>> gradesList) {
        this.gradesList = gradesList;
    }
}
