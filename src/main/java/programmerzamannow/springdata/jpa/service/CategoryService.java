package programmerzamannow.springdata.jpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import programmerzamannow.springdata.jpa.entity.Category;
import programmerzamannow.springdata.jpa.repository.CategoryRepository;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    //@Transactional just running in this method
    @Transactional
    public void create(){
        for (int i = 0; i < 5; i++) {
            Category category = new Category();
            category.setName("category ke -" + i);
            categoryRepository.save(category);
        }
        throw new RuntimeException("Upss rollback please"); // seharusnya ini di rollback karena ada error
    }

    public void test(){
        create();
    }
}
