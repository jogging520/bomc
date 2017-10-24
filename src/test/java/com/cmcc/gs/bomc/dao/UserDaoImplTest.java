package com.cmcc.gs.bomc.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
public class UserDaoImplTest {
    @Autowired
    private UserDao userDao;

//    @Before
//    public void setUp() {
//        // 准备，清空user表
//        userDao.deleteAllUsers();
//    }

    @Test
    public void test() throws Exception {
//        // 插入5个用户
//        userDao.create("a", 1);
//        userDao.create("b", 2);
//        userDao.create("c", 3);
//        userDao.create("d", 4);
//        userDao.create("e", 5);
        System.out.println(userDao);
        // 查数据库，应该有5个用户
        assertEquals(3, userDao.getAllUsers().intValue());

//        // 删除两个用户
//        userdao.deleteByName("a");
//        userdao.deleteByName("e");
//
//        // 查数据库，应该有5个用户
//        Assert.assertEquals(3, userdao.getAllUsers().intValue());

    }


}