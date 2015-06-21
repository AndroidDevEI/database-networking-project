package cflatrocktechnology.com.databasenetworkingproject.bll;

import android.provider.ContactsContract;
import android.util.Log;

import java.sql.SQLException;
import java.util.List;

import cflatrocktechnology.com.databasenetworkingproject.database.DatabaseManager;
import cflatrocktechnology.com.databasenetworkingproject.models.Category;
import cflatrocktechnology.com.databasenetworkingproject.models.CategoryItem;

/**
 * Created by Fuji on 14.6.2015 ?..
 */
public class Bll_Category {

    private static final String TAG = Bll_Category.class.getSimpleName();

    public static Category createRecord(Category category){

        try {
            int row = DatabaseManager.getInstance().getCategoryDaoInstance().create(category);

            Log.d(TAG, "Created row :"+ row);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  category;
    }

    public static void updateRecord(Category category){
        try {
            DatabaseManager.getInstance().getCategoryDaoInstance().update(category);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void deleteRecord(Category category){

        try {
            DatabaseManager.getInstance().getCategoryDaoInstance().delete(category);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static Category getRecordById (int recordId){
        Category category = null;

        try {
             category = DatabaseManager.getInstance().getCategoryDaoInstance().queryForId(recordId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return category;
    }


    public static List<Category> getAllRecords(){

        List<Category> categories = null;

        try {
            categories = DatabaseManager.getInstance().getCategoryDaoInstance().queryForAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return categories;
    }



}
