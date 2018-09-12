[TOC]



###定位机制

#### 普通流(标准流)

- `默认状态，元素自动从左往右，从上往下的排列`

#### 浮动

- `会使元素向左或向右移动，只能左右，不能上下。`
- `浮动元素碰到包含框或另一个浮动框，浮动停止`
- `浮动元素之后的元素将围绕它，之前的不受影响`
- `浮动元素会脱离标准流`
- 基本语法
  - `float:left`:靠左浮动
  - `float:right`:靠右浮动
  - `float:none`:不适用浮动





### 使用浮动之后产生的问题

- 元素使用浮动后会脱离普通流，出现“高度坍塌”

- 浮动溢出

- ```html
  <!DOCTYPE html>
  <html>
  	<head>
  		<meta charset="utf-8" />
  		<meta name="viewport" content="width=device-width, initial-scale=1">
  		<title></title>
  		<style type="text/css">
  			.container{
  				width: 500px;
  				/* height: 500px; */
  				border: 2px solid #333;
  			}
  			.box1{
  				width: 100px;
  				height: 100px;
  				background: blue;
  				color: #fff;
  				float: left;
  			}
  			.box2{
  				width: 100px;
  				height: 100px;
  				background: red;
  				color: #fff;
  				float: left;
  			}
  			.box3{
  				width: 100px;
  				height: 100px;
  				background: orange;
  				color: #fff;
  				float: left;
  			}
  		</style>
  	</head>
  	<body>
  	<div class="container">
  		<div class="box1">11111</div>
  		<div class="box2">22222</div>
  		<div class="box3">33333</div>
  	</div>	
  	</body>
  </html>
  ```

- 如上面代码所示，父容器的高度坍塌为0,3个浮动溢出

- 文字环绕是文字文本流，而后面的box是div，是文档流，虽然浮动元素脱离了原来了文档流，但是还是在文本流中占据了位置的



### 清除浮动（闭合浮动）

- 语法

  - `clear:none|left|right|both;`
  - `clear:inherit;`:从父元素继承clear属性的值

- 常用方法

  - 方法1：在浮动元素后使用一个空元素

    - `<div class="clear"></div>`

  - 方法2：给浮动元素的容器添加`overflow:hidden`

  - 方法3：使用CSS3的`:after`伪元素

    - ```css
      .clearfix:after{
          content:".";
          display:block;
          height:0;
          visibility:hidden;
          clear:both
      }
      ```

  - ```html
    <!DOCTYPE html>
    <html>
    	<head>
    		<meta charset="utf-8" />
    		<meta name="viewport" content="width=device-width, initial-scale=1">
    		<title></title>
    		<style type="text/css">
    			.clear{
    				/* clear: both;  方法一 */
    			}
    			.container{
    				width: 500px;
    				/* height: 500px; */
    				border: 2px solid #333;
    				/*overflow: hidden;   方法二*/
    				zoom: 1;
    			}
    			.clearfix:after{
    				content: '.';
    				height: 0;
    				display: block;
    				visibility: hidden;
    				clear: both;         /*方法三*/
    			}
    			.clearfix{
    				zoom:1;
    			}
    			.box1{
    				width: 100px;
    				height: 100px;
    				background: blue;
    				color: #fff;
    				/* float: left;
    				clear: none; */
    				/* float: right; */
    				/* clear: right; */
    				/* clear: both; */
    				float: left;
    			}
    			.box2{
    				width: 100px;
    				height: 100px;
    				background: red;
    				color: #fff;
    				/* float: left;
    				clear: left; */
    				/* float: right; */
    				/* clear: right; */
    				/* clear: both; */
    				float: left;
    			}
    			.box3{
    				width: 100px;
    				height: 100px;
    				background: orange;
    				color: #fff;
    				/* float: left;
    				clear: left; */
    				/* float: right; */
    				/* clear: right; */
    				/* clear: both; */
    				float: left;
    				
    			}
    			.box4{
    				width: 500px;
    				height: 200px;
    				background: green;
    			}
    		</style>
    	</head>
    	<body>
    	<div class="container clearfix">
    		<div class="box1">11111</div>
    		<div class="box2">22222</div>
    		<div class="box3">33333</div>
    		<div class="clear"></div>
    	</div>	
    	<div class="box4">44444</div>
    	</body>
    </html>
    ```

- 其它方法

  + 父级元素定义height。只适合高度固定的布局。
  + 父级元素也一起浮动，不推荐，会产生新的浮动问题