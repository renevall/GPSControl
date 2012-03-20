package znergia.dev.gpscontrol;

import android.app.Activity;
import android.os.Bundle;

public class GPSControlActivity extends Activity {
	
	public Locator ul;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		
		ul.requestUpdate();
	}
    

}