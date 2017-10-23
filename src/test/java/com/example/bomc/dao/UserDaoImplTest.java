

import com.example.bomc.dao.UserDao;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

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
        Assert.assertEquals(3, userDao.getAllUsers().intValue());

//        // 删除两个用户
//        userdao.deleteByName("a");
//        userdao.deleteByName("e");
//
//        // 查数据库，应该有5个用户
//        Assert.assertEquals(3, userdao.getAllUsers().intValue());

    }


}