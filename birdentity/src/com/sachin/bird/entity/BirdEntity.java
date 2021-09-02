package com.sachin.bird.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@SuppressWarnings("serial")
@Entity
@Table(name = "bird")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BirdEntity implements Serializable {

	@Id
	@Column(name = "b_id")
	private int id;
	@Column(name = "b_name")
	private String name;
	@Column(name = "b_color")
	private String color;
	@Column(name = "b_gender")
	private String gender;
	@Column(name = "b_lookingGood")
	private boolean lookingGood;
	@Column(name = "b_beak")
	private boolean beak;
	@Column(name = "b_maxYear")
	private int maxYear;
	@Column(name = "b_weight")
	private double weight;
	@Column(name = "b_noOfEyes")
	private int noOfEyes;
	@Column(name = "b_noOfLegs")
	private int noOfLegs;

}