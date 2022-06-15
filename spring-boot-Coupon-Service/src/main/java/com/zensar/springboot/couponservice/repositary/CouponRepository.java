package com.zensar.springboot.couponservice.repositary;

import java.util.List;


import com.zensar.springboot.entity.Coupon;

public interface CouponRepository {
	public Coupon getCoupon(int couponId);

	public List<Coupon> getAllCoupon();

	public void insertCoupon(Coupon coupon);

	public void updateCoupon(int couponId, Coupon coupon);

	public void deleteCoupon(int CouponId);

	public List<Coupon> findAll();

	public void save(Coupon coupon);

}
