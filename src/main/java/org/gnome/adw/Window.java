package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A freeform window.
 * <p>
 * &lt;picture&gt;
 *   &lt;source srcset="window-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="window.png" alt="window"&gt;
 * &lt;/picture&gt;
 * <p>
 * The {@code AdwWindow} widget is a subclass of {@link org.gtk.gtk.Window} which has no
 * titlebar area. It means {@link org.gtk.gtk.HeaderBar} can be used as follows:
 * <pre>{@code xml
 * <object class="AdwWindow">
 *   <property name="content">
 *     <object class="GtkBox">
 *       <property name="orientation">vertical</property>
 *       <child>
 *         <object class="GtkHeaderBar"/>
 *       </child>
 *       <child>
 *         <!-- ... -->
 *       </child>
 *     </object>
 *   </property>
 * </object>
 * }</pre>
 * <p>
 * Using {@code Gtk.Window:titlebar} or {@code Gtk.Window:child}
 * is not supported and will result in a crash. Use {@code Window:content}
 * instead.
 * @version 1.0
 */
public class Window extends org.gtk.gtk.Window implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Native, org.gtk.gtk.Root, org.gtk.gtk.ShortcutManager {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "AdwWindow";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gtk.Window.getMemoryLayout().withName("parent_instance")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a Window proxy instance for the provided memory address.
     * <p>
     * Because Window is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected Window(Addressable address, Ownership ownership) {
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
    public static final Marshal<Addressable, Window> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new Window(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_window_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwWindow}.
     */
    public Window() {
        super(constructNew(), Ownership.NONE);
    }
    
    /**
     * Gets the content widget of {@code self}.
     * <p>
     * This method should always be used instead of {@link org.gtk.gtk.Window#getChild}.
     * @return the content widget of {@code self}
     */
    public @Nullable org.gtk.gtk.Widget getContent() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_window_get_content.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.Widget.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Sets the content widget of {@code self}.
     * <p>
     * This method should always be used instead of {@link org.gtk.gtk.Window#setChild}.
     * @param content the content widget
     */
    public void setContent(@Nullable org.gtk.gtk.Widget content) {
        try {
            DowncallHandles.adw_window_set_content.invokeExact(
                    handle(),
                    (Addressable) (content == null ? MemoryAddress.NULL : content.handle()));
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
            RESULT = (long) DowncallHandles.adw_window_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link Window.Builder} object constructs a {@link Window} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Window.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Window.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link Window} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Window}.
         * @return A new instance of {@code Window} with the properties 
         *         that were set in the Builder object.
         */
        public Window build() {
            return (Window) org.gtk.gobject.GObject.newWithProperties(
                Window.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The content widget.
         * <p>
         * This property should always be used instead of {@code Gtk.Window:child}.
         * @param content The value for the {@code content} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setContent(org.gtk.gtk.Widget content) {
            names.add("content");
            values.add(org.gtk.gobject.Value.create(content));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_window_new = Interop.downcallHandle(
            "adw_window_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_window_get_content = Interop.downcallHandle(
            "adw_window_get_content",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_window_set_content = Interop.downcallHandle(
            "adw_window_set_content",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_window_get_type = Interop.downcallHandle(
            "adw_window_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
