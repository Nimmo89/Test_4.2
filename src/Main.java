public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 120;
        int height = 183;
        double imt = weight / service.calculate(height);
        System.out.println(imt);
    }
}
