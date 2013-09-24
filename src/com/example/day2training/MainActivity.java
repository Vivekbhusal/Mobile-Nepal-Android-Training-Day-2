package com.example.day2training;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	Button login, register;
	EditText username, password;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
		login = (Button) findViewById(R.id.signin);
		register =(Button) findViewById(R.id.register);
		username = (EditText) findViewById(R.id.username);
		password = (EditText) findViewById(R.id.password);
		
		register.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(getApplicationContext(), "Function under construction", Toast.LENGTH_LONG).show();
			}
		});
		
		login.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String usr = username.getText().toString();
				String pass = password.getText().toString();
				if(usr.equalsIgnoreCase("admin") && pass.equalsIgnoreCase("admin")){
//					Toast.makeText(getApplicationContext(), "you can login", Toast.LENGTH_LONG).show();
					
					Intent i = new Intent(MainActivity.this, afterlogin.class);
					i.putExtra("username", usr);
					startActivity(i);
					
				}else{
					Toast.makeText(getApplicationContext(), "Username/Password Invalid", Toast.LENGTH_LONG).show();
				}
			}
		});
		
		
	}

}
