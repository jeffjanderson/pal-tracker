package io.pivotal.pal.tracker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class InMemoryTimeEntryRepository implements TimeEntryRepository {
    private HashMap<Long, TimeEntry> repo = new HashMap<Long, TimeEntry>();

    public TimeEntry create(TimeEntry timeEntry) {

        /*Random r = new Random();
        int low = 1;
        int high = 600;
        int result = r.nextInt(high-low) + low;*/

        //timeEntry.setId(result);

        timeEntry.setId(repo.size() + 1);

        repo.put((long) repo.size() + 1, timeEntry);

        return timeEntry;

    }

    public TimeEntry find(long id) {

        return repo.get(id);
    }

    public List<TimeEntry> list() {
        return new ArrayList<TimeEntry>(repo.values());
    }

    public TimeEntry update(long id, TimeEntry timeEntry) {
        timeEntry.setId(id);
        repo.replace((long) id, timeEntry);
        return timeEntry;
    }

    public void delete(long id) {
        repo.remove(id);
    }


}

/*
this.id = timeEntry.getId();
        this.projectId = timeEntry.getProjectId();
        this.userId = timeEntry.getUserId();
        this.date = timeEntry.getDate();
        this.hours = timeEntry.getHours();*/