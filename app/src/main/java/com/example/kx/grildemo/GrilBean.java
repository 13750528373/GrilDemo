package com.example.kx.grildemo;

import java.util.List;

/**
 * Created by KX on 2017/8/21.
 */

public class GrilBean {

    /**
     * error : false
     * results : [{"_id":"599a299a421aa901b9dc460f","createdAt":"2017-08-21T08:30:18.487Z","desc":"8-21","publishedAt":"2017-08-21T11:38:57.363Z","source":"chrome","type":"福利","url":"https://ws1.sinaimg.cn/large/610dc034ly1fir1jbpod5j20ip0newh3.jpg","used":true,"who":"daimajia"},{"_id":"599386fe421aa9672cdf0812","createdAt":"2017-08-16T07:42:54.135Z","desc":"8-16","publishedAt":"2017-08-17T11:36:42.967Z","source":"chrome","type":"福利","url":"https://ws1.sinaimg.cn/large/610dc034ly1fil82i7zsmj20u011hwja.jpg","used":true,"who":"daimajia"},{"_id":"599237dd421aa96729c57246","createdAt":"2017-08-15T07:53:01.962Z","desc":"8-15","publishedAt":"2017-08-15T13:32:36.998Z","source":"chrome","type":"福利","url":"https://ws1.sinaimg.cn/large/610dc034ly1fik2q1k3noj20u00u07wh.jpg","used":true,"who":"daimajia"},{"_id":"59907386421aa9672cdf07ff","createdAt":"2017-08-13T23:43:02.253Z","desc":"8-13","publishedAt":"2017-08-14T17:04:50.266Z","source":"chrome","type":"福利","url":"https://ws1.sinaimg.cn/large/610dc034ly1fiiiyfcjdoj20u00u0ju0.jpg","used":true,"who":"dmj"},{"_id":"598bb8f0421aa90ca3bb6c01","createdAt":"2017-08-10T09:37:52.684Z","desc":"8-10","publishedAt":"2017-08-11T14:05:53.749Z","source":"chrome","type":"福利","url":"https://ws1.sinaimg.cn/large/610dc034ly1fiednrydq8j20u011itfz.jpg","used":true,"who":"带马甲"},{"_id":"598a5478421aa90ca3bb6bfc","createdAt":"2017-08-09T08:16:56.373Z","desc":"8-9","publishedAt":"2017-08-09T13:49:27.260Z","source":"chrome","type":"福利","url":"https://ws1.sinaimg.cn/large/610dc034ly1fid5poqfznj20u011imzm.jpg","used":true,"who":"daimajia"},{"_id":"598886d9421aa90ca209c570","createdAt":"2017-08-07T23:27:21.296Z","desc":"8-8","publishedAt":"2017-08-08T11:34:20.37Z","source":"chrome","type":"福利","url":"https://ws1.sinaimg.cn/large/610dc034ly1fibksd2mbmj20u011iacx.jpg","used":true,"who":"daimajia"},{"_id":"59826564421aa90ca3bb6bda","createdAt":"2017-08-03T07:51:00.249Z","desc":"8-3","publishedAt":"2017-08-03T12:08:07.258Z","source":"chrome","type":"福利","url":"https://ws1.sinaimg.cn/large/610dc034gy1fi678xgq1ij20pa0vlgo4.jpg","used":true,"who":"代码家"},{"_id":"59810747421aa90ca3bb6bcc","createdAt":"2017-08-02T06:57:11.207Z","desc":"8-2","publishedAt":"2017-08-02T12:21:45.220Z","source":"chrome","type":"福利","url":"https://ws1.sinaimg.cn/large/610dc034gy1fi502l3eqjj20u00hz41j.jpg","used":true,"who":"代码家"},{"_id":"597e622f421aa97de5c7c9ea","createdAt":"2017-07-31T06:48:15.386Z","desc":"7-31","publishedAt":"2017-08-01T11:48:20.466Z","source":"chrome","type":"福利","url":"https://ws1.sinaimg.cn/large/610dc034gy1fi2okd7dtjj20u011h40b.jpg","used":true,"who":"daimajia"}]
     */

    private boolean error;
    private List<ResultsBean> results;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean {
        /**
         * _id : 599a299a421aa901b9dc460f
         * createdAt : 2017-08-21T08:30:18.487Z
         * desc : 8-21
         * publishedAt : 2017-08-21T11:38:57.363Z
         * source : chrome
         * type : 福利
         * url : https://ws1.sinaimg.cn/large/610dc034ly1fir1jbpod5j20ip0newh3.jpg
         * used : true
         * who : daimajia
         */

        private String _id;
        private String createdAt;
        private String desc;
        private String publishedAt;
        private String source;
        private String type;
        private String url;
        private boolean used;
        private String who;

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public boolean isUsed() {
            return used;
        }

        public void setUsed(boolean used) {
            this.used = used;
        }

        public String getWho() {
            return who;
        }

        public void setWho(String who) {
            this.who = who;
        }
    }
}
