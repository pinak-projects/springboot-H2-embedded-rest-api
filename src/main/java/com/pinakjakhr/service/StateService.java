package com.pinakjakhr.service;

import static com.pinakjakhr.constants.APIConstants.STATES_NOT_FOUND;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import com.pinakjakhr.entity.State;
import com.pinakjakhr.repository.StateRepository;;

@Service
public class StateService {

	@Autowired
	private StateRepository stateRepository;

	public List<State> getStatesByCountryId(UUID countryId) {
		return Optional.ofNullable(stateRepository.findStatesByCountryId(countryId))
				.orElseThrow(() -> new ResourceNotFoundException(STATES_NOT_FOUND));
	}
}
