package org.gtk.glib;

@FunctionalInterface
public interface ErrorCopyFunc {

    /**
     * Specifies the type of function which is called when an extended
     * error instance is copied. It is passed the pointer to the
     * destination error and source error, and should copy only the fields
     * of the private data from @src_error to @dest_error.
     * 
     * Normally, it is better to use G_DEFINE_EXTENDED_ERROR(), as it
     * already takes care of getting the private data from @src_error and
     * @dest_error.
     */
    public void onErrorCopyFunc(Error srcError, Error destError);
}
