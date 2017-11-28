import org.apache.logging.log4j.LogManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
    public static void main(String[] args) throws ParseException {
        Logger logger = LoggerFactory.getLogger(LogManager.ROOT_LOGGER_NAME);
     /*    Object f = 11231.3685;
        BigDecimal b = new BigDecimal(f.toString());

//
//        double df = b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
//        System.out.println(b);


        DecimalFormat df1 = new DecimalFormat("###.##");

        System.out.println(df1.format(b));
//*/
//        f = (double)Math.round(f*100)/100;
//        System.out.println(f);
//
//        Calendar calendar1 = Calendar.getInstance();
//        Calendar calendar2 = Calendar.getInstance();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
        String format = dateFormat.format(new Date());


        System.out.println(format);

        String s2 = "abc";
        String s1 = "a bc";
        boolean equals = s2.equals(s1);

//        Date date2 = dateFormat.parse("2016-6-11 13:24:16");
//        calendar1.setTime(date1);
//        calendar2.setTime(date2);

//        int y1 = calendar1.get(Calendar.YEAR);
//        int y2 = calendar2.get(Calendar.YEAR);
//        int m1 = calendar1.get(Calendar.MONTH);
//        int m2 = calendar2.get(Calendar.MONTH);
//
//        int f = (y1-y2)*12 + (m1-m2);

//        String str = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS")).format(calendar.getTime());
        System.out.println(equals);

        System.out.println("*************************");
        Calendar calendar = Calendar.getInstance();
        calendar.set(2017, 04, 17, 15, 20, 1);
        System.out.println(calendar.getTime());


        String str1 = "abcdefghijklmnabc";
        // 从头开始查找是否存在指定的字符
        System.out.println(str1.indexOf("c"));
        // 从第四个字符位置开始往后继续查找
        System.out.println(str1.indexOf("c", 3));
        //若指定字符串中没有该字符则系统返回-1
        System.out.println(str1.indexOf("x"));

        String s="Hello".replace('l','w');
        System.out.println(s);

        char ch= "abc".charAt(2);
        System.out.println(ch);

       BigDecimal bg1 = new BigDecimal("-235.738");

        // assign the BigInteger value of bg1 to i1
        BigInteger bigInteger = bg1.toBigInteger();
        System.out.println(bigInteger);


        String str = "011,011,001,";
        int i = str.indexOf(',');
        int i1 = str.lastIndexOf(',');
        int i3 = str.lastIndexOf(',', i1-1);
        System.out.println(i1+","+i3);
        System.out.println(i1-i3);
        System.out.println("#######");
//        String s3 = str.substring(i1 -3);
//        System.out.println(s3);
        int i2 = str.lastIndexOf(',', i1-3);
        System.out.println(i1);
        System.out.println(i2);
        String first = str.substring(0, i1-3);
        System.out.println(first);
        System.out.println("##########");




        ArrayList<Integer> arraylist1 = new ArrayList<Integer>();
        ArrayList<Integer> arraylist2 = new ArrayList<Integer>();
        arraylist1.add(1);arraylist1.add(2);arraylist1.add(3);
        arraylist2.add(3);arraylist2.add(4);
//        arraylist1.retainAll(arraylist2);
        arraylist1.addAll(arraylist2);

        System.out.println("Arraylist1∩Arraylist2="+arraylist1);

        HashSet objects = new HashSet();
        objects.addAll(arraylist1);
        System.out.println(objects);

        System.out.println("并集"+arraylist1.addAll(arraylist2));

        System.out.println("差集"+arraylist1.removeAll(arraylist2));

        arraylist1.retainAll(arraylist2);
        arraylist2.addAll(arraylist1);

        logger.info("nihao");


        Pattern p = Pattern.compile("\\#.*?\\#");
        Matcher mc = p.matcher(" SPLIT( 'asd#dasd#dasd','#',2)");
        System.out.println(mc.toString());
        System.out.println(mc.find());
        String foobar = mc.group().replace("#", "");
        System.out.println(foobar);
        String formulaContent = " SPLIT( 'asd#dasd#dasd','#',2)";

        System.out.println( formulaContent.replace("#", ""));

        String str12="1234@ab@c";
        String[] a = str12.split("@");
        System.out.println("处理结果: "+a[0]+","+a[1]+","+a[2]);

        System.out.println("*************************");
        Calendar calendar1 = Calendar.getInstance();
        Date date = dateFormat.parse("2013-6-1 13:24:16");
        // 对 calendar 设置为 date 所定的日期
        calendar1.setTime(date);
        calendar1.add(Calendar.HOUR,2);
        System.out.println(calendar1.getTime());
        str = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS")).format(calendar1.getTime());
        System.out.println(str);
    }
}
