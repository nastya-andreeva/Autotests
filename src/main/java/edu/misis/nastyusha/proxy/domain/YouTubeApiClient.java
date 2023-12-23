package edu.misis.nastyusha.proxy.domain;

import java.util.HashMap;

public interface YouTubeApiClient {
    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}
