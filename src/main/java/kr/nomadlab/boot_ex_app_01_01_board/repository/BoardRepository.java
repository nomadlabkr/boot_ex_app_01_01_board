package kr.nomadlab.boot_ex_app_01_01_board.repository;

import kr.nomadlab.boot_ex_app_01_01_board.domain.Board;
import kr.nomadlab.boot_ex_app_01_01_board.repository.search.BoardSearch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long>, BoardSearch {
}
