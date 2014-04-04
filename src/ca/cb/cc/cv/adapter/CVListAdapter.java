package ca.cb.cc.cv.adapter;

import ca.cb.cc.cv.R;
import ca.cb.cc.cv.model.CVListItem;
 
import java.util.ArrayList;
 
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

 
public class CVListAdapter extends BaseAdapter {
     
    private Context context;
    private ArrayList<CVListItem> CVItems;
     
    public CVListAdapter(Context context, ArrayList<CVListItem> CVItems){
        this.context = context;
        this.CVItems = CVItems;
    }
 
    @Override
    public int getCount() {
        return CVItems.size();
    }
 
    @Override
    public Object getItem(int position) {       
        return CVItems.get(position);
    }
 
    @Override
    public long getItemId(int position) {
        return position;
    }
 
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater mInflater = (LayoutInflater)
                    context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.cv_list_item, null);
        }
          
        ImageView imgIcon = (ImageView) convertView.findViewById(R.id.icon);
        TextView txtTitle = (TextView) convertView.findViewById(R.id.title);
          
        imgIcon.setImageResource(CVItems.get(position).getPreview());        
        txtTitle.setText(CVItems.get(position).getTitle());
         
        return convertView;
    }
 
}