package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import play.db.ebean.Model;
@Entity
public class Cameras extends Model {
	@Id
	public int id;
	
	public String brand;
	public String model;
	public String age;
	public boolean anyDamages;
	public boolean additional;
	public boolean pickUpDrop;
	public boolean anyAccessories;
	@OneToOne
	public ProductType product;
	@Column(length=500)
	public String description;

 }
