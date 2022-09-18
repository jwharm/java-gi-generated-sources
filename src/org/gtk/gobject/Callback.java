package org.gtk.gobject;

/**
 * The type used for callback functions in structure definitions and function
 * signatures.
 * 
 * This doesn&<code>#39</code> t mean that all callback functions must take no  parameters and
 * return void. The required signature of a callback function is determined by
 * the context in which is used (e.g. the signal to which it is connected).
 * 
 * Use G_CALLBACK() to cast the callback function to a {@link org.gtk.gobject.Callback}
 */
@FunctionalInterface
public interface Callback {
        void onCallback();
}
