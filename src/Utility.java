public class Utility {

    public static String checkNull(String value, String defaultValue) {
        return value == null || value.isBlank() ? defaultValue : value;
    }
    public static double checkDouble(double value, double defaultValue) {
        return value <= 0.0 ? defaultValue : value;
    }
    public static float checkFloat(float value, float defaultValue) {
        return value <= 0.0 ? defaultValue : value;
    }
    public static int checkInt(int value, int defaultValue) {
        return value <= 0 ? defaultValue : value;
    }
}