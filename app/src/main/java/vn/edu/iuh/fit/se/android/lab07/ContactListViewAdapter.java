package vn.edu.iuh.fit.se.android.lab07;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class ContactListViewAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Contact> contacts;

    public ContactListViewAdapter(Context context, int layout, List<Contact> contacts) {
        this.context = context;
        this.layout = layout;
        this.contacts = contacts;
    }

    @Override
    public int getCount() {
        return contacts.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(layout, viewGroup, false);
        }
        TextView tvName = view.findViewById(R.id.tvName);
        final Contact contact = contacts.get(i);
        tvName.setText(contact.getName());
        return view;
    }
}
