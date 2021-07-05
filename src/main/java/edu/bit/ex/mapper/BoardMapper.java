package edu.bit.ex.mapper;

import java.sql.Timestamp;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.bit.ex.vo.BoardVO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Mapper
public interface BoardMapper {
	List<BoardVO> getList();
	BoardVO getList1(int bid);
	int delete(int bid);
	void update(BoardVO boardVO);

	
	
}
