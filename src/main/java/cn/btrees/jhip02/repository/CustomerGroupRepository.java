package cn.btrees.jhip02.repository;

import cn.btrees.jhip02.domain.CustomerGroup;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the CustomerGroup entity.
 */
@SuppressWarnings("unused")
@Repository
public interface CustomerGroupRepository extends JpaRepository<CustomerGroup, Long> {}
