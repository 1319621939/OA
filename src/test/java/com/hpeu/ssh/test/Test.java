package com.hpeu.ssh.test;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.lang.UsesJava7;

import com.hpeu.ssh.entity.Buyitem;
import com.hpeu.ssh.entity.Friends;
import com.hpeu.ssh.entity.Scores;
import com.hpeu.ssh.entity.User;
import com.hpeu.ssh.service.base.BuyitemService;
import com.hpeu.ssh.service.base.FriendsService;
import com.hpeu.ssh.service.base.ScoresService;
import com.hpeu.ssh.service.base.UserService;
import com.hpeu.ssh.util.HibernateUitl;



public class Test {
	
	static BuyitemService buyitemService;
	static UserService userService;
	static ScoresService scoresService;
	
	static {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		buyitemService = context.getBean(BuyitemService.class);
		userService = context.getBean(UserService.class);
		scoresService = context.getBean(ScoresService.class);
		
	
	}
	@Transactional
	public static void main(String[] args) {
			findRe();
	}
	public static String find() {
		//查询java5班的所有学生
		String classes = "java";
		List<User> list = userService.getAll("from User u where u.groupId = "+2);
		//查询现在登录的人
		User teacher = new User();
		for (User user : list) {
			//创建新的scores
			Scores scores = new Scores();
			//统一写出考试批次
			scores.setTitle("java5第一次考试");
			//先统一自动给出状态码0-未提交
			scores.setStatus(0);
			//统一给录入人
			scores.setOperatorId(teacher);
			//给出创建时间	
			scores.setCreateDate(new Timestamp(System.currentTimeMillis()));
			//给每一个java五班学生加上统一数据
			scores.setUserId(user);
			//保存数据
			scoresService.add(scores);
		}
		return null;
	}
	
	public static String findRe() {
		//查询java5班的当前修改的学生的成绩信息
		Scores scores = scoresService.getEntity("from Scores s where s.scoresId = :id", 2);
		//录入考试分数
		scores.setScore(60);
		//录入备注
		scores.setRemark("我在哪");
		//保存
		scoresService.update(scores);
		return null;
	}
	
	
	
	

}
