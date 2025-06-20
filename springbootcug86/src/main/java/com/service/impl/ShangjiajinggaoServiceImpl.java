package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShangjiajinggaoDao;
import com.entity.ShangjiajinggaoEntity;
import com.service.ShangjiajinggaoService;
import com.entity.vo.ShangjiajinggaoVO;
import com.entity.view.ShangjiajinggaoView;

@Service("shangjiajinggaoService")
public class ShangjiajinggaoServiceImpl extends ServiceImpl<ShangjiajinggaoDao, ShangjiajinggaoEntity> implements ShangjiajinggaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShangjiajinggaoEntity> page = this.selectPage(
                new Query<ShangjiajinggaoEntity>(params).getPage(),
                new EntityWrapper<ShangjiajinggaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShangjiajinggaoEntity> wrapper) {
		  Page<ShangjiajinggaoView> page =new Query<ShangjiajinggaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShangjiajinggaoVO> selectListVO(Wrapper<ShangjiajinggaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShangjiajinggaoVO selectVO(Wrapper<ShangjiajinggaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShangjiajinggaoView> selectListView(Wrapper<ShangjiajinggaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShangjiajinggaoView selectView(Wrapper<ShangjiajinggaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
