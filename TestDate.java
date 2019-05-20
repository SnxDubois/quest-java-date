import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;

class TestDate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please fill a day (1-31) :");
        int day = sc.nextInt();
        System.out.println("Please fill a month (1-12) :");
        int month = sc.nextInt();
        System.out.println("Please fill a year :");
        int year = sc.nextInt();
        sc.close();

        // TODO : your code after this line
        // SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        // Date current = new Date();
        // System.out.println(sdf.format(current));

        // SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        // try {
        // Date birthday = format.parse("14/06/1983");
        // System.out.println(birthday); // Thu Jan 01 00:00:00 CET 1970
        // } catch (ParseException e) {
        // e.printStackTrace();
        // }

        // Calendar c = new GregorianCalendar(2019, 3, 22, 13, 30, 00);
        // Date d = c.getTime();
        // System.out.println(sdf.format(d)); // 22/04/2019 13:30:00

        SimpleDateFormat sdfQuest = new SimpleDateFormat("MM/dd/yyyy");
        Calendar c = new GregorianCalendar(year, month - 1, day);
        Date d = c.getTime();
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        System.out.println("The date is : " + sdfQuest.format(d));
        System.out.println("The day of the week is : " + dayOfWeek);

    }
}
