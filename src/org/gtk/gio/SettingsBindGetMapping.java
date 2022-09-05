package org.gtk.gio;

@FunctionalInterface
public interface SettingsBindGetMapping {

    /**
     * The type for the function that is used to convert from #GSettings to
     * an object property. The @value is already initialized to hold values
     * of the appropriate type.
     */
    public boolean onSettingsBindGetMapping(org.gtk.gobject.Value value, org.gtk.glib.Variant variant, jdk.incubator.foreign.MemoryAddress userData);
}
