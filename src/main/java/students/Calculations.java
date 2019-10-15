package students;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class Calculations {

    public double calculateBestAverage(Map<Student, Grades> inputMap) {
        double avr = 0.0;
        List<Double> studentsAvr = new ArrayList<>();

        for(Map.Entry<Student, Grades> entry: inputMap.entrySet()) {
            avr = calculateAvrg(entry.getValue());
            studentsAvr.add(avr);
        }

        double bestAvr = 0.0;

        for (int i = 0; i < studentsAvr.size(); i++) {
            if(studentsAvr.get(i) > bestAvr) {
                bestAvr = studentsAvr.get(i);
            }
        }

//        for(List<Double> tempList: studentsAvr) {
//            if(avr > max) {
//                max = avr;
//            }

        return bestAvr;
    }

    public List<Student> findStudentsNamesWithBestAverage (Map<Student, Grades> inputMap) {
        final double bestAvg = inputMap.values().stream()
                .mapToDouble(this::calculateAvrg) // g -> calculateAvrg(g)
                .max()
                .orElse(0);

        List<Student> bestStudents = new ArrayList<>();

        for(Map.Entry<Student, Grades> entry: inputMap.entrySet()) {
            final double avg = calculateAvrg(entry.getValue());

            if(avg == bestAvg) {
                bestStudents.add(entry.getKey());
            }
        }
        return bestStudents;
    }

    public List<Student> findStudentsWhichSpeakPolishWithAverageFromMathAbove4 (Map<Student, Grades> inputMap) {
        List<Student> polishStudents = new ArrayList<>();
        //double bestMathAvg = 0.0;

        //jak mam sie dostać do matematyki ?


        for(Map.Entry<Student, Grades> entry: inputMap.entrySet()) {
            if(entry.getKey().getLanguage().equals("polish")){
                polishStudents.add(entry.getKey());
            }
        }
        return null;
    }

    private double calculateAvrg(Grades grades) {
        final List<List<Integer>> lists = grades.getGradesList();

        return lists.stream()
                .flatMap(l -> l.stream())
                .mapToInt(k -> k)
                // tu sie gubie
                .average()
                .orElse(0);
    }
}



