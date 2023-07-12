package com.josam.clink.user;


import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import lombok.Data;

//@Entity 어노테이션 없어도 되나..?
@Data
@Table(name="user")
public class UserVO {
	@Id
	int userNo;
	String userId;
	String userName;
	String nickname;
	String pwd;
	String email;
	String phoneNumber;
	String photoUrl;
	int status;
}
