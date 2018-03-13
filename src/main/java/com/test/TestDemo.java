package com.test;


import com.test.dao.StuInfoMapper;
import com.test.pojo.StuInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class TestDemo {

    public static void main(String[] args) {
        System.out.println("你好");

        try {
            InputStream is= Resources.getResourceAsStream("mybatis-configuration.xml");
            SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
            SqlSession session=factory.openSession();
            StuInfoMapper stuInfoMapper=session.getMapper(StuInfoMapper.class);
           StuInfo stuInfo=stuInfoMapper.selectByPrimaryKey("10000");
            System.out.println(stuInfo.getStuname());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public void aaa() {

    }
}
