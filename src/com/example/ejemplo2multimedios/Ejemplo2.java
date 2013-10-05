package com.example.ejemplo2multimedios;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Ejemplo2 extends Activity {
	
	private int i = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ejemplo2);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ejemplo2, menu);
		return true;
	}

}
