package org.gtk.gtk;

@FunctionalInterface
public interface TickCallback {

        void onTickCallback(Widget widget, org.gtk.gdk.FrameClock frameClock);
}
