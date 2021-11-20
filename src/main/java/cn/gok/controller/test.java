package cn.gok.controller;


import cn.gok.beans.sys.sysMember;
import cn.gok.service.sys.ISysMemberService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-new.xml")
public class test {
    @Autowired
    ISysMemberService iSysMemberService;
    @org.junit.Test
    public void testSpring(){
        sysMember sysMember = iSysMemberService.queryMembersById(1);
        System.out.println(sysMember.toString());

    }

}
