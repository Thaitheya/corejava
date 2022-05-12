package com.chainsys.classandmethod;

public class Phone {
    public final long phoneNo;
    private int frontCamera;
    private int rearCamera;
    private float cost;
    private String model;
    private String manufacturer;
    private int memory;
    private java.util.Date dateOfPurchase;
    private String planDetails;
    
    public Phone (long no) {
    	phoneNo = no;
    }
    public Phone() {
    	this.phoneNo = 9372937171L;
    	
    }
    public Phone(long no, float pcost, String pmodel) {
    	this.phoneNo = no;
    	this.setCost(pcost);
    	this.setModel(pmodel);
    }
    public void sendMSG(long toNo, String outmsg) {
    	System.out.println("Phone.sendMSG");
    }
    public void receieveMSG( String incomingmsg) {
    	System.out.println("Phone.receiveMSG" + incomingmsg);
    }
    public void sendMSG(long no) {
    	System.out.println("Phone.makeCall to" + no);
    }
 
//    Getter and setter
	public int getFrontCamera() {
		return frontCamera;
	}
	public void setFrontCamera(int frontCamera) {
		this.frontCamera = frontCamera;
	}
	public int getRearCamera() {
		return rearCamera;
	}
	public void setRearCamera(int rearCamera) {
		this.rearCamera = rearCamera;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
//		Validation
		this.cost = cost;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	public java.util.Date getDateOfPurchase() {
		return dateOfPurchase;
	}
	public void setDateOfPurchase(java.util.Date dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}
	public String getPlanDetails() {
		return planDetails;
	}
	public void setPlanDetails(String planDetails) {
		this.planDetails = planDetails;
	}
}
