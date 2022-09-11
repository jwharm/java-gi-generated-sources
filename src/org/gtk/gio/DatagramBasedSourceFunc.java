package org.gtk.gio;

@FunctionalInterface
public interface DatagramBasedSourceFunc {

        void onDatagramBasedSourceFunc(DatagramBased datagramBased, int condition);
}
