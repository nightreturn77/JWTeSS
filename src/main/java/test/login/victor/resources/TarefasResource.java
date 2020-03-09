package test.login.victor.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import test.login.victor.entities.Tarefas;
import test.login.victor.services.TarefasService;

@RestController
@RequestMapping("/tarefas")
public class TarefasResource {
	
	
	@Autowired
	TarefasService service; 
	
	
	
	@GetMapping
	public ResponseEntity<List<Tarefas>> findAll(){ 
		List<Tarefas> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<Tarefas> findById(@PathVariable Long id){ 
		Tarefas obj = service.findById(id); 
		return ResponseEntity.ok().body(obj);
	}
	
	
	
	
	
	
	
	

}
