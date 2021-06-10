# 电子商城的Demo

### 本项目只是搭建起了基础的框架，还有较多需要更改的地方

### JWT部分
还未实现

### Controller部分
因为我已经写的请求还不是很多，所以还未把Controller分开，只是笼统地写了一个controller，会马上改

### 其它各层都还差Cart的相关实现

### 关于领域模型
  之所以本周的进度比较落后，直接表现是项目的业务部分实现很大的缺漏，
是因为本周我花了较多的时间去墙内墙外去翻阅了很多关于领域模型的设计之类的文献和资料，
这是我之前在学校从未接触过的东西，所以这次花了很多时间去思考架构的设计，最后是根据自己的理解
写了部分的pojo类，但是感觉还是有所欠缺，这是我本周的工作中心。

### 关于业务细节
我会尽快完善

目前的项目结构
```

├─src
│  ├─main
│  │  ├─java
│  │  │  └─com
│  │  │      └─boss
│  │  │          └─mystore
│  │  │              │  MystoreApplication.java
│  │  │              │
│  │  │              ├─controller
│  │  │              │      StoreController.java
│  │  │              │
│  │  │              ├─mapper
│  │  │              │      AccountMapper.java
│  │  │              │      ItemMapper.java
│  │  │              │      OrderMapper.java
│  │  │              │
│  │  │              ├─pojo
│  │  │              │  ├─dto
│  │  │              │  │      AccountDTO.java
│  │  │              │  │      ItemDTO.java
│  │  │              │  │
│  │  │              │  ├─po
│  │  │              │  │      Account.java
│  │  │              │  │      Cart.java
│  │  │              │  │      Item.java
│  │  │              │  │      Order.java
│  │  │              │  │
│  │  │              │  └─vo
│  │  │              │          AccountInfoVO.java
│  │  │              │          LoginVO.java
│  │  │              │          OrderVO.java
│  │  │              │
│  │  │              ├─response
│  │  │              │  │  JSONResult.java
│  │  │              │  │
│  │  │              │  └─constant
│  │  │              │          CodeEnum.java
│  │  │              │          MessageEnum.java
│  │  │              │
│  │  │              ├─service
│  │  │              │  │  AccountService.java
│  │  │              │  │  ItemService.java
│  │  │              │  │  OrderService.java
│  │  │              │  │
│  │  │              │  └─implement
│  │  │              │          AccountServiceImpl.java
│  │  │              │          ItemServiceImpl.java
│  │  │              │          OrderServiceImpl.java
│  │  │              │
│  │  │              └─util
│  │  │                      GenerateUUID.java
```