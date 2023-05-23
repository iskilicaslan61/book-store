package com.folksdev.bookstore.dto;

import lombok.Data;

import java.util.List;

@Data
public class BookOrderRequest {

    private List<Integer> bookIdList;
    private String userName;
	public List<Integer> getBookIdList() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getUserName() {
		// TODO Auto-generated method stub
		return null;
	}
}
