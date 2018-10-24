package com.lilliemountain.jadetiger;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class EventAdapter extends RecyclerView.Adapter<EventAdapter.EventHolder> {
    List<Event> eventList;
    Context context;
    public EventAdapter(Context context ,List<Event> eventList) {
        this.eventList=eventList;
        this.context=context;

    }
    @NonNull
    @Override
    public EventHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_artist,viewGroup,false);
        return new EventHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EventHolder eventHolder, int i) {
        eventHolder.artistName1.setText(eventList.get(i).getArtistName1());
        eventHolder.artist1Venue.setText(eventList.get(i).getArtist1Venue());
        eventHolder.artistName2.setText(eventList.get(i).getArtistName2());
        eventHolder.artist2Venue.setText(eventList.get(i).getArtist2Venue());
        Glide.with(context)
                .load(eventList.get(i).getArtist1ImageResource())
                .into(eventHolder.artist1ImageResource);
        Glide.with(context)
                .load(eventList.get(i).getArtist2ImageResource())
                .into(eventHolder.artist2ImageResource);
    }

    @Override
    public int getItemCount() {
        return eventList.size();
    }

    public class EventHolder extends RecyclerView.ViewHolder {
        TextView artistName1,artist1Venue;
        ImageView artist1ImageResource;
        TextView artistName2,artist2Venue;
        ImageView artist2ImageResource;
        public EventHolder(@NonNull View itemView) {
            super(itemView);
            artistName1=itemView.findViewById(R.id.artistName1);
            artist1Venue=itemView.findViewById(R.id.eventLocation1);
            artist1ImageResource=itemView.findViewById(R.id.photoArtist1);
            artistName2=itemView.findViewById(R.id.artistName2);
            artist2Venue=itemView.findViewById(R.id.eventLocation2);
            artist2ImageResource=itemView.findViewById(R.id.photoArtist2);
        }
    }
}
