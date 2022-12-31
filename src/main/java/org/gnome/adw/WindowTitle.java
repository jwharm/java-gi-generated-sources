package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A helper widget for setting a window's title and subtitle.
 * <p>
 * &lt;picture&gt;
 *   &lt;source srcset="window-title-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="window-title.png" alt="window-title"&gt;
 * &lt;/picture&gt;
 * <p>
 * {@code AdwWindowTitle} shows a title and subtitle. It's intended to be used as the
 * title child of {@link org.gtk.gtk.HeaderBar}.
 * <p>
 * <strong>CSS nodes</strong><br/>
 * {@code AdwWindowTitle} has a single CSS node with name {@code windowtitle}.
 * @version 1.0
 */
public class WindowTitle extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "AdwWindowTitle";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a WindowTitle proxy instance for the provided memory address.
     * <p>
     * Because WindowTitle is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected WindowTitle(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            try {
                var RESULT = (MemoryAddress) Interop.g_object_ref_sink.invokeExact(address);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, WindowTitle> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new WindowTitle(input, ownership);
    
    private static MemoryAddress constructNew(java.lang.String title, java.lang.String subtitle) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_window_title_new.invokeExact(
                    Marshal.stringToAddress.marshal(title, null),
                    Marshal.stringToAddress.marshal(subtitle, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwWindowTitle}.
     * @param title a title
     * @param subtitle a subtitle
     */
    public WindowTitle(java.lang.String title, java.lang.String subtitle) {
        super(constructNew(title, subtitle), Ownership.NONE);
    }
    
    /**
     * Gets the subtitle of {@code self}.
     * @return the subtitle
     */
    public java.lang.String getSubtitle() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_window_title_get_subtitle.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the title of {@code self}.
     * @return the title
     */
    public java.lang.String getTitle() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_window_title_get_title.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Sets the subtitle of {@code self}.
     * <p>
     * The subtitle should give the user additional details.
     * @param subtitle a subtitle
     */
    public void setSubtitle(java.lang.String subtitle) {
        try {
            DowncallHandles.adw_window_title_set_subtitle.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(subtitle, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the title of {@code self}.
     * <p>
     * The title typically identifies the current view or content item, and
     * generally does not use the application name.
     * @param title a title
     */
    public void setTitle(java.lang.String title) {
        try {
            DowncallHandles.adw_window_title_set_title.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(title, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.adw_window_title_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link WindowTitle.Builder} object constructs a {@link WindowTitle} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link WindowTitle.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Widget.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link WindowTitle} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link WindowTitle}.
         * @return A new instance of {@code WindowTitle} with the properties 
         *         that were set in the Builder object.
         */
        public WindowTitle build() {
            return (WindowTitle) org.gtk.gobject.GObject.newWithProperties(
                WindowTitle.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The subtitle to display.
         * <p>
         * The subtitle should give the user additional details.
         * @param subtitle The value for the {@code subtitle} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSubtitle(java.lang.String subtitle) {
            names.add("subtitle");
            values.add(org.gtk.gobject.Value.create(subtitle));
            return this;
        }
        
        /**
         * The title to display.
         * <p>
         * The title typically identifies the current view or content item, and
         * generally does not use the application name.
         * @param title The value for the {@code title} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTitle(java.lang.String title) {
            names.add("title");
            values.add(org.gtk.gobject.Value.create(title));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_window_title_new = Interop.downcallHandle(
            "adw_window_title_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_window_title_get_subtitle = Interop.downcallHandle(
            "adw_window_title_get_subtitle",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_window_title_get_title = Interop.downcallHandle(
            "adw_window_title_get_title",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_window_title_set_subtitle = Interop.downcallHandle(
            "adw_window_title_set_subtitle",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_window_title_set_title = Interop.downcallHandle(
            "adw_window_title_set_title",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_window_title_get_type = Interop.downcallHandle(
            "adw_window_title_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
