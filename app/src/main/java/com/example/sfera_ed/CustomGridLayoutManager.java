package com.example.sfera_ed;

import android.content.Context;

import androidx.recyclerview.widget.GridLayoutManager;

public class CustomGridLayoutManager extends GridLayoutManager {
    private boolean isScrollEnabled = true;

    public CustomGridLayoutManager(Context context, Integer num) {
        super(context, num);
    }

    public void setScrollEnabled(boolean flag) {
        this.isScrollEnabled = flag;
    }

    @Override
    public boolean canScrollVertically() {
        //Similarly you can customize "canScrollHorizontally()" for managing horizontal scroll
        return isScrollEnabled && super.canScrollVertically();
    }

}
