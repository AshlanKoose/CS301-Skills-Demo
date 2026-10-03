public class Circles {
 public static void main(String[] args) {
    double amount = Double.parseDouble(args[0]);
    double probability = Double.parseDouble(args[1]);
    double min = Double.parseDouble(args[2]);
    double max = Double.parseDouble(args[3]);
    double percent = probability * amount;
    StdDraw.setCanvasSize(1056, 1056);
    for (int i = 0; i <= amount; i++){
        double radius = (Math.random() * (max - min) + min);
        StdDraw.filledCircle(Math.random(), Math.random(), radius);
        percent--;
        amount--;
        if (percent == 0.0){
            break;
        }
    }
    if (percent == 0.0) {
        for (int i = 0; i <= amount; i++){
            double radius = (Math.random() * (max - min) + min);
            StdDraw.circle(Math.random(), Math.random(), radius);
        }  
    }
 }
}
