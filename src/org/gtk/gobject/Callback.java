package org.gtk.gobject;

@FunctionalInterface
public interface Callback {

    /**
     * The type used for callback functions in structure definitions and function
     * signatures.
     * 
     * This doesn't mean that all callback functions must take no  parameters and
     * return void. The required signature of a callback function is determined by
     * the context in which is used (e.g. the signal to which it is connected).
     * 
     * Use G_CALLBACK() to cast the callback function to a #GCallback.
     */
    public void onCallback();
}
