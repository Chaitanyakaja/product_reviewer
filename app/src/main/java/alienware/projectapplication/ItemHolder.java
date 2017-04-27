package alienware.projectapplication;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;


public class ItemHolder extends RecyclerView.ViewHolder {

    public TextView txtbrandName, txtbrandcategory;
    public CircleImageView ProductImage;

    public ItemHolder(View view) {
        super(view);
        txtbrandName = (TextView) view.findViewById(R.id.txtbrandName);
        txtbrandcategory = (TextView) view.findViewById(R.id.txtbrandcategory);
        ProductImage = (CircleImageView) view.findViewById(R.id.ProductImage);
    }
}