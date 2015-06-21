package cflatrocktechnology.com.databasenetworkingproject.database;

import android.content.Context;

import com.j256.ormlite.dao.Dao;

import cflatrocktechnology.com.databasenetworkingproject.models.Category;
import cflatrocktechnology.com.databasenetworkingproject.models.CategoryItem;

/**
 * Created by Fuji on 14.6.2015 ?..
 */

public class DatabaseManager {

    static private DatabaseManager instance;

    static public void init(Context context){

        if(null == instance){

            instance = new DatabaseManager(context);
        }
    }

    static public DatabaseManager getInstance(){
        return instance;
    }

    private DatabaseHelper helper;

    private DatabaseManager(Context context){
        helper = new DatabaseHelper(context);
    }

    private DatabaseHelper getHelper(){
        return helper;
    }


    public Dao<Category, Integer> getCategoryDaoInstance(){return getHelper().getCategoryDao();}
    public Dao<CategoryItem,Integer> getCategoryItemsDaoInstance(){return  getHelper().getCategoryItemsDao();}
}
