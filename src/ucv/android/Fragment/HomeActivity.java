package ucv.android.Fragment;

import android.os.Bundle;
import ucv.android.Fragment.Personajes;
import ucv.android.Fragment.fragment_detalle;
import ucv.android.Fragment.fragment_lista;



import android.support.v4.app.FragmentActivity;
import android.view.Menu;

public class HomeActivity extends FragmentActivity implements IPersonajes {
 private fragment_lista fragmentlista;
 private fragment_detalle fragmentdetalle;
 
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);

       fragmentdetalle= (fragment_detalle)getSupportFragmentManager().findFragmentById(R.id.fragment_detalle);


       
       
       
       
		
		
		
		
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home, menu);
		return true;
	}

	@Override
	public void selectedContact(Personajes entity) {
		// TODO Auto-generated method stub
		fragmentdetalle.showView(entity); 
	}

}
