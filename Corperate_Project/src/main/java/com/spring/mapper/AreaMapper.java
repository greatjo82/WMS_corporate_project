package com.spring.mapper;

import java.util.List;

import com.spring.domain.AreaVO;

public interface AreaMapper {
	public List<AreaVO> selectAll();			//구역리스트불러오기
	public int insert(int no); 					//구역추가
	public int update(int no); 					//구역수정
	public int delete(int no); 					//구역삭제
	public List<AreaVO> getListByWareNo(int no);//구역일련번호에따른 창고일련번호가져오기
}