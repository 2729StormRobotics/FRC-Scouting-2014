package com.example.scouter.help;

import com.example.scouter.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MatchHelpActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_match_help);
		this.setTitle("Help");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.help, menu);
		return true;
	}

}
