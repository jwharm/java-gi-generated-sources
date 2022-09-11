package org.gtk.glib;

@FunctionalInterface
public interface IOFunc {

        void onIOFunc(IOChannel source, int condition);
}
