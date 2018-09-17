package com.example.boot.domain.cm.service.impl;

import com.example.boot.domain.cm.entity.Menu;
import com.example.boot.domain.cm.mapper.MenuMapper;
import com.example.boot.domain.cm.service.IMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 菜单表 服务实现类
 * </p>
 *
 * @author lvyongb
 * @since 2018-09-17
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {

}
