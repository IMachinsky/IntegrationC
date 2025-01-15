package biz.itcompany.repository;

import biz.itcompany.model.MoveStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoveStatusRepository extends JpaRepository<MoveStatus, Integer> {
}
