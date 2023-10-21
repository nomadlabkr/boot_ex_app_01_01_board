package kr.nomadlab.boot_ex_app_01_01_board.service;

import kr.nomadlab.boot_ex_app_01_01_board.dto.BoardDTO;
import kr.nomadlab.boot_ex_app_01_01_board.dto.PageRequestDTO;
import kr.nomadlab.boot_ex_app_01_01_board.dto.PageResponseDTO;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Log4j2
class BoardServiceImplTest {
    @Autowired
    private BoardService boardService;

    @Test
    void registerTest() {
        log.info(boardService.getClass().getName());

        log.info(boardService.getClass().getName());

        BoardDTO boardDTO = BoardDTO.builder()
                .title("Sample Title...")
                .content("Sample Content...")
                .writer("user00")
                .build();
        Long bno = boardService.register(boardDTO);

        log.info("bno: " + bno);
    }

    @Test
    public void modifyTest() {
        // 변경이 필요한 데이터만
        BoardDTO boardDTO = BoardDTO.builder()
                .bno(100L)
                .title("update...100")
                .content("update content 100")
                .build();
        boardService.modify(boardDTO);
    }

    @Test
    public void listTest() {
        PageRequestDTO pageRequestDTO = PageRequestDTO.builder()
                .type("tcw")
                .keyword("1")
                .page(1)
                .size(10)
                .build();
        PageResponseDTO pageResponseDTO = boardService.list(pageRequestDTO);
        log.info(pageResponseDTO);
    }
}