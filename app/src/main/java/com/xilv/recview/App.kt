package com.xilv.recview

import android.app.Application
import com.xilv.recview.model.UsersService

class App : Application() {

    val usersService = UsersService()
}