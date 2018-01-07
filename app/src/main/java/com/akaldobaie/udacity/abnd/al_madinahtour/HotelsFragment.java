package com.akaldobaie.udacity.abnd.al_madinahtour;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HotelsFragment extends Fragment {
	
	public HotelsFragment() {
		// Required empty public constructor
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
	                         Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.places_list, container, false);
		
		final ArrayList<Place> places = new ArrayList<>();
		places.add(new Place(getString(R.string.hotel_1_title), getString(R.string.hotel_1_description), getString(R.string.hotel_1_address), R.drawable.hotel_1));
		places.add(new Place(getString(R.string.hotel_2_title), getString(R.string.hotel_2_description), getString(R.string.hotel_2_address), R.drawable.hotel_2));
		places.add(new Place(getString(R.string.hotel_3_title), getString(R.string.hotel_3_description), getString(R.string.hotel_3_address), R.drawable.hotel_3));
		places.add(new Place(getString(R.string.hotel_4_title), getString(R.string.hotel_4_description), getString(R.string.hotel_4_address), R.drawable.hotel_4));
		places.add(new Place(getString(R.string.hotel_5_title), getString(R.string.hotel_5_description), getString(R.string.hotel_5_address), R.drawable.hotel_5));
		places.add(new Place(getString(R.string.hotel_6_title), getString(R.string.hotel_6_description), getString(R.string.hotel_6_address), R.drawable.hotel_6));
		places.add(new Place(getString(R.string.hotel_7_title), getString(R.string.hotel_7_description), getString(R.string.hotel_7_address), R.drawable.hotel_7));
		
		PlacesAdapter itemsAdapter = new PlacesAdapter(getActivity(), places, R.color.hotelsCategory);
		
		ListView listView = rootView.findViewById(R.id.list);
		listView.setAdapter(itemsAdapter);
		listView.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
		
		return rootView;
	}
}
