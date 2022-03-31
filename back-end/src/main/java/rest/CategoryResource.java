package rest;


import entities.Category;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.CategoryService;

import java.util.List;

@RestController
@RequestMapping(value = "/api/categories")
@RequiredArgsConstructor
public class CategoryResource {

    private final CategoryService categoryService;

    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
        List<Category> listaCategory = categoryService.findAll();
        return ResponseEntity.ok().body(listaCategory);
    }
}
