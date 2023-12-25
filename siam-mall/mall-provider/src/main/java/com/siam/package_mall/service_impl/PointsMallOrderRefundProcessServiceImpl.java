package com.siam.package_mall.service_impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.siam.package_mall.mapper.PointsMallOrderMapper;
import com.siam.package_mall.mapper.PointsMallOrderRefundProcessMapper;
import com.siam.package_mall.service.PointsMallOrderRefundProcessService;
import com.siam.package_mall.entity.PointsMallOrderRefundProcess;
import com.siam.package_mall.model.example.PointsMallOrderRefundProcessExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class PointsMallOrderRefundProcessServiceImpl implements PointsMallOrderRefundProcessService {

    @Autowired
    private PointsMallOrderRefundProcessMapper orderRefundProcessMapper;

    @Autowired
    private PointsMallOrderMapper orderMapper;

    public int countByExample(PointsMallOrderRefundProcessExample example){
        return orderRefundProcessMapper.countByExample(example);
    }

    public void deleteByPrimaryKey(Integer id){
        orderRefundProcessMapper.deleteByPrimaryKey(id);
    }

    public void insertSelective(PointsMallOrderRefundProcess record){
        orderRefundProcessMapper.insertSelective(record);
    }

    public List<PointsMallOrderRefundProcess> selectByExample(PointsMallOrderRefundProcessExample example){
        return orderRefundProcessMapper.selectByExample(example);
    }

    public PointsMallOrderRefundProcess selectByPrimaryKey(Integer id){
        return orderRefundProcessMapper.selectByPrimaryKey(id);
    }

    public void updateByExampleSelective(PointsMallOrderRefundProcess record, PointsMallOrderRefundProcessExample example){
        orderRefundProcessMapper.updateByExampleSelective(record, example);
    }

    public void updateByPrimaryKeySelective(PointsMallOrderRefundProcess record){
        orderRefundProcessMapper.updateByPrimaryKeySelective(record);
    }

    public Page getListByPage(int pageNo, int pageSize, PointsMallOrderRefundProcess orderRefundProcess) {
        Page<Map<String, Object>> page = orderRefundProcessMapper.getListByPage(new Page(pageNo, pageSize), orderRefundProcess);
        return page;
    }

    @Override
    public List<PointsMallOrderRefundProcess> selectByPointsMallOrderRefundId(Integer orderRefundId) {
        return orderRefundProcessMapper.selectByPointsMallOrderRefundId(orderRefundId);
    }
}