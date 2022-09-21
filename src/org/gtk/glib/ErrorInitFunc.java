package org.gtk.glib;

/**
 * Specifies the type of function which is called just after an
 * extended error instance is created and its fields filled. It should
 * only initialize the fields in the private data, which can be
 * received with the generated {@code *_get_private()} function.
 * <p>
 * Normally, it is better to use G_DEFINE_EXTENDED_ERROR(), as it
 * already takes care of getting the private data from {@code error}.
 */
@FunctionalInterface
public interface ErrorInitFunc {
        void onErrorInitFunc(Error error);
}
