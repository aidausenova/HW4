package com.example.lesson4;

import android.os.Parcel;
import android.os.Parcelable;

public class Print implements Parcelable {
   private String text;

    protected Print(Parcel in) {
        text=in.readString();
    }

    public static final Creator<Print> CREATOR = new Creator<Print>() {
        @Override
        public Print createFromParcel(Parcel in) {
            return new Print(in);
        }

        @Override
        public Print[] newArray(int size) {
            return new Print[size];
        }
    };

    public String getText() {
        return text;
    }


    public Print(String text) {
        this.text=text;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }
}
