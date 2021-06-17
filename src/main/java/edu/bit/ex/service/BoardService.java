package edu.bit.ex.service;


import java.util.List;
import edu.bit.ex.vo.BoardVO;



public interface BoardService {
	List<BoardVO> getList();
	List<BoardVO> getList1(int bid);

}



