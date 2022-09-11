package org.gtk.gio;

@FunctionalInterface
public interface TaskThreadFunc {

        void onTaskThreadFunc(Task task, org.gtk.gobject.Object sourceObject, jdk.incubator.foreign.MemoryAddress taskData);
}
