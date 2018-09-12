//封装getElementById()
function byId(id){
	//判断类型
	return typeof(id)==="string"?document.getElementById(id):id;
}

//全局变量
var index= 0,
	timer= null,
	pics=byId("banner").getElementsByTagName("div"),
	dots=byId("dots").getElementsByTagName("span"),
	prev=byId("prev"),
	next=byId("next"),
	menu=byId("menu-content"),
	menuItmes=menu.getElementsByClassName("menu-item"),
	subMenu=byId("sub-menu"),
	innerBox=subMenu.getElementsByClassName("inner-box"),
	len= pics.length;
	

function sildeImg(){
	var main =byId("main");
	//划过清除定时器，离开继续
	main.onmouseover = function(){
		//划过清除定时器
		if(timer){
			clearInterval(timer);
		}
	}
	
	main.onmouseout =function(){
		timer = setInterval(function(){	
			index++;
			if(index>= len){
				index=0;
			}
			
			//切换图片
			changeImg();
		},3000);
	}
	
	//自动在main上触发鼠标离开的事件
	main.onmouseout();
	
	//遍历所有点击，且绑定点击事件，点击圆点切换图片
	for(var d= 0;d<len ;d++){
		//给所有span添加一个id的属性，值为d，作为当前span的索引
		dots[d].id = d ;
		dots[d].onclick =function(){
			//改变index为当前span的索引
			index = this.id;
			
			changeImg();
		}
	}
	
	
	//下一张
	next.onclick =function(){
		index++;
		if(index>=len){
			index= 0;
		}
		changeImg();
	}
	
	//上一张
	prev.onclick =function(){
		index--;
		if(index<0){
			index=len-1;
		}
		changeImg();
	}
	
	//导航菜单
	for(var m= 0 ;m<menuItmes.length;m++){
		//给每一个menu-item定义data-index属性，作为索引
		menuItmes[m].setAttribute("data-index",m);
		menuItmes[m].onmouseover =function(){
			subMenu.className="sub-menu";
			var idx =this.getAttribute("data-index");
			for(var k =0 ;k<innerBox.length;k++){
				innerBox[k].style.display='none';
				menuItmes[k].style.background='none';
			}
			menuItmes[idx].style.background='rgba(0,0,0,0.1)';
			innerBox[idx].style.display='block';
		}
	}
	
	//离开导航菜单
	menu.onmouseout =function(){
		subMenu.className='sub-menu hide';
	}
	subMenu.onmouseover =function(){
		this.className ='sub-menu' ;
	}
	subMenu.onmouseout =function(){
		this.className='sub-menu hide';
	}
}


function changeImg(){
	console.log(index);
	//遍历bannner下所有的div及dots下所有的span，并将div隐藏，将span清除
	for(var i =0 ;i<len; i++){
		pics[i].style.display="none";
		dots[i].className ="";
	}
	pics[index].style.display ="block";
	dots[index].className="active";
}
sildeImg();