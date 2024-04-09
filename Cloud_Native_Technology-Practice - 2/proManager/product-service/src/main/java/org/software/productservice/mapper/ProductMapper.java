package org.software.productservice.mapper;
import org.apache.ibatis.annotations.Mapper;
import org.software.productservice.po.Product;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import java.util.List;
@Mapper
public interface ProductMapper {
    @Select("select p.product_name as productName,p.price as price from product p where id = #{productId}")
            Product findByProductId(@Param("productId") Long productId);
    @Select("select p.id,p.product_name as productName,p.price as price from product p")
            List<Product> queryAllProduct();
}