public class BmiService {
    public double calculate(double height) {
        double imt = (height / 100) * (height / 100);
        return imt;
    }
}
