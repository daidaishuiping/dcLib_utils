package com.android.libdc_utils;

import android.content.Context;
import android.widget.Toast;

public class ToastUtils {

    public static void showMsg(Context context) {
        Toast.makeText(context, "测试", Toast.LENGTH_SHORT).show();
    }
}
