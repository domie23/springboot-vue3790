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


import com.dao.ShengxianfenleiDao;
import com.entity.ShengxianfenleiEntity;
import com.service.ShengxianfenleiService;
import com.entity.vo.ShengxianfenleiVO;
import com.entity.view.ShengxianfenleiView;

@Service("shengxianfenleiService")
public class ShengxianfenleiServiceImpl extends ServiceImpl<ShengxianfenleiDao, ShengxianfenleiEntity> implements ShengxianfenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShengxianfenleiEntity> page = this.selectPage(
                new Query<ShengxianfenleiEntity>(params).getPage(),
                new EntityWrapper<ShengxianfenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShengxianfenleiEntity> wrapper) {
		  Page<ShengxianfenleiView> page =new Query<ShengxianfenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShengxianfenleiVO> selectListVO(Wrapper<ShengxianfenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShengxianfenleiVO selectVO(Wrapper<ShengxianfenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShengxianfenleiView> selectListView(Wrapper<ShengxianfenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShengxianfenleiView selectView(Wrapper<ShengxianfenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
