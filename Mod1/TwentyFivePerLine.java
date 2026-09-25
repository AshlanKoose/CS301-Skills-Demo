public class TwentyFivePerLine{
    public static void main(String[] args){
        int b = 1000;
        for (int i = 0; i < 1001; i++){
            IO.print(b + " ");
            if (b % 40 == 0){
                IO.println("");
            }
            b++;
        }
    }
}
