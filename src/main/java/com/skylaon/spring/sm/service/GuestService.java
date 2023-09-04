package com.skylaon.spring.sm.service;

import java.util.List;

import com.skylaon.spring.sm.vo.GuestVO;

public interface GuestService {
	public List<GuestVO> getList(int currentPage);	// 리스트
	public GuestVO read(long bno);	// read
	public void del(long bno); 		// delete
	public void write(GuestVO gvo);	// write
	public void modify(GuestVO gvo);// update
}
