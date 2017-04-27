package alienware.projectapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import java.util.List;


public class ItemAdapter extends RecyclerView.Adapter<ItemHolder> {

    private List<Merchandise> merchandiseList;

    public ItemAdapter(List<Merchandise> merchandiseList) {
        this.merchandiseList = merchandiseList;
    }

    @Override
    public ItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_layout, parent, false);

        return new ItemHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ItemHolder holder, int position) {
        Merchandise item = merchandiseList.get(position);
        holder.txtbrandName.setText(item.getName());
        holder.txtbrandcategory.setText(item.getProductDescription());
        Picasso.with(holder.txtbrandName.getContext()).load(item.getProductPhotoLocation()).into(holder.ProductImage);
    }

    @Override
    public int getItemCount() {
        return merchandiseList.size();
    }
}
