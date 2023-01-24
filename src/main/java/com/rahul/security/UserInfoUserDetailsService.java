//package com.rahul.security;
//
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Component;
//
//import com.rahul.entity.UserInfo;
//import com.rahul.repository.UserRepo;
//
//@Component
//public class UserInfoUserDetailsService implements UserDetailsService {
//	
//	@Autowired
//	private UserRepo repo;
//
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		
//		Optional<UserInfo> userinfo=repo.findByName(username);
//		
//		return userinfo.map(UserInfoDetail::new).orElseThrow(null);
//		
//	}
//
//}
