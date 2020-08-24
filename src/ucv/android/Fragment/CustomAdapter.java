package ucv.android.Fragment;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends ArrayAdapter<Personajes> {
private Context contexto;
private ImageView countryIco;
private TextView countryName;
private List<Personajes> countries= new ArrayList<Personajes>();


	public CustomAdapter(Context context, int textViewResourceId, List<Personajes> objets) {
		super(context, textViewResourceId, objets);
		
		this.contexto= context;
		this.countries= objets;
	}
	
	public int getCount(){
		return this.countries.size();
	}
	
	public Personajes getItem(int index){
		return this.countries.get(index);
				
		}
 
	public View getView(int position, View convertview, ViewGroup parent){
		View row= convertview;
		if(row == null){
			Log.v("CONSOLE", "STARTING XML ROW INFLATER");
			LayoutInflater inflater= (LayoutInflater)this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			row= inflater.inflate(R.layout.fragment_lista, parent, false);
			Log.v("CONSOLE", "succefully xml row inflater");
			
		}
		Personajes contact= getItem(position);
		countryIco= (ImageView) row.findViewById(R.id.imgcontact);
		countryName= (TextView) row.findViewById(R.id.txtname);
		countryName.setText(contact.getName());
		countryIco.setImageResource(contact.getImageID());
		
		return row;
	}
}
