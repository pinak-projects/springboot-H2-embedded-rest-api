package com.pinakjakhr.controller;

import static com.pinakjakhr.constants.APIConstants.API_FETCH_STATES_INFO;
import static com.pinakjakhr.constants.APIConstants.API_TAG_STATE;
import static com.pinakjakhr.constants.APIConstants.COUNTRY_ID_PARAM;
import static com.pinakjakhr.constants.APIConstants.REST_STATE_PATH;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pinakjakhr.entity.State;
import com.pinakjakhr.service.StateService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = REST_STATE_PATH)
@Api(tags = API_TAG_STATE)
public class StateController {

	@Autowired
	private StateService stateService;

	@ApiOperation(value = API_FETCH_STATES_INFO)
	@GetMapping(value = COUNTRY_ID_PARAM, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<State> fetchAllStates(@PathVariable UUID countryId) {

		return stateService.getStatesByCountryId(countryId);
	}
}
