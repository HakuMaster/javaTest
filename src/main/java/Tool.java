import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tool {
    private static Pattern linePattern = Pattern.compile("_(\\w)");
    /**下划线转驼峰*/
    public static String lineToHump(String str){
        str = str.toLowerCase();
        Matcher matcher = linePattern.matcher(str);
        StringBuffer sb = new StringBuffer();
        while(matcher.find()){
            matcher.appendReplacement(sb, matcher.group(1).toUpperCase());
        }
        matcher.appendTail(sb);
        return sb.toString();
    }

    public static void main(String[] args) {
        String lineToHump = lineToHump("f_parent_no_leader");
        System.out.println(lineToHump);
        String str = "011,011,001,";
        int i1 = str.lastIndexOf(',');
        int i3 = str.lastIndexOf(',', i1-1);
        String first = str.substring(0, i3+1);
        int i = str.lastIndexOf(',', i3 - 1);
        String second = str.substring(0, i + 1);

        int i2 = str.lastIndexOf(',', i - 1);
        System.out.println(first+","+second + i2);

        long nowDate = System.currentTimeMillis();
        double age = ((nowDate - (Long.valueOf("1010972464000"))) / (1000 * 60 * 60 * 24 * 365));
        System.out.println(Long.valueOf("1500972464000"));
        System.out.println(nowDate);
        System.out.println(age+"************");

        String s = "{ errMsg= null, retCode = 1, data={totalSize=0, size=0, pagenation={startPage=1, rows=50}, dataset=[], tableName=mdep_mdep_chag_seta}}";
//        Result ormResult = JSON.parseObject(s, Result.class);
        JSONObject object = JSON.parseObject(s);
        System.out.println(object);

    }
}
