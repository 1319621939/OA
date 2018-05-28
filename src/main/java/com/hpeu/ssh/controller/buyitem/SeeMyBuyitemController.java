package com.hpeu.ssh.controller.buyitem;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.StrutsStatics;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.fastjson.JSON;
import com.hpeu.ssh.entity.Buyitem;
import com.hpeu.ssh.entity.User;
import com.hpeu.ssh.service.base.BuyitemService;
import com.opensymphony.xwork2.ActionContext;



public class SeeMyBuyitemController {
	
	private BuyitemService buyitemService;
	
	public SeeMyBuyitemController(BuyitemService buyitemService) {
		this.buyitemService = buyitemService;
	}
	
	

	/**
	 * 用户查看自己提交的采购申请
	 */
	public void find() {
			//获取当前用户
			User user = new User();
			user.setUserId(3);
			//获取当前用户的所有申请表
			List<Buyitem> list = buyitemService.getAll("from Buyitem where apply_user = "+3);
			
			//转换为json对象
			String json = JSON.toJSONString(list);
			System.out.println(json);
			//获取resp对象
			HttpServletResponse resp = (HttpServletResponse) ActionContext.getContext().get(StrutsStatics.HTTP_RESPONSE);
			resp.setContentType("text/html;charset=utf8");
			try {
				//写入
				resp.getWriter().println(json);
			} catch (IOException e) {
				e.printStackTrace();
			}
		
	}
		
}

