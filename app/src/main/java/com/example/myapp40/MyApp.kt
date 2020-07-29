package layout

import android.app.Application
import timber.log.Timber
import android.os.Debug

class MyApp : Application() {
    override fun  onCreate(){
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }

}