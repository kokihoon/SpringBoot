package com.kokihoon.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kokihoon.models.Board;
import com.kokihoon.repositories.BoardRepository;
import com.kokihoon.services.BoardService;

@RestController
public class BoardControl {
//	@Autowired
//	BoardRepository boardRepository;
//	
//	@GetMapping("/")
//	public List<Board> getListBoardByTitle(){
//		return boardRepository.findByTitle("제목..117");
//	}
	
	@Autowired
	BoardService boardService;
	
	@PatchMapping("/patch")
	Board patchBoard() {
		return boardService.patchBoard(1L);
	}
	
	
	@GetMapping("/")
	List<Board> listGetAll(){
		
		return boardService.getFindAll();
	}
	
	@GetMapping("/title")
	List<Board> listGetTitle(){
		return boardService.getFindTitle("제목..178");
	}
	
	@GetMapping("/content")
	List<Board> listGetContent() {
		return boardService.getFindContent("내용..177");
	}
	@GetMapping("/writer")
	List<Board> listGetWriter() {
		return boardService.getFindWriterContaining("05");
	}
}
