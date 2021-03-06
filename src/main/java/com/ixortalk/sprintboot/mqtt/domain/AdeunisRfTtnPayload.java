package com.ixortalk.sprintboot.mqtt.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Date;

@Entity
public class AdeunisRfTtnPayload {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Embedded
    @JsonProperty("payload_fields")
    private PayloadFields payloadFields;

    @Embedded
    @JsonProperty("metadata")
    private Metadata metadata;
    
    private String app_id; //xxxxx",
    private String dev_id; //cccccc",
    private String hardware_serial; //xxxxxxxx",
    private int port; //: 1,
    private long counter; // 5,
    private boolean confirmed; // true,
    private String payload_raw; //xxxxxxx",

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getApp_id() {
        return app_id;
    }

    public void setApp_id(String app_id) {
        this.app_id = app_id;
    }

    public String getDev_id() {
        return dev_id;
    }

    public void setDev_id(String dev_id) {
        this.dev_id = dev_id;
    }

    public String getHardware_serial() {
        return hardware_serial;
    }

    public void setHardware_serial(String hardware_serial) {
        this.hardware_serial = hardware_serial;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public long getCounter() {
        return counter;
    }

    public void setCounter(long counter) {
        this.counter = counter;
    }

    public boolean isConfirmed() {
        return confirmed;
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }

    public String getPayload_raw() {
        return payload_raw;
    }

    public void setPayload_raw(String payload_raw) {
        this.payload_raw = payload_raw;
    }

    public PayloadFields getPayloadFields() {
        return payloadFields;
    }

    public void setPayloadFields(PayloadFields payloadFields) {
        this.payloadFields = payloadFields;
    }

    @Override
    public String toString() {
        return "AdeunisRfTtnPayload{" +
                "id=" + id +
                ", payloadFields=" + payloadFields +
                '}';
    }

    @Embeddable
    public static class Metadata {

        private Date time; //"2017-10-08T22:30:21.957684657Z",
        private double frequency; //867.1,
        private String modulation; //"LORA",
        private String data_rate; //"SF7BW125",
        private String coding_rate; //"4/5",

        public Date getTime() {
            return time;
        }

        public void setTime(Date time) {
            this.time = time;
        }

        public double getFrequency() {
            return frequency;
        }

        public void setFrequency(double frequency) {
            this.frequency = frequency;
        }

        public String getModulation() {
            return modulation;
        }

        public void setModulation(String modulation) {
            this.modulation = modulation;
        }

        public String getData_rate() {
            return data_rate;
        }

        public void setData_rate(String data_rate) {
            this.data_rate = data_rate;
        }

        public String getCoding_rate() {
            return coding_rate;
        }

        public void setCoding_rate(String coding_rate) {
            this.coding_rate = coding_rate;
        }

        @Override
        public String toString() {
            return "Metadata{" +
                    "time=" + time +
                    ", frequency=" + frequency +
                    ", modulation='" + modulation + '\'' +
                    ", data_rate='" + data_rate + '\'' +
                    ", coding_rate='" + coding_rate + '\'' +
                    '}';
        }
    }

    @Embeddable
    public static class PayloadFields {

        private int btn1; //32,
        private String device_id; //"adeunis-rf-tester",
        private int down; //55,
        private boolean gps; //true,
        private double lat; //"50.961950",
        private double lon; //"3.516833",
        private int rssi; //-185,
        private int snr; //109,
        private int temp; //24,
        private int uplink; //58,
        private double vbat; //6.155


        public int getBtn1() {
            return btn1;
        }

        public void setBtn1(int btn1) {
            this.btn1 = btn1;
        }

        public String getDevice_id() {
            return device_id;
        }

        public void setDevice_id(String device_id) {
            this.device_id = device_id;
        }

        public int getDown() {
            return down;
        }

        public void setDown(int down) {
            this.down = down;
        }

        public boolean isGps() {
            return gps;
        }

        public void setGps(boolean gps) {
            this.gps = gps;
        }

        public double getLat() {
            return lat;
        }

        public void setLat(double lat) {
            this.lat = lat;
        }

        public double getLon() {
            return lon;
        }

        public void setLon(double lon) {
            this.lon = lon;
        }

        public int getRssi() {
            return rssi;
        }

        public void setRssi(int rssi) {
            this.rssi = rssi;
        }

        public int getSnr() {
            return snr;
        }

        public void setSnr(int snr) {
            this.snr = snr;
        }

        public int getTemp() {
            return temp;
        }

        public void setTemp(int temp) {
            this.temp = temp;
        }

        public int getUplink() {
            return uplink;
        }

        public void setUplink(int uplink) {
            this.uplink = uplink;
        }

        public double getVbat() {
            return vbat;
        }

        public void setVbat(double vbat) {
            this.vbat = vbat;
        }


        @Override
        public String toString() {
            return "AdeunisRfTtnPayload{" +
                    "btn1=" + btn1 +
                    ", device_id='" + device_id + '\'' +
                    ", down=" + down +
                    ", gps=" + gps +
                    ", lat=" + lat +
                    ", lon=" + lon +
                    ", rssi=" + rssi +
                    ", snr=" + snr +
                    ", temp=" + temp +
                    ", uplink=" + uplink +
                    ", vbat=" + vbat +
                    '}';
        }

    }
}
