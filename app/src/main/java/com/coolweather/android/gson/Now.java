package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Now {

    public String cloud;

    @SerializedName("cond_code")
    public String condCode; //	实况天气状况代码

    @SerializedName("cond_txt")
    public String condTxt;  //实况天气状况描述

    public String fl; //体感温度，默认单位：摄氏度

    public String hum;  //相对湿度

    public String pcpn;  //降水量

    public String pres;  //大气压强

    public String tmp;  //温度

    public String vis;  //能见度，默认单位：公里

    @SerializedName("wind_deg")
    public String windDeg; //

    @SerializedName("wind_dir")
    public String windDir;  //风向

    @SerializedName("wind_sc")
    public String windSc;  //风力

    @SerializedName("wind_spd")
    public String windSpd;  //风速，公里/小时

}
