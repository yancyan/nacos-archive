package repository;

import com.star.OrmApplication;
import com.star.orm.ParPO;
import com.star.orm.dao.ParRepository;
import com.star.orm.domain.Par;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ZhuYX
 * @date 2020/10/22 15:49
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {OrmApplication.class})
//@TestPropertySource(properties = {"aws.sqs.enabled:false"})
@ActiveProfiles("dev")
public class ParTest {


    @Autowired
    ParRepository parRepository;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void test() {

        Par one = parRepository.getOne(10001L);
        System.out.println(one);
        System.out.println("#####");
    }

    @Test
    public void test_likeName() {

        List<Par> nameLike = parRepository.findByNameLike("%o%");
        System.out.println(nameLike);
        System.out.println("#####" + nameLike.size());
    }

    @Test
    public void test_nameQuery() {

        List<Par> byCode = parRepository.findAll();
        System.out.println(byCode);
        System.out.println("#####" + byCode.size());
    }

    @Test
    public void test_pageable() {
        PageRequest of = PageRequest.of(1, 5, Sort.by(Sort.Direction.DESC, "id"));
        Page<Par> byCode = parRepository.findByNameLike("%o%", of);
        System.out.println(byCode.get().map(Par::getId).collect(Collectors.toList()));
        System.out.println("#####" + byCode);
    }

    @Test
    public void test_queryPO() {
        Collection<ParPO> parPO = parRepository.findByCompanyIdAndNameLike(2L, "%o%");
        System.out.println("#####" + parPO);
    }

}
