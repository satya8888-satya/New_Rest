package com.banking.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User_Request {
	private String fname;
	private String lname;
	private String city;
	private String state;
	private long mobile;
	private String status;

}
