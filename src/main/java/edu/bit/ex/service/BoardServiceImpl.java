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
	

	public BoardVO getList1(int bid){
	
		return boardMapper.getList1(bid);
		
		
	}
	
	@Override
	public int remove(int bid) {
		log.info("service:remove()..");
		return boardMapper.delete(bid);
	}
	
	   @Override
	   public void modify(BoardVO boardVO) {
	      log.info("service:modify()..");
	      boardMapper.update(boardVO);

	   }


}
