package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VulnerableJavaAppApplication {

	public static void main(String[] args) {
		String password = "07298a76-2a0d-4d83-be18-4b8f50afd2cc";
		String secret = "Pcwn)TDs8PC:!.X3mn^cmVQ0@q8~mRooKpX-K0E,f7)Thh}._BTA,-Q]rfn@y5cfX5xt4CY=}U=yDjJ}*BY!+P0JNf],";
		SpringApplication.run(VulnerableJavaAppApplication.class, args);
	}

}
