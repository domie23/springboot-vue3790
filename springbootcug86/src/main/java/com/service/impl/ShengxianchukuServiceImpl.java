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


import com.dao.ShengxianchukuDao;
import com.entity.ShengxianchukuEntity;
import com.service.ShengxianchukuService;
import com.entity.vo.ShengxianchukuVO;
import com.entity.view.ShengxianchukuView;

@Service("shengxianchukuService")
public class ShengxianchukuServiceImpl extends ServiceImpl<ShengxianchukuDao, ShengxianchukuEntity> implements ShengxianchukuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShengxianchukuEntity> page = this.selectPage(
                new Query<ShengxianchukuEntity>(params).getPage(),
                new EntityWrapper<ShengxianchukuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShengxianchukuEntity> wrapper) {
		  Page<ShengxianchukuView> page =new Query<ShengxianchukuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShengxianchukuVO> selectListVO(Wrapper<ShengxianchukuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShengxianchukuVO selectVO(Wrapper<ShengxianchukuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShengxianchukuView> selectListView(Wrapper<ShengxianchukuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShengxianchukuView selectView(Wrapper<ShengxianchukuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
