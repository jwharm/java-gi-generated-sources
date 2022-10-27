package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * During invocation, g_desktop_app_info_launch_uris_as_manager() may
 * create one or more child processes.  This callback is invoked once
 * for each, providing the process ID.
 */
@FunctionalInterface
public interface DesktopAppLaunchCallback {
        void onDesktopAppLaunchCallback(@NotNull org.gtk.gio.DesktopAppInfo appinfo, @NotNull org.gtk.glib.Pid pid);
}
