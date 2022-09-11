package org.gtk.glib;

@FunctionalInterface
public interface ChildWatchFunc {

        void onChildWatchFunc(Pid pid, int waitStatus);
}
