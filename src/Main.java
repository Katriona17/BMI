public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService ();
        double weight = 53;
        double height = 1.66;
        double bmi = weight / (height * height);
        double result = service.calculate(bmi);
        System.out.println(result);
    }
}
