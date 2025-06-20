package com.dao;

import com.entity.ShangjiajinggaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShangjiajinggaoVO;
import com.entity.view.ShangjiajinggaoView;


/**
 * 商家警告
 * 
 * @author 
 * @email 
 * @date 2022-03-16 15:55:56
 */
public interface ShangjiajinggaoDao extends BaseMapper<ShangjiajinggaoEntity> {
	
	List<ShangjiajinggaoVO> selectListVO(@Param("ew") Wrapper<ShangjiajinggaoEntity> wrapper);
	
	ShangjiajinggaoVO selectVO(@Param("ew") Wrapper<ShangjiajinggaoEntity> wrapper);
	
	List<ShangjiajinggaoView> selectListView(@Param("ew") Wrapper<ShangjiajinggaoEntity> wrapper);

	List<ShangjiajinggaoView> selectListView(Pagination page,@Param("ew") Wrapper<ShangjiajinggaoEntity> wrapper);
	
	ShangjiajinggaoView selectView(@Param("ew") Wrapper<ShangjiajinggaoEntity> wrapper);
	

}
