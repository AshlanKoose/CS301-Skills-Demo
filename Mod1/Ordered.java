public class Ordered{
    public static void main(String[] args){
        boolean b = false;
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);
        if (((x > y) && (y > z)) || ((x < y) && (y < z))) {
            b = true;
        }
        IO.println(b);
    }
}
