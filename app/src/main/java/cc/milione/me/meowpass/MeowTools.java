package cc.milione.me.meowpass;

import java.math.BigInteger;
import java.security.MessageDigest;

public class MeowTools {

    public static String ToMD5(String string) {
        MessageDigest mDigest;
        try {
            mDigest = MessageDigest.getInstance("MD5");
            mDigest.update(string.getBytes());
            byte[] byteStr=mDigest.digest();
            String mStr = new BigInteger(1, byteStr).toString(16);
            if(mStr.length()%2==1){
                mStr="0"+mStr;
            }
            int length=mStr.length();
            StringBuffer sBuffer=new StringBuffer(length+length/2-1);
            for(int i=0;i<length;i+=2){
                sBuffer.append(mStr.substring(i, i+2));
                if(i+2<length)
                    sBuffer.append("-");
            }
            return sBuffer.toString().toUpperCase();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return string;
    }

}
