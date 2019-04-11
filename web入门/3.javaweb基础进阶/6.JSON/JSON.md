## JSON介绍

+ JavaScript Object Notation(JavaScript对象表达法)

+ JSON是轻量级的文本数据交换格式

+ JSON独立于语言，具有自我描述性，更易理解

+ ```json
  {
  	"sites"[
  		{"name":"慕课网","url":"www.imooc.com"},
  		{"name":"百度","url":"www.baidu.com"},
  		{"name":"网易","url":"www.163.com"}
  	]
  }
  ```



### JSON与字符串相互转换

+ `JSON.parse()`方法将字符串转换为JSON对象

+ `JSON.stringify()`方法将JSON对象转换为字符串

+ ```javascript
  <script  type="text/javascript">
  		var str = "{\"class_name\":\"五年级三班\"}";
  		var json = JSON.parse(str);
  		console.log(str);
  		console.log(json);
  
  		document.write(json.class_name);
  	</script>
  ```

+ ```javascript
  <script  type="text/javascript">
  		var json1= {"class_name":"五年级四班"};
  		var json2=JSON.stringify(json1);
  
  		document.write(json2);
  	</script>
  ```

+ 