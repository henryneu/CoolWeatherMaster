package neu.cn.coolweathermaster.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by neuHenry on 2017/6/20.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
