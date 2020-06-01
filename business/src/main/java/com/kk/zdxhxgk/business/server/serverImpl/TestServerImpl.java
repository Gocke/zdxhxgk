package com.kk.zdxhxgk.business.server.serverImpl;

import com.kk.zdxhxgk.business.mapper.TestJpa;
import com.kk.zdxhxgk.business.mapper.TestMapper;
import com.kk.zdxhxgk.business.model.Test;
import com.kk.zdxhxgk.business.model.TestExample;
import com.kk.zdxhxgk.business.server.TestServer;
import org.springframework.stereotype.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Gocke
 * 2020/4/18
 */
@Service
public class TestServerImpl implements TestServer {
    private static final Logger LOG = LoggerFactory.getLogger(TestServerImpl.class);
    @Resource
    private TestMapper testMapper;
    @Resource
    private TestJpa testJpa;
    @Override
    public List<Test> selectAll() {
        //Jpa
        List<Test> testList = testJpa.findByNameLike("%托%");
        System.err.print(testList.get(0).getName());

//
//        Test test = new Test();
//        test.setId(1);
//        Example<Test> example = Example.of(test);
//        Optional<Test> optTest = testMapper.findOne(example);
//        if(optTest != null){
//          //  return optTest.get();
//            LOG.info(optTest.get().getName());
//        }else{
//          //  return null;
//        }
//
//        List<Integer> ids = new ArrayList<Integer>();
//        ids.add(1);
//        ids.add(2);
//        List<Test> testList = testMapper.findByIdIn(ids);
//        System.err.println(testList.size());
//
//        //mybatis
        TestExample testExample = new TestExample();
        testExample.setOrderByClause("id desc");
        testExample.createCriteria().andIdEqualTo(2);
        return testMapper.selectByExample(testExample);


    }
}
