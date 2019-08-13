package com.pinakjakhr.entity;

import static com.pinakjakhr.constants.APIConstants.COUNTRY_ID;
import static com.pinakjakhr.constants.APIConstants.TABLE_STATE;
import static com.pinakjakhr.constants.APIConstants.UUID_GENERATOR;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonBackReference;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;;

@Entity
@Table(name = TABLE_STATE)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class State implements Serializable {

	@Id
	@GeneratedValue(generator = UUID_GENERATOR)
	@ApiModelProperty(hidden = true)
	private UUID stateId;

	@NotBlank
	private String code;

	@NotBlank
	private String name;

	@ApiModelProperty(hidden = true)
	@JsonBackReference
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = COUNTRY_ID, nullable = false)
	private Country country;
}
