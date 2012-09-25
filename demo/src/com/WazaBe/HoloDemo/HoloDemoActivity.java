package com.WazaBe.HoloDemo;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

import com.WazaBe.HoloEverywhere.ThemeManager;
import com.WazaBe.HoloEverywhere.app.Activity;

public class HoloDemoActivity extends Activity {
	@Override
	public void onContentChanged() {
		super.onContentChanged();
		Utils.onViewCreated(findViewById(R.id.main));
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		setForceThemeApply(true);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.content);
		FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
		ft.replace(android.R.id.content, MainFragment.getInstance());
		ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
		ft.commit();
	}

	public void setDarkTheme(View v) {
		ThemeManager.restartWithTheme(this, ThemeManager.DARK);
	}

	public void setLightTheme(View v) {
		ThemeManager.restartWithTheme(this, ThemeManager.LIGHT);
	}

	public void showAlertDialog(View v) {
		Utils.showAlertDialog(this);
	}

	public void showDatePicker(View v) {
		Utils.showDatePicker(this);
	}

	public void showNumberPicker(View v) {
		Utils.showNumberPicker(this);
	}

	public void showPreferences(View v) {
		Utils.showPreferences(this);
	}

	public void showProgressDialog(View v) {
		Utils.showProgressDialog(this);
	}

	public void showTimePicker(View v) {
		Utils.showTimePicker(this);
	}

	public void showToast(View v) {
		Utils.showToast(this);
	}

	public void showCalendar(View v) {
		Utils.showCalendar(this);
	}

	public void closeCalendar(View v) {
		Utils.closeCalendar(this);
	}
}