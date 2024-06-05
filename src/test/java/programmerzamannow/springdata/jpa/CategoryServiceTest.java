package programmerzamannow.springdata.jpa;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import programmerzamannow.springdata.jpa.service.CategoryService;

@SpringBootTest
public class CategoryServiceTest {
    @Autowired
    private CategoryService categoryService;

    // create akan di rollback
    // karena yang memanggil create merupakan objek dari luar kelasnya
    // konsep spring aop
    @Test
    void create(){
        assertThrows(RuntimeException.class, ()->{
            categoryService.create();
        });
    }

    // create tidak akan di rollback
    // karena yang memanggil create merupakan objek dari dalam kelasnya atau objek yang sama
    // konsep spring aop
    @Test
    void failed(){
        assertThrows(RuntimeException.class, ()->{
            categoryService.test();
        });
    }
}
