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
public class MasjidsFragment extends Fragment {
	
	public MasjidsFragment() {
		// Required empty public constructor
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
	                         Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.places_list, container, false);
		
		final ArrayList<Place> places = new ArrayList<>();
		places.add(new Place(getString(R.string.masjid_1_title), getString(R.string.masjid_1_description), getString(R.string.masjid_1_address), R.drawable.masjid_1));
		places.add(new Place(getString(R.string.masjid_2_title), getString(R.string.masjid_2_description), getString(R.string.masjid_2_address), R.drawable.masjid_2));
		places.add(new Place(getString(R.string.masjid_3_title), getString(R.string.masjid_3_description), getString(R.string.masjid_3_address), R.drawable.masjid_3));
		places.add(new Place(getString(R.string.masjid_4_title), getString(R.string.masjid_4_description), getString(R.string.masjid_4_address), R.drawable.masjid_4));
		places.add(new Place(getString(R.string.masjid_5_title), getString(R.string.masjid_5_description), getString(R.string.masjid_5_address), R.drawable.masjid_5));
		places.add(new Place(getString(R.string.masjid_6_title), getString(R.string.masjid_6_description), getString(R.string.masjid_6_address), R.drawable.masjid_6));
		places.add(new Place(getString(R.string.masjid_7_title), getString(R.string.masjid_7_description), getString(R.string.masjid_7_address), R.drawable.masjid_7));
		
		PlacesAdapter itemsAdapter = new PlacesAdapter(getActivity(), places, R.color.masjidsCategory);
		
		ListView listView = rootView.findViewById(R.id.list);
		listView.setAdapter(itemsAdapter);
		listView.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
		
		return rootView;
	}
}