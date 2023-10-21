# 个人通联日志管理



API接口列表:

| 接口路径   | 参数            | 返回值             |
| ---------- | --------------- | ------------------ |
| /getAllLog | /               | 所有日志的json数据 |
| /addLog    | Log类的所有属性 | success / fail     |



调用测试用例:

http://localhost:8081/getAllLog

参数： NULL

返回值：

```json
{
    "msg": "",
    "code": 0,
    "data": [
        {
            "ant": "GP",
            "frequency": "438.900",
            "id": 27,
            "mode": "FM",
            "myPower": "25",
            "myRadio": "BG6SNR",
            "myRst": "59+",
            "qth": "湖北省武汉市武汉东湖学院",
            "rig": "宝锋UV-5R",
            "time": "2023-10-20 14:26",
            "toPower": "5",
            "toRadio": "BG6SOE",
            "toRst": "59+"
        }
    ],
    "count": 1
}
```



http://localhost:8081/addLog

参数:

```
toRadio = BG6SOE
frequency = 438.900
mode = FM
myRst = 59+
toRst = 59+
myPower = 25
toPower = 25
qth = 湖北省武汉市南湖大道
rig = 摩托罗拉GP88
ant = 原装天线
myRadio = BG6SNR
time = 2023-10-20 20:48
id = 0
```

返回值: success



导入ham.sql文件

将项目使用IDEA打开，修改数据库信息之后打包之后修改名字放入tomcat的webapp中访问目录下的项目即可

