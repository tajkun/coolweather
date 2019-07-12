package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Basic  {

    @SerializedName("cid")
    public String cityId;

    public String location;

    @SerializedName("parent_city")
    public String parentCity;

    @SerializedName("admin_area")
    public String adminArea;

    public String cnty;

    public String lat;

    public String lon;

    public String tz;

}
