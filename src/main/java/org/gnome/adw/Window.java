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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gtk.Window.getMemoryLayout().withName("parent_instance")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Create a Window proxy instance for the provided memory address.
     * <p>
     * Because Window is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Window(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to Window if its GType is a (or inherits from) "AdwWindow".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code Window} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "AdwWindow", a ClassCastException will be thrown.
     */
    public static Window castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), Window.getType())) {
            return new Window(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of AdwWindow");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
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
        return new org.gtk.gtk.Widget(RESULT, Ownership.NONE);
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
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.adw_window_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.Window.Build {
        
         /**
         * A {@link Window.Build} object constructs a {@link Window} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link Window} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Window} using {@link Window#castFrom}.
         * @return A new instance of {@code Window} with the properties 
         *         that were set in the Build object.
         */
        public Window construct() {
            return Window.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    Window.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The content widget.
         * <p>
         * This property should always be used instead of {@code Gtk.Window:child}.
         * @param content The value for the {@code content} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setContent(org.gtk.gtk.Widget content) {
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
