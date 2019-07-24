package com.canteen.dto;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "items")

public class Item {
    @Column
	private String itemName;
	
    @Id
	@Column
	@GeneratedValue
	private String itemId;
	
    @Column
	private String courseId;
	
    @Column
	private String itemType;
	
    @Column
	private Double itemPrice;

    
    
    
    
	@Override
	public String toString() {
		return " " + itemName + " " + itemId + " " + courseId + " " + itemType
				+ " " + itemPrice + " ";
	}

	
	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public Double getItemPrice() {
		return itemPrice;
	}

	public Item(String itemName, String itemId, String courseId, String itemType, Double itemPrice) {
		super();
		this.itemName = itemName;
		this.itemId = itemId;
		this.courseId = courseId;
		this.itemType = itemType;
		this.itemPrice = itemPrice;
	}


	public Item() {
		super();
	}


	public Item(String itemId) {
		super();
		this.itemId = itemId;
	}


	public void setItemPrice(Double itemPrice) {
		this.itemPrice = itemPrice;
	}
	
}
