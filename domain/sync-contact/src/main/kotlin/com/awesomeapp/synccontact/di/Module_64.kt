package com.awesomeapp.synccontact.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.synccontact.Viewmodel64_1
import com.awesomeapp.synccontact.Activity64_2
import com.awesomeapp.synccontact.Activity64_3
import com.awesomeapp.synccontact.Fragment64_4
import com.awesomeapp.synccontact.Repository64_5
import com.awesomeapp.task.Api28_6
import com.awesomeapp.video.Api44_6
import com.awesomeapp.todo.Api36_6
import com.awesomeapp.forecast.Api40_6
import com.awesomeapp.audio.Api48_6
import com.awesomeapp.synccontact.Api64_6
import com.awesomeapp.synccontact.Model64_8
import com.awesomeapp.synccontact.Model64_9
import com.awesomeapp.synccontact.Activity64_10
import com.awesomeapp.synccontact.Model64_12
import com.awesomeapp.synccontact.Activity64_13
import com.awesomeapp.synccontact.Model64_15
import com.awesomeapp.synccontact.Activity64_16

@Module
@InstallIn(SingletonComponent::class)
object Module_64 {
    @Provides
    @Singleton
    fun provideRepository64_5(
        api0: Api28_6 = Api28_6(),
        api1: Api44_6 = Api44_6(),
        api2: Api36_6 = Api36_6(),
        api3: Api40_6 = Api40_6(),
        api4: Api48_6 = Api48_6()
    ): Repository64_5 {
        return Repository64_5(api0, 
        api1, 
        api2, 
        api3, 
        api4)
    }

    @Provides
    @Singleton
    fun provideApi64_6(): Api64_6 {
        return Api64_6()
    }
}