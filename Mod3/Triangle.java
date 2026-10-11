public class Triangle {
    public static void main() {
        IO.println(areTriangular(3.0, 1.0, 5.0));
    }
    public static boolean areTriangular(double x, double y, double z) {
        if (x >= y + z){
            return false;
        }
        if (y >= x + z){
            return false;
        }
        if (z >= x + y){
            return false;
        }
        return true;
    }
}
