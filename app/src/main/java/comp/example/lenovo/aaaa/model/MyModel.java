package comp.example.lenovo.aaaa.model;

import com.google.gson.Gson;

import java.util.List;

import comp.example.lenovo.aaaa.bean.UtilBean;
import comp.example.lenovo.aaaa.net.NetUtil;

/**
 * @author: 章黎黎
 * @Date: 2019/5/5  16:04
 * @description: $描述
 */
public class MyModel {

    public static List<UtilBean.ResultBean> getData(String url){

        String s = NetUtil.getObject().doGet(url);

        if(s!=null){
            Gson gson = new Gson();
            UtilBean utilBean = gson.fromJson(s, UtilBean.class);
            List<UtilBean.ResultBean> result = utilBean.getResult();
            return result;
        }
        return null;
    }
}
