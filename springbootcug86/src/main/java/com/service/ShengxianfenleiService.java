package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShengxianfenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShengxianfenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShengxianfenleiView;


/**
 * 生鲜分类
 *
 * @author 
 * @email 
 * @date 2022-03-16 15:55:56
 */
public interface ShengxianfenleiService extends IService<ShengxianfenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShengxianfenleiVO> selectListVO(Wrapper<ShengxianfenleiEntity> wrapper);
   	
   	ShengxianfenleiVO selectVO(@Param("ew") Wrapper<ShengxianfenleiEntity> wrapper);
   	
   	List<ShengxianfenleiView> selectListView(Wrapper<ShengxianfenleiEntity> wrapper);
   	
   	ShengxianfenleiView selectView(@Param("ew") Wrapper<ShengxianfenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShengxianfenleiEntity> wrapper);
   	

}

