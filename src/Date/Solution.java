package Date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat dateFormate = new SimpleDateFormat("dd/MM/YYYY");
        String currentDate = dateFormate.format(date);
        System.out.println("Current date is: "+currentDate);
    }
}
