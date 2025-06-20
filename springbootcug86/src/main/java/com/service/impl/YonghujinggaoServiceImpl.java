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


import com.dao.YonghujinggaoDao;
import com.entity.YonghujinggaoEntity;
import com.service.YonghujinggaoService;
import com.entity.vo.YonghujinggaoVO;
import com.entity.view.YonghujinggaoView;

@Service("yonghujinggaoService")
public class YonghujinggaoServiceImpl extends ServiceImpl<YonghujinggaoDao, YonghujinggaoEntity> implements YonghujinggaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YonghujinggaoEntity> page = this.selectPage(
                new Query<YonghujinggaoEntity>(params).getPage(),
                new EntityWrapper<YonghujinggaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YonghujinggaoEntity> wrapper) {
		  Page<YonghujinggaoView> page =new Query<YonghujinggaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YonghujinggaoVO> selectListVO(Wrapper<YonghujinggaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YonghujinggaoVO selectVO(Wrapper<YonghujinggaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YonghujinggaoView> selectListView(Wrapper<YonghujinggaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YonghujinggaoView selectView(Wrapper<YonghujinggaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
