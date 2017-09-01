package khalti.utils;

import android.util.Log;

public class LogUtil {
    private static final boolean DEBUG = true;

    public static void log(String tag, Object message) {
        if (DEBUG) {
            Log.i("Debug", "**/|| " + tag + " ||** ------------------------------------" + message + "\n");
        }
    }

    public static void checkpoint(Object message) {
        if (DEBUG) {
            Log.i("Debug", "**/|| " + "Checkpoint" + " ||** ------------------------------------" + message + "\n");
        }
    }

    public static void sysOut(Object message) {
        System.out.print(message.toString());
    }
}
