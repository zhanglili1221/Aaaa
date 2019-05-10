package comp.example.lenovo.aaaa.net;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * @author: 章黎黎
 * @Date: 2019/5/5  15:54
 * @description: $描述
 */
public class NetUtil {

    OkHttpClient okHttpClient;

     public static NetUtil netUtil = new NetUtil();

    public NetUtil() {
    }
    public static NetUtil getObject(){
        return netUtil;
    }

    public String doGet(String url){
        Request build = new Request.Builder().url(url).get().build();
        Call call = okHttpClient.newCall(build);

        try {
            String string = call.execute().body().string();
            return string;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
