import java.util.List;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toList;

public class Chapter3 {

    private static final double weight = 0.1;

    public static void main(String[] args) {

        double[] number_of_toes = new double[]{8.5, 9.5, 10, 9};
        double pred = neural_network(number_of_toes[0]);

        System.out.println(pred);

        List<Double> collect = stream(number_of_toes).map(Chapter3::neural_network).boxed().collect(toList());
        System.out.println(collect);
    }

    private static double neural_network(double input) {
        return input * weight;
    }


}
