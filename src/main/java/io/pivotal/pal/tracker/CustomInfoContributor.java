package io.pivotal.pal.tracker;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;

import java.util.HashMap;
import java.util.Map;

public class CustomInfoContributor implements InfoContributor {

    @Override
    public void contribute(Info.Builder builder) {
        Map<String,Object> buildInfo = new HashMap<>();
        buildInfo.put("org", "kent-miller");
        buildInfo.put("space", "review");
        buildInfo.put("author", "kent miller");

        Map<String,Object> map = new HashMap<>();
        map.put("buildInfo",buildInfo);

    }
}
