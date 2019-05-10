package comp.example.lenovo.aaaa.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.jcodecraeer.xrecyclerview.XRecyclerView;

import java.util.ArrayList;
import java.util.List;

import comp.example.lenovo.aaaa.R;
import comp.example.lenovo.aaaa.bean.UtilBean;

/**
 * @author: 章黎黎
 * @Date: 2019/5/5  16:03
 * @description: $描述
 */
public class ListAdapter extends XRecyclerView.Adapter<XRecyclerView.ViewHolder> {

    private Context context;

    private List<UtilBean.ResultBean> list = new ArrayList<>();
    public ListAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public XRecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(View.inflate(context, R.layout.item_layout,null));
    }

    @Override
    public void onBindViewHolder(@NonNull XRecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolder extends XRecyclerView.ViewHolder{

        public ImageView img;
        public TextView name;
        public TextView prcie;

        public ViewHolder(View itemView) {
            super(itemView);
            img =itemView.findViewById(R.id.img);
            name =itemView.findViewById(R.id.name);
            prcie = itemView.findViewById(R.id.price);

        }
    }
}
