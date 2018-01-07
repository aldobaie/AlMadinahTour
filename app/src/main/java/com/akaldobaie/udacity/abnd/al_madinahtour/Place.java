package com.akaldobaie.udacity.abnd.al_madinahtour;

/**
 * Created by Abdullah Aldobaie (akdPro) on 1/7/18 at 3:39 AM.
 *
 */
class Place {
	
	/**
	 * Constant value that represents no image was provided for this word
	 */
	private static final int NO_IMAGE_PROVIDED = -1;
	
	private String placeTitle = "";
	private String placeDescription = "";
	private String placeAddress = "";
	private int imageResourceId = -1;
	private boolean hasImage = false;
	
	Place(String placeTitle, String placeDescription, String placeAddress) {
		
		this.placeTitle = placeTitle;
		this.placeDescription = placeDescription;
		this.placeAddress = placeAddress;
		hasImage = false;
	}
	
	Place(String placeTitle, String placeDescription, String placeAddress, int img) {
		
		this.placeTitle = placeTitle;
		this.placeDescription = placeDescription;
		this.placeAddress = placeAddress;
		this.imageResourceId = img;
		hasImage = true;
	}
	
	String getPlaceTitle() {
		return placeTitle;
	}
	
	String getPlaceDescription() {
		return placeDescription;
	}
	
	String getPlaceAddress() {
		return placeAddress;
	}
	
	int getImageResourceId() {
		return imageResourceId;
	}
	
	boolean hasImage() {
		return hasImage && imageResourceId != NO_IMAGE_PROVIDED;
	}
}