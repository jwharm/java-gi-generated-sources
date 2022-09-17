package org.gtk.glib;

/**
 * Specifies the type of function which is called when an extended
 * error instance is freed. It is passed the error pointer about to be
 * freed, and should free the error&#39;s private data fields.
 * 
 * Normally, it is better to use G_DEFINE_EXTENDED_ERROR(), as it
 * already takes care of getting the private data from @error.
 */
@FunctionalInterface
public interface ErrorClearFunc {
        void onErrorClearFunc(Error error);
}
