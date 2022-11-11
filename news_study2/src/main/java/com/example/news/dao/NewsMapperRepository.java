package com.example.news.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.news.dto.News;

@Mapper
public interface NewsMapperRepository {
	public List<News> getAll() throws Exception;
	public News getNews(int aid) throws SQLException;
	public void addNews(News n) throws Exception;
	
	@Delete(" delete from news where aid=#{aid}")
	public void delNews(int aid) throws SQLException;
	
}
