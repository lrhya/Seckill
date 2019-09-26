# Seckill

![AJMSv4.png](https://s2.ax1x.com/2019/03/23/AJMSv4.png)



## 项目介绍

![plateform](https://img.shields.io/badge/plateform-windows-lightgrey.svg) 
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ%20IDEA-2018.2.7-8B0000.svg) 
![JDK](https://img.shields.io/badge/JDK-1.8.0_121-3A5FCD.svg) 
![Maven](https://img.shields.io/badge/Maven-3.6.0-ff69b4.svg) 
![MySQL](https://img.shields.io/badge/MySQL-5.7.21-20B2AA.svg) 
![Redis](https://img.shields.io/badge/Redis-3.2.100-20B2AA.svg) 
![SSM](https://img.shields.io/badge/SSM-framework-brightgreen.svg) 
![build](https://img.shields.io/badge/build-passing-brightgreen.svg) 

本项目是使用SSM框架开发的高并发限时秒杀web应用。

**项目功能介绍：**

- 商品秒杀开启前，用户能看到商品秒杀倒计时，但不能进行秒杀。

- 商品秒杀开启时，可以进行秒杀但不能进行重复秒杀。

- 商品秒杀结束后，显示商品秒杀已结束，阻止用户进行秒杀。

  

**项目功能演示：**

![AJuvXd.gif](https://s2.ax1x.com/2019/03/23/AJuvXd.gif)



## 特性

- 简易限时秒杀 Web 应用。秒杀开启前显示商品秒杀倒计时；开启时允许用户执行秒杀，但不允许用户重复秒杀同一件商品；结束后显示商品秒杀已结束，并关闭秒杀URL
- 使用 SSM 框架开发后端业务，采用 RESTful 风格接口设计，并使用 JSON 交互数据
- 使用 MD5 混淆秒杀链接，从而防止用户破解秒杀接口提前秒杀
- 使用 Redis 缓存热点数据，减少对数据库的访问，提高页面响应时间
- 使用存储过程执行秒杀操作，减少数据库行级锁时间，提高SQL语句执行速度



## 开发技术

- 前端技术 ：Bootstrap + jQuery 
- 后端技术 ：Spring + SpringMVC + MyBatis 
- 依赖管理：Maven
- 版本控制：Git
- 数据库： MySQL + Redis
- 服务器： Tomcat



## 开发工具

IntelliJ IDEA + MySQL + Git + Chrome



## 安装

1. git clone `https://github.com/lrhya/Seckill.git`或者`Download Zip`
2. 打开IDEA --> File --> New --> Open
3. 项目导入后，打开 Project Settings -->Project 设置 Project SDK (本项目JDK版本需在1.8以上)
4. 打开File --> Settings --> Build,Execution,Deployment -->Maven 配置maven相关信息
5. 在 sql 包下，执行 seckill.sql 与 execute_seckill.sql，建立数据库，然后找到 jdbc.properties 文件修改username and password

**项目启动过程：**

- 启动 MySQL，启动 Redis
- 为项目添加 tomacat 服务器，部署项目并运行
- 打开浏览器进入 `http://localhost:8080/seckill/list`
- 成功