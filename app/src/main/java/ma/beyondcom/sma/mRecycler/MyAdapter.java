package ma.beyondcom.sma.mRecycler;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ma.beyondcom.sma.R;
import ma.beyondcom.sma.mData.SpaceCraft;
import ma.beyondcom.sma.mDetail.Activity_Detail;
import java.util.ArrayList;
/**
 * Created by Oclemy on 5/11/2016 for ProgrammingWizards Channel and http://www.camposha.com.
 */
public class MyAdapter extends RecyclerView.Adapter<MyHolder> {
    Context c;
    ArrayList<SpaceCraft> spaceCrafts;
    public MyAdapter(Context c, ArrayList<SpaceCraft> spaceCrafts) {
        this.c = c;
        this.spaceCrafts = spaceCrafts;
    }
    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.model,parent,false);
        return new MyHolder(v);
    }
    @Override
    public void onBindViewHolder(MyHolder holder, int position) {

        final String cv=spaceCrafts.get(position).getCv();
        final String name=spaceCrafts.get(position).getName();
        final String profession=spaceCrafts.get(position).getProfession();
        final String datetime=spaceCrafts.get(position).getDatetime();
        final String lieu=spaceCrafts.get(position).getLieu();
        final String resume=spaceCrafts.get(position).getResume();
        final int image=spaceCrafts.get(position).getImage();
        //BIND DATA
        holder.nameTxt.setText(name);
        holder.profTxt.setText(profession);
        holder.datetimeTxt.setText(datetime);
        holder.lieuTxt.setText(lieu);
        holder.img.setImageResource(image);
        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(int pos) {
                openDetailActivity(name,cv,resume,image);
            }
        });
    }
    @Override
    public int getItemCount() {
        return spaceCrafts.size();
    }
    private void openDetailActivity(String name,String cv,String resume,int image)
    {
        Intent i=new Intent(c, Activity_Detail.class);
        //PACK DATA TO SEND
        i.putExtra("NAMEDETAIL_KEY",name);

        i.putExtra("CV_KEY",cv);
        i.putExtra("RESUME_KEY",resume);
        i.putExtra("IMAGE_KEY",image);
        //open activity
        c.startActivity(i);
    }
}