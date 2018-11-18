package com.hn.shop.bean;

/**
 * Article 数据传输类
 * @author xlei @qq 251425887 @tel 13352818008
 * @Email dlei0009@163.com
 * @date 2018-11-18 21:17:31
 * @version 1.0
 */
public class Article implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	private int id;
	private String title;
	private String supplier;
	private double price;
	private double discount;
	private String locality;
	private java.util.Date putawayDate;
	private int storage;
	private String image;
	private String description;
	private String typeCode;
	private java.util.Date createDate;
	private String disabled;

	/** setter and getter method */
	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return this.id;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public String getTitle(){
		return this.title;
	}
	public void setSupplier(String supplier){
		this.supplier = supplier;
	}
	public String getSupplier(){
		return this.supplier;
	}
	public void setPrice(double price){
		this.price = price;
	}
	public double getPrice(){
		return this.price;
	}
	public void setDiscount(double discount){
		this.discount = discount;
	}
	public double getDiscount(){
		return this.discount;
	}
	public void setLocality(String locality){
		this.locality = locality;
	}
	public String getLocality(){
		return this.locality;
	}
	public void setPutawayDate(java.util.Date putawayDate){
		this.putawayDate = putawayDate;
	}
	public java.util.Date getPutawayDate(){
		return this.putawayDate;
	}
	public void setStorage(int storage){
		this.storage = storage;
	}
	public int getStorage(){
		return this.storage;
	}
	public void setImage(String image){
		this.image = image;
	}
	public String getImage(){
		return this.image;
	}
	public void setDescription(String description){
		this.description = description;
	}
	public String getDescription(){
		return this.description;
	}
	public void setTypeCode(String typeCode){
		this.typeCode = typeCode;
	}
	public String getTypeCode(){
		return this.typeCode;
	}
	public void setCreateDate(java.util.Date createDate){
		this.createDate = createDate;
	}
	public java.util.Date getCreateDate(){
		return this.createDate;
	}
	public void setDisabled(String disabled){
		this.disabled = disabled;
	}
	public String getDisabled(){
		return this.disabled;
	}

}