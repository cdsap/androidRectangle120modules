package com.awesomeapp.weathercontact.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.weathercontact.Viewmodel88_1
import com.awesomeapp.weathercontact.Activity88_2
import com.awesomeapp.weathercontact.Activity88_3
import com.awesomeapp.weathercontact.Fragment88_4
import com.awesomeapp.weathercontact.Repository88_5
import com.awesomeapp.synccontact.Api64_6
import com.awesomeapp.analyticscontact.Api72_6
import com.awesomeapp.notificationcontact.Api68_6
import com.awesomeapp.usercontact.Api56_6
import com.awesomeapp.postcontact.Api60_6
import com.awesomeapp.weathercontact.Api88_6
import com.awesomeapp.weathercontact.Model88_8
import com.awesomeapp.weathercontact.Model88_9
import com.awesomeapp.weathercontact.Activity88_10
import com.awesomeapp.weathercontact.Model88_12
import com.awesomeapp.weathercontact.Activity88_13
import com.awesomeapp.weathercontact.Model88_15
import com.awesomeapp.weathercontact.Activity88_16
import com.awesomeapp.weathercontact.Model88_18
import com.awesomeapp.weathercontact.Activity88_19
import com.awesomeapp.weathercontact.Model88_21
import com.awesomeapp.weathercontact.Activity88_22
import com.awesomeapp.weathercontact.Model88_24
import com.awesomeapp.weathercontact.Activity88_25
import com.awesomeapp.weathercontact.Model88_27
import com.awesomeapp.weathercontact.Activity88_28
import com.awesomeapp.weathercontact.Model88_30
import com.awesomeapp.weathercontact.Activity88_31
import com.awesomeapp.weathercontact.Model88_33
import com.awesomeapp.weathercontact.Activity88_34
import com.awesomeapp.weathercontact.Model88_36
import com.awesomeapp.weathercontact.Activity88_37
import com.awesomeapp.weathercontact.Model88_39
import com.awesomeapp.weathercontact.Activity88_40
import com.awesomeapp.weathercontact.Model88_42
import com.awesomeapp.weathercontact.Activity88_43

@Module
@InstallIn(SingletonComponent::class)
object Module_88 {
    @Provides
    @Singleton
    fun provideRepository88_5(
        api0: Api64_6 = Api64_6(),
        api1: Api72_6 = Api72_6(),
        api2: Api68_6 = Api68_6(),
        api3: Api56_6 = Api56_6(),
        api4: Api60_6 = Api60_6()
    ): Repository88_5 {
        return Repository88_5(api0, 
        api1, 
        api2, 
        api3, 
        api4)
    }

    @Provides
    @Singleton
    fun provideApi88_6(): Api88_6 {
        return Api88_6()
    }
}