package kr.nomadlab.boot_ex_app_01_01_board.service;

import kr.nomadlab.boot_ex_app_01_01_board.dto.BoardDTO;
import kr.nomadlab.boot_ex_app_01_01_board.dto.PageRequestDTO;
import kr.nomadlab.boot_ex_app_01_01_board.dto.PageResponseDTO;

public interface BoardService {
    Long register(BoardDTO boardDTO);
    BoardDTO readOne(Long bno);
    void modify(BoardDTO boardDTO);
    void remove(Long bno);
    PageResponseDTO<BoardDTO> list(PageRequestDTO pageRequestDTO);
}
