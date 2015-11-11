package kriek.madlibs;

import android.content.Intent;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class Choosestory extends AppCompatActivity {

    public int checker = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choosestory);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_choosestory, menu);
        return true;
    }
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.simple:
                if (checked)
                    checker = 1;
                    break;
            case R.id.tarzan:
                if (checked)
                    checker = 2;
                    break;
            case R.id.university:
                if(checked)
                    checker = 3;
                    break;
            case R.id.clothes:
                if(checked)
                    checker = 4;
                    break;
            case R.id.dancer:
                if(checked)
                    checker = 5;
                    break;
        }
    }
    /* Method to enable rotation

     */
    @Override
    public void onSaveInstanceState(Bundle outState) {

        super.onSaveInstanceState(outState);

    }

    /* Method to enable rotation
     */
    @Override
    public void onRestoreInstanceState(Bundle inState) {

        super.onRestoreInstanceState(inState);
    }

    /* Send clicked story to next screen

     */
    public void onButtonClicked(View g){
        TextView text1 = (TextView) findViewById(R.id.choosestory);
        if(checker == 0){
            text1.setText(this.getString(R.string.errorstory));
        }
        else{
            Intent passinfo = new Intent(this, Inputstory.class);
            passinfo.putExtra("checker", checker);
            startActivity(passinfo);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
