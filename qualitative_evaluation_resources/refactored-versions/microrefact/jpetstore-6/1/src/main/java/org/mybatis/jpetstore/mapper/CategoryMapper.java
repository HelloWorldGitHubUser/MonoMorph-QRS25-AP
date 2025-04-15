package org.mybatis.jpetstore.mapper;
 import java.util.List;
import org.mybatis.jpetstore.domain.Category;
public interface CategoryMapper {


public List<Category> getCategoryList()
;

public Category getCategory(String categoryId)
;

}