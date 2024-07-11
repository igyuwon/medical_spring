package com.java.controller;

import com.java.dto.BoardDto;
import com.java.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.util.ArrayList;
import java.util.UUID;

@Controller
//@RequestMapping("/board")
public class BoardController {

    @Autowired
    BoardService boardService; // IOC 컨테이너에서 주입받음.

    @RequestMapping("/board/list") // 게시판리스트
    public ModelAndView list(){

        ArrayList<BoardDto> list = boardService.selectList();

        // mv
        ModelAndView mv = new ModelAndView();
        mv.addObject("list", list);
        mv.setViewName("board/list");
        return mv;
    } // list

    @RequestMapping("/board/view") // 뷰페이지
    public ModelAndView view(BoardDto bdto){

        // 1개
        BoardDto boardDto = boardService.selectOne(bdto);

        ModelAndView mv = new ModelAndView();
        mv.addObject("boardDto", boardDto);
        mv.setViewName("board/view");
        return mv;
    } // view

    @GetMapping("/board/write") // 글쓰기 화면
    public String write(){
        return "board/write";
    }

    @PostMapping("/board/write") // 글쓰기 저장
    public String write(BoardDto bdto, @RequestPart MultipartFile files){

        // id, btitle, bcontent, files
        System.out.println("write conroller files : " + files.getOriginalFilename());
        String uFile = "";

        // 파일이 존재할 시
        if(!files.isEmpty()){
            // jsp
            long time = System.currentTimeMillis();
            System.out.println("time : "+time);

    //        // 파일 중복 방지
    //        UUID uuid = UUID.randomUUID();
    //        System.out.println("uuid : "+uuid);

            // 파일 중복 방지
            uFile = String.format("%d_%s",time,files.getOriginalFilename());
            String saveUrl = "/Users/igyuwon/upload/";
            File f = new File(saveUrl+uFile);
            try {
                files.transferTo(f); // 파일업로드
            } catch (Exception e) {
                e.printStackTrace();
            }
        } // if

        // 변경된 파일이름 저장
        bdto.setBfile(uFile);

        boardService.insertBoard(bdto);
        return "redirect:/board/list";
    }

    @RequestMapping("/board/delete") // 게시글 삭제
    public String delete(BoardDto bdto){
        System.out.println("controller delete bno : "+bdto.getBno());
        boardService.deleteBoard(bdto);
        return "redirect:/board/list";
    }

    @RequestMapping("/board/update")
    public ModelAndView update(BoardDto bdto){ // 수정페이지

        BoardDto boardDto = boardService.updateBoard(bdto);

        ModelAndView mv = new ModelAndView();
        mv.addObject("boardDto", boardDto);
        mv.setViewName("board/modify");
        return mv;
    }

    @RequestMapping("/board/doUpdate") // 게시글 수정
    public String doUpdate(BoardDto bdto,@RequestPart MultipartFile files) {
        String uFile = "";

        // 파일이 존재할 시
        if(!files.isEmpty()){
            // jsp
            long time = System.currentTimeMillis();
            System.out.println("time : "+time);

            // 파일 중복 방지
            uFile = String.format("%d_%s",time,files.getOriginalFilename());
            String saveUrl = "/Users/igyuwon/upload/";
            File f = new File(saveUrl+uFile);
            try {
                files.transferTo(f); // 파일업로드
            } catch (Exception e) {
                e.printStackTrace();
            }
            // 변경된 파일이름 저장
            bdto.setBfile(uFile);
        } // if


        boardService.doUpdateBoard(bdto);
        System.out.println(bdto.getBno());
        return "redirect:/board/list";
    } // modify_save

    @RequestMapping("/board/reply")
    public ModelAndView reply(BoardDto bdto){ // 답글페이지
        BoardDto boardDto = boardService.selectOne(bdto);
        ModelAndView mv = new ModelAndView();
        mv.addObject("boardDto", boardDto);
        mv.setViewName("board/reply");

        return mv;
    }

    @RequestMapping("/board/doReply")
    public String doReply(BoardDto bdto,@RequestPart MultipartFile files) { // 답글페이지 저장
        String uFile = "";

        // 파일이 존재할 시
        if(!files.isEmpty()){
            // jsp
            long time = System.currentTimeMillis();
            System.out.println("time : "+time);

            uFile = String.format("%d_%s",time,files.getOriginalFilename());
            String saveUrl = "/Users/igyuwon/upload/";
            File f = new File(saveUrl+uFile);
            try {
                files.transferTo(f); // 파일업로드
            } catch (Exception e) {
                e.printStackTrace();
            }
        } // if

        // 변경된 파일이름 저장
        bdto.setBfile(uFile);

        boardService.insertReply(bdto);

        return "redirect:/board/list";
    }



}
