package com.example.dialogopenexample;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
	private Button button1,button2,button3;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		button1 = (Button) findViewById(R.id.button1);
		button2 = (Button) findViewById(R.id.button2);
		button3 = (Button) findViewById(R.id.button3);
		
		/*
		 * Implementation for dynamic OnClicklisteners
		 */
//		button1.setOnClickListener(new OnClickListener(){
//			@Override
//			public void onClick(View v) {
//				openDialog(v);
//			}
//		});
//		button2.setOnClickListener(new OnClickListener(){
//			@Override
//			public void onClick(View v) {
//				openDialog(v);
//			}
//		});
//		button3.setOnClickListener(new OnClickListener(){
//			@Override
//			public void onClick(View v) {
//				openDialog(v);
//			}
//		});
		
	}
	public void openDialog(View v){
		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this)
		.setTitle("Settings Menu")
		.setMessage("Delete Edit or Link?")
		.setCancelable(false)
		.setNeutralButton("Edit", new DialogInterface.OnClickListener() {
			 public void onClick(DialogInterface dialog,int id) {
				 Toast.makeText(MainActivity.this, "Clicked Edit",Toast.LENGTH_LONG).show();
			 }
		})
		.setPositiveButton("Link",new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog,int id) {
				Toast.makeText(MainActivity.this, "Clicked Link",Toast.LENGTH_LONG).show();
			}
		})    
	    .setNegativeButton("Delete",new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog,int id) {
            	
                dialog.cancel();
            }
	     });

        AlertDialog alertDialog = alertDialogBuilder.create();

        alertDialog.show();
	}
}
	