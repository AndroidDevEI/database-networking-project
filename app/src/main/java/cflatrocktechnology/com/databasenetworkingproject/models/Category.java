package cflatrocktechnology.com.databasenetworkingproject.models;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by Fuji on 14.6.2015 ?..
 */

@DatabaseTable
public class Category {


    @DatabaseField (generatedId = true)
    int id;
    @DatabaseField
    String category_name;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public String getCategory_name() {
        return category_name;
    }

}
