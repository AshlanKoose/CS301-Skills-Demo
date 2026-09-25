public class DistanceSquared{
    public static void main(String[] args){
        double num = Double.parseDouble(args[0]);
        double nums = Double.parseDouble(args[1]);
        double distance = Math.pow(num - 0, 2) + Math.pow(nums - 0, 2);
        distance = Math.pow(distance, 2);
        IO.println("The distance squared from ("+ num + "," + nums + ") to (0,0) is " + distance);
    }
}
