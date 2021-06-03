package com.example.yddc.ui.pages.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.yddc.BaseApp
import com.example.yddc.R
import com.example.yddc.common.UserService
import com.example.yddc.common.toast
import com.example.yddc.network.Api
import com.example.yddc.network.api_generator.ApiGenerator
import com.example.yddc.network.api_generator.safeSubscribeBy
import com.example.yddc.network.api_generator.setSchedulers
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        tv_login.setOnClickListener {
            ApiGenerator.getApiService(Api::class.java)
                .getUserInfo(et_phone_num.text.toString())
                .setSchedulers()
                .safeSubscribeBy(
                    onNext = {
                        if (it.password == et_password.text.toString()){
                            //表示密码正确
                            BaseApp.context.toast("登录成功")
                            UserService.setUserInfo(it)
                            finish()
                        } else {
                            BaseApp.context.toast("密码错误")
                        }
                    },
                    onError = {
                        BaseApp.context.toast("服务器状态异常")
                        finish()
                    }
                )
        }
    }
}