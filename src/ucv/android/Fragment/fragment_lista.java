package ucv.android.Fragment;

import java.util.ArrayList;
import java.util.List;


import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;



@SuppressLint("NewApi")
public class fragment_lista extends Fragment{

	private ListView lstcontactos;
	private List<Personajes> data;
	
	@SuppressLint("NewApi")
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
	}
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){
		View rooview= inflater.inflate(R.layout.fragment_lista, container, false);
		return rooview;
		
	}
	
	public void onActivityCreated(Bundle savedInstanceState){
		super.onActivityCreated(savedInstanceState);
		lstcontactos= (ListView)getView().findViewById(R.id.lstcontacts);
		
		data= new ArrayList<Personajes>();
		data.add(new Personajes(1, "juan quiñones", "456721048", "juan89@gmail.com", "Administrators", R.drawable.albert_einston));
		data.add(new Personajes(1, "christian villalobos", "425718908", "christian14@gmail.com", "Developers", R.drawable.charles_darwin));
		data.add(new Personajes(1, "sandy gonzales", "143006729", "sandy45@gmail.com", "Administrators", R.drawable.martin_lutero));
		data.add(new Personajes(1, "kevin fernandez", "112766400", "kevin47@gmail.com", "Developers", R.drawable.abraham_lincoln));
		data.add(new Personajes(1, "kural puchades", "775602214", "kural28@gmail.com", "Administrators", R.drawable.karl_max));
		data.add(new Personajes(1, "martha perez", "456677108", "martha06@gmail.com", "Developers", R.drawable.thomas_jeferson));
		
		List<String> data2= new ArrayList<String>();
		
		for(Personajes item:data){
			data2.add(item.getName());
		}
		
	   ArrayAdapter<String> adapter= new ArrayAdapter<String>(getActivity(), android.R.layout.simple_expandable_list_item_1, data2);
	   
		lstcontactos.setAdapter(adapter);
	lstcontactos.setOnItemClickListener(new OnItemClickListener(){

		@Override
		public void onItemClick(AdapterView<?> arg0, View arg1, int position,
				long arg2) {
		Log.v("CONSOLE", "ENTIDAD" + data.get(position).toString());
			
		}
		
	});
				
	}
	
	
}
