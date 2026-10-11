public class ReverseString{
    public static void main(){
        IO.println(reverse("JellyBean"));
    }
    public static String reverse(String s){
        if (s.length() <= 1){
            return s;
        }
        return reverse(s.substring(1)) + s.charAt(0);
    }
}