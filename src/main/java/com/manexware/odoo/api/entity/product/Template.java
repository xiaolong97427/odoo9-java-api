package com.manexware.odoo.api.entity.product;

import com.manexware.odoo.api.entity.core.Company;

public class Template {
	
	public enum Type {consu, server}
	public enum CostMethod{standard, average}
	public enum State{draft, sellable, end, obsolete}
	public enum MeasureType{fixed, variable}
	
	private Integer id;
	private String name;
	private String description;
	private String descriptionPurchase;
	private String descriptionSale;
	private Type type;
	private Category category;
	private Double listPrice;
	private Double standardPrice;
	private Double volume;
	private Double weight;
	private Double weightNet;
	private CostMethod costMethod;
	private Double warranty;
	private Boolean saleOk;
	private State state;
	private UnitOfMeasure unitOfMeasure;
	private UnitOfMeasure unitOfMeasurePurchase;
	private Double unitOfSaleCoefficient;
	private MeasureType measureType;
	private Company company;
	
	public Template(){
		
	}

	public Template(
		Integer id,
		String name, 
		String description,
		String descriptionPurchase, 
		String descriptionSale, 
		Type type,
		Category category, 
		Double listPrice, 
		Double standardPrice,
		Double volume, 
		Double weight, 
		Double weightNet, 
		CostMethod costMethod,
		Double warranty, 
		Boolean saleOk, 
		State state,
		UnitOfMeasure unitOfMeasure,
		UnitOfMeasure unitOfMeasurePurchase,
		Double unitOfSaleCoefficient,
		MeasureType measureType, 
		Company company
	) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.descriptionPurchase = descriptionPurchase;
		this.descriptionSale = descriptionSale;
		this.type = type;
		this.category = category;
		this.listPrice = listPrice;
		this.standardPrice = standardPrice;
		this.volume = volume;
		this.weight = weight;
		this.weightNet = weightNet;
		this.costMethod = costMethod;
		this.warranty = warranty;
		this.saleOk = saleOk;
		this.state = state;
		this.unitOfMeasure = unitOfMeasure;
		this.unitOfMeasurePurchase = unitOfMeasurePurchase;
		this.unitOfSaleCoefficient = unitOfSaleCoefficient;
		this.measureType = measureType;
		this.company = company;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescriptionPurchase() {
		return descriptionPurchase;
	}

	public void setDescriptionPurchase(String descriptionPurchase) {
		this.descriptionPurchase = descriptionPurchase;
	}

	public String getDescriptionSale() {
		return descriptionSale;
	}

	public void setDescriptionSale(String descriptionSale) {
		this.descriptionSale = descriptionSale;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Double getListPrice() {
		return listPrice;
	}

	public void setListPrice(Double listPrice) {
		this.listPrice = listPrice;
	}

	public Double getStandardPrice() {
		return standardPrice;
	}

	public void setStandardPrice(Double standardPrice) {
		this.standardPrice = standardPrice;
	}

	public Double getVolume() {
		return volume;
	}

	public void setVolume(Double volume) {
		this.volume = volume;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Double getWeightNet() {
		return weightNet;
	}

	public void setWeightNet(Double weightNet) {
		this.weightNet = weightNet;
	}

	public CostMethod getCostMethod() {
		return costMethod;
	}

	public void setCostMethod(CostMethod costMethod) {
		this.costMethod = costMethod;
	}

	public Double getWarranty() {
		return warranty;
	}

	public void setWarranty(Double warranty) {
		this.warranty = warranty;
	}

	public Boolean getSaleOk() {
		return saleOk;
	}

	public void setSaleOk(Boolean saleOk) {
		this.saleOk = saleOk;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public UnitOfMeasure getUnitOfMeasure() {
		return unitOfMeasure;
	}

	public void setUnitOfMeasure(UnitOfMeasure unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
	}

	public UnitOfMeasure getUnitOfMeasurePurchase() {
		return unitOfMeasurePurchase;
	}

	public void setUnitOfMeasurePurchase(UnitOfMeasure unitOfMeasurePurchase) {
		this.unitOfMeasurePurchase = unitOfMeasurePurchase;
	}

	public Double getUnitOfSaleCoefficient() {
		return unitOfSaleCoefficient;
	}

	public void setUnitOfSaleCoefficient(Double unitOfSaleCoefficient) {
		this.unitOfSaleCoefficient = unitOfSaleCoefficient;
	}

	public MeasureType getMeasureType() {
		return measureType;
	}

	public void setMeasureType(MeasureType measureType) {
		this.measureType = measureType;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
}
