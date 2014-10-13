package com.example.androidtictactoe;


import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {

	private boolean win = true;
	private int counter = 0;
	private Button button1;
	private Button button2;
	private Button button3;
	private Button button4;
	private Button button5;
	private Button button6;
	private Button button7;
	private Button button8;
	private Button button9;
	private TextView infoText;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		button1 = new Button(getApplicationContext());
		button2 = new Button(getApplicationContext());
		button3 = new Button(getApplicationContext());
		button4 = new Button(getApplicationContext());
		button5 = new Button(getApplicationContext());
		button6 = new Button(getApplicationContext());
		button7 = new Button(getApplicationContext());
		button8 = new Button(getApplicationContext());
		button9 = new Button(getApplicationContext());
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to theprivate Button button1 = new Button(getApplicationContext()); action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void buttonClicked(View v){
		
        Button button = (Button)v;
        
        String symbol;
        
        if(counter % 2 == 0){
        	symbol = "X";
        }
        else{
        	symbol = "O";
        }       
        
        
        	if((button.getId()+"").equals("2131230722") && button.getText().equals("")){
        		button1 = (Button)v;
        		button1.setText(symbol);
        		counter++;
        	}
        	else if((button.getId()+"").equals("2131230723") && button.getText().equals("")){
        		button2 = (Button)v;
        		button2.setText(symbol);
        		counter++;
        	}
        	else if((button.getId()+"").equals("2131230724") && button.getText().equals("")){
        		button3 = (Button)v;
        		button3.setText(symbol);
        		counter++;
        	}
        	else if((button.getId()+"").equals("2131230725") && button.getText().equals("")){
        		button4 = (Button)v;
        		button4.setText(symbol);
        		counter++;
        	}
        	else if((button.getId()+"").equals("2131230726") && button.getText().equals("")){
        		button5 = (Button)v;
        		button5.setText(symbol);
        		counter++;
        	}
        	else if((button.getId()+"").equals("2131230727") && button.getText().equals("")){
        		button6 = (Button)v;
        		button6.setText(symbol);
        		counter++;
        	}
        	else if((button.getId()+"").equals("2131230728") && button.getText().equals("")){
        		button7 = (Button)v;
        		button7.setText(symbol);
        		counter++;
        	}
        	else if((button.getId()+"").equals("2131230729") && button.getText().equals("")){
        		button8 = (Button)v;
        		button8.setText(symbol);
        		counter++;
        	}
        	else if((button.getId()+"").equals("2131230730") && button.getText().equals("")){
        		button9 = (Button)v;
        		button9.setText(symbol);
        		counter++;
        	}
        	
        	if(counter >= 5){
        		checkWinner();
        	}
        
        
       // }
//        EditText user = (EditText)findViewById(R.id.username);
//        EditText pass = (EditText)findViewById(R.id.password);
//        error = (TextView)findViewById(R.id.error);
	}
	
	private void checkWinner(){	
		
		infoText = (TextView)findViewById(R.id.text);
		
		 if((button1.getText().equals(button2.getText()) && button1.getText().equals(button3.getText()) && !button1.getText().equals("")) ||
			(button4.getText().equals(button5.getText()) && button4.getText().equals(button6.getText()) && !button4.getText().equals("")) ||
			(button7.getText().equals(button8.getText()) && button7.getText().equals(button9.getText()) && !button7.getText().equals("")) ||
			(button1.getText().equals(button4.getText()) && button1.getText().equals(button7.getText()) && !button1.getText().equals("")) ||
			(button2.getText().equals(button5.getText()) && button2.getText().equals(button8.getText()) && !button2.getText().equals("")) ||
			(button3.getText().equals(button6.getText()) && button3.getText().equals(button9.getText()) && !button3.getText().equals("")) ||
			(button1.getText().equals(button5.getText()) && button1.getText().equals(button9.getText()) && !button1.getText().equals("")) ||
			(button7.getText().equals(button5.getText()) && button7.getText().equals(button3.getText()) && !button7.getText().equals(""))) {
			
			if(counter % 2 == 1){
				infoText.setText("O - wins!");
				//infoText.setForeground(Color.RED);
				infoText.setTextColor(Color.RED);
				
			}
			else{
				infoText.setText("X - wins!");
				infoText.setTextColor(Color.BLUE);
				infoText.setTextColor(Color.BLUE);
			}
			
			win = false;
			
		}
		 
		 if(win && counter == 9){
			 infoText.setText("Tied!");
			 
		 }
		 
		 
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
