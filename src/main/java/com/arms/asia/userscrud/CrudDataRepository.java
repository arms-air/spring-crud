package com.arms.asia.userscrud;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrudDataRepository extends JpaRepository<CrudData, Integer> {

}
