package ua.nure.panchenko.SummaryTask4.db;

import ua.nure.panchenko.SummaryTask4.db.entity.User;
/**
 * UserLock entity.
 */
public enum UserLock {
    LOCK, UNLOCKED;

    public static UserLock getUserLock(User user) {
        int userLockId = user.getUserLockId();
        return UserLock.values()[userLockId - 1];
    }

    public String getName() {
        return name().toLowerCase();
    }
}


