package vn.edu.iuh.fit.se.android.lab07;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHandler databaseHandler = new DatabaseHandler(this);
//        List<Contact> contacts = new ArrayList<>();
//        contacts.add(new Contact(1, "Võ Đức Toàn"));
//        contacts.add(new Contact(2, "Phan Đình Nhật"));
//        contacts.add(new Contact(3, "Hoàng Hoa Thuấn"));
//        contacts.add(new Contact(4, "Nguyễn Hoàn Hữu"));
//        contacts.add(new Contact(5, "Phan Hồng Hà"));
//
//        for (Contact contact: contacts) {
//            databaseHandler.addContact(contact);
//        }
        ListView listView = findViewById(R.id.listViewContact);
        ContactListViewAdapter contactListViewAdapter = new ContactListViewAdapter(this, R.layout.contact_items_list_view, databaseHandler.getAllContacts());
        listView.setAdapter(contactListViewAdapter);

    }

}