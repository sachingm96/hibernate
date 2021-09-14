package com.sachin.mobile.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "mobile_table")
@NamedQuery(name="fetchAll",query="from MobileEntity")
@NamedQuery(name="fetchColorByBrand",query="select price from MobileEntity where name=:Brand")
@NamedQuery(name="updatePriceById",query="update MobileEntity mobile set mobile.price=:Price where mobile.id=:Id")
@NamedQuery(name="readTotalPrice",query="select sum(price) from MobileEntity")
@NamedQuery(name="sumOfPrice",query=" select sum(price) from MobileEntity")
@NamedQuery(name="maxOfSizeInInches",query="select max(sizeInInches) from MobileEntity")
@NamedQuery(name="minOfSizeInInches",query="select min(sizeInInches) from MobileEntity")
public class MobileEntity implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	private int id;

	@Column(name = "brand")
	private String brand;

	@Column(name = "price")
	private int price;

	@Column(name = "weight")
	private double weight;

	@Column(name = "color")
	private String color;

	@Column(name = "andriod")
	private boolean andriod;

	@Column(name = "sizeInInches")
	private double sizeInInches;

	public MobileEntity(String brand, int price, double weight, String color, boolean andriod, double sizeInInches) {
		super();
		this.brand = brand;
		this.price = price;
		this.weight = weight;
		this.color = color;
		this.andriod = andriod;
		this.sizeInInches = sizeInInches;
	}
}
