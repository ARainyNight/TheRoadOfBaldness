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
    - `char toCharArray()`
  - 将字节数组转成字符串
    - `String(byte[])`
    - `String(byte[],offset,count)`:将字节数组中的一部分转成字符串
  - 将字符串转成字节数组
    - `byte[]  getBytes()`
  - 将基本数据类型转成字符串
    - `static String valueOf(int)`
    - `static String valueOf(double)`
  - 字符串和字节数组在转换过程中，是可以指定编码表的

+ **替换**

  - `String replace(oldchar,newchar);`

+ **切割**

  - `String [] split(regex);`

+ **子串**

  - `String substring(begin);` :从指定位置开始到结尾；如果角标不存在，会出现字符串角标越界异常
  - `String substring(begin,end);`：包含指定位置begin，不包含end

+ **转换** , 去除空格，比较

  - 将字符串转成大写或小写
    - `String toUpperCase()`
    - `String toLowerCase()`

  - 将字符串两端的空格去除
    - `String trim();`
  - 对两个字符串进行自然顺序的比较
    - `int compareTo(String);`

## StringBuffer

+ 字符串的组成原理就是通过该类实现的

+ StringBuffer可以对字符串内容进行增删

+ StringBuffer是一个容器

+ 很多方法与String相同

+ StringBuffer是可变长度的

+ StringBuffer是字符串缓冲区

+ ```java
  public class StringBufferDemo {
      public static void main(String[] args) {
  
          StringBuffer stringBuffer = new StringBuffer();
  
          stringBuffer.append(34).append("dasd").append(true); //34dasdtrue
          System.out.println(stringBuffer.toString());
          StringBuffer sb1 = stringBuffer.append(34);
  
          System.out.println(sb1 == stringBuffer);  // true
          System.out.println(stringBuffer.toString()); //34dasdtrue
          System.out.println(sb1.toString());  //34dasdtrue
      }
  }
  ```

### 常见操作

+ **添加**
  - `StringBuffer append();`:将指定数据作为参数添加到以后数据的结尾处
  - `StringBuffer insert(int index, Object obj)`:添加任意数据到指定的index角标处
+ **删除**
  - `StringBuffer delete(int start,int end)`:从start开始，不包含end位置，删除字符
  - `StringBuffer deleteCharAt(int index)`：删除指定位置的字符
+ **获取**
  - `char charAt(int index)`:根据角标获取字符
  - `int indexOf(String str)`:获取字符串出现的位置
  - `int lastIndexOf(String str)`
  - `int length()`
  - `String substring(int start ,int end)`:**注意返回的是String类型**
+ **修改**
  - `StringBuffer replace(int start,int end,String str)`:替换，包含头不包含尾
  - `void setCharAt(int index, String str)`
+ **反转**
  - `StringBuffer reverse() `
+ `void getChars(int srcBegin,nt srcEnd, char[] dst, ubt dstBegin)`:将缓冲区中指定数据存储到指定字符数组中

---

### 注意

JDK1.5版本之后出现了StringBuilder

+ StringBuffer是线程同步的
+ StringBuilder是线程不同步的
+ StringBuilder执行效率比StringBuffer效率高，因为没有线程安全锁
+ 单线程建议使用StringBuilder