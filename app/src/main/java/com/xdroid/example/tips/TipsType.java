package com.xdroid.example.tips;

import android.content.Context;

import com.xdroid.example.R;

public enum TipsType {

  LOADING(R.layout.tips_loading),
  LOADING_FAILED(R.layout.tips_loading_failed),
  EMPTY(R.layout.tips_empty);

  protected int mLayoutRes;

  TipsType(int layoutRes) {
    this.mLayoutRes = layoutRes;
  }

  protected Tips createTips(Context context) {
    return new Tips(context, mLayoutRes);
  }

}
