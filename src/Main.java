public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double imt1 = service.calculate( 183, 120);
        System.out.println(imt1);

        double imt2 = service.calculate( 195, 110);
        System.out.println(imt2);
    }
}
