package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShengxianchukuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShengxianchukuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShengxianchukuView;


/**
 * 生鲜出库
 *
 * @author 
 * @email 
 * @date 2022-03-16 15:55:56
 */
public interface ShengxianchukuService extends IService<ShengxianchukuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShengxianchukuVO> selectListVO(Wrapper<ShengxianchukuEntity> wrapper);
   	
   	ShengxianchukuVO selectVO(@Param("ew") Wrapper<ShengxianchukuEntity> wrapper);
   	
   	List<ShengxianchukuView> selectListView(Wrapper<ShengxianchukuEntity> wrapper);
   	
   	ShengxianchukuView selectView(@Param("ew") Wrapper<ShengxianchukuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShengxianchukuEntity> wrapper);
   	

}

