package ucv.android.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class fragment_detalle extends Fragment{
private TextView txtnombre, txtphone, txtmail, txtgroups;
private ImageView imgcontact;

public void onCreate(Bundle savedInstanceState){
	super.onCreate(savedInstanceState);
	
	
}

public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState ){
	View rooview= inflater.inflate(R.layout.fragment_detalle, container, false);
	return rooview;
}

public void onActivityCreated(Bundle saveInstanceState){
	super.onActivityCreated(saveInstanceState);
	txtnombre= (TextView)getView().findViewById(R.id.txtname);
	txtphone= (TextView)getView().findViewById(R.id.txtphone);
	txtmail= (TextView)getView().findViewById(R.id.txtemail);
	txtgroups= (TextView)getView().findViewById(R.id.txtgroups);
	imgcontact= (ImageView)getView().findViewById(R.id.imgcontact);
	
	
	
}

public void showView(Personajes entity){
	txtnombre.setText(entity.getName());
	txtphone.setText(entity.getPhone());
	txtmail.setText(entity.getEmail());
	txtgroups.setText(entity.getGroups());
	imgcontact.setImageResource(entity.getImageID());
}
}
