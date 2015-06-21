package cflatrocktechnology.com.databasenetworkingproject.models;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by Fuji on 14.6.2015 ?..
 */
@DatabaseTable
public class CategoryItem {

    public static final String COL_CATEGORY_NAME  = "category_name";


    @DatabaseField (generatedId = true)
    int id;

    @DatabaseField (foreign = true ,columnName = COL_CATEGORY_NAME)
    Category category;
}
