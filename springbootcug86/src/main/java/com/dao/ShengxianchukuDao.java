package com.dao;

import com.entity.ShengxianchukuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShengxianchukuVO;
import com.entity.view.ShengxianchukuView;


/**
 * 生鲜出库
 * 
 * @author 
 * @email 
 * @date 2022-03-16 15:55:56
 */
public interface ShengxianchukuDao extends BaseMapper<ShengxianchukuEntity> {
	
	List<ShengxianchukuVO> selectListVO(@Param("ew") Wrapper<ShengxianchukuEntity> wrapper);
	
	ShengxianchukuVO selectVO(@Param("ew") Wrapper<ShengxianchukuEntity> wrapper);
	
	List<ShengxianchukuView> selectListView(@Param("ew") Wrapper<ShengxianchukuEntity> wrapper);

	List<ShengxianchukuView> selectListView(Pagination page,@Param("ew") Wrapper<ShengxianchukuEntity> wrapper);
	
	ShengxianchukuView selectView(@Param("ew") Wrapper<ShengxianchukuEntity> wrapper);
	

}
