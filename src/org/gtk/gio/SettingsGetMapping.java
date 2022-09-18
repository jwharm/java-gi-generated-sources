package org.gtk.gio;

/**
 * The type of the function that is used to convert from a value stored
 * in a {@link org.gtk.gio.Settings} to a value that is useful to the application.
 * 
 * If the value is successfully mapped, the result should be stored at
 * @result and <code>true</code> returned.  If mapping fails (for example, if @value
 * is not in the right format) then <code>false</code> should be returned.
 * 
 * If @value is <code>null</code> then it means that the mapping function is being
 * given a &<code>#34</code> last chance&<code>#34</code>  to successfully return a valid value.  <code>true</code> must be returned in this case.
 */
@FunctionalInterface
public interface SettingsGetMapping {
        boolean onSettingsGetMapping(org.gtk.glib.Variant value, jdk.incubator.foreign.MemoryAddress result);
}
