package edu.bit.ex.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.bit.ex.mapper.BoardMapper;
import edu.bit.ex.vo.BoardVO;
import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	private BoardMapper boardMapper;
	
	@Override
	public List<BoardVO> getList(){
		log.info("getList()..");
		return boardMapper.getList();
	}
	

	public List<BoardVO> getList1(int bid){
		log.info("getList1()..");
		BoardVO boardvo = new BoardVO();
		return boardMapper.getList1(bid);
		
		
	}


}
