package org.sid.FeignClient;


import org.sid.common.UserForm;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "CrudApplication" , url = "http://localhost:8011/CrudApplication")
public interface RestAuth {

	
	@PostMapping("/client")
	public UserForm postClientDetails(@RequestBody UserForm userForm);
	
	@PostMapping("/fournisseur")
	public UserForm postFournisseurDetails(@RequestBody UserForm userForm);
	
	
	
	
	
	
	
	
	
	
}
