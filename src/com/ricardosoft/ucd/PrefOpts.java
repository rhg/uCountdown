package com.ricardosoft.ucd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class PrefOpts extends Activity {
	
	public static final int INSERT_ID = Menu.FIRST;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.prefs);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		boolean _result = super.onCreateOptionsMenu(menu);
		menu.add(0, INSERT_ID, 0, R.string.back);
		return _result;
	}
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case INSERT_ID:
			Intent _goBack = new Intent(getApplicationContext(), CountDown.class);
			startActivity(_goBack);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
