package thread.threadclass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDiff {
    public static double yearDateDiff(String startDate, String endDate) {
        Calendar calBegin = Calendar.getInstance(); //获取日历实例
        Calendar calEnd = Calendar.getInstance();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long lt = new Long(startDate);
        Date date = new Date(lt);
        String res = simpleDateFormat.format(date);
        calBegin.setTime(stringTodate(res));
        calEnd.setTime(stringTodate(endDate));
        double year = calEnd.get(Calendar.YEAR) - calBegin.get(Calendar.YEAR);
        double month = calEnd.get(Calendar.MONTH) - calBegin.get(Calendar.MONTH);
        double day = calEnd.get(Calendar.DAY_OF_MONTH) - calBegin.get(Calendar.DAY_OF_MONTH);

        java.text.DecimalFormat   df   =new   java.text.DecimalFormat("#.0");
        String s = df.format(year * 12 + month + day / 30);

        return Double.valueOf(s);
    }

    //字符串按照指定格式转化为日期
    public static Date stringTodate(String dateStr) {
        // 如果时间为空则默认当前时间
        Date date = null;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if (dateStr != null && !dateStr.equals("")) {
            String time = "";
            try {
                Date dateTwo = format.parse(dateStr);
                time = format.format(dateTwo);
                date = format.parse(time);
            } catch (ParseException e) {
                e.printStackTrace();
            }

        } else {
            String timeTwo = format.format(new Date());
            try {
                date = format.parse(timeTwo);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return date;
    }
}
