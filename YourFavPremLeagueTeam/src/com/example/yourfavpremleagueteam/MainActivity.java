package com.example.yourfavpremleagueteam;



import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
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
                "Liverpool FC", Toast.LENGTH_SHORT).show();
    	Intent intent = 
                 new Intent(this,LiverpoolActivity.class); 
	    startActivity(intent); 
	}
	
	public void arsOnClick(View view){
		Toast.makeText(getApplicationContext(), 
                "Arsenal FC", Toast.LENGTH_SHORT).show();
    	Intent intent = 
                 new Intent(this,ArsenalActivity.class); 
	    startActivity(intent); 
	}
	
	public void chelOnClick(View view){
		Toast.makeText(getApplicationContext(), 
                "Chelsea FC", Toast.LENGTH_SHORT).show();
    	Intent intent = 
                 new Intent(this,ChelseaActivity.class); 
	    startActivity(intent); 
	}
}
