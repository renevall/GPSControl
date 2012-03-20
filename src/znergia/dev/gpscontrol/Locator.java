package znergia.dev.gpscontrol;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;

public class Locator {
	private Context context;
	private Activity activity;
	
	private LocationManager locationManager;
	
	// Define a listener that responds to location updates
	LocationListener locationListener = new LocationListener() {
	    public void onLocationChanged(Location location) {
	      // Called when a new location is found by the network location provider.
	      makeUseOfNewLocation(location);
	    }

	    public void onStatusChanged(String provider, int status, Bundle extras) {}

	    public void onProviderEnabled(String provider) {}

	    public void onProviderDisabled(String provider) {}
	  };
	
	//Contructor
	public void Locator(Activity activity){
		this.activity = activity;
		
		//Setting reference to the system Location Manager
		locationManager = (LocationManager)activity.getSystemService(Context.LOCATION_SERVICE);
	}
	
	//Request update for a (new)location
	public void requestUpdate(){
		// Register the listener with the Location Manager to receive location updates
		locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 0, 0, locationListener);
	}
	
	//if new location found, what do we do
	public void makeUseOfNewLocation(Location location){
		
	}
	
}
