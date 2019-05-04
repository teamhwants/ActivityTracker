package hwants.activitytracker.com.sorce;

import hwants.activitytracker.com.model.Activity;
import hwants.activitytracker.com.model.ActivityRecord;

import java.time.LocalDateTime;
import java.util.List;

public interface ActivityRecordRepo {
    void save(List<ActivityRecord> activityRecords);
    void delete(ActivityRecord record);
    List<ActivityRecord> get(Activity activity);
    List<Activity> find(Activity activity, LocalDateTime from, LocalDateTime to);
}
