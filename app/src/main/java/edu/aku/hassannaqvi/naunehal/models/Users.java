package edu.aku.hassannaqvi.naunehal.models;

import android.database.Cursor;

import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.naunehal.contracts.UsersContract;

/**
 * Created by hassan.naqvi on 11/30/2016.
 */

public class Users {


    String username;
    String password;
    String fullName;


    public String getUsername() {
        return username;
    }

    public Users setUsername(String username) {
        this.username = username;
        return this;
    }


    public String getPassword() {
        return password;
    }

    public Users setPassword(String password) {
        this.password = password;
        return this;
    }


    public String getFullName() {
        return fullName;
    }

    public Users setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }


    public Users Sync(JSONObject jsonObject) throws JSONException {
        this.username = jsonObject.getString(UsersContract.UsersTable.COLUMN_USERNAME);
        this.password = jsonObject.getString(UsersContract.UsersTable.COLUMN_PASSWORD);
        this.fullName = jsonObject.getString(UsersContract.UsersTable.COLUMN_FULL_NAME);
        return this;
    }

    public Users Hydrate(Cursor cursor) {
        this.username = cursor.getString(cursor.getColumnIndex(UsersContract.UsersTable.COLUMN_USERNAME));
        this.password = cursor.getString(cursor.getColumnIndex(UsersContract.UsersTable.COLUMN_PASSWORD));
        this.fullName = cursor.getString(cursor.getColumnIndex(UsersContract.UsersTable.COLUMN_FULL_NAME));
        return this;

    }


    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();
        json.put(UsersContract.UsersTable.COLUMN_USERNAME, this.username == null ? JSONObject.NULL : this.username);
        json.put(UsersContract.UsersTable.COLUMN_PASSWORD, this.password == null ? JSONObject.NULL : this.password);
        json.put(UsersContract.UsersTable.COLUMN_FULL_NAME, this.fullName == null ? JSONObject.NULL : this.fullName);
        return json;
    }


}