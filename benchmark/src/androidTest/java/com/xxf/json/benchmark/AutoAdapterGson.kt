package com.xxf.json.benchmark

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.xxf.json.gson.plugin.AutoTypeAdapterFactory

object AutoAdapterGson {

    fun createGson(): Gson {
        //如果运行不起来 报AutoTypeAdapterFactory 找不到 是因为还没生成,可以打开下面这句 运行一遍case,然后在切换到 最下面的语句
       // return Gson()

        return GsonBuilder()
              .registerTypeAdapterFactory(AutoTypeAdapterFactory())
              .create()
              .also {
                  AutoTypeAdapterFactory.load(it)
              }
    }
}