package cflatrocktechnology.com.databasenetworkingproject.app;

import android.app.Application;
import android.content.Context;

import cflatrocktechnology.com.databasenetworkingproject.database.DatabaseManager;
import cflatrocktechnology.com.databasenetworkingproject.database.HelperFactory;

/**
 * Created by Fuji on 14.6.2015 ?..
 */
public class MyApplication extends Application {

    private static MyApplication mInstance;

    private static Context mAppContext;


    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;

        try {
            //VolleySingleton.init(this);
            DatabaseManager.init(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.setAppContext(getApplicationContext());

    }

    public static MyApplication getInstance(){
        return mInstance;
    }
    public static Context getAppContext() {
        return mAppContext;
    }
    public void setAppContext(Context mAppContext) {
        this.mAppContext = mAppContext;
    }

    @Override
    public void onTerminate() {
        HelperFactory.releaseHelper();
        super.onTerminate();
    }
}
