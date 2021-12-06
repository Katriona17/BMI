public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 53;
        double height = 1.66;
        double result = service.calculate(weight, height);
        System.out.println(result);
    }
}
