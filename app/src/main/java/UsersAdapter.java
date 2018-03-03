import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.pisa_452.secondclass.R;

import java.util.ArrayList;

/**
 * Created by PISA_452 on 2/24/2018.
 */

public class UsersAdapter extends ArrayAdapter<User> {

    public UsersAdapter(@NonNull Context context, ArrayList<User> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        User user =getItem(position);
        if(convertView==null){
            convertView= LayoutInflater.from(getContext()).inflate(R.layout.item_user, parent, false);
        }

        TextView tvName = (TextView) convertView.findViewById(R.id.tvName);
        TextView tvbirthdate = (TextView) convertView.findViewById(R.id.tvBirthdate);
        tvName.setText(user.name);
        tvbirthdate.setText(user.birthdate);
        return convertView;
    }
}
