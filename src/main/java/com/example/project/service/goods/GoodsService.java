package com.example.project.service.goods;

import com.example.project.domain.goods.Goods;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2015/12/23 0023.
 */
@Service
public interface GoodsService {

    /**
     * 创建对象
     */
    void create();

    /**
     * 创建对象
     */
    List<Goods> findAllGoods();
}
