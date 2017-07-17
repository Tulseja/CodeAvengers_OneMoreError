package com.onemoreerror.codeavengers.Application;


import android.app.Application;

import net.gotev.speech.Logger;
import net.gotev.speech.Speech;

public class AppApplication extends Application{

    private static AppApplication sInstance;
//    private RequestQueue mRequestQueue;

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
        Speech.init(this,getPackageName());
        Logger.setLogLevel(Logger.LogLevel.DEBUG);
    }

    public static AppApplication getInstance() {
        if (sInstance == null)
            sInstance = new AppApplication();
        return sInstance;
    }




}
