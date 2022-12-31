package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Contains information found when looking up an icon in {@code GtkIconTheme}.
 * <p>
 * {@code GtkIconPaintable} implements {@code GdkPaintable}.
 */
public class IconPaintable extends org.gtk.gobject.GObject implements org.gtk.gdk.Paintable, org.gtk.gtk.SymbolicPaintable {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkIconPaintable";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a IconPaintable proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected IconPaintable(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, IconPaintable> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new IconPaintable(input, ownership);
    
    private static MemoryAddress constructNewForFile(org.gtk.gio.File file, int size, int scale) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_icon_paintable_new_for_file.invokeExact(
                    file.handle(),
                    size,
                    scale);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@code GtkIconPaintable} for a file with a given size and scale.
     * <p>
     * The icon can then be rendered by using it as a {@code GdkPaintable}.
     * @param file a {@code GFile}
     * @param size desired icon size
     * @param scale the desired scale
     * @return a {@code GtkIconPaintable} containing
     *   for the icon. Unref with g_object_unref()
     */
    public static IconPaintable newForFile(org.gtk.gio.File file, int size, int scale) {
        var RESULT = constructNewForFile(file, size, scale);
        return (org.gtk.gtk.IconPaintable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.IconPaintable.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the {@code GFile} that was used to load the icon.
     * <p>
     * Returns {@code null} if the icon was not loaded from a file.
     * @return the {@code GFile} for the icon
     */
    public @Nullable org.gtk.gio.File getFile() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_icon_paintable_get_file.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.File.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Get the icon name being used for this icon.
     * <p>
     * When an icon looked up in the icon theme was not available, the
     * icon theme may use fallback icons - either those specified to
     * gtk_icon_theme_lookup_icon() or the always-available
     * "image-missing". The icon chosen is returned by this function.
     * <p>
     * If the icon was created without an icon theme, this function
     * returns {@code null}.
     * @return the themed icon-name for the
     *   icon, or {@code null} if its not a themed icon.
     */
    public @Nullable java.lang.String getIconName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_icon_paintable_get_icon_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Checks if the icon is symbolic or not.
     * <p>
     * This currently uses only the file name and not the file contents
     * for determining this. This behaviour may change in the future.
     * <p>
     * Note that to render a symbolic {@code GtkIconPaintable} properly (with
     * recoloring), you have to set its icon name on a {@code GtkImage}.
     * @return {@code true} if the icon is symbolic, {@code false} otherwise
     */
    public boolean isSymbolic() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_icon_paintable_is_symbolic.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_icon_paintable_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link IconPaintable.Builder} object constructs a {@link IconPaintable} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link IconPaintable.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link IconPaintable} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link IconPaintable}.
         * @return A new instance of {@code IconPaintable} with the properties 
         *         that were set in the Builder object.
         */
        public IconPaintable build() {
            return (IconPaintable) org.gtk.gobject.GObject.newWithProperties(
                IconPaintable.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The file representing the icon, if any.
         * @param file The value for the {@code file} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFile(org.gtk.gio.File file) {
            names.add("file");
            values.add(org.gtk.gobject.Value.create(file));
            return this;
        }
        
        /**
         * The icon name that was chosen during lookup.
         * @param iconName The value for the {@code icon-name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setIconName(java.lang.String iconName) {
            names.add("icon-name");
            values.add(org.gtk.gobject.Value.create(iconName));
            return this;
        }
        
        /**
         * Whether the icon is symbolic or not.
         * @param isSymbolic The value for the {@code is-symbolic} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setIsSymbolic(boolean isSymbolic) {
            names.add("is-symbolic");
            values.add(org.gtk.gobject.Value.create(isSymbolic));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_icon_paintable_new_for_file = Interop.downcallHandle(
            "gtk_icon_paintable_new_for_file",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_icon_paintable_get_file = Interop.downcallHandle(
            "gtk_icon_paintable_get_file",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_icon_paintable_get_icon_name = Interop.downcallHandle(
            "gtk_icon_paintable_get_icon_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_icon_paintable_is_symbolic = Interop.downcallHandle(
            "gtk_icon_paintable_is_symbolic",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_icon_paintable_get_type = Interop.downcallHandle(
            "gtk_icon_paintable_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
