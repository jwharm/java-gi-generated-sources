package org.gtk.gio;

/**
 * This is the function type of the callback used for the #GSource
 * returned by g_datagram_based_create_source().
 */
@FunctionalInterface
public interface DatagramBasedSourceFunc {
        boolean onDatagramBasedSourceFunc(DatagramBased datagramBased, int condition);
}
