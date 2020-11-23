package com.star.orm.dao;

import com.star.orm.ParPO;
import com.star.orm.domain.Par;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Collection;
import java.util.List;

/**
 * @author ZhuYX
 * @date 2020/10/22 15:23
 */
public interface ParRepository extends JpaRepository<Par, Long>, JpaSpecificationExecutor<Par> {

    List<Par> findDistinctByAddressLevel(Long addressLevel);
    List<Par> findByNameLike(String name);
    List<Par> findAll();

    List<Par> findByCompanyId(Long companyId, Sort sort);
    List<Par> findByCompanyId(Long companyId, Pageable pageable);

    Page<Par> findByNameLike(String name, Pageable pageable);

    // <T> Collection<T> findByCompanyIdAndNameLike(Long id, String name);
    Collection<ParPO> findByCompanyIdAndNameLike(Long id, String name);

    @Query(value = "select pl.* from boss_partner.PARTNER_LEVEL pl where pl.id = :id", nativeQuery = true)
    Par queryById(@Param("id") Long id);
}
