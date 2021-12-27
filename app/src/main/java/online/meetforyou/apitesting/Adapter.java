package online.meetforyou.apitesting;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
public class Adapter extends RecyclerView.Adapter<Adapter.CustomViewHolder> {

    private List<PostPojo> dataList;
    private Context context;


    public Adapter(Context context, List<PostPojo> dataList) {
        this.context = context;
        this.dataList = dataList;
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {

        TextView titles, posts;

        CustomViewHolder(View itemView) {
            super(itemView);

            titles = itemView.findViewById(R.id.title);
            posts = itemView.findViewById(R.id.body);
        }
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.design ,parent,false);

        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        holder.titles.setText(dataList.get(position).getTitle());
        holder.posts.setText(dataList.get(position).getBody());
    }

    @Override

    public int getItemCount() {
        return dataList.size();
    }


}
