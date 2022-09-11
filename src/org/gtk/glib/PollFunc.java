package org.gtk.glib;

@FunctionalInterface
public interface PollFunc {

        void onPollFunc(PollFD ufds, int nfsd);
}
