package com.joey.pluginapk.plugin;

import android.util.Log;

import com.joey.pluginapk.common.Const;
import com.joey.pluginapk.library.TestInterface;

/**
 * 文件描述
 * Date: 16/8/3
 *
 * @author xusheng
 */
public class PluginManager {
    private static final String PLUGIN_NAME = "plugin.apk";

    private PluginLoader mPluginLoader;

    private static final class PluginManagerHolder {
        private static final PluginManager INSTANCE = new PluginManager();
    }

    public static PluginManager getInstance() {
        return PluginManagerHolder.INSTANCE;
    }

    /**
     * Load theloadDtPluginApk apk
     */
    public void loadPluginApk() {
        if (mPluginLoader == null) {
            mPluginLoader = new PluginLoader();
            mPluginLoader.loadPluginApk(PLUGIN_NAME);
        }
    }

    /**
     * 创建一个TestUtil插件
     */
    public TestInterface createTestPluginInstance() {
        if (mPluginLoader == null) {
            Log.e(Const.LOG, "createTestPluginInstance plugin loader is null");
            return null;
        }

        TestInterface testManager = (TestInterface) mPluginLoader.newInstance("com.joey.pluginapk.plugin.TestUtil");
        return testManager;
    }

}
