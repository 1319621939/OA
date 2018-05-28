package com.hpeu.ssh.controller.buyitem;

import java.io.IOException;
import java.sql.Timestamp;
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

public class BuyitemListController {
	
	private BuyitemService buyitemService;
	
	public BuyitemListController(BuyitemService buyitemService) {
		this.buyitemService = buyitemService;
	}
	
	private int id;
	private int result;
	
	/*
	 * 领导查看和所有的采购申请
	 */
	public void find() {
		//获取所有用户的所有申请表
		List<Buyitem> list = buyitemService.getAll("from Buyitem ORDER BY status ASC, create_date DESC ");
		//转换为json对象
		String json = JSON.toJSONString(list);
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
	/**
	 * 领导审批当前选中的申请
	 * @return
	 */
	public String findRe() {
		String sql= "from Buyitem as s where s.buyitemId = :id";
		//获取当前buyitem申请;
		Buyitem buyitem = buyitemService.getEntity(sql, id);
		buyitem.setResult(result);
		buyitemService.update(buyitem);
		return "success";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	
	



}
