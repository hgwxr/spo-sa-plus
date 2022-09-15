package com.pj.movie

import com.pj.utils.LogUtil
@JvmOverloads
fun printHello(value:Int? = 0){
    LogUtil.info("hello kotlin $value")
}