package edu.bit.board.service;

import java.util.List;

import edu.bit.board.page.Criteria;
import edu.bit.board.vo.BoardVO;

public interface BoardService {
	List<BoardVO> getList();
	BoardVO get(int bid);
	void modify(BoardVO boardVO);
	void remove(int bid);
	
	void writeBoard(BoardVO boardVO);
	void writeReply(BoardVO boardVO);
	public void upHit(int bid);
	// 페이징 처리 함수
	public int getTotal(Criteria cri);
	// 위의 List<BoardVO>랑 이름이 같다 즉 함수 오버로딩이다. 
	public List<BoardVO> getList(Criteria critera);
}
