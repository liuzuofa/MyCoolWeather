package com.liuzuofa.mycoolweather.util;
/*
 *  项目名：  MyCoolWeather 
 *  包名：    com.liuzuofa.mycoolweather.util
 *  文件名:   HttpUtil
 *  创建者:   Summers
 *  创建时间: 2017/2/719:46
 *  描述：    TODO
 */

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).equals(callback);
    }

}
