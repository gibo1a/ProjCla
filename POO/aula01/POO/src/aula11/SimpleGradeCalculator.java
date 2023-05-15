package aula11;

import java.util.List;

public class SimpleGradeCalculator implements IGradeCalculator{
    @Override
    public double calculate(List<Double> grades) {
        double average = 0;
        for(double d : grades){
            average += d;
        }

        return (average/grades.size());
    }
}
