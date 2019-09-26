package com.seckill.service;

import com.seckill.dto.Exposer;
import com.seckill.dto.SeckillExecution;
import com.seckill.entity.Seckill;
import com.seckill.exception.RepeatKillException;
import com.seckill.exception.SeckillCloseException;
import com.seckill.exception.SeckillException;

import java.util.List;

/**
 * 业务接口:站在使用者(程序员)的角度设计接口
 * 三个方面:1.方法定义粒度，方法定义的要非常清楚
 * 2.参数，要越简练越好
 * 3.返回类型(return类型一定要友好/或者return异常，我们允许的异常)
 */
public interface SeckillService {

    /**
     * 查询全部的秒杀记录
     *
     * @return
     */
    List<Seckill> getSeckillList();

    /**
     * 查询单个秒杀记录
     *
     * @param seckillId
     * @return
     */
    Seckill getById(long seckillId);


    /**
     * 在秒杀开启时输出秒杀接口的地址，否则输出系统时间和秒杀时间
     *
     * @param seckillId 秒杀商品Id
     * @return 根据对应的状态返回对应的状态实体
     */
    // void exportSeckillUrl(long seckillId);
    Exposer exportSeckillUrl(long seckillId);

    /**
     * 执行秒杀操作，有可能失败，有可能成功，所以要抛出我们允许的异常
     *
     * @param seckillId 秒杀的商品ID
     * @param userPhone 手机号码
     * @param md5       md5加密值
     * @return 根据不同的结果返回不同的实体信息
     */
    //  SeckillExecution executeSeckill(long seckillId, long userPhone, String md5);
    SeckillExecution executeSeckill(long seckillId, long userPhone, String md5)
            throws SeckillException, RepeatKillException, SeckillCloseException;


    /**
     * 调用存储过程来执行秒杀操作，不需要抛出异常
     *
     * @param seckillId 秒杀的商品ID
     * @param userPhone 手机号码
     * @param md5       md5加密值
     * @return 根据不同的结果返回不同的实体信息
     */
    SeckillExecution executeSeckillProcedure(long seckillId, long userPhone, String md5);
}
