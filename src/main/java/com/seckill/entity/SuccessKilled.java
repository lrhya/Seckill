package com.seckill.entity;

import java.util.Date;

public class SuccessKilled {

    private short state; //用户秒杀商品状态

    private Date createTime;   //用户秒杀商品时间

    private Long seckillId;   //秒杀商品id

    private Long userPhone;  //用户手机号

    // 多对一,因为一件商品在库存中有很多数量，对应的购买明细也有很多。
    private Seckill seckill;

    public Seckill getSeckill() {
        return seckill;
    }

    public void setSeckill(Seckill seckill) {
        this.seckill = seckill;
    }

    public Long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(Long seckillId) {
        this.seckillId = seckillId;
    }

    public Long getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(Long userPhone) {
        this.userPhone = userPhone;
    }

    public Short getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "SuccessKilled{" +
                "state=" + state +
                ", createTime=" + createTime +
                ", seckillId=" + seckillId +
                ", userPhone=" + userPhone +
                '}';
    }
}