// Generated code from Butter Knife. Do not modify!
package com.example.martinruiz.myapplication.adapters;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.martinruiz.myapplication.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class CityWeatherAdapter$ViewHolder_ViewBinding implements Unbinder {
  private CityWeatherAdapter.ViewHolder target;

  @UiThread
  public CityWeatherAdapter$ViewHolder_ViewBinding(CityWeatherAdapter.ViewHolder target,
      View source) {
    this.target = target;

    target.textViewCityName = Utils.findRequiredViewAsType(source, R.id.textViewCardCityName, "field 'textViewCityName'", TextView.class);
    target.textViewWeatherDescription = Utils.findRequiredViewAsType(source, R.id.textViewCardWeatherDescription, "field 'textViewWeatherDescription'", TextView.class);
    target.textViewCurrentTemp = Utils.findRequiredViewAsType(source, R.id.textViewCardCurrentTemp, "field 'textViewCurrentTemp'", TextView.class);
    target.textViewMaxTemp = Utils.findRequiredViewAsType(source, R.id.textViewCardMaxTemp, "field 'textViewMaxTemp'", TextView.class);
    target.textViewMinTemp = Utils.findRequiredViewAsType(source, R.id.textViewCardMinTemp, "field 'textViewMinTemp'", TextView.class);
    target.imageViewWeatherIcon = Utils.findRequiredViewAsType(source, R.id.imageViewCardWeatherIcon, "field 'imageViewWeatherIcon'", ImageView.class);
    target.cardViewWeather = Utils.findRequiredViewAsType(source, R.id.cardViewWeatherCard, "field 'cardViewWeather'", CardView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    CityWeatherAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.textViewCityName = null;
    target.textViewWeatherDescription = null;
    target.textViewCurrentTemp = null;
    target.textViewMaxTemp = null;
    target.textViewMinTemp = null;
    target.imageViewWeatherIcon = null;
    target.cardViewWeather = null;
  }
}
