public class Main {

    public static void main(String[] args) {

        BmiService bodyMassIndex = new BmiService();

        double weight = 98;
        double height = 1.87;

        int bmi = bodyMassIndex.calculate(weight, height);

        System.out.println("Индекс массы тела: " + bmi);

    }
}
