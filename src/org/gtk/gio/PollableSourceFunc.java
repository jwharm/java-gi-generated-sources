package org.gtk.gio;

@FunctionalInterface
public interface PollableSourceFunc {

        void onPollableSourceFunc(org.gtk.gobject.Object pollableStream);
}
