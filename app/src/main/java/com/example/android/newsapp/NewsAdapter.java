package com.example.android.newsapp;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Created by Cansu on 3.05.2018.
 */

public class NewsAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<HashMap<String, String>> data;
    private ArrayList<HashMap<String, Drawable>> data2;
    private static LayoutInflater inflater = null;
    private HashMap<String, String> localhash;
    private HashMap<String, Drawable> localhash2;
    private String author;
    private static View v;
    private Resources res;
    private HashMap<String, String> mData = new HashMap();
    private static String[] mKeys;

    public NewsAdapter(Context c, ArrayList<HashMap<String, String>> d, ArrayList<HashMap<String, Drawable>> d2) {
        context = c;
        data = d;
        data2 = d2;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mKeys = mData.keySet().toArray(new String[data.size()]);
    }

    public int getCount() {
        return data.size();
    }

    public Object getItem(int position) {
        return mData.get(mKeys[position]);
    }

    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        v = convertView;

        if (convertView == null)

            v = inflater.inflate(R.layout.list_item, null);

        TextView txt1 = v.findViewById(R.id.title);
        TextView txt2 = v.findViewById(R.id.date);
        TextView txt3 = v.findViewById(R.id.section);
        TextView txt4 = v.findViewById(R.id.author);
        ImageView image = v.findViewById(R.id.thumbnail);

        try {
            localhash = data.get(position);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        res = context.getResources();

        txt1.setText(localhash.get(res.getString(R.string.title)));
        String date = localhash.get(res.getString(R.string.webPublicationDate));
        String d = date.replace(res.getString(R.string.T), " ");
        String resultDate = d.replace(res.getString(R.string.Z), "");
        String formattedDate = parseDateToddMMyyyy(resultDate);
        txt2.setText(formattedDate);
        if (formattedDate != null && !formattedDate.isEmpty()) {

            txt2.setVisibility(View.VISIBLE);
        }

        String section = localhash.get(res.getString(R.string.sectionName));
        txt3.setText(section);
        if (section.equals(res.getString(R.string.football))) {
            txt3.setBackgroundColor(res.getColor(R.color.football));
        } else if (section.equals(res.getString(R.string.sport))) {
            txt3.setBackgroundColor(res.getColor(R.color.sport));
        } else if (section.equals(res.getString(R.string.politics))) {
            txt3.setBackgroundColor(res.getColor(R.color.politics));
        } else if (section.equals(res.getString(R.string.opinion))) {
            txt3.setBackgroundColor(res.getColor(R.color.opinion));
        } else if (section.equals(res.getString(R.string.usNews))) {
            txt3.setBackgroundColor(res.getColor(R.color.usNews));
        } else if (section.equals(res.getString(R.string.environment))) {
            txt3.setBackgroundColor(res.getColor(R.color.environment));
        } else if (section.equals(res.getString(R.string.worldNews))) {
            txt3.setBackgroundColor(res.getColor(R.color.worldNews));
        } else if (section.equals(res.getString(R.string.books))) {
            txt3.setBackgroundColor(res.getColor(R.color.books));
        } else if (section.equals(res.getString(R.string.business))) {
            txt3.setBackgroundColor(res.getColor(R.color.business));
        } else if (section.equals(res.getString(R.string.lifeAndStyle))) {
            txt3.setBackgroundColor(res.getColor(R.color.lifeAndStyle));
        } else if (section.equals(res.getString(R.string.artAndDesign))) {
            txt3.setBackgroundColor(res.getColor(R.color.artAnddesign));
        } else if (section.equals(res.getString(R.string.membership))) {
            txt3.setBackgroundColor(res.getColor(R.color.membership));
        } else if (section.equals(res.getString(R.string.film))) {
            txt3.setBackgroundColor(res.getColor(R.color.film));
        } else if (section.equals(res.getString(R.string.fashion))) {
            txt3.setBackgroundColor(res.getColor(R.color.fashion));
        } else if (section.equals(res.getString(R.string.travel))) {
            txt3.setBackgroundColor(res.getColor(R.color.travel));
        } else if (section.equals(res.getString(R.string.music))) {
            txt3.setBackgroundColor(res.getColor(R.color.music));
        } else if (section.equals(res.getString(R.string.televisionAndRadio))) {
            txt3.setBackgroundColor(res.getColor(R.color.televisionAndRadio));
        } else if (section.equals(res.getString(R.string.culture))) {
            txt3.setBackgroundColor(res.getColor(R.color.culture));
        } else if (section.equals(res.getString(R.string.ukNews))) {
            txt3.setBackgroundColor(res.getColor(R.color.ukNews));
        } else if (section.equals(res.getString(R.string.science))) {
            txt3.setBackgroundColor(res.getColor(R.color.science));
        } else if (section.equals(res.getString(R.string.technology))) {
            txt3.setBackgroundColor(res.getColor(R.color.technology));
        } else if (section.equals(res.getString(R.string.society))) {
            txt3.setBackgroundColor(res.getColor(R.color.society));
        } else if (section.equals(res.getString(R.string.money))) {
            txt3.setBackgroundColor(res.getColor(R.color.money));
        } else if (section.equals(res.getString(R.string.australianNews))) {
            txt3.setBackgroundColor(res.getColor(R.color.australiaNews));
        } else if (section.equals(res.getString(R.string.education))) {
            txt3.setBackgroundColor(res.getColor(R.color.education));
        } else if (section.equals(res.getString(R.string.stage))) {
            txt3.setBackgroundColor(res.getColor(R.color.stage));
        } else if (section.equals(res.getString(R.string.media))) {
            txt3.setBackgroundColor(res.getColor(R.color.media));
        } else if (section.equals(res.getString(R.string.inequality))) {
            txt3.setBackgroundColor(res.getColor(R.color.inequality));
        } else if (section.equals(res.getString(R.string.news))) {
            txt3.setBackgroundColor(res.getColor(R.color.news));
        }
        else {
            txt3.setBackgroundColor(res.getColor(R.color.defaultColor));
        }


        try {
            localhash2 = data2.get(position);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        image.setImageDrawable(localhash2.get(res.getString(R.string.thumbnail)));

        author = localhash.get(res.getString(R.string.author));
        txt4.setText(res.getString(R.string.writtenBy) + " " + author);

        if (author != null && !author.isEmpty()) {

            txt4.setVisibility(View.VISIBLE);
        }

        return v;
    }

    public String parseDateToddMMyyyy(String date) {
        String inputPattern = "yyyy-MM-dd HH:mm:ss";
        String outputPattern = "dd-MMM-yyyy h:mm a";
        SimpleDateFormat inputFormat = new SimpleDateFormat(inputPattern);
        SimpleDateFormat outputFormat = new SimpleDateFormat(outputPattern);

        Date mDate;
        String mStr = null;

        try {
            mDate = inputFormat.parse(date);
            mStr = outputFormat.format(mDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return mStr;
    }


}