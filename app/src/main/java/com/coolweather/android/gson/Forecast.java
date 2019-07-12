package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Forecast {

    @SerializedName("cond_code_d")
    public String condCodeDaily;

    @SerializedName("cond_code_n")
    public String condCodeNight;

    @SerializedName("cond_txt_d")
    public String condTxtDaily;

    @SerializedName("cond_txt_n")
    public String condTxtNight;

    public String date;

    public String hum;

    public String mr;

    public String ms;

    public String pcpn;

    public String pop;

    public String pres;

    public String sr;

    public String ss;

    @SerializedName("tmp_max")
    public String tmpMax;

    @SerializedName("tmp_min")
    public String tmpMin;

    @SerializedName("uv_index")
    public String uvIndex;

    public String vis;

    @SerializedName("wind_deg")
    public String windDeg;

    @SerializedName("wind_dir")
    public String windDir;  //风向

    @SerializedName("wind_sc")
    public String windSc;  //风力

    @SerializedName("wind_spd")
    public String windSpd;  //风速，公里/小时

}
