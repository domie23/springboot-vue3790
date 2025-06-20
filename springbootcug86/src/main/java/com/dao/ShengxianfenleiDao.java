package com.dao;

import com.entity.ShengxianfenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShengxianfenleiVO;
import com.entity.view.ShengxianfenleiView;


/**
 * 生鲜分类
 * 
 * @author 
 * @email 
 * @date 2022-03-16 15:55:56
 */
public interface ShengxianfenleiDao extends BaseMapper<ShengxianfenleiEntity> {
	
	List<ShengxianfenleiVO> selectListVO(@Param("ew") Wrapper<ShengxianfenleiEntity> wrapper);
	
	ShengxianfenleiVO selectVO(@Param("ew") Wrapper<ShengxianfenleiEntity> wrapper);
	
	List<ShengxianfenleiView> selectListView(@Param("ew") Wrapper<ShengxianfenleiEntity> wrapper);

	List<ShengxianfenleiView> selectListView(Pagination page,@Param("ew") Wrapper<ShengxianfenleiEntity> wrapper);
	
	ShengxianfenleiView selectView(@Param("ew") Wrapper<ShengxianfenleiEntity> wrapper);
	

}
