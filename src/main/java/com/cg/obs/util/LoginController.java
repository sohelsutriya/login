/**
 * 
 */
package com.cg.obs.util;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.obs.model.LoginCredential;

/**
 * @author sohel
 *
 */
@RestController
public class LoginController {
	@GetMapping(path = "/login/{username}/{password}")
	public LoginCredential getCredentials(@PathVariable String username, @PathVariable String password) {
		System.out.println("this will return credentials by username and password");
		return new LoginCredential();
	}

	@PostMapping(path = "/login/add")
	public String addCredential(@RequestBody LoginCredential credential) {
		System.out.println("This will add new credential in db");
		return "credentials added";
	}

	@PutMapping(path = "/login/update")
	public String updateCredential(@RequestBody LoginCredential credential) {
		System.out.println("This will update credential");
		return "password updated";
	}
}
