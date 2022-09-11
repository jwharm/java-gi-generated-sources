package org.gtk.gio;

/**
 * The type of the function that is used to convert from a value stored
 * in a #GSettings to a value that is useful to the application.
 * 
 * If the value is successfully mapped, the result should be stored at
 * @result and %TRUE returned.  If mapping fails (for example, if @value
 * is not in the right format) then %FALSE should be returned.
 * 
 * If @value is %NULL then it means that the mapping function is being
 * given a "last chance" to successfully return a valid value.  %TRUE
 * must be returned in this case.
 */
@FunctionalInterface
public interface SettingsGetMapping {
        boolean onSettingsGetMapping(org.gtk.glib.Variant value, jdk.incubator.foreign.MemoryAddress result);
}
