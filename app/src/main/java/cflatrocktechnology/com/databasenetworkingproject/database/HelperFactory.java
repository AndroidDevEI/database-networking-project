package cflatrocktechnology.com.databasenetworkingproject.database;

import android.content.Context;
import android.provider.ContactsContract;

import com.j256.ormlite.android.apptools.OpenHelperManager;

/**
 * Created by Fuji on 14.6.2015 ?..
 */
public class HelperFactory {

    private static DatabaseHelper databaseHelper;

    public static DatabaseHelper getDatabaseHelper(){
        return databaseHelper;
    }

    public static  void setDatabaseHelper(Context context){
        databaseHelper = OpenHelperManager.getHelper(context,DatabaseHelper.class);

    }

    public static void releaseHelper(){
        OpenHelperManager.releaseHelper();
        databaseHelper = null;
    }

}
