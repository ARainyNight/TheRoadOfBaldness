CREATE TABLE address(
	id 			INT AUTO_INCREMENT PRIMARY KEY 	COMMENT '主键',
	userid 		INT 							COMMENT '外键：关联用户表主键',
	defaultAddr	BOOLEAN							COMMENT '是否默认地址',
	nation 		VARCHAR(20) 					COMMENT '国家',
	province 	VARCHAR(20) 					COMMENT '省区',
	city 		VARCHAR(20) 					COMMENT '市区',
	country 	VARCHAR(20) 					COMMENT '县区',
	street 		VARCHAR(100)					COMMENT '街道',
	remark		TEXT							COMMENT '备注'
) CHARSET utf8;
# 增加外键约束
ALTER TABLE address ADD FOREIGN KEY (userid) REFERENCES users(id);
# 增加测试数据
INSERT INTO address(userid, defaultAddr, nation, province, city, country, street, remark)
	VALUES	(1, TRUE, "中国", "河南", "郑州", "金水区", "二环路", "瑞隆城7号楼601"),
			(1, FALSE, "中国", "陕西", "西安", "北城区", "开元路", "文景小区1号楼202"),
			(1, FALSE, "中国", "云南", "昆明", "盘龙区", "小康大道", "银河星辰3号楼402");