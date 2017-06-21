package neu.cn.coolweathermaster.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by neuHenry on 2017/6/20.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
