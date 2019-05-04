package hwants.activitytracker.com.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ActivityTrackerConfig {
    @Value("default.local.save.file.path")
    private String localSaveFilePath;
}
