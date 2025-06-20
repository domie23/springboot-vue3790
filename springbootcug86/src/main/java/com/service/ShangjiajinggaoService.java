package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShangjiajinggaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShangjiajinggaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShangjiajinggaoView;


/**
 * 商家警告
 *
 * @author 
 * @email 
 * @date 2022-03-16 15:55:56
 */
public interface ShangjiajinggaoService extends IService<ShangjiajinggaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShangjiajinggaoVO> selectListVO(Wrapper<ShangjiajinggaoEntity> wrapper);
   	
   	ShangjiajinggaoVO selectVO(@Param("ew") Wrapper<ShangjiajinggaoEntity> wrapper);
   	
   	List<ShangjiajinggaoView> selectListView(Wrapper<ShangjiajinggaoEntity> wrapper);
   	
   	ShangjiajinggaoView selectView(@Param("ew") Wrapper<ShangjiajinggaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShangjiajinggaoEntity> wrapper);
   	

}

