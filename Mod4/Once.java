import java.util.*;
public class Once {
    public static void main(){
        String s = "ABCDBADDABCS";
        char find = ' ';
        ArrayList<Character> first = new ArrayList<Character>();
        ArrayList<Character> second = new ArrayList<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!first.contains(c)){
                first.add(c);
            }
            else if (first.contains(c)){
                second.add(c);
            }
        }
        for (int i = 0; i < first.size(); i++){
            if (!second.contains(first.get(i))){
                find = first.get(i);
                break;
            }
        }
        IO.println(find);
    }
}
