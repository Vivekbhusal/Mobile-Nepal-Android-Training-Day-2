package com.example.day2training;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class afterlogin extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.afterlogin);
		
		Button usernamehere = (Button) findViewById(R.id.userhere);
		
		Intent i = getIntent();
		String recceived_value = i.getStringExtra("username");
//		Toast.makeText(getApplicationContext(), recceived_value, Toast.LENGTH_LONG).show();
		usernamehere.setText("Welcome "+recceived_value);
		
	}

	
}
