package org.gtk.gio;

/**
 * The type of the function that is used to convert from a value stored
 * in a {@link Settings} to a value that is useful to the application.
 * <p>
 * If the value is successfully mapped, the result should be stored at
 * {@code result} and {@code true} returned.  If mapping fails (for example, if {@code value}
 * is not in the right format) then {@code false} should be returned.
 * <p>
 * If {@code value} is {@code null} then it means that the mapping function is being
 * given a "last chance" to successfully return a valid value.  {@code true}
 * must be returned in this case.
 */
@FunctionalInterface
public interface SettingsGetMapping {
        boolean onSettingsGetMapping(org.gtk.glib.Variant value, java.lang.foreign.MemoryAddress result);
}
