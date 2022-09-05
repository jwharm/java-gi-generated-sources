package org.gtk.gio;

@FunctionalInterface
public interface DesktopAppLaunchCallback {

    /**
     * During invocation, g_desktop_app_info_launch_uris_as_manager() may
     * create one or more child processes.  This callback is invoked once
     * for each, providing the process ID.
     */
    public void onDesktopAppLaunchCallback(DesktopAppInfo appinfo, org.gtk.glib.Pid pid, jdk.incubator.foreign.MemoryAddress userData);
}
