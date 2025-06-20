package com.dao;

import com.entity.YonghujinggaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YonghujinggaoVO;
import com.entity.view.YonghujinggaoView;


/**
 * 用户警告
 * 
 * @author 
 * @email 
 * @date 2022-03-16 15:55:56
 */
public interface YonghujinggaoDao extends BaseMapper<YonghujinggaoEntity> {
	
	List<YonghujinggaoVO> selectListVO(@Param("ew") Wrapper<YonghujinggaoEntity> wrapper);
	
	YonghujinggaoVO selectVO(@Param("ew") Wrapper<YonghujinggaoEntity> wrapper);
	
	List<YonghujinggaoView> selectListView(@Param("ew") Wrapper<YonghujinggaoEntity> wrapper);

	List<YonghujinggaoView> selectListView(Pagination page,@Param("ew") Wrapper<YonghujinggaoEntity> wrapper);
	
	YonghujinggaoView selectView(@Param("ew") Wrapper<YonghujinggaoEntity> wrapper);
	

}
