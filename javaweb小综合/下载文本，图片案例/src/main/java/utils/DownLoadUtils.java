package utils;
//工具类，暂时不能用
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class DownLoadUtils {
    public static String getFileName(String agent, String filename) throws Exception {
        if (agent.contains("MSIE")) {
            filename = URLEncoder.encode(filename, "utf-8");
            filename = filename.replace("+", " ");
        } else if (agent.contains("Firefox")) {
            Base64.Encoder encoder = Base64.getEncoder();
            filename = "=?utf-8?B?" + encoder.encodeToString(filename.getBytes("utf-8")) + "?=";
        } else {
            filename = URLEncoder.encode(filename, "utf-8");
        }
        return filename;
    }
}

