package org.gtk.gtk;

/**
 * User function that is called to determine if the {@code item} should be matched.
 * <p>
 * If the filter matches the item, this function must return {@code true}. If the
 * item should be filtered out, {@code false} must be returned.
 */
@FunctionalInterface
public interface CustomFilterFunc {
        boolean onCustomFilterFunc(org.gtk.gobject.Object item);
}
