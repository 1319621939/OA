package com.hpeu.ssh.controller.buyitem;

import java.sql.Timestamp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hpeu.ssh.entity.Buyitem;
import com.hpeu.ssh.entity.User;
import com.hpeu.ssh.service.base.BuyitemService;

public class BuyitemController {
	
	private BuyitemService buyitemService;
	
	public  BuyitemController(BuyitemService buyitemService) {
		this.buyitemService = buyitemService;
	}
	
	
	//采购清单
	private String title;
	//采购内容
	private String content;
	//备注
	private String remark;
	
	/**
	 * 采购模块-用户提交申请
	 * @return
	 */
	public String find() {
		try {
			Buyitem buyitem = new Buyitem();
			buyitem.setTitle(title);
			buyitem.setContent(content);
			buyitem.setRemark(remark);
			//状态码初始为0,即已提交
			buyitem.setStatus(0);
			//审核结果,为0,即正在审核
			buyitem.setResult(0);
			//创建时间为系统时间
			buyitem.setCreateDate(new Timestamp(System.currentTimeMillis()));
			//根据登录信息查找,查找申请人
			buyitem.setApplyUser(new User());
			//审批人,暂时为空
			buyitem.setApprovalUser(null);
			//执行增加操作
			buyitemService.add(buyitem);
		} catch (Exception e) {
			System.out.println("采购申请出现错误");
			return "error";
		}
		return "success";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
	
	
	

}
