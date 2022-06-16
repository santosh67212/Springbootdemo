package com.zensar.springboot.entity;



@Entity
public class Coupon {
	
	@Id
	private int couponId;
	private String couponCode;
	private String couponexpiryDate;

	public Coupon() {
		super();
	}

	public Coupon(int couponId, String couponCode, String couponexpiryDate) {
		super();
		this.couponId = couponId;
		this.couponCode = couponCode;
		this.couponexpiryDate = couponexpiryDate;
	}

	public int getCouponId() {
		return couponId;
	}

	public void setCouponId(int couponId) {
		this.couponId = couponId;
	}

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public String getCouponexpiryDate() {
		return couponexpiryDate;
	}

	public void setCouponexpiryDate(String couponexpiryDate) {
		this.couponexpiryDate = couponexpiryDate;
	}

}