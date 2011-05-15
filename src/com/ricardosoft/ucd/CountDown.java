package com.ricardosoft.ucd;

import java.util.Date;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class CountDown extends Activity {
	
	public static final int INSERT_ID = Menu.FIRST;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        int _timeDiff = getDifference();
        String text = Integer.toString(_timeDiff);
        TextView dayDisplay = (TextView)findViewById(R.id.textView1);
        dayDisplay.setText(text);
    }
    private int getDifference() {
    	Date _curDate = new Date();
    	Date _eoyDate = new Date();
    	_eoyDate.setDate(3);
    	_eoyDate.setMonth(5);
    	long _msDiff = _eoyDate.getTime() - _curDate.getTime();
    	int _secDiff = (int) (_msDiff / 1000);
    	int _dayDiff = _secDiff / (3600*24);
    	return _dayDiff;
    }
    public boolean onCreateOptionsMenu(Menu menu) {
    	boolean _result = super.onCreateOptionsMenu(menu);
    	menu.add(0, INSERT_ID, 1, R.string.prefs);
    	return _result;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	switch (item.getItemId()) {
    	case INSERT_ID:
    		/*
    		Toast _notImplemented = Toast.makeText(this, "Not Available", Toast.LENGTH_LONG);
    		_notImplemented.show();
    		*/
    		Intent _switchView = new Intent(getApplicationContext(), PrefOpts.class);
    		startActivity(_switchView);
    		return true;
    	}
    	return super.onOptionsItemSelected(item);
    }
}