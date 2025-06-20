package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ShangjiajinggaoEntity;
import com.entity.view.ShangjiajinggaoView;

import com.service.ShangjiajinggaoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 商家警告
 * 后端接口
 * @author 
 * @email 
 * @date 2022-03-16 15:55:56
 */
@RestController
@RequestMapping("/shangjiajinggao")
public class ShangjiajinggaoController {
    @Autowired
    private ShangjiajinggaoService shangjiajinggaoService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShangjiajinggaoEntity shangjiajinggao,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("shangjia")) {
			shangjiajinggao.setShangdianbianhao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShangjiajinggaoEntity> ew = new EntityWrapper<ShangjiajinggaoEntity>();
		PageUtils page = shangjiajinggaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shangjiajinggao), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShangjiajinggaoEntity shangjiajinggao, 
		HttpServletRequest request){
        EntityWrapper<ShangjiajinggaoEntity> ew = new EntityWrapper<ShangjiajinggaoEntity>();
		PageUtils page = shangjiajinggaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shangjiajinggao), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShangjiajinggaoEntity shangjiajinggao){
       	EntityWrapper<ShangjiajinggaoEntity> ew = new EntityWrapper<ShangjiajinggaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shangjiajinggao, "shangjiajinggao")); 
        return R.ok().put("data", shangjiajinggaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShangjiajinggaoEntity shangjiajinggao){
        EntityWrapper< ShangjiajinggaoEntity> ew = new EntityWrapper< ShangjiajinggaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shangjiajinggao, "shangjiajinggao")); 
		ShangjiajinggaoView shangjiajinggaoView =  shangjiajinggaoService.selectView(ew);
		return R.ok("查询商家警告成功").put("data", shangjiajinggaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShangjiajinggaoEntity shangjiajinggao = shangjiajinggaoService.selectById(id);
        return R.ok().put("data", shangjiajinggao);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShangjiajinggaoEntity shangjiajinggao = shangjiajinggaoService.selectById(id);
        return R.ok().put("data", shangjiajinggao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShangjiajinggaoEntity shangjiajinggao, HttpServletRequest request){
    	shangjiajinggao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shangjiajinggao);
        shangjiajinggaoService.insert(shangjiajinggao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShangjiajinggaoEntity shangjiajinggao, HttpServletRequest request){
    	shangjiajinggao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shangjiajinggao);
        shangjiajinggaoService.insert(shangjiajinggao);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ShangjiajinggaoEntity shangjiajinggao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shangjiajinggao);
        shangjiajinggaoService.updateById(shangjiajinggao);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shangjiajinggaoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ShangjiajinggaoEntity> wrapper = new EntityWrapper<ShangjiajinggaoEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("shangjia")) {
			wrapper.eq("shangdianbianhao", (String)request.getSession().getAttribute("username"));
		}

		int count = shangjiajinggaoService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
