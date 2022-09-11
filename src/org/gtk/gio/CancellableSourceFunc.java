package org.gtk.gio;

@FunctionalInterface
public interface CancellableSourceFunc {

        void onCancellableSourceFunc(Cancellable cancellable);
}
