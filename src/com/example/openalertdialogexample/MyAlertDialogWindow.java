package com.example.openalertdialogexample;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.widget.Toast;

public class MyAlertDialogWindow extends DialogFragment
{
	@Override
	public Dialog onCreateDialog ( Bundle saveInstanceState )
	{
		OnClickListener positiveClick = new OnClickListener()
		{
			@Override
			public void onClick ( DialogInterface dialog, int which )
			{
				Toast.makeText( getActivity().getBaseContext(), "Application Quiting", Toast.LENGTH_SHORT ).show();
				getActivity().finish();
			}
		};
		
		OnClickListener negativeClick = new OnClickListener()
		{
			@Override
			public void onClick ( DialogInterface dialog, int which )
			{
				Toast.makeText(getActivity().getBaseContext(), "Returning to main Activity", Toast.LENGTH_SHORT ).show();
			}
		};
		
		AlertDialog.Builder b = new AlertDialog.Builder ( getActivity() );
		b.setMessage( "Do you want to quit ?" );
		b.setNegativeButton( "NO", negativeClick );
		b.setPositiveButton( "YES", positiveClick );
		b.setTitle( "Confirmation" );
		
		Dialog d = b.create(); 
		
		return d;
	}
}