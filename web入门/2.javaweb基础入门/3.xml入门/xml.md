[TOC]





### XML是什么

![](http://a1.qpic.cn/psb?/V11ree7s3wel2Y/dGSy4*OT3rXSPlYZVgvQCKQlWfnMeDNCtX.t9.4DE2A!/c/dDQBAAAAAAAA&ek=1&kp=1&pt=0&bo=vQTJAgAAAAADN2A!&tl=1&vuin=3481376519&tm=1536231600&sce=60-2-2&rf=0-0)

### XML的用途

+ Java程序的配置文件
+ 用于保存程序的产生的数据
+ 网络间的数据传输

### XML文档结构

+ 第一行必须是XML声明

  - XML声明说明XML文档的基本信息，包括版本号与字符集，写在XML第一行

  - ```xml
    <?xml version="1.0" encoding="UTF-8"?>
    ```

+ 有且只有一个根节点

+ XML标签的书写规则与HTML相同

### XML标签书写规则

+ 合法的标签名

  - 标签名要有意义
  - 建议使用英文，小写字母，单词之间使用"-"分割
  - 建议多级标签之间不要存在重名的情况
  - ![](http://a2.qpic.cn/psb?/V11ree7s3wel2Y/TO*SQC7ACX0*9Xvf0AzpuBN5tU9oeTWGIvWtmbVNnUo!/c/dC0BAAAAAAAA&ek=1&kp=1&pt=0&bo=lAMCAQAAAAADJ5Y!&tl=1&vuin=3481376519&tm=1536235200&sce=60-2-2&rf=0-0)

+ 适当的注释与缩进

+ 合理使用属性

  - 标签属性用于描述标签不可或缺的信息
  - 对标签分组或者为标签设置ID时常用属性表示

+ 特殊字符与CDATA标签

  - 标签体中，出现`<`、`>`特殊字符，会破坏文档结构。

  - 解决方法1：使用实体引用

    - ![](http://a3.qpic.cn/psb?/V11ree7s3wel2Y/quniQ5l62Ha9oftEDxfpOQzLDdrID40bPyx0X.1ABek!/c/dFIBAAAAAAAA&ek=1&kp=1&pt=0&bo=1AJXAQAAAAADF7I!&tl=1&vuin=3481376519&tm=1536235200&sce=60-2-2&rf=0-0)

  - 解决方法2：使用CDATA标签

    - CDATA指的是不应由XML解析器进行解析的文本数据

    - 从`"<![CDATA["`开始，到`"]]>"`结束

    - ![](http://a3.qpic.cn/psb?/V11ree7s3wel2Y/8.IcrQqMS5zufhpubThQLhNz2gV3AnT2w7wNPzkxJFI!/m/dDYBAAAAAAAAnull&bo=AAPGAQAAAAADB.Y!&rf=photolist&t=5)

      

+ 有序的子元素



### XML语义约束

+ XML文档结构正确，但可能不是有效的

  - 例如，员工档案XML中决不允许出现“植物品种”标签
  - XML语义约束就是用于规定XML文档中允许出现哪些元素
+ XML语义约束有两种定义方式：`DTD`与`XML Schema`

#### DTD

![](http://m.qpic.cn/psb?/V11ree7s3wel2Y/BFu5K1WSxBCRYnbjMlhk.an0*.MA2*E5yjxF4Wfm7lc!/b/dEYBAAAAAAAA&bo=HwSjAgAAAAADN6g!&rf=viewer_4)

![](http://m.qpic.cn/psb?/V11ree7s3wel2Y/BoX4Cf1wKi.Dw7x98kgVAh7Fybi2Y6wrZ64yFVrv7Go!/b/dDcBAAAAAAAA&bo=kwSeAgAAAAADNxk!&rf=viewer_4)

![](http://a2.qpic.cn/psb?/V11ree7s3wel2Y/tDI6aqEXGTP0ad2k3*90.QC9Q9o37vkTInccSBy94UM!/c/dEkBAAAAAAAA&ek=1&kp=1&pt=0&bo=IwSnAgAAAAADN5A!&tl=1&vuin=3481376519&tm=1536235200&sce=60-2-2&rf=0-0)

![](http://a4.qpic.cn/psb?/V11ree7s3wel2Y/iAaWKeVOmsoSnIkXLfvQF6G6tuIghKV601esKFjaLB8!/c/dFMBAAAAAAAA&ek=1&kp=1&pt=0&bo=4wPiAQAAAAADJwE!&tl=1&vuin=3481376519&tm=1536235200&sce=60-2-2&rf=0-0)