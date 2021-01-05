# aquacltureserver

# Aquacltureserver APIs


**简介**:Aquacltureserver APIs


**HOST**:127.0.0.1:8080


**联系人**:


**Version**:1.0


**接口路径**:undefined


[TOC]






# 折旧维护数据管理


## 添加折旧维护数据


**接口地址**:`/depreciationMaintenance/addOne`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"id": 0,
	"newimg": "",
	"ordimg": "",
	"projectName": "",
	"spending": {},
	"why": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|depreciationMaintenance|depreciationMaintenance|body|true|折旧维护数据库实体类|折旧维护数据库实体类|
|&emsp;&emsp;id| 自增ID||false|integer(int32)||
|&emsp;&emsp;newimg|新照片||false|string||
|&emsp;&emsp;ordimg|旧照片||false|string||
|&emsp;&emsp;projectName|项目名称||false|string||
|&emsp;&emsp;spending|花费||false|object||
|&emsp;&emsp;why|维护原因||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- |
|200|OK|折旧维护数据库实体类|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- |
|id| 自增ID|integer(int32)|integer(int32)|
|newimg|新照片|string||
|ordimg|旧照片|string||
|projectName|项目名称|string||
|spending|花费|object||
|why|维护原因|string||


**响应示例**:
```javascript
{
	"id": 0,
	"newimg": "",
	"ordimg": "",
	"projectName": "",
	"spending": {},
	"why": ""
}
```


## 通过ID删除折旧维护数据


**接口地址**:`/depreciationMaintenance/deleteOne`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"id": 0,
	"newimg": "",
	"ordimg": "",
	"projectName": "",
	"spending": {},
	"why": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|depreciationMaintenance|depreciationMaintenance|body|true|折旧维护数据库实体类|折旧维护数据库实体类|
|&emsp;&emsp;id| 自增ID||false|integer(int32)||
|&emsp;&emsp;newimg|新照片||false|string||
|&emsp;&emsp;ordimg|旧照片||false|string||
|&emsp;&emsp;projectName|项目名称||false|string||
|&emsp;&emsp;spending|花费||false|object||
|&emsp;&emsp;why|维护原因||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- |
|200|OK||
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


暂无


**响应示例**:
```javascript

```


## 查询全部折旧维护数据


**接口地址**:`/depreciationMaintenance/queryAll`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- |
|200|OK|折旧维护数据库实体类|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- |
|id| 自增ID|integer(int32)|integer(int32)|
|newimg|新照片|string||
|ordimg|旧照片|string||
|projectName|项目名称|string||
|spending|花费|object||
|why|维护原因|string||


**响应示例**:
```javascript
[
	{
		"id": 0,
		"newimg": "",
		"ordimg": "",
		"projectName": "",
		"spending": {},
		"why": ""
	}
]
```


## 通过ID查询折旧维护数据


**接口地址**:`/depreciationMaintenance/selectOne`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"id": 0,
	"newimg": "",
	"ordimg": "",
	"projectName": "",
	"spending": {},
	"why": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|depreciationMaintenance|depreciationMaintenance|body|true|折旧维护数据库实体类|折旧维护数据库实体类|
|&emsp;&emsp;id| 自增ID||false|integer(int32)||
|&emsp;&emsp;newimg|新照片||false|string||
|&emsp;&emsp;ordimg|旧照片||false|string||
|&emsp;&emsp;projectName|项目名称||false|string||
|&emsp;&emsp;spending|花费||false|object||
|&emsp;&emsp;why|维护原因||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- |
|200|OK|折旧维护数据库实体类|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- |
|id| 自增ID|integer(int32)|integer(int32)|
|newimg|新照片|string||
|ordimg|旧照片|string||
|projectName|项目名称|string||
|spending|花费|object||
|why|维护原因|string||


**响应示例**:
```javascript
{
	"id": 0,
	"newimg": "",
	"ordimg": "",
	"projectName": "",
	"spending": {},
	"why": ""
}
```


## 更新信息


**接口地址**:`/depreciationMaintenance/updateOne`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"id": 0,
	"newimg": "",
	"ordimg": "",
	"projectName": "",
	"spending": {},
	"why": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|depreciationMaintenance|depreciationMaintenance|body|true|折旧维护数据库实体类|折旧维护数据库实体类|
|&emsp;&emsp;id| 自增ID||false|integer(int32)||
|&emsp;&emsp;newimg|新照片||false|string||
|&emsp;&emsp;ordimg|旧照片||false|string||
|&emsp;&emsp;projectName|项目名称||false|string||
|&emsp;&emsp;spending|花费||false|object||
|&emsp;&emsp;why|维护原因||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- |
|200|OK|折旧维护数据库实体类|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- |
|id| 自增ID|integer(int32)|integer(int32)|
|newimg|新照片|string||
|ordimg|旧照片|string||
|projectName|项目名称|string||
|spending|花费|object||
|why|维护原因|string||


**响应示例**:
```javascript
{
	"id": 0,
	"newimg": "",
	"ordimg": "",
	"projectName": "",
	"spending": {},
	"why": ""
}
```


# 员工管理


## 添加员工


**接口地址**:`/staff/addOne`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"entryDate": "",
	"id": 0,
	"idCardNumber": "",
	"isSeparation": 0,
	"name": "",
	"phoneNumber": "",
	"positionId": 0,
	"separationDate": "",
	"wage": 0
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|staff|staff|body|true|员工表实体类|员工表实体类|
|&emsp;&emsp;entryDate|入职日期||false|string(date-time)||
|&emsp;&emsp;id|自增ID||false|integer(int32)||
|&emsp;&emsp;idCardNumber|身份证号码||false|string||
|&emsp;&emsp;isSeparation|是否离职||false|integer(int32)||
|&emsp;&emsp;name|姓名||false|string||
|&emsp;&emsp;phoneNumber|联系方式||false|string||
|&emsp;&emsp;positionId|职位||false|integer(int32)||
|&emsp;&emsp;separationDate|离职日期||false|string(date-time)||
|&emsp;&emsp;wage|工资||false|number(double)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- |
|200|OK|员工表实体类|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- |
|entryDate|入职日期|string(date-time)|string(date-time)|
|id|自增ID|integer(int32)|integer(int32)|
|idCardNumber|身份证号码|string||
|isSeparation|是否离职|integer(int32)|integer(int32)|
|name|姓名|string||
|phoneNumber|联系方式|string||
|positionId|职位|integer(int32)|integer(int32)|
|separationDate|离职日期|string(date-time)|string(date-time)|
|wage|工资|number(double)|number(double)|


**响应示例**:
```javascript
{
	"entryDate": "",
	"id": 0,
	"idCardNumber": "",
	"isSeparation": 0,
	"name": "",
	"phoneNumber": "",
	"positionId": 0,
	"separationDate": "",
	"wage": 0
}
```


## 通过ID删除员工信息


**接口地址**:`/staff/deleteOne`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"entryDate": "",
	"id": 0,
	"idCardNumber": "",
	"isSeparation": 0,
	"name": "",
	"phoneNumber": "",
	"positionId": 0,
	"separationDate": "",
	"wage": 0
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|staff|staff|body|true|员工表实体类|员工表实体类|
|&emsp;&emsp;entryDate|入职日期||false|string(date-time)||
|&emsp;&emsp;id|自增ID||false|integer(int32)||
|&emsp;&emsp;idCardNumber|身份证号码||false|string||
|&emsp;&emsp;isSeparation|是否离职||false|integer(int32)||
|&emsp;&emsp;name|姓名||false|string||
|&emsp;&emsp;phoneNumber|联系方式||false|string||
|&emsp;&emsp;positionId|职位||false|integer(int32)||
|&emsp;&emsp;separationDate|离职日期||false|string(date-time)||
|&emsp;&emsp;wage|工资||false|number(double)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- |
|200|OK||
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


暂无


**响应示例**:
```javascript

```


## 办理员工离职


**接口地址**:`/staff/employeeResignation`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"entryDate": "",
	"id": 0,
	"idCardNumber": "",
	"isSeparation": 0,
	"name": "",
	"phoneNumber": "",
	"positionId": 0,
	"separationDate": "",
	"wage": 0
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|staff|staff|body|true|员工表实体类|员工表实体类|
|&emsp;&emsp;entryDate|入职日期||false|string(date-time)||
|&emsp;&emsp;id|自增ID||false|integer(int32)||
|&emsp;&emsp;idCardNumber|身份证号码||false|string||
|&emsp;&emsp;isSeparation|是否离职||false|integer(int32)||
|&emsp;&emsp;name|姓名||false|string||
|&emsp;&emsp;phoneNumber|联系方式||false|string||
|&emsp;&emsp;positionId|职位||false|integer(int32)||
|&emsp;&emsp;separationDate|离职日期||false|string(date-time)||
|&emsp;&emsp;wage|工资||false|number(double)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- |
|200|OK|员工表实体类|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- |
|entryDate|入职日期|string(date-time)|string(date-time)|
|id|自增ID|integer(int32)|integer(int32)|
|idCardNumber|身份证号码|string||
|isSeparation|是否离职|integer(int32)|integer(int32)|
|name|姓名|string||
|phoneNumber|联系方式|string||
|positionId|职位|integer(int32)|integer(int32)|
|separationDate|离职日期|string(date-time)|string(date-time)|
|wage|工资|number(double)|number(double)|


**响应示例**:
```javascript
{
	"entryDate": "",
	"id": 0,
	"idCardNumber": "",
	"isSeparation": 0,
	"name": "",
	"phoneNumber": "",
	"positionId": 0,
	"separationDate": "",
	"wage": 0
}
```


## 查询全部员工


**接口地址**:`/staff/queryAll`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- |
|200|OK|员工表实体类|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- |
|entryDate|入职日期|string(date-time)|string(date-time)|
|id|自增ID|integer(int32)|integer(int32)|
|idCardNumber|身份证号码|string||
|isSeparation|是否离职|integer(int32)|integer(int32)|
|name|姓名|string||
|phoneNumber|联系方式|string||
|positionId|职位|integer(int32)|integer(int32)|
|separationDate|离职日期|string(date-time)|string(date-time)|
|wage|工资|number(double)|number(double)|


**响应示例**:
```javascript
[
	{
		"entryDate": "",
		"id": 0,
		"idCardNumber": "",
		"isSeparation": 0,
		"name": "",
		"phoneNumber": "",
		"positionId": 0,
		"separationDate": "",
		"wage": 0
	}
]
```


## 关键字IDCard查询员工


**接口地址**:`/staff/queryByIDCard`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"entryDate": "",
	"id": 0,
	"idCardNumber": "",
	"isSeparation": 0,
	"name": "",
	"phoneNumber": "",
	"positionId": 0,
	"separationDate": "",
	"wage": 0
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|staff|staff|body|true|员工表实体类|员工表实体类|
|&emsp;&emsp;entryDate|入职日期||false|string(date-time)||
|&emsp;&emsp;id|自增ID||false|integer(int32)||
|&emsp;&emsp;idCardNumber|身份证号码||false|string||
|&emsp;&emsp;isSeparation|是否离职||false|integer(int32)||
|&emsp;&emsp;name|姓名||false|string||
|&emsp;&emsp;phoneNumber|联系方式||false|string||
|&emsp;&emsp;positionId|职位||false|integer(int32)||
|&emsp;&emsp;separationDate|离职日期||false|string(date-time)||
|&emsp;&emsp;wage|工资||false|number(double)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- |
|200|OK|员工表实体类|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- |
|entryDate|入职日期|string(date-time)|string(date-time)|
|id|自增ID|integer(int32)|integer(int32)|
|idCardNumber|身份证号码|string||
|isSeparation|是否离职|integer(int32)|integer(int32)|
|name|姓名|string||
|phoneNumber|联系方式|string||
|positionId|职位|integer(int32)|integer(int32)|
|separationDate|离职日期|string(date-time)|string(date-time)|
|wage|工资|number(double)|number(double)|


**响应示例**:
```javascript
[
	{
		"entryDate": "",
		"id": 0,
		"idCardNumber": "",
		"isSeparation": 0,
		"name": "",
		"phoneNumber": "",
		"positionId": 0,
		"separationDate": "",
		"wage": 0
	}
]
```


## 关键字Name查询员工


**接口地址**:`/staff/queryByName`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"entryDate": "",
	"id": 0,
	"idCardNumber": "",
	"isSeparation": 0,
	"name": "",
	"phoneNumber": "",
	"positionId": 0,
	"separationDate": "",
	"wage": 0
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|staff|staff|body|true|员工表实体类|员工表实体类|
|&emsp;&emsp;entryDate|入职日期||false|string(date-time)||
|&emsp;&emsp;id|自增ID||false|integer(int32)||
|&emsp;&emsp;idCardNumber|身份证号码||false|string||
|&emsp;&emsp;isSeparation|是否离职||false|integer(int32)||
|&emsp;&emsp;name|姓名||false|string||
|&emsp;&emsp;phoneNumber|联系方式||false|string||
|&emsp;&emsp;positionId|职位||false|integer(int32)||
|&emsp;&emsp;separationDate|离职日期||false|string(date-time)||
|&emsp;&emsp;wage|工资||false|number(double)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- |
|200|OK|员工表实体类|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- |
|entryDate|入职日期|string(date-time)|string(date-time)|
|id|自增ID|integer(int32)|integer(int32)|
|idCardNumber|身份证号码|string||
|isSeparation|是否离职|integer(int32)|integer(int32)|
|name|姓名|string||
|phoneNumber|联系方式|string||
|positionId|职位|integer(int32)|integer(int32)|
|separationDate|离职日期|string(date-time)|string(date-time)|
|wage|工资|number(double)|number(double)|


**响应示例**:
```javascript
[
	{
		"entryDate": "",
		"id": 0,
		"idCardNumber": "",
		"isSeparation": 0,
		"name": "",
		"phoneNumber": "",
		"positionId": 0,
		"separationDate": "",
		"wage": 0
	}
]
```


## 关键字PhoneNUmber查询员工


**接口地址**:`/staff/queryByPhoneNumber`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"entryDate": "",
	"id": 0,
	"idCardNumber": "",
	"isSeparation": 0,
	"name": "",
	"phoneNumber": "",
	"positionId": 0,
	"separationDate": "",
	"wage": 0
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|staff|staff|body|true|员工表实体类|员工表实体类|
|&emsp;&emsp;entryDate|入职日期||false|string(date-time)||
|&emsp;&emsp;id|自增ID||false|integer(int32)||
|&emsp;&emsp;idCardNumber|身份证号码||false|string||
|&emsp;&emsp;isSeparation|是否离职||false|integer(int32)||
|&emsp;&emsp;name|姓名||false|string||
|&emsp;&emsp;phoneNumber|联系方式||false|string||
|&emsp;&emsp;positionId|职位||false|integer(int32)||
|&emsp;&emsp;separationDate|离职日期||false|string(date-time)||
|&emsp;&emsp;wage|工资||false|number(double)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- |
|200|OK|员工表实体类|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- |
|entryDate|入职日期|string(date-time)|string(date-time)|
|id|自增ID|integer(int32)|integer(int32)|
|idCardNumber|身份证号码|string||
|isSeparation|是否离职|integer(int32)|integer(int32)|
|name|姓名|string||
|phoneNumber|联系方式|string||
|positionId|职位|integer(int32)|integer(int32)|
|separationDate|离职日期|string(date-time)|string(date-time)|
|wage|工资|number(double)|number(double)|


**响应示例**:
```javascript
[
	{
		"entryDate": "",
		"id": 0,
		"idCardNumber": "",
		"isSeparation": 0,
		"name": "",
		"phoneNumber": "",
		"positionId": 0,
		"separationDate": "",
		"wage": 0
	}
]
```


## 查询在职员工


**接口地址**:`/staff/queryOnJob`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"entryDate": "",
	"id": 0,
	"idCardNumber": "",
	"isSeparation": 0,
	"name": "",
	"phoneNumber": "",
	"positionId": 0,
	"separationDate": "",
	"wage": 0
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|staff|staff|body|true|员工表实体类|员工表实体类|
|&emsp;&emsp;entryDate|入职日期||false|string(date-time)||
|&emsp;&emsp;id|自增ID||false|integer(int32)||
|&emsp;&emsp;idCardNumber|身份证号码||false|string||
|&emsp;&emsp;isSeparation|是否离职||false|integer(int32)||
|&emsp;&emsp;name|姓名||false|string||
|&emsp;&emsp;phoneNumber|联系方式||false|string||
|&emsp;&emsp;positionId|职位||false|integer(int32)||
|&emsp;&emsp;separationDate|离职日期||false|string(date-time)||
|&emsp;&emsp;wage|工资||false|number(double)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- |
|200|OK|员工表实体类|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- |
|entryDate|入职日期|string(date-time)|string(date-time)|
|id|自增ID|integer(int32)|integer(int32)|
|idCardNumber|身份证号码|string||
|isSeparation|是否离职|integer(int32)|integer(int32)|
|name|姓名|string||
|phoneNumber|联系方式|string||
|positionId|职位|integer(int32)|integer(int32)|
|separationDate|离职日期|string(date-time)|string(date-time)|
|wage|工资|number(double)|number(double)|


**响应示例**:
```javascript
[
	{
		"entryDate": "",
		"id": 0,
		"idCardNumber": "",
		"isSeparation": 0,
		"name": "",
		"phoneNumber": "",
		"positionId": 0,
		"separationDate": "",
		"wage": 0
	}
]
```


## 查询离职员工


**接口地址**:`/staff/queryResignedEmployees`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"entryDate": "",
	"id": 0,
	"idCardNumber": "",
	"isSeparation": 0,
	"name": "",
	"phoneNumber": "",
	"positionId": 0,
	"separationDate": "",
	"wage": 0
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|staff|staff|body|true|员工表实体类|员工表实体类|
|&emsp;&emsp;entryDate|入职日期||false|string(date-time)||
|&emsp;&emsp;id|自增ID||false|integer(int32)||
|&emsp;&emsp;idCardNumber|身份证号码||false|string||
|&emsp;&emsp;isSeparation|是否离职||false|integer(int32)||
|&emsp;&emsp;name|姓名||false|string||
|&emsp;&emsp;phoneNumber|联系方式||false|string||
|&emsp;&emsp;positionId|职位||false|integer(int32)||
|&emsp;&emsp;separationDate|离职日期||false|string(date-time)||
|&emsp;&emsp;wage|工资||false|number(double)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- |
|200|OK|员工表实体类|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- |
|entryDate|入职日期|string(date-time)|string(date-time)|
|id|自增ID|integer(int32)|integer(int32)|
|idCardNumber|身份证号码|string||
|isSeparation|是否离职|integer(int32)|integer(int32)|
|name|姓名|string||
|phoneNumber|联系方式|string||
|positionId|职位|integer(int32)|integer(int32)|
|separationDate|离职日期|string(date-time)|string(date-time)|
|wage|工资|number(double)|number(double)|


**响应示例**:
```javascript
[
	{
		"entryDate": "",
		"id": 0,
		"idCardNumber": "",
		"isSeparation": 0,
		"name": "",
		"phoneNumber": "",
		"positionId": 0,
		"separationDate": "",
		"wage": 0
	}
]
```


## 通过ID查询单一员工


**接口地址**:`/staff/selectOne`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"entryDate": "",
	"id": 0,
	"idCardNumber": "",
	"isSeparation": 0,
	"name": "",
	"phoneNumber": "",
	"positionId": 0,
	"separationDate": "",
	"wage": 0
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|staff|staff|body|true|员工表实体类|员工表实体类|
|&emsp;&emsp;entryDate|入职日期||false|string(date-time)||
|&emsp;&emsp;id|自增ID||false|integer(int32)||
|&emsp;&emsp;idCardNumber|身份证号码||false|string||
|&emsp;&emsp;isSeparation|是否离职||false|integer(int32)||
|&emsp;&emsp;name|姓名||false|string||
|&emsp;&emsp;phoneNumber|联系方式||false|string||
|&emsp;&emsp;positionId|职位||false|integer(int32)||
|&emsp;&emsp;separationDate|离职日期||false|string(date-time)||
|&emsp;&emsp;wage|工资||false|number(double)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- |
|200|OK|员工表实体类|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- |
|entryDate|入职日期|string(date-time)|string(date-time)|
|id|自增ID|integer(int32)|integer(int32)|
|idCardNumber|身份证号码|string||
|isSeparation|是否离职|integer(int32)|integer(int32)|
|name|姓名|string||
|phoneNumber|联系方式|string||
|positionId|职位|integer(int32)|integer(int32)|
|separationDate|离职日期|string(date-time)|string(date-time)|
|wage|工资|number(double)|number(double)|


**响应示例**:
```javascript
{
	"entryDate": "",
	"id": 0,
	"idCardNumber": "",
	"isSeparation": 0,
	"name": "",
	"phoneNumber": "",
	"positionId": 0,
	"separationDate": "",
	"wage": 0
}
```


## 员工更新信息


**接口地址**:`/staff/updateOne`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"entryDate": "",
	"id": 0,
	"idCardNumber": "",
	"isSeparation": 0,
	"name": "",
	"phoneNumber": "",
	"positionId": 0,
	"separationDate": "",
	"wage": 0
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|staff|staff|body|true|员工表实体类|员工表实体类|
|&emsp;&emsp;entryDate|入职日期||false|string(date-time)||
|&emsp;&emsp;id|自增ID||false|integer(int32)||
|&emsp;&emsp;idCardNumber|身份证号码||false|string||
|&emsp;&emsp;isSeparation|是否离职||false|integer(int32)||
|&emsp;&emsp;name|姓名||false|string||
|&emsp;&emsp;phoneNumber|联系方式||false|string||
|&emsp;&emsp;positionId|职位||false|integer(int32)||
|&emsp;&emsp;separationDate|离职日期||false|string(date-time)||
|&emsp;&emsp;wage|工资||false|number(double)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- |
|200|OK|员工表实体类|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- |
|entryDate|入职日期|string(date-time)|string(date-time)|
|id|自增ID|integer(int32)|integer(int32)|
|idCardNumber|身份证号码|string||
|isSeparation|是否离职|integer(int32)|integer(int32)|
|name|姓名|string||
|phoneNumber|联系方式|string||
|positionId|职位|integer(int32)|integer(int32)|
|separationDate|离职日期|string(date-time)|string(date-time)|
|wage|工资|number(double)|number(double)|


**响应示例**:
```javascript
{
	"entryDate": "",
	"id": 0,
	"idCardNumber": "",
	"isSeparation": 0,
	"name": "",
	"phoneNumber": "",
	"positionId": 0,
	"separationDate": "",
	"wage": 0
}
```


# 职位管理


## 添加职位


**接口地址**:`/position/addPositionl`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"descriptionPosition": "",
	"position": "",
	"positionid": 0
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|position|position|body|true|职位表实体类|职位表实体类|
|&emsp;&emsp;descriptionPosition|职位描述||false|string||
|&emsp;&emsp;position|职位名称||false|string||
|&emsp;&emsp;positionid|自增ID||false|integer(int32)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- |
|200|OK|职位表实体类|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- |
|descriptionPosition|职位描述|string||
|position|职位名称|string||
|positionid|自增ID|integer(int32)|integer(int32)|


**响应示例**:
```javascript
{
	"descriptionPosition": "",
	"position": "",
	"positionid": 0
}
```


## 删除职位


**接口地址**:`/position/deletePositionl`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"descriptionPosition": "",
	"position": "",
	"positionid": 0
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|position|position|body|true|职位表实体类|职位表实体类|
|&emsp;&emsp;descriptionPosition|职位描述||false|string||
|&emsp;&emsp;position|职位名称||false|string||
|&emsp;&emsp;positionid|自增ID||false|integer(int32)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- |
|200|OK||
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


暂无


**响应示例**:
```javascript

```


## 查询所有职位


**接口地址**:`/position/selectAll`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- |
|200|OK|职位表实体类|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- |
|descriptionPosition|职位描述|string||
|position|职位名称|string||
|positionid|自增ID|integer(int32)|integer(int32)|


**响应示例**:
```javascript
[
	{
		"descriptionPosition": "",
		"position": "",
		"positionid": 0
	}
]
```


## 职位查询


**接口地址**:`/position/selectOne`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"descriptionPosition": "",
	"position": "",
	"positionid": 0
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|position|position|body|true|职位表实体类|职位表实体类|
|&emsp;&emsp;descriptionPosition|职位描述||false|string||
|&emsp;&emsp;position|职位名称||false|string||
|&emsp;&emsp;positionid|自增ID||false|integer(int32)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- |
|200|OK|职位表实体类|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- |
|descriptionPosition|职位描述|string||
|position|职位名称|string||
|positionid|自增ID|integer(int32)|integer(int32)|


**响应示例**:
```javascript
{
	"descriptionPosition": "",
	"position": "",
	"positionid": 0
}
```


## 更新职位


**接口地址**:`/position/updatePositionl`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"descriptionPosition": "",
	"position": "",
	"positionid": 0
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|position|position|body|true|职位表实体类|职位表实体类|
|&emsp;&emsp;descriptionPosition|职位描述||false|string||
|&emsp;&emsp;position|职位名称||false|string||
|&emsp;&emsp;positionid|自增ID||false|integer(int32)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- |
|200|OK|职位表实体类|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- |
|descriptionPosition|职位描述|string||
|position|职位名称|string||
|positionid|自增ID|integer(int32)|integer(int32)|


**响应示例**:
```javascript
{
	"descriptionPosition": "",
	"position": "",
	"positionid": 0
}
```


# 抽象财务数据管理


## 添加抽象财务数据


**接口地址**:`/abstractFinancialData/addOne`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"id": 0,
	"livestoSpecies": "",
	"number": 0,
	"numberOfChanges": 0,
	"why": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|abstractFinancialData|abstractFinancialData|body|true|抽象财务数据实体类|抽象财务数据实体类|
|&emsp;&emsp;id|自增ID||false|integer(int32)||
|&emsp;&emsp;livestoSpecies|牲畜种类||false|string||
|&emsp;&emsp;number|总值||false|integer(int32)||
|&emsp;&emsp;numberOfChanges|变动数量||false|integer(int32)||
|&emsp;&emsp;why|变动原因||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- |
|200|OK|抽象财务数据实体类|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- |
|id|自增ID|integer(int32)|integer(int32)|
|livestoSpecies|牲畜种类|string||
|number|总值|integer(int32)|integer(int32)|
|numberOfChanges|变动数量|integer(int32)|integer(int32)|
|why|变动原因|string||


**响应示例**:
```javascript
{
	"id": 0,
	"livestoSpecies": "",
	"number": 0,
	"numberOfChanges": 0,
	"why": ""
}
```


## 通过ID删除抽象财务数据


**接口地址**:`/abstractFinancialData/deleteOne`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"id": 0,
	"livestoSpecies": "",
	"number": 0,
	"numberOfChanges": 0,
	"why": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|abstractFinancialData|abstractFinancialData|body|true|抽象财务数据实体类|抽象财务数据实体类|
|&emsp;&emsp;id|自增ID||false|integer(int32)||
|&emsp;&emsp;livestoSpecies|牲畜种类||false|string||
|&emsp;&emsp;number|总值||false|integer(int32)||
|&emsp;&emsp;numberOfChanges|变动数量||false|integer(int32)||
|&emsp;&emsp;why|变动原因||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- |
|200|OK||
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


暂无


**响应示例**:
```javascript

```


## 查询全部抽象财务数据


**接口地址**:`/abstractFinancialData/queryAll`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- |
|200|OK|抽象财务数据实体类|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- |
|id|自增ID|integer(int32)|integer(int32)|
|livestoSpecies|牲畜种类|string||
|number|总值|integer(int32)|integer(int32)|
|numberOfChanges|变动数量|integer(int32)|integer(int32)|
|why|变动原因|string||


**响应示例**:
```javascript
[
	{
		"id": 0,
		"livestoSpecies": "",
		"number": 0,
		"numberOfChanges": 0,
		"why": ""
	}
]
```


## 通过ID查询抽象财务数据


**接口地址**:`/abstractFinancialData/selectOne`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"id": 0,
	"livestoSpecies": "",
	"number": 0,
	"numberOfChanges": 0,
	"why": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|abstractFinancialData|abstractFinancialData|body|true|抽象财务数据实体类|抽象财务数据实体类|
|&emsp;&emsp;id|自增ID||false|integer(int32)||
|&emsp;&emsp;livestoSpecies|牲畜种类||false|string||
|&emsp;&emsp;number|总值||false|integer(int32)||
|&emsp;&emsp;numberOfChanges|变动数量||false|integer(int32)||
|&emsp;&emsp;why|变动原因||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- |
|200|OK|抽象财务数据实体类|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- |
|id|自增ID|integer(int32)|integer(int32)|
|livestoSpecies|牲畜种类|string||
|number|总值|integer(int32)|integer(int32)|
|numberOfChanges|变动数量|integer(int32)|integer(int32)|
|why|变动原因|string||


**响应示例**:
```javascript
{
	"id": 0,
	"livestoSpecies": "",
	"number": 0,
	"numberOfChanges": 0,
	"why": ""
}
```


## 更新抽象财务数据


**接口地址**:`/abstractFinancialData/updateOne`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"id": 0,
	"livestoSpecies": "",
	"number": 0,
	"numberOfChanges": 0,
	"why": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|abstractFinancialData|abstractFinancialData|body|true|抽象财务数据实体类|抽象财务数据实体类|
|&emsp;&emsp;id|自增ID||false|integer(int32)||
|&emsp;&emsp;livestoSpecies|牲畜种类||false|string||
|&emsp;&emsp;number|总值||false|integer(int32)||
|&emsp;&emsp;numberOfChanges|变动数量||false|integer(int32)||
|&emsp;&emsp;why|变动原因||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- |
|200|OK|抽象财务数据实体类|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- |
|id|自增ID|integer(int32)|integer(int32)|
|livestoSpecies|牲畜种类|string||
|number|总值|integer(int32)|integer(int32)|
|numberOfChanges|变动数量|integer(int32)|integer(int32)|
|why|变动原因|string||


**响应示例**:
```javascript
{
	"id": 0,
	"livestoSpecies": "",
	"number": 0,
	"numberOfChanges": 0,
	"why": ""
}
```


# 财务数据管理


## 添加财务数据


**接口地址**:`/finance/addOne`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"id": 0,
	"incomeAndExpenditureType": 0,
	"note": "",
	"number": 0,
	"why": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|finance|finance|body|true|财务数据表实体类|财务数据表实体类|
|&emsp;&emsp;id|自增ID||false|integer(int32)||
|&emsp;&emsp;incomeAndExpenditureType|收入支出||false|integer(int32)||
|&emsp;&emsp;note|备注||false|string||
|&emsp;&emsp;number|数额||false|number(double)||
|&emsp;&emsp;why|缘由||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- |
|200|OK|财务数据表实体类|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- |
|id|自增ID|integer(int32)|integer(int32)|
|incomeAndExpenditureType|收入支出|integer(int32)|integer(int32)|
|note|备注|string||
|number|数额|number(double)|number(double)|
|why|缘由|string||


**响应示例**:
```javascript
{
	"id": 0,
	"incomeAndExpenditureType": 0,
	"note": "",
	"number": 0,
	"why": ""
}
```


## 通过ID删除财务数据信息


**接口地址**:`/finance/deleteOne`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"id": 0,
	"incomeAndExpenditureType": 0,
	"note": "",
	"number": 0,
	"why": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|finance|finance|body|true|财务数据表实体类|财务数据表实体类|
|&emsp;&emsp;id|自增ID||false|integer(int32)||
|&emsp;&emsp;incomeAndExpenditureType|收入支出||false|integer(int32)||
|&emsp;&emsp;note|备注||false|string||
|&emsp;&emsp;number|数额||false|number(double)||
|&emsp;&emsp;why|缘由||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- |
|200|OK||
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


暂无


**响应示例**:
```javascript

```


## 查询全部财务数据


**接口地址**:`/finance/queryAll`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- |
|200|OK|财务数据表实体类|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- |
|id|自增ID|integer(int32)|integer(int32)|
|incomeAndExpenditureType|收入支出|integer(int32)|integer(int32)|
|note|备注|string||
|number|数额|number(double)|number(double)|
|why|缘由|string||


**响应示例**:
```javascript
[
	{
		"id": 0,
		"incomeAndExpenditureType": 0,
		"note": "",
		"number": 0,
		"why": ""
	}
]
```


## 通过ID查询单一财务数据


**接口地址**:`/finance/selectOne`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"id": 0,
	"incomeAndExpenditureType": 0,
	"note": "",
	"number": 0,
	"why": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|finance|finance|body|true|财务数据表实体类|财务数据表实体类|
|&emsp;&emsp;id|自增ID||false|integer(int32)||
|&emsp;&emsp;incomeAndExpenditureType|收入支出||false|integer(int32)||
|&emsp;&emsp;note|备注||false|string||
|&emsp;&emsp;number|数额||false|number(double)||
|&emsp;&emsp;why|缘由||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- |
|200|OK|财务数据表实体类|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- |
|id|自增ID|integer(int32)|integer(int32)|
|incomeAndExpenditureType|收入支出|integer(int32)|integer(int32)|
|note|备注|string||
|number|数额|number(double)|number(double)|
|why|缘由|string||


**响应示例**:
```javascript
{
	"id": 0,
	"incomeAndExpenditureType": 0,
	"note": "",
	"number": 0,
	"why": ""
}
```


## 更新财务数据信息


**接口地址**:`/finance/updateOne`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"id": 0,
	"incomeAndExpenditureType": 0,
	"note": "",
	"number": 0,
	"why": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|finance|finance|body|true|财务数据表实体类|财务数据表实体类|
|&emsp;&emsp;id|自增ID||false|integer(int32)||
|&emsp;&emsp;incomeAndExpenditureType|收入支出||false|integer(int32)||
|&emsp;&emsp;note|备注||false|string||
|&emsp;&emsp;number|数额||false|number(double)||
|&emsp;&emsp;why|缘由||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- |
|200|OK|财务数据表实体类|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- |
|id|自增ID|integer(int32)|integer(int32)|
|incomeAndExpenditureType|收入支出|integer(int32)|integer(int32)|
|note|备注|string||
|number|数额|number(double)|number(double)|
|why|缘由|string||


**响应示例**:
```javascript
{
	"id": 0,
	"incomeAndExpenditureType": 0,
	"note": "",
	"number": 0,
	"why": ""
}
```


# Redis管理


## TestRedisGet


**接口地址**:`/TestRedis/TestRedisGet`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- |
|200|OK|员工表实体类|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- |
|entryDate|入职日期|string(date-time)|string(date-time)|
|id|自增ID|integer(int32)|integer(int32)|
|idCardNumber|身份证号码|string||
|isSeparation|是否离职|integer(int32)|integer(int32)|
|name|姓名|string||
|phoneNumber|联系方式|string||
|positionId|职位|integer(int32)|integer(int32)|
|separationDate|离职日期|string(date-time)|string(date-time)|
|wage|工资|number(double)|number(double)|


**响应示例**:
```javascript
{
	"entryDate": "",
	"id": 0,
	"idCardNumber": "",
	"isSeparation": 0,
	"name": "",
	"phoneNumber": "",
	"positionId": 0,
	"separationDate": "",
	"wage": 0
}
```


## TestRedisSet


**接口地址**:`/TestRedis/TestRedisSet`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求示例**:


```javascript
{
	"entryDate": "",
	"id": 0,
	"idCardNumber": "",
	"isSeparation": 0,
	"name": "",
	"phoneNumber": "",
	"positionId": 0,
	"separationDate": "",
	"wage": 0
}
```


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|staff|staff|body|true|员工表实体类|员工表实体类|
|&emsp;&emsp;entryDate|入职日期||false|string(date-time)||
|&emsp;&emsp;id|自增ID||false|integer(int32)||
|&emsp;&emsp;idCardNumber|身份证号码||false|string||
|&emsp;&emsp;isSeparation|是否离职||false|integer(int32)||
|&emsp;&emsp;name|姓名||false|string||
|&emsp;&emsp;phoneNumber|联系方式||false|string||
|&emsp;&emsp;positionId|职位||false|integer(int32)||
|&emsp;&emsp;separationDate|离职日期||false|string(date-time)||
|&emsp;&emsp;wage|工资||false|number(double)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- |
|200|OK||
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


暂无


**响应示例**:
```javascript

```