package br.com.wemob.lojavirtual.controller;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Resource;

@Resource
public class HelloController {
	
	@Get("/hello")
	public void hello(){
		System.out.println("So pra testar msm");
	}
	

}
