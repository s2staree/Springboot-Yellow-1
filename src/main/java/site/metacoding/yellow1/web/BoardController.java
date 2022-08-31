package site.metacoding.yellow1.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import site.metacoding.yellow1.domain.Board;

@Controller
public class BoardController {
	
	@GetMapping("/board")
	public String getBoard(Model model) {	// board테이블에 있는 파일을 view에 담아서 줘.
		// 더미 데이터 만들기
		List<Board> boardList = new ArrayList<>();	// 모델+뷰+컨트롤러 패턴 => mvn
		boardList.add(new Board(1, "스프링 1강", "컨트롤러 배우기"));
		boardList.add(new Board(2, "스프링 2강", "템플릿 엔진 배우기"));
		boardList.add(new Board(3, "스프링 3강", "DB 연결하기"));
		
		model.addAttribute("boards", boardList);
		return "board/list";
	}
	
	@GetMapping("/board/{id}")
	public String getBoardOne(@PathVariable Integer id, Model model) {
		// 더미 데이터 만들기 2
		List<Board> boardList = new ArrayList<>();	// 모델+뷰+컨트롤러 패턴 => mvn
		boardList.add(new Board(1, "스프링 1강", "컨트롤러 배우기"));
		boardList.add(new Board(2, "스프링 2강", "템플릿 엔진 배우기"));
		boardList.add(new Board(3, "스프링 3강", "DB 연결하기"));
		
		if(id == 1) {
			model.addAttribute("board", boardList.get(0));
		}
		if(id == 2) {
			model.addAttribute("board", boardList.get(1));
		}
		if(id == 3) {
			model.addAttribute("board", boardList.get(2));
		}
		
		return "board/detail";
	}
}
