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
public class RestaurantsFragment extends Fragment {
	
	public RestaurantsFragment() {
		// Required empty public constructor
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
	                         Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.places_list, container, false);
		
		final ArrayList<Place> places = new ArrayList<>();
		places.add(new Place(getString(R.string.restaurant_1_title), getString(R.string.restaurant_1_description), getString(R.string.restaurant_1_address), R.drawable.restaurant_1));
		places.add(new Place(getString(R.string.restaurant_2_title), getString(R.string.restaurant_2_description), getString(R.string.restaurant_2_address), R.drawable.restaurant_2));
		places.add(new Place(getString(R.string.restaurant_3_title), getString(R.string.restaurant_3_description), getString(R.string.restaurant_3_address), R.drawable.restaurant_3));
		places.add(new Place(getString(R.string.restaurant_4_title), getString(R.string.restaurant_4_description), getString(R.string.restaurant_4_address), R.drawable.restaurant_4));
		places.add(new Place(getString(R.string.restaurant_5_title), getString(R.string.restaurant_5_description), getString(R.string.restaurant_5_address), R.drawable.restaurant_5));
		places.add(new Place(getString(R.string.restaurant_6_title), getString(R.string.restaurant_6_description), getString(R.string.restaurant_6_address), R.drawable.restaurant_6));
		places.add(new Place(getString(R.string.restaurant_7_title), getString(R.string.restaurant_7_description), getString(R.string.restaurant_7_address), R.drawable.restaurant_7));
		
		PlacesAdapter itemsAdapter = new PlacesAdapter(getActivity(), places, R.color.restaurantsCategory);
		
		ListView listView = rootView.findViewById(R.id.list);
		listView.setAdapter(itemsAdapter);
		listView.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
		
		return rootView;
	}
}