package com.lib.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * 吐司
 *
 * @author daichao
 */
public class ToastUtils {

    public static void showMsg(Context context) {
        Toast.makeText(context, "拉拉", Toast.LENGTH_SHORT).show();
    }

    public static void showMsg(Context context, String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }

    public static void showMsg(Context context, String msg, String msg2) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
