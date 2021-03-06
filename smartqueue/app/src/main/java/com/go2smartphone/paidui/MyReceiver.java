package com.go2smartphone.paidui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by administrator on 2017/8/15.
 */

public class MyReceiver extends BroadcastReceiver {

    private MyMessage msg;

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("```", "收到刷新广播");

        msg.getMsg("noti"); //广播结合接口来实现一个回调来刷新历史队伍界面
    }

    interface MyMessage {
        public void getMsg(String msg);
    }

    public void setMsg(MyMessage msg) {
        this.msg = msg;
    }

}
