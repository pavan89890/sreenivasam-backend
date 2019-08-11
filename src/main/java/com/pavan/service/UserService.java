package com.pavan.service;

import org.springframework.stereotype.Service;

import com.pavan.dto.ApiResponse;
import com.pavan.model.User;

@Service
public interface UserService {

	public ApiResponse saveUser(User user);

	public ApiResponse getUsers();

	public ApiResponse getUser(Long id);

	public ApiResponse deleteUser(Long id);
	
	public ApiResponse deleteUsers();

}
