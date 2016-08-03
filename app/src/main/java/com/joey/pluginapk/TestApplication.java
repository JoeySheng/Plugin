package com.joey.pluginapk;

import android.app.Application;
import android.content.Context;

import com.joey.pluginapk.plugin.PluginManager;

/**
 * 文件描述
 * Date: 16/8/3
 *
 * @author xusheng
 */
public class TestApplication extends Application{

    private static TestApplication mInstance;

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        mInstance = this;
        PluginManager.getInstance().loadPluginApk();
    }

    /**
     * 获取Application的实例
     */
    public static TestApplication getInstance() {
        return mInstance;
    }
}
