import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

import com.example.pisa_452.secondclass.R;

import java.util.ArrayList;

/**
 * Created by PISA_452 on 2/24/2018.
 */

public class CustomAdapterActivity extends AppCompatActivity {

    @Override
    protected  void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        ArrayList<User> arrayOfUsers = new ArrayList<User>();

        for(int i=0; i<100; i++){
            arrayOfUsers.add(new User("Juan"+i, "783gfdf"));
        }

        UsersAdapter adapter = new UsersAdapter(this, arrayOfUsers);
        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(adapter);
    }
}
