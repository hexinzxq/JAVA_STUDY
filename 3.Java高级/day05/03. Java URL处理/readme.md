# Java URL处理
- URL（Uniform Resource Locator）中文名为同一资源定位符，表示互联网上的资源，如网页或者FTP地址。URL可以分为以下几个部分
```text
protocol://host:port/path?query#fragment
- protocol: 协议，可以是HTTP、HTTPS、FTP和File
- port：端口号
- path：文件路径或文件名
```
```text
例如：http://www.baidu.com/index.html?language=zh#j2se
-协议为http
-主机为www.baidu.com
-端口号为80，是因为该链接并没有指定端口，所以是默认端口80
-文件路径为/index.html
-请求参数为language=zh
-定位位置为j2se，定位到网页中id属性为j2se的HTML元素位置
```

## URL 类方法
- 在java.net包中定义了URL类，该类用来处理有关URL的内容
- java.net.URL提供了丰富的URL构建方式，并恶意通过java.net.URL来获取资源

## URL Connections类方法
- openConnection()返回一个java.net.URLConnection