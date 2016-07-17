package org.kyle.coolweather.util;

/**
 * Created by zhangyf on 2016/7/10.
 */
public interface HttpCallbackListener {

    void onFinish(String response);

    void onError(Exception e);
}
