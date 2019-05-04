package hwants.activitytracker.com.model;

import java.time.LocalDateTime;

public class ActivityRecord extends Activity{
    private LocalDateTime performed;
    public LocalDateTime getPerformed() {
        return performed;
    }
    public void setPerformed(LocalDateTime performed) {
        this.performed = performed;
    }
}
