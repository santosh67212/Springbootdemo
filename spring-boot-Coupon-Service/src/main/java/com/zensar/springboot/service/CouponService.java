package com.zensar.springboot.service;

import java.util.List;

import com.zensar.springboot.entity.Coupon;

public interface CouponService {
	public Coupon getCoupon(int couponId);

	List<Coupon> getAllCoupons();

	public void inserCoupon(Coupon coupon);

	public void updateCoupon(int CouponId, Coupon coupon);

	public void deleteCoupon(int couponId);

}
