package org.gtk.glib;

@FunctionalInterface
public interface ErrorInitFunc {

    /**
     * Specifies the type of function which is called just after an
     * extended error instance is created and its fields filled. It should
     * only initialize the fields in the private data, which can be
     * received with the generated `*_get_private()` function.
     * 
     * Normally, it is better to use G_DEFINE_EXTENDED_ERROR(), as it
     * already takes care of getting the private data from @error.
     */
    public void onErrorInitFunc(Error error);
}
