public class BmiService {

    double weight;
    double height;

    double bmi;

    public int calculate(double weight, double height) {

        bmi = weight / (height * height);

        return (int) bmi;
    }

}