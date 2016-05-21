package com.ogaclejapan.smarttablayout.demo;

import android.content.Context;


import com.ogaclejapan.smarttablayout.SmartTabLayout;

public enum Demo {

  INDICATOR_TRICK1(R.string.demo_title_indicator_trick1, R.layout.demo_indicator_trick1);

  public final int titleResId;
  public final int layoutResId;

  Demo(int titleResId, int layoutResId) {
    this.titleResId = titleResId;
    this.layoutResId = layoutResId;
  }

  public void startActivity(Context context) {
    DemoActivity.startActivity(context, this);
  }

  public void setup(final SmartTabLayout layout) {
    //Do nothing.
  }

  public int[] tabs() {
    return new int[] {
            R.string.demo_tab_1,
            R.string.demo_tab_2,
            R.string.demo_tab_3,
            R.string.demo_tab_4,
            R.string.demo_tab_5,
            R.string.demo_tab_6
    };
  }
}
