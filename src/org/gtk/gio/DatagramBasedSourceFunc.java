package org.gtk.gio;

@FunctionalInterface
public interface DatagramBasedSourceFunc {

    /**
     * This is the function type of the callback used for the #GSource
     * returned by g_datagram_based_create_source().
     */
    public boolean onDatagramBasedSourceFunc(DatagramBased datagramBased, int condition, jdk.incubator.foreign.MemoryAddress userData);
}
