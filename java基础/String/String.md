## String类

字符串是一个特殊的对象

字符串一旦初始化就不可被改变

```java
	    String s1 = "abc";
        String s2 = new String("abc");
        String s3 = "abc";

        System.out.println(s1==s2);   //false
        System.out.println(s1==s3);	  //true
```



### 常见操作

+ **获取**
  - 字符串中包含的字符数，也就是字符串的长度
    - `int length()` ：获取长度
  - 根据位置获取位置上的某个字符
    - `char charAt(int index)`
  - 根据字符获取该字符在字符串中的位置
    - `int indexOf(int ch)`:返回的是ch在字符串中第一次出现的位置
    - `int indexOf(int ch,int fromIndex)`:从fromIndex指定的位置开始，获取ch在字符串中出现的位置
    - `int indexOf(String str)`:返回的是str在字符串中第一次出现的位置
    - `int indexOf(String str,int fromIndex)`:从fromIndex指定的位置开始，获取str在字符串中出现的位置
    - `int lastIndexOf(int ch)`：反向索引

+ **判断**
  - 字符串中是否包含某一个字串
    - `boolean contains(str)`
  - 字符串中是否有内容
    - `boolean isEmpty()`:原理就是判断长度是否为0
  - 字符串是否是以指定内容开头
    - `boolean startsWith(str)`
  - 字符串是否是以指定内容结尾
    - `boolean endsWith(str)`
  - 判断字符串内容是否相同，复写了Object类中的equals方法
    - `boolean equals(str)`
  - 判断内容是否相同，并忽略大小写
    - `boolean euqalsIgnoreCase()`
+ **转换**
  - 将字符数组转成字符串
    - 构造函数:
      - `String(char[])`
      - `String(char[],offset,count)`:将字符数组中的一部分转成字符串
    - 静态方法
      - `static String copyValueOf(char[])`
      - `static String copyValueOf(char[] data, int offset, int count)`
  - 将字符串转成字符数组
    - 
  - 将字节数组转成字符串
    - `String(byte[])`
    - `String(byte[],offset,count)`:将字节数组中的一部分转成字符串
  - 将字符串转成字节数组
  - 将基本数据类型转成字符串
    - `static String valueOf(int)`
    - `static String valueOf(double)`



