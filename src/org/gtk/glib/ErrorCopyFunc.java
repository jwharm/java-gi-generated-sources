package org.gtk.glib;

/**
 * Specifies the type of function which is called when an extended
 * error instance is copied. It is passed the pointer to the
 * destination error and source error, and should copy only the fields
 * of the private data from {@code src_error} to {@code dest_error}.
 * <p>
 * Normally, it is better to use G_DEFINE_EXTENDED_ERROR(), as it
 * already takes care of getting the private data from {@code src_error} and
 * {@code dest_error}.
 */
@FunctionalInterface
public interface ErrorCopyFunc {
        void onErrorCopyFunc(Error srcError, Error destError);
}
