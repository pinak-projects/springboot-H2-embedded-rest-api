package com.pinakjakhr.entity;

import static com.pinakjakhr.constants.APIConstants.COUNTRY_ID;
import static com.pinakjakhr.constants.APIConstants.TABLE_COUNTRY;
import static com.pinakjakhr.constants.APIConstants.UUID_GENERATOR;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = TABLE_COUNTRY)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Country implements Serializable {

	@Id
	@GeneratedValue(generator = UUID_GENERATOR)
	@ApiModelProperty(hidden = true)
	@Column(name = COUNTRY_ID, nullable = false, updatable = false)
	private UUID countryId;

	@NotBlank
	private String countryName;

	@NotBlank
	private String countryCode;

	@NotEmpty
	@JsonManagedReference
	@OneToMany(mappedBy = "country", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
	private List<State> states;

}
