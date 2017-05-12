package university.employment.manager.tool;

import java.security.MessageDigest;

public class Md5 {
	public static String getMd5(String s) {
        char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
 
        try {
            byte[] strTemp = s.getBytes();
            MessageDigest mdTemp = MessageDigest.getInstance("md5");
            mdTemp.update(strTemp);
            byte[] md = mdTemp.digest();
            int j = md.length;
            char str[] = new char[j * 2];
            int k = 0;
            for (int i = 0; i < j; i++) {
                byte byte0 = md[i];
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                str[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(str);
        } catch (Exception e) {
            return null;
        }
    }
 
    /**
     * 标准MD5加密
     * 
     * @param inStr
     * @return
     * @throws Exception
     */
    public static String toMD5(String inStr) {
        StringBuffer sb = new StringBuffer();
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(inStr.getBytes());
            byte b[] = md.digest();
            int i;
            for (int offset = 0; offset < b.length; offset++) {
                i = b[offset];
                if (i < 0)
                    i += 256;
                if (i < 16)
                    sb.append("0");
                sb.append(Integer.toHexString(i));
            }
        } catch (Exception e) {
            return null;
            //          e.printStackTrace();
        }
        return sb.toString().toUpperCase();
    }
 
    public static void main(String[] args) throws Exception {
        System.out.println(toMD5("MATICSOFT").toUpperCase());
    }
}