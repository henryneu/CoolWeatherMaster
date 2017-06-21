package neu.cn.coolweathermaster.gson;

/**
 * Created by neuHenry on 2017/6/20.
 */

public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
