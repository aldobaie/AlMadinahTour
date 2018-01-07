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
public class SightseeingFragment extends Fragment {
	
	public SightseeingFragment() {
		// Required empty public constructor
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
	                         Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.places_list, container, false);
		
		final ArrayList<Place> places = new ArrayList<>();
		places.add(new Place(getString(R.string.sightseeing_1_title), getString(R.string.sightseeing_1_description), getString(R.string.sightseeing_1_address)));
		places.add(new Place(getString(R.string.sightseeing_2_title), getString(R.string.sightseeing_2_description), getString(R.string.sightseeing_2_address)));
		places.add(new Place(getString(R.string.sightseeing_3_title), getString(R.string.sightseeing_3_description), getString(R.string.sightseeing_3_address)));
		places.add(new Place(getString(R.string.sightseeing_4_title), getString(R.string.sightseeing_4_description), getString(R.string.sightseeing_4_address)));
		places.add(new Place(getString(R.string.sightseeing_5_title), getString(R.string.sightseeing_5_description), getString(R.string.sightseeing_5_address)));
		places.add(new Place(getString(R.string.sightseeing_6_title), getString(R.string.sightseeing_6_description), getString(R.string.sightseeing_6_address)));
		places.add(new Place(getString(R.string.sightseeing_7_title), getString(R.string.sightseeing_7_description), getString(R.string.sightseeing_7_address)));
		
		PlacesAdapter itemsAdapter = new PlacesAdapter(getActivity(), places, R.color.sightseeingCategory);
		
		ListView listView = rootView.findViewById(R.id.list);
		listView.setAdapter(itemsAdapter);
		listView.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
		
		return rootView;
	}
}