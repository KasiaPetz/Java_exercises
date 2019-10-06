package students;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;


public class CalculationsTest {

    @Test
    public void shouldCalculateBestAverage() {
        Student student = new Student("Kasia", "Kasia", "polish");
        Student student1 = new Student("Marek", "Marek");

        List<Integer> maths = new ArrayList<>();
        maths.add(4);
        maths.add(4);

        List<Integer> physics = new ArrayList<>();
        physics.add(2);
        physics.add(2);

        List<Integer> maths1 = new ArrayList<>();
        maths1.add(1);
        maths1.add(1);

        List<Integer> physics1 = new ArrayList<>();
        physics1.add(1);
        physics1.add(1);


        //dla studenta
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(maths);
        lists.add(physics);

        // dla studenta1
        List<List<Integer>> lists1 = new ArrayList<>();
        lists1.add(maths1);
        lists1.add(physics1);


        Grades grades= new Grades(lists);
        Grades grades1 = new Grades(lists1);

        Map<Student, Grades> students = new HashMap<>();
        students.put(student, grades);
        students.put(student1, grades1);

        Calculations calculations = new Calculations();

        //when
        double result = calculations.calculateBestAverage(students);

        //then
        assertThat(result).isEqualTo(3.0);

    }

    @Test
    public void shouldFindStudentsNamesWithBestAverage() {
        //given
        Student student = new Student("Kasia", "Kasia", "polish");
        Student student1 = new Student("Marek", "Marek");

        List<Integer> mathsGrades = new ArrayList<>();
        mathsGrades.add(4);
        mathsGrades.add(4);

        List<Integer> physics = new ArrayList<>();
        physics.add(2);
        physics.add(2);

        //dla 1 studenta
        List<List<Integer>> lists = new ArrayList<>();

        lists.add(mathsGrades);
        lists.add(physics);


        Grades grades= new Grades(lists);
        Grades grades1 = new Grades(new ArrayList<>());

        Map<Student, Grades> students = new HashMap<>();
        students.put(student, grades);
        students.put(student1, grades1);

        Calculations calculations = new Calculations();

        //when
        List<Student> result = calculations.findStudentsNamesWithBestAverage(students);

        //then
        assertThat(result.size()).isEqualTo(1);
    }

    @Test
    public void findStudentsWhichSpeakPolishWithAverageFromMathAbove4() {
        //given
        Student student = new Student("Kasia", "Kasia", "polish");
        Student student1 = new Student("Marek", "Marek");
        Student student2 = new Student("Michał", "Michał", "polish");
        Student student3 = new Student("Monika", "Monika", "english");


       //dla studenta
        List<Integer> maths = new ArrayList<>();
        maths.add(4);
        maths.add(5);

        List<Integer> physics = new ArrayList<>();
        physics.add(2);
        physics.add(2);

        List<List<Integer>> lists = new ArrayList<>();
        lists.add(maths);
        lists.add(physics);

        //dla studenta1
        List<Integer> maths1 = new ArrayList<>();
        maths1.add(1);
        maths1.add(1);

        List<Integer> physics1 = new ArrayList<>();
        physics1.add(1);
        physics1.add(1);

        List<List<Integer>> lists1 = new ArrayList<>();
        lists1.add(maths1);
        lists1.add(physics1);

        //dla studenta2
        List<Integer> maths2 = new ArrayList<>();
        maths2.add(1);
        maths2.add(1);

        List<Integer> physics2 = new ArrayList<>();
        physics2.add(1);
        physics2.add(1);

        List<List<Integer>> lists2 = new ArrayList<>();
        lists2.add(maths2);
        lists2.add(physics2);

        //dla studenta3
        List<Integer> maths3 = new ArrayList<>();
        maths2.add(1);
        maths2.add(1);

        List<Integer> physics3 = new ArrayList<>();
        physics3.add(1);
        physics3.add(1);

        List<List<Integer>> lists3 = new ArrayList<>();
        lists3.add(maths3);
        lists3.add(physics3);

        Grades grades= new Grades(lists);
        Grades grades1 = new Grades(lists1);
        Grades grades2 = new Grades(lists2);
        Grades grades3 = new Grades(lists3);

        Map<Student, Grades> students = new HashMap<>();
        students.put(student, grades);
        students.put(student1, grades1);
        students.put(student2, grades2);
        students.put(student3, grades3);

        Calculations calculations = new Calculations();

        //when
        // ?????
        List<Student> resultList =
                 calculations.findStudentsWhichSpeakPolishWithAverageFromMathAbove4(students);

        //then
        assertThat(resultList.size()).isEqualTo(1);




    }
}