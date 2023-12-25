package com.siam.package_mall.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.siam.package_mall.entity.PointsMallFullReductionRule;

import java.util.List;

public interface PointsMallFullReductionRuleService {

    void deleteByPrimaryKey(Integer id);

    void insertSelective(PointsMallFullReductionRule fullReductionRule);

    PointsMallFullReductionRule selectByPrimaryKey(Integer id);

    void updateByPrimaryKeySelective(PointsMallFullReductionRule fullReductionRule);

    Page<PointsMallFullReductionRule> getListByPage(int pageNo, int pageSize, PointsMallFullReductionRule fullReductionRule);

    List<PointsMallFullReductionRule> selectByShopId(PointsMallFullReductionRule fullReductionRule);
}
