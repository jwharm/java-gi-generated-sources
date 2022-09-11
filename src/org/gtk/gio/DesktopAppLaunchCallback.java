package org.gtk.gio;

@FunctionalInterface
public interface DesktopAppLaunchCallback {

        void onDesktopAppLaunchCallback(DesktopAppInfo appinfo, org.gtk.glib.Pid pid);
}
