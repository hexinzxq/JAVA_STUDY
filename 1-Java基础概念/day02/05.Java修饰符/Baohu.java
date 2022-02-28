//package com.runoob.test;
//// 编译报错，接口以及接口的成员变量和成员方法不能使用protected进行修饰
//protected interface Baohu {
//    protected void fun() {}
//}


/**
 * 如果我们只想让该方法对其所在的子类可见，则将该方法声明为protected
 * */
class AudioPlayer {
    protected boolean openSpeaker(Speaker sp) {
        //实现细节
    }
}

class StreamAudioPlayer extends AudioPlayer {
    protected boolean openSpeaker(Speaker sp) {
        // 实现细节
    }
}