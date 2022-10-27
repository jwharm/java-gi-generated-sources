package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Prototype of a {@code GChildWatchSource} callback, called when a child
 * process has exited.
 * <p>
 * To interpret {@code wait_status}, see the documentation
 * for g_spawn_check_wait_status(). In particular,
 * on Unix platforms, note that it is usually not equal
 * to the integer passed to {@code exit()} or returned from {@code main()}.
 */
@FunctionalInterface
public interface ChildWatchFunc {
        void onChildWatchFunc(@NotNull org.gtk.glib.Pid pid, int waitStatus);
}
