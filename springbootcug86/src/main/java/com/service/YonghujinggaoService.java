package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YonghujinggaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YonghujinggaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YonghujinggaoView;


/**
 * 用户警告
 *
 * @author 
 * @email 
 * @date 2022-03-16 15:55:56
 */
public interface YonghujinggaoService extends IService<YonghujinggaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YonghujinggaoVO> selectListVO(Wrapper<YonghujinggaoEntity> wrapper);
   	
   	YonghujinggaoVO selectVO(@Param("ew") Wrapper<YonghujinggaoEntity> wrapper);
   	
   	List<YonghujinggaoView> selectListView(Wrapper<YonghujinggaoEntity> wrapper);
   	
   	YonghujinggaoView selectView(@Param("ew") Wrapper<YonghujinggaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YonghujinggaoEntity> wrapper);
   	

}

