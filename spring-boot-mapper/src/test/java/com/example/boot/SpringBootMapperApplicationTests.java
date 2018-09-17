package com.example.boot;

import com.example.boot.module.cm.CmMenu;
import com.example.boot.module.cm.CmMenuMapper;
import com.example.boot.module.cm.CmUser;
import com.example.boot.module.cm.CmUserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.spring.annotation.MapperScan;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan(basePackages = "com.example.boot.module")
public class SpringBootMapperApplicationTests {

    @Autowired
    private CmUserMapper cmUserMapper;
    @Resource
    private CmMenuMapper cmMenuMapper;

    @Test
    public void selectOne() {
        System.out.println("+++++++++++++++++++++++++++++++++");
        List<CmUser> userLists = cmUserMapper.select(new CmUser());
        userLists.stream().forEach(System.out::println);
        //CmUser user = new CmUser();
        //user.setId(1L);
        //CmUser cmUser = cmUserMapper.selectOne(user);
        //System.out.println(cmUser);
        System.out.println("+++++++++++++++++++++++++++++++++");
    }

    @Test
    public void insertMenuOne() {
        CmMenu cmMenu = new CmMenu();
        cmMenu.setMenuCode("200005");
        cmMenu.setMenuName("菜单管理");
        cmMenu.setCreator("admin");
        cmMenu.setCreateTime(new Date());
        cmMenuMapper.insertSelective(cmMenu);
        System.out.println("插入成功。。。。。");

        cmMenuMapper.selectAll().stream().forEach(System.out::println);
    }

    @Test
    public void updateOne() {
        Example example = new Example(CmMenu.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("id","5");
        CmMenu cmMenu = new CmMenu();
        cmMenu.setMenuName("权限管理");
        cmMenuMapper.updateByExampleSelective(cmMenu,example);
        System.out.println("更新成功。。。。");

        cmMenuMapper.selectAll().stream().forEach(System.out::println);
    }
}
