package biz.itcompany.repository;

import biz.itcompany.model.Move;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoveRepository extends JpaRepository<Move, Integer> {
}
