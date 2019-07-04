// Generated code from Butter Knife. Do not modify!
package com.example.martinruiz.myapplication.activities;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.martinruiz.myapplication.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class WeatherDetails_ViewBinding implements Unbinder {
  private WeatherDetails target;

  @UiThread
  public WeatherDetails_ViewBinding(WeatherDetails target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public WeatherDetails_ViewBinding(WeatherDetails target, View source) {
    this.target = target;

    target.textViewCityName = Utils.findRequiredViewAsType(source, R.id.textViewCardCityName, "field 'textViewCityName'", TextView.class);
    target.textViewWeatherDescription = Utils.findRequiredViewAsType(source, R.id.textViewCardWeatherDescription, "field 'textViewWeatherDescription'", TextView.class);
    target.textViewCurrentTemp = Utils.findRequiredViewAsType(source, R.id.textViewCardCurrentTemp, "field 'textViewCurrentTemp'", TextView.class);
    target.textViewMaxTemp = Utils.findRequiredViewAsType(source, R.id.textViewCardMaxTemp, "field 'textViewMaxTemp'", TextView.class);
    target.textViewMinTemp = Utils.findRequiredViewAsType(source, R.id.textViewCardMinTemp, "field 'textViewMinTemp'", TextView.class);
    target.imageViewWeatherIcon = Utils.findRequiredViewAsType(source, R.id.imageViewCardWeatherIcon, "field 'imageViewWeatherIcon'", ImageView.class);
    target.textViewDay1 = Utils.findRequiredViewAsType(source, R.id.textViewDay1, "field 'textViewDay1'", TextView.class);
    target.textViewDay2 = Utils.findRequiredViewAsType(source, R.id.textViewDay2, "field 'textViewDay2'", TextView.class);
    target.textViewDay3 = Utils.findRequiredViewAsType(source, R.id.textViewDay3, "field 'textViewDay3'", TextView.class);
    target.textViewDay4 = Utils.findRequiredViewAsType(source, R.id.textViewDay4, "field 'textViewDay4'", TextView.class);
    target.textViewDay5 = Utils.findRequiredViewAsType(source, R.id.textViewDay5, "field 'textViewDay5'", TextView.class);
    target.imageViewDay1 = Utils.findRequiredViewAsType(source, R.id.imageViewDay1, "field 'imageViewDay1'", ImageView.class);
    target.imageViewDay2 = Utils.findRequiredViewAsType(source, R.id.imageViewDay2, "field 'imageViewDay2'", ImageView.class);
    target.imageViewDay3 = Utils.findRequiredViewAsType(source, R.id.imageViewDay3, "field 'imageViewDay3'", ImageView.class);
    target.imageViewDay4 = Utils.findRequiredViewAsType(source, R.id.imageViewDay4, "field 'imageViewDay4'", ImageView.class);
    target.imageViewDay5 = Utils.findRequiredViewAsType(source, R.id.imageViewDay5, "field 'imageViewDay5'", ImageView.class);
    target.textViewMaxTempDay1 = Utils.findRequiredViewAsType(source, R.id.textViewMaxTempDay1, "field 'textViewMaxTempDay1'", TextView.class);
    target.textViewMaxTempDay2 = Utils.findRequiredViewAsType(source, R.id.textViewMaxTempDay2, "field 'textViewMaxTempDay2'", TextView.class);
    target.textViewMaxTempDay3 = Utils.findRequiredViewAsType(source, R.id.textViewMaxTempDay3, "field 'textViewMaxTempDay3'", TextView.class);
    target.textViewMaxTempDay4 = Utils.findRequiredViewAsType(source, R.id.textViewMaxTempDay4, "field 'textViewMaxTempDay4'", TextView.class);
    target.textViewMaxTempDay5 = Utils.findRequiredViewAsType(source, R.id.textViewMaxTempDay5, "field 'textViewMaxTempDay5'", TextView.class);
    target.textViewMinTempDay1 = Utils.findRequiredViewAsType(source, R.id.textViewMinTempDay1, "field 'textViewMinTempDay1'", TextView.class);
    target.textViewMinTempDay2 = Utils.findRequiredViewAsType(source, R.id.textViewMinTempDay2, "field 'textViewMinTempDay2'", TextView.class);
    target.textViewMinTempDay3 = Utils.findRequiredViewAsType(source, R.id.textViewMinTempDay3, "field 'textViewMinTempDay3'", TextView.class);
    target.textViewMinTempDay4 = Utils.findRequiredViewAsType(source, R.id.textViewMinTempDay4, "field 'textViewMinTempDay4'", TextView.class);
    target.textViewMinTempDay5 = Utils.findRequiredViewAsType(source, R.id.textViewMinTempDay5, "field 'textViewMinTempDay5'", TextView.class);
    target.textViewHumidity = Utils.findRequiredViewAsType(source, R.id.textViewHumidity, "field 'textViewHumidity'", TextView.class);
    target.textViewWind = Utils.findRequiredViewAsType(source, R.id.textViewWind, "field 'textViewWind'", TextView.class);
    target.textViewCloudiness = Utils.findRequiredViewAsType(source, R.id.textViewCloudiness, "field 'textViewCloudiness'", TextView.class);
    target.textViewPressure = Utils.findRequiredViewAsType(source, R.id.textViewPressure, "field 'textViewPressure'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    WeatherDetails target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.textViewCityName = null;
    target.textViewWeatherDescription = null;
    target.textViewCurrentTemp = null;
    target.textViewMaxTemp = null;
    target.textViewMinTemp = null;
    target.imageViewWeatherIcon = null;
    target.textViewDay1 = null;
    target.textViewDay2 = null;
    target.textViewDay3 = null;
    target.textViewDay4 = null;
    target.textViewDay5 = null;
    target.imageViewDay1 = null;
    target.imageViewDay2 = null;
    target.imageViewDay3 = null;
    target.imageViewDay4 = null;
    target.imageViewDay5 = null;
    target.textViewMaxTempDay1 = null;
    target.textViewMaxTempDay2 = null;
    target.textViewMaxTempDay3 = null;
    target.textViewMaxTempDay4 = null;
    target.textViewMaxTempDay5 = null;
    target.textViewMinTempDay1 = null;
    target.textViewMinTempDay2 = null;
    target.textViewMinTempDay3 = null;
    target.textViewMinTempDay4 = null;
    target.textViewMinTempDay5 = null;
    target.textViewHumidity = null;
    target.textViewWind = null;
    target.textViewCloudiness = null;
    target.textViewPressure = null;
  }
}
