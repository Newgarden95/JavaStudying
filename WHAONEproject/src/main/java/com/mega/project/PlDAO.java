package com.mega.project;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PlDAO {
	@Autowired
	SqlSessionTemplate my;
	
	public List<PlVO> select() {
		List<PlVO> list = my.selectList("pl.select");
		return list;
	}
}
