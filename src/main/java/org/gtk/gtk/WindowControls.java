package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkWindowControls} shows window frame controls.
 * <p>
 * Typical window frame controls are minimize, maximize and close buttons,
 * and the window icon.
 * <p>
 * <img src="./doc-files/windowcontrols.png" alt="An example GtkWindowControls">
 * <p>
 * {@code GtkWindowControls} only displays start or end side of the controls (see
 * {@code Gtk.WindowControls:side}), so it's intended to be always used
 * in pair with another {@code GtkWindowControls} for the opposite side, for example:
 * <pre>{@code xml
 * <object class="GtkBox">
 *   <child>
 *     <object class="GtkWindowControls">
 *       <property name="side">start</property>
 *     </object>
 *   </child>
 * 
 *   ...
 * 
 *   <child>
 *     <object class="GtkWindowControls">
 *       <property name="side">end</property>
 *     </object>
 *   </child>
 * </object>
 * }</pre>
 * <p>
 * <strong>CSS nodes</strong><br/>
 * <pre>{@code 
 * windowcontrols
 * ├── [image.icon]
 * ├── [button.minimize]
 * ├── [button.maximize]
 * ╰── [button.close]
 * }</pre>
 * <p>
 * A {@code GtkWindowControls}' CSS node is called windowcontrols. It contains
 * subnodes corresponding to each title button. Which of the title buttons
 * exist and where they are placed exactly depends on the desktop environment
 * and {@code Gtk.WindowControls:decoration-layout} value.
 * <p>
 * When {@code Gtk.WindowControls:empty} is {@code true}, it gets the .empty
 * style class.
 * <p>
 * <strong>Accessibility</strong><br/>
 * {@code GtkWindowControls} uses the {@link AccessibleRole#GROUP} role.
 */
public class WindowControls extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkWindowControls";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a WindowControls proxy instance for the provided memory address.
     * <p>
     * Because WindowControls is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected WindowControls(Addressable address, Ownership ownership) {
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
    public static final Marshal<Addressable, WindowControls> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new WindowControls(input, ownership);
    
    private static MemoryAddress constructNew(org.gtk.gtk.PackType side) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_window_controls_new.invokeExact(
                    side.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkWindowControls}.
     * @param side the side
     */
    public WindowControls(org.gtk.gtk.PackType side) {
        super(constructNew(side), Ownership.NONE);
    }
    
    /**
     * Gets the decoration layout of this {@code GtkWindowControls}.
     * @return the decoration layout or {@code null} if it is unset
     */
    public @Nullable java.lang.String getDecorationLayout() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_window_controls_get_decoration_layout.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets whether the widget has any window buttons.
     * @return {@code true} if the widget has window buttons, otherwise {@code false}
     */
    public boolean getEmpty() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_window_controls_get_empty.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the side to which this {@code GtkWindowControls} instance belongs.
     * @return the side
     */
    public org.gtk.gtk.PackType getSide() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_window_controls_get_side.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.PackType.of(RESULT);
    }
    
    /**
     * Sets the decoration layout for the title buttons.
     * <p>
     * This overrides the {@code Gtk.Settings:gtk-decoration-layout}
     * setting.
     * <p>
     * The format of the string is button names, separated by commas.
     * A colon separates the buttons that should appear on the left
     * from those on the right. Recognized button names are minimize,
     * maximize, close and icon (the window icon).
     * <p>
     * For example, “icon:minimize,maximize,close” specifies a icon
     * on the left, and minimize, maximize and close buttons on the right.
     * <p>
     * If {@code Gtk.WindowControls:side} value is {@code GTK_PACK_START}, {@code self}
     * will display the part before the colon, otherwise after that.
     * @param layout a decoration layout, or {@code null} to unset the layout
     */
    public void setDecorationLayout(@Nullable java.lang.String layout) {
        try {
            DowncallHandles.gtk_window_controls_set_decoration_layout.invokeExact(
                    handle(),
                    (Addressable) (layout == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(layout, null)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Determines which part of decoration layout the {@code GtkWindowControls} uses.
     * <p>
     * See {@code Gtk.WindowControls:decoration-layout}.
     * @param side a side
     */
    public void setSide(org.gtk.gtk.PackType side) {
        try {
            DowncallHandles.gtk_window_controls_set_side.invokeExact(
                    handle(),
                    side.getValue());
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
            RESULT = (long) DowncallHandles.gtk_window_controls_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link WindowControls.Builder} object constructs a {@link WindowControls} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link WindowControls.Builder#build()}. 
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
         * Finish building the {@link WindowControls} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link WindowControls}.
         * @return A new instance of {@code WindowControls} with the properties 
         *         that were set in the Builder object.
         */
        public WindowControls build() {
            return (WindowControls) org.gtk.gobject.GObject.newWithProperties(
                WindowControls.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The decoration layout for window buttons.
         * <p>
         * If this property is not set, the
         * {@code Gtk.Settings:gtk-decoration-layout} setting is used.
         * @param decorationLayout The value for the {@code decoration-layout} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDecorationLayout(java.lang.String decorationLayout) {
            names.add("decoration-layout");
            values.add(org.gtk.gobject.Value.create(decorationLayout));
            return this;
        }
        
        /**
         * Whether the widget has any window buttons.
         * @param empty The value for the {@code empty} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setEmpty(boolean empty) {
            names.add("empty");
            values.add(org.gtk.gobject.Value.create(empty));
            return this;
        }
        
        /**
         * Whether the widget shows start or end side of the decoration layout.
         * <p>
         * See {@code Gtk.WindowControls:decoration_layout}.
         * @param side The value for the {@code side} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSide(org.gtk.gtk.PackType side) {
            names.add("side");
            values.add(org.gtk.gobject.Value.create(side));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_window_controls_new = Interop.downcallHandle(
            "gtk_window_controls_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_window_controls_get_decoration_layout = Interop.downcallHandle(
            "gtk_window_controls_get_decoration_layout",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_window_controls_get_empty = Interop.downcallHandle(
            "gtk_window_controls_get_empty",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_window_controls_get_side = Interop.downcallHandle(
            "gtk_window_controls_get_side",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_window_controls_set_decoration_layout = Interop.downcallHandle(
            "gtk_window_controls_set_decoration_layout",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_window_controls_set_side = Interop.downcallHandle(
            "gtk_window_controls_set_side",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_window_controls_get_type = Interop.downcallHandle(
            "gtk_window_controls_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
