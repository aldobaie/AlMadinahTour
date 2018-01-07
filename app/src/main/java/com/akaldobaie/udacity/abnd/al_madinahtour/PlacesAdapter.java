package com.akaldobaie.udacity.abnd.al_madinahtour;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

/**
 * Created by Abdullah Aldobaie (akdPro) on 1/7/18 at 3:59 AM.
 *
 */
public class PlacesAdapter extends ArrayAdapter<Place> {
	
	private int colorSourceId;
	
	PlacesAdapter(@NonNull Context context, @NonNull List<Place> objects, int colorSourceId) {
		super(context, 0, objects);
		
		this.colorSourceId = colorSourceId;
	}
	
	/**
	 * @param position
	 * 	 : The position of the item in the List
	 * @param convertView
	 * 	 : the recycled item view of the ListView
	 * @param parent required
	 *
	 * @return fragment's view
	 */
	@NonNull
	@Override
	public View getView(int position, View convertView, @NonNull ViewGroup parent) {
		
		// Check if the existing view is being reused, otherwise inflate the view
		View listItemView = convertView;
		
		if (listItemView == null) {
			listItemView = LayoutInflater.from(getContext()).inflate(
				 R.layout.list_item, parent, false);
		}
		
		final Place place = getItem(position);
		
		TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_text_view);
		titleTextView.setText(place.getPlaceTitle());
		
		TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description_text_view);
		descriptionTextView.setText(place.getPlaceDescription());
		
		TextView addressTextView = (TextView) listItemView.findViewById(R.id.address_text_view);
		addressTextView.setText(place.getPlaceAddress());
		
		ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_view);
		
		if (place.hasImage()) {
			imageView.setImageResource(place.getImageResourceId());
			imageView.setVisibility(View.VISIBLE);
		} else {
			imageView.setVisibility(View.GONE);
		}
		
		View textContainer = listItemView.findViewById(R.id.list_item_container_layout);
		int color = ContextCompat.getColor(getContext(), colorSourceId);
		textContainer.setBackgroundColor(color);
		
		return listItemView;
	}
}
