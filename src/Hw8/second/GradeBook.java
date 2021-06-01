package Hw8.second;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class GradeBook {

    public static void main(String[] args) {


        Set<String> namesOfStudents = TestResult.listOfStudentsNames();
        HashMap<String, Integer> firstTest = TestResult.getOriginalGrades();
        HashMap<String, Integer> secondTest = TestResult.getMakeUpGrades();
        HashMap<String, Integer> gradeBookMap = new HashMap<>();


        namesOfStudents.forEach( x -> {
                    if (firstTest.get(x) > secondTest.get(x)) {
                        gradeBookMap.put(x, firstTest.get(x));
                    } else {
                        gradeBookMap.put(x, secondTest.get(x));
                    }

                }

        );

        gradeBookMap.forEach((k,v )  -> System.out.println(k + "  " + v));

    }
    }

