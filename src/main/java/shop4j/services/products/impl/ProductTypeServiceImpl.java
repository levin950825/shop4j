package shop4j.services.products.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shop4j.dao.products.ProductTypeMapper;
import shop4j.models.products.ProductType;
import shop4j.models.products.SearchMoney;
import shop4j.services.base.BaseServiceImpl;
import shop4j.services.products.ProductTypeService;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @Author: weixuedong
 * @Date: 2018/4/22 21:56
 * @Description:产品类型业务实现
 */
@Service
public class ProductTypeServiceImpl extends BaseServiceImpl<ProductType> implements ProductTypeService {

}
