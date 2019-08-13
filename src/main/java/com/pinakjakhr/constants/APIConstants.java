package com.pinakjakhr.constants;

public final class APIConstants {

	private APIConstants() {
		// prevents initialization
	}

	public static final String TABLE_COUNTRY = "country_details";
	public static final String TABLE_STATE = "state_details";
	public static final String COUNTRY_ID = "country_id";

	// REST End Points
	public static final String REST_COUNTRY_PATH = "/countries";
	public static final String COUNTRY_ID_PARAM = "/{countryId}";
	public static final String REST_STATE_PATH = "/states";

	// API Responses
	public static final String COUNTRY_DETAILS_DELETE_SUCCESS = "Country details deleted.";
	public static final String COUNTRY_DETAILS_NOT_FOUND = "Country details not found";
	public static final String STATES_NOT_FOUND = "States not found";

	// API Tags
	public static final String API_TAG_COUNTRY = "Country Controller";
	public static final String API_TAG_STATE = "State Controller";

	// API Info
	public static final String API_SAVE_COUNTRY_INFO = "Save details of a country";
	public static final String API_UPDATE_COUNTRY_INFO = "Update details of a country";
	public static final String API_FETCH_COUNTRY_INFO = "Fetch details of a country";
	public static final String API_DELETE_COUNTRY_INFO = "Delete details of a country";
	public static final String API_FETCH_COUNTRIES_INFO = "Fetch details of all countries";
	public static final String API_FETCH_STATES_INFO = "Fetch states of a country";

	public static final String UUID_GENERATOR = "uuid-gen";

}
