public class CustomDate {
   private final int day;
   private final int month;
   private final int year;
   
   public CustomDate(int days, int months, int years){
    day = days;
    month = months;
    year = years;
   }
   public static Integer BetweenDates(CustomDate f, CustomDate s){
      if (total(s) < total(f)){
         CustomDate temp = new CustomDate(0, 0, 0);
         temp = s;
         s = f;
         f = temp;
      }

      int y = (s.year - f.year) - 1;
      int sGap = s.month - 1;
      int fGap = 12 - f.month;
      int MonthGap = sGap + fGap + (12 * y);

      int m = 0;
      int temp2 = f.month;
      for (int i = 0; i < MonthGap + 1; i++){
         m = MonthtoDay(temp2) + m;
         temp2++;
      }

      int d = s.day - f.day;
      int gap = m + d;
      return gap;
   }
   public static String DayofWeek(CustomDate w){
      CustomDate start = new CustomDate(10, 11, 2026); //sunday
      int check = 0;
      int space = 0;
      check = BetweenDates(start, w);
      for (int i = 0; i < 7; i++){
         if (check % 7 != 0){
            check--;
            space++;
         } else {
            break;
         }
      }
      String[] week = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
      String date = week[space];
      return date;
   }

   private static Integer MonthtoDay(int k){
    int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    k = (k - 1) % 12;
    return days[k];
   }
   private static Integer total(CustomDate t){
      int y = t.year * 365;
      int m = 0;
      int month = t.month;
      for (int i = 1; i < t.month + 1; i++){
         m = MonthtoDay(month) + m;
         month--;
      }
      int d = t.day;
      int total = y + m + d;
      return total;
   }
}
