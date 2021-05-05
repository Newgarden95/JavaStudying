package com.mega.project;
//상품 위치 테이블에 대한 컨트롤 해주는 컨트롤러

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.code.geocoder.Geocoder;
import com.google.code.geocoder.GeocoderRequestBuilder;
import com.google.code.geocoder.model.GeocodeResponse;
import com.google.code.geocoder.model.GeocoderRequest;
import com.google.code.geocoder.model.GeocoderResult;
import com.google.code.geocoder.model.GeocoderStatus;
import com.google.code.geocoder.model.LatLng;



@Controller
public class PlController {
	@Autowired
	ProductLocationDAO dao;
	
	@RequestMapping("pl_insert.mega")
	public void insert(ProductLocationVO bag) throws Exception {
		dao.insert(bag);
		System.out.println("데이터 반환 성공");
		System.out.println(bag.pid);
		System.out.println(bag.platitude);
		System.out.println(bag.plongtitude);
	}
	
}
