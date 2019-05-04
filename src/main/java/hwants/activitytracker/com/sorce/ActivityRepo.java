package hwants.activitytracker.com.sorce;

import hwants.activitytracker.com.model.Activity;

import java.util.List;

public interface ActivityRepo {
    void save(Activity activity);
    void delete(Activity activity);
    List<Activity> getAll();
    List<Activity> get(String name);
}
