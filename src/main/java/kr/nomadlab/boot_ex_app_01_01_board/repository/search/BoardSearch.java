package kr.nomadlab.boot_ex_app_01_01_board.repository.search;

import kr.nomadlab.boot_ex_app_01_01_board.domain.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BoardSearch {
    Page<Board> search1(Pageable pageable);
    Page<Board> searchAll(String[] types, String keyword, Pageable pageable);
}
