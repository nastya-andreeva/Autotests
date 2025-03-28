package edu.misis.nastyusha.proxy.domain;

import java.util.HashMap;
import java.util.Map;

class CacheProxyYouTubeApiClient implements YouTubeApiClient {

    private YouTubeApiClient youtubeService;
    private HashMap<String, Video> cachePopular = new HashMap<String, Video>();
    private Map<String, Video> cacheAll = new HashMap<String, Video>();

    public CacheProxyYouTubeApiClient() {
        this.youtubeService = new ThirdPartyYouTubeApiClient();
    }

    public HashMap<String, Video> popularVideos() {
        if (cachePopular.isEmpty())
            cachePopular = youtubeService.popularVideos();
        else
            System.out.println("Retrieved list from cache.");

        return cachePopular;
    }

    public Video getVideo(String videoId) {
        Video video;
        if (!cacheAll.containsKey(videoId)) {
            video = youtubeService.getVideo(videoId);
            cacheAll.put(videoId, video);
        } else {
            System.out.println("Retrieved video '" + videoId + "' from cache.");
                    video = cacheAll.get(videoId);
        }

        return video;
    }

    public void reset() {
        cachePopular.clear();
        cacheAll.clear();
    }
}
