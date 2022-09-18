package org.gtk.gtk;

/**
 * User function that is called to determine if the @item should be matched.
 * 
 * If the filter matches the item, this function must return <code>true</code>  If the
 * item should be filtered out, <code>false</code> must be returned.
 */
@FunctionalInterface
public interface CustomFilterFunc {
        boolean onCustomFilterFunc(org.gtk.gobject.Object item);
}
