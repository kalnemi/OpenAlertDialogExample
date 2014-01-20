package com.example.openalertdialogexample;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity 
{
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button quit = (Button) findViewById( R.id.cmdQuit );
		
		quit.setOnClickListener( new OnClickListener()
		{
			@Override
			public void onClick ( View view )
			{
				FragmentManager fm = getFragmentManager(); 
//				FragmentTransaction ft = fm.beginTransaction();
				MyAlertDialogWindow dialog = new MyAlertDialogWindow();
				dialog.show(fm, "Alert_Dialog" );
			}
		});
	}
}