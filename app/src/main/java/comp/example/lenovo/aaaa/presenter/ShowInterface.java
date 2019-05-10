package comp.example.lenovo.aaaa.presenter;

import java.util.List;

import comp.example.lenovo.aaaa.bean.UtilBean;

/**
 * @author: 章黎黎
 * @Date: 2019/5/5  16:13
 * @description: $描述
 */
public interface ShowInterface {
    void success(List<UtilBean.ResultBean> list);
    void error(String s);
}
