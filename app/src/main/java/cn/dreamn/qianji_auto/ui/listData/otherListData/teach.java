package cn.dreamn.qianji_auto.ui.listData.otherListData;

import android.util.Log;

import cn.dreamn.qianji_auto.ui.base.BaseFragment;
import cn.dreamn.qianji_auto.ui.listData.BaseList;

public class teach extends BaseList {

    private static teach p;

    public static teach getInstance(){
        if(p==null)
            p=new teach();
        return p;
    }

    @Override
    public String getName() {
        return "使用教程";
    }

    @Override
    public String getIcon() {
        return "&#xe62d;";
    }

    @Override
    public void onClick(BaseFragment baseFragment) {
       // baseFragment.openPage()
        Log.d("plugin","click");
    }

    @Override
    public int getFontSize() {
        return 32;
    }
}
