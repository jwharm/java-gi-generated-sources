package org.gtk.gio;

import io.github.jwharm.javagi.*;

/**
 * During invocation, g_desktop_app_info_launch_uris_as_manager() may
 * create one or more child processes.  This callback is invoked once
 * for each, providing the process ID.
 */
@FunctionalInterface
public interface DesktopAppLaunchCallback {
        void onDesktopAppLaunchCallback(DesktopAppInfo appinfo, org.gtk.glib.Pid pid);
}
