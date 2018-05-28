package com.hpeu.ssh.controller.scores;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.StrutsStatics;

import com.alibaba.fastjson.JSON;
import com.hpeu.ssh.entity.Group;
import com.hpeu.ssh.entity.Scores;
import com.hpeu.ssh.entity.User;
import com.hpeu.ssh.service.base.GroupService;
import com.hpeu.ssh.service.base.ScoresService;
import com.hpeu.ssh.service.base.UserService;
import com.opensymphony.xwork2.ActionContext;

public class SubmitScoresController {
	
	private ScoresService scoresService;
	private GroupService groupService;
	private UserService userService; 
	
	public SubmitScoresController(ScoresService scoresService) {
		this.scoresService = scoresService;
	}
	public SubmitScoresController(GroupService groupService) {
		this.groupService = groupService;
	}
	public SubmitScoresController( UserService userService) {
		this.userService = userService;
	}
	//分组id
	private int groupSc;
	//成绩标题,批次
	private String title;
	//个人分数
	private int Iscore;
	//个人备注
	private String Iremark;
	
	/**
	 * 获取所有可选择分组
	 */
	public void find() {
		// 获取所有用户的所需要的分组表
		List<Group> list = groupService.getAll("from Group");
		// 转换为json对象
		String json = JSON.toJSONString(list);
		// 获取resp对象
		HttpServletResponse resp = (HttpServletResponse) ActionContext.getContext().get(StrutsStatics.HTTP_RESPONSE);
		resp.setContentType("text/html;charset=utf8");
		try {
			// 写入
			resp.getWriter().println(json);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 获取选中分组,以及查询分组里所有人员,统一写入
	 * @return
	 */
	public String findSu() {
		System.out.println("这是测试group=============="+groupSc);
		//存group
		ActionContext.getContext().getSession().put("findGroup", groupSc);
		//取group
		int findSuGroup =   (int)ActionContext.getContext().getSession().get("findGroup");
		// 查询java5班的所有学生
		System.out.println("这是测试findSuGroup=============="+findSuGroup);
		List<User> list = userService.getAll("from User u where u.groupId = " + findSuGroup);
		System.out.println(list);
		// 查询现在登录的人
		User teacher = userService.getEntity("from User u where u.userId = :id", 17);
		for (User user : list) {
			// 创建新的scores
			Scores scores = new Scores();
			// 统一写出考试批次
			scores.setTitle(title);
			// 先统一自动给出状态码0-未提交
			scores.setStatus(0);
			// 统一给录入人
			scores.setOperatorId(teacher);
			// 给出创建时间
			scores.setCreateDate(new Timestamp(System.currentTimeMillis()));
			// 给每一个java五班学生加上统一数据
			scores.setUserId(user);
			// 保存数据
			scoresService.add(scores);
		}
		return "success";
	}

	public void findUs() {
		int findSuGroup =   (int)ActionContext.getContext().getSession().get("findGroup");
		//查询java5班的所有学生
		List<User> list = userService.getAll("from User u where u.groupId = "+findSuGroup);
		//测试
		System.out.println("这是测试findSuGroup=============="+findSuGroup);
		// 转换为json对象
		String json = JSON.toJSONString(list);
		// 获取resp对象
		HttpServletResponse resp = (HttpServletResponse) ActionContext.getContext().get(StrutsStatics.HTTP_RESPONSE);
		resp.setContentType("text/html;charset=utf8");
		try {
			// 写入
			resp.getWriter().println(json);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void findRe() {
		//测试
		System.out.println("-------------------------"+Iscore);
//		//查询java5班的当前修改的学生的成绩信息
//		Scores scores = scoresService.getEntity("", 1);
//		//录入考试分数
//		scores.setScore(20);
//		//录入备注
//		scores.setRemark("");
//		//保存
//		scoresService.update(scores);
		
	}
	

	public ScoresService getScoresService() {
		return scoresService;
	}

	public void setScoresService(ScoresService scoresService) {
		this.scoresService = scoresService;
	}

	public GroupService getGroupService() {
		return groupService;
	}

	public void setGroupService(GroupService groupService) {
		this.groupService = groupService;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public int getGroupSc() {
		return groupSc;
	}
	public void setGroupSc(int groupSc) {
		this.groupSc = groupSc;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getIscore() {
		return Iscore;
	}
	public void setIscore(int iscore) {
		Iscore = iscore;
	}
	public String getIremark() {
		return Iremark;
	}
	public void setIremark(String iremark) {
		Iremark = iremark;
	}
	
	
	

}
