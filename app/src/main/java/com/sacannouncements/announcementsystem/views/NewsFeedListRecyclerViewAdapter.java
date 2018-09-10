package com.sacannouncements.announcementsystem.views;

import android.animation.ValueAnimator;
import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.sacannouncements.announcementsystem.GlideApp;
import com.sacannouncements.announcementsystem.R;
import com.sacannouncements.announcementsystem.datamodel.AnnouncementCategoryDataModal;
import com.sacannouncements.announcementsystem.datamodel.AnnouncementNewsFeedDataModal;

import java.util.ArrayList;

/**
 * Created by Keji's Lab on 19/01/2018.
 */

public class NewsFeedListRecyclerViewAdapter extends RecyclerView.Adapter<NewsFeedListRecyclerViewAdapter.MyViewHolder> {
   private ArrayList<AnnouncementNewsFeedDataModal> announcementNewsFeedDataModalArrayList = new ArrayList<>();
   private Context context;
   int active = 0;


    public class MyViewHolder extends RecyclerView.ViewHolder{
    TextView announcementCaption,des;
    ImageView postImage;
    ConstraintLayout container;




        public MyViewHolder(View view){
            super(view);
            announcementCaption = (TextView) view.findViewById(R.id.announcementCaption);
            des = (TextView) view.findViewById(R.id.des);
            postImage = (ImageView) view.findViewById(R.id.postImage);

        }
    }

    public NewsFeedListRecyclerViewAdapter(Context c, ArrayList<AnnouncementNewsFeedDataModal> announcementCategoryDataModals){
    this.context = c;
    this.announcementNewsFeedDataModalArrayList = announcementCategoryDataModals;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.news_feed_item,parent,false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        AnnouncementNewsFeedDataModal newsFeedDataModal = announcementNewsFeedDataModalArrayList.get(position);
        holder.announcementCaption.setText(newsFeedDataModal.getAnnouncementCaption());
        holder.des.setText(newsFeedDataModal.getAnnouncementDetails());
        try {
            GlideApp.with(context).load(newsFeedDataModal.getImagePath()).diskCacheStrategy(DiskCacheStrategy.ALL).into(holder.postImage);
        }catch (NullPointerException e){

        }

    }

    @Override
    public int getItemCount() {
        return announcementNewsFeedDataModalArrayList.size();
    }

    public interface OnItemClickLitener {
        void onItemClick(View view, int position, AnnouncementCategoryDataModal announcementCategoryDataModal);

    }

    private OnItemClickLitener mOnItemClickLitener;

    public void setOnItemClickListener(OnItemClickLitener mOnItemClickLitener) {
        this.mOnItemClickLitener = mOnItemClickLitener;
    }

//    private void textAnimation(TextView textView,float start){
//        final TextView tv = textView;
//
//        final float startSize = start/context.getResources().getDisplayMetrics().scaledDensity;; // Size in pixels
//        final float endSize = 25;
//        long animationDuration = 600; // Animation duration in ms
//
//        ValueAnimator animator = ValueAnimator.ofFloat(startSize, endSize);
//        animator.setDuration(animationDuration);
//
//        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
//            @Override
//            public void onAnimationUpdate(ValueAnimator valueAnimator) {
//                float animatedValue = (float) valueAnimator.getAnimatedValue();
//                tv.setTextSize(animatedValue);
//            }
//        });
//        animator.start();
//    }
//    private void textAnimationDown(TextView textView,float end){
//        final TextView tv = textView;
//
//        final float startSize = end/context.getResources().getDisplayMetrics().scaledDensity; // Size in pixels
//        final float endSize = 15;
//        long animationDuration = 600; // Animation duration in ms
//
//        ValueAnimator animator = ValueAnimator.ofFloat(startSize, endSize);
//        animator.setDuration(animationDuration);
//
//        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
//            @Override
//            public void onAnimationUpdate(ValueAnimator valueAnimator) {
//                float animatedValue = (float) valueAnimator.getAnimatedValue();
//                tv.setTextSize(animatedValue);
//            }
//        });
//
//        animator.start();
//    }

}


