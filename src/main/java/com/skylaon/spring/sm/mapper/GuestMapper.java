package com.skylaon.spring.sm.mapper;

import java.util.List;

import com.skylaon.spring.sm.vo.GuestVO;

public interface GuestMapper {
	//  리스트
	public List<GuestVO> getList(int limitIndex);
	
	// read
	public GuestVO read(long bno);
	
	// del
	public void del(long bno);
	
	// write
	public void write(GuestVO gvo);
	
	// modify
	public void modify(GuestVO gvo);
}
