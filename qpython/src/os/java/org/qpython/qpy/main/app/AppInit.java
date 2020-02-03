package org.qpython.qpy.main.app;

import android.content.Context;
import android.util.Log;

import com.google.firebase.FirebaseApp;
import com.google.firebase.iid.FirebaseInstanceId;
import com.quseit.config.BASE_CONF;

import org.qpython.qpy.codeshare.ShareCodeUtil;

/**
 * 文 件 名: AppInit
 * 创 建 人: ZhangRonghua
 * 创建日期: 2018/3/8 15:13
 * 修改时间：
 * 修改备注：
 */

public class AppInit {

    public static void init(Context context){

        FirebaseApp.initializeApp(context);
        if (BASE_CONF.DEBUG) {
            try {
                FirebaseInstanceId xx = FirebaseInstanceId.getInstance();
                if (xx != null) {
                    Log.e("Firebase", xx.getToken());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        ShareCodeUtil.getInstance();
    }
}
