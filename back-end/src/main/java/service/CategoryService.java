package service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import repository.CategoryRepository;
import service.DTO.CategoryDTO;
import service.Mapper.CategoryMapper;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryMapper mapper;
    private final CategoryRepository categoryRepository;

    public List<CategoryDTO> findAll(){
        return mapper.toDTO(categoryRepository.findAll());
    }

    public CategoryDTO findById(Long id){
        return mapper.toDTO(categoryRepository.getById(id));
    }
}
