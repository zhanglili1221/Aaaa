package comp.example.lenovo.aaaa.presenter;

import android.os.Handler;
import android.os.Message;

import java.util.List;

import comp.example.lenovo.aaaa.bean.UtilBean;

/**
 * @author: 章黎黎
 * @Date: 2019/5/5  16:08
 * @description: $描述
 */
public abstract class BasePresenter {

    private ShowInterface showInterface;

    public BasePresenter(ShowInterface showInterface) {
        this.showInterface = showInterface;
    }

    private Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if(msg.what==1){
                showInterface.success((List<UtilBean.ResultBean>) msg.obj);
            }
        }
    };
    public void getData(final String url){
        new Thread(){
            @Override
            public void run() {
                super.run();
                List<UtilBean.ResultBean> resultBeans = sendModel(url);
                if(resultBeans!=null){
                    Message message = handler.obtainMessage();
                    message.obj=resultBeans;
                    message.what=1;
                    handler.sendMessage(message);
                }
            }
        }.start();
    }
    abstract List<UtilBean.ResultBean> sendModel(String s);
}
