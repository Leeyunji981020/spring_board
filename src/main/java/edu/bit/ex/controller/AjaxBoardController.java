package edu.bit.ex.controller;

import java.sql.SQLException;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import edu.bit.ex.service.BoardService;
import edu.bit.ex.vo.BoardVO;
import lombok.extern.log4j.Log4j;
//spring v4.0 에서부터
//@RestController라는 어노테이션을 추가해서 해당
//Controller의 모든 메서드의 리턴타입을 기존과 다르게 처리한다는것을 명시

@Log4j
@Controller
@RequestMapping("/ajax/*")
public class AjaxBoardController {
   
	@Autowired
	private BoardService boardService;
	
   @GetMapping("/list")
   public String ajaxList( Model model) {
      log.info("ajaxList()..");
      
            
      return "ajax/ajaxlist";
   }
   @ResponseBody
   @GetMapping("/delete")
   public String delete(BoardVO boardVO) {
      log.info("ajaxList()..");
      log.info(boardVO);
      boardService.remove(boardVO.getBid());
      
            
      return "SUCCESS";
   }
   
   

	

 
}



