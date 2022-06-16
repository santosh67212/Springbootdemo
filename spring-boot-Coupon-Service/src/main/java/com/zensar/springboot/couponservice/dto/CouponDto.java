package com.zensar.springboot.couponservice.dto;

public class CouponDto {
	private int couponIddto;
	private String couponCodedto;
	private String couponexpiryDatedto;
	public CouponDto() {
		super();
	}
	public CouponDto(int couponIddto, String couponCodedto, String couponexpiryDatedto) {
		super();
		this.couponIddto = couponIddto;
		this.couponCodedto = couponCodedto;
		this.couponexpiryDatedto = couponexpiryDatedto;
	}
	public int getCouponIddto() {
		return couponIddto;
	}
	public void setCouponIddto(int couponIddto) {
		this.couponIddto = couponIddto;
	}
	public String getCouponCodedto() {
		return couponCodedto;
	}
	public void setCouponCodedto(String couponCodedto) {
		this.couponCodedto = couponCodedto;
	}
	public String getCouponexpiryDatedto() {
		return couponexpiryDatedto;
	}
	public void setCouponexpiryDatedto(String couponexpiryDatedto) {
		this.couponexpiryDatedto = couponexpiryDatedto;
	}
	@Override
	public String toString() {
		return "CouponDto [couponIddto=" + couponIddto + ", couponCodedto=" + couponCodedto + ", couponexpiryDatedto="
				+ couponexpiryDatedto + "]";
	}
}