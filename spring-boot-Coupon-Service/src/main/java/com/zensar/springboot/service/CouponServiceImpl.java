package com.zensar.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.springboot.couponservice.repositary.CouponRepository;
import com.zensar.springboot.entity.Coupon;

@Service
public class CouponServiceImpl implements CouponService {
	@Autowired
	private CouponRepository couponRepository;

	public CouponServiceImpl() {

	}

	@Override
	public Coupon getCoupon(int couponId) {
		
		return couponRepository.getCoupon(couponId);
	}

	@Override
	public List<Coupon> getAllCoupons() {
		return couponRepository.findAll();

	}

	@Override
	public void inserCoupon(Coupon coupon) {
		couponRepository.save(coupon);

	}

	@Override
	public void updateCoupon(int CouponId, Coupon coupon) {
		couponRepository.save(coupon);
	}

	@Override
	public void deleteCoupon(int couponId) {
		couponRepository.deleteCoupon(couponId);
	}
}
