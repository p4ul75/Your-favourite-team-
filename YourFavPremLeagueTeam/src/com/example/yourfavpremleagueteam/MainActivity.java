package com.example.yourfavpremleagueteam;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void liverOnClick(View view){
		Toast.makeText(getApplicationContext(), 
                "Connecting to Liverpool Fc web page", Toast.LENGTH_SHORT).show();
    	Intent browserIntent = 
                 new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.liverpoolfc.com"));
	    startActivity(browserIntent); 
	}
	
	public void arsOnClick(View view){
		Toast.makeText(getApplicationContext(), 
                "Connecting to Arsenal Fc web page", Toast.LENGTH_SHORT).show();
    	Intent browserIntent = 
                 new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.arsenal.com/home"));
	    startActivity(browserIntent); 
	}
}
