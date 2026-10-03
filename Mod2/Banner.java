import java.awt.Font;

public class Banner {

    public static void main(String[] args) {
        String s = args[0];
        int time = Integer.parseInt(args[1]);
        double coord = 0.0;

        Font font = new Font("Arial", Font.BOLD, 100);
        StdDraw.setFont(font);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.enableDoubleBuffering();
        
        while (true){
            StdDraw.clear(StdDraw.BLACK);
            StdDraw.text((coord % 1.0),       0.5, s);
            StdDraw.text((coord % 1.0) - 1.0, 0.5, s);
            StdDraw.text((coord % 1.0) + 1.0, 0.5, s);
            StdDraw.pause(time);
            StdDraw.show();
            coord = coord + 0.01;
        }
    }
}