package com.java.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.java.model.Dictionary;
import com.java.util.DbConnection;

public class DictionaryDao {
	
	private Connection connection;
	
	public DictionaryDao() {
		connection = DbConnection.getConnection();
	}
	
	public List<Dictionary> getAllWords() {
		List<Dictionary> words = new ArrayList<>();
		
		try {
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select * from entries");

			while (rs.next()) {
				Dictionary dict = new Dictionary();
				dict.setWord(rs.getString("word"));
				dict.setWordtype(rs.getString("wordtype"));
				dict.setDefinition(rs.getString("definition"));
				words.add(dict);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return words;
	}

}
