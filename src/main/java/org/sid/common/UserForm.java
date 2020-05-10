package org.sid.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserForm {

	 private String username;
	    private String password;
	    private String confirmedPassword;
	    private String phoneNumber ;
	    private String gender;
	    private String address;
	    private String cin ;
	
	}
