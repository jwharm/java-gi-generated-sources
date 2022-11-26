package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkWidgetPaintable} is a {@code GdkPaintable} that displays the contents
 * of a widget.
 * <p>
 * {@code GtkWidgetPaintable} will also take care of the widget not being in a
 * state where it can be drawn (like when it isn't shown) and just draw
 * nothing or where it does not have a size (like when it is hidden) and
 * report no size in that case.
 * <p>
 * Of course, {@code GtkWidgetPaintable} allows you to monitor widgets for size
 * changes by emitting the {@code Gdk.Paintable::invalidate-size} signal
 * whenever the size of the widget changes as well as for visual changes by
 * emitting the {@code Gdk.Paintable::invalidate-contents} signal whenever
 * the widget changes.
 * <p>
 * You can use a {@code GtkWidgetPaintable} everywhere a {@code GdkPaintable} is allowed,
 * including using it on a {@code GtkPicture} (or one of its parents) that it was
 * set on itself via gtk_picture_set_paintable(). The paintable will take care
 * of recursion when this happens. If you do this however, ensure that the
 * {@code Gtk.Picture:can-shrink} property is set to {@code true} or you might
 * end up with an infinitely growing widget.
 */
public class WidgetPaintable extends org.gtk.gobject.Object implements org.gtk.gdk.Paintable {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkWidgetPaintable";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a WidgetPaintable proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public WidgetPaintable(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to WidgetPaintable if its GType is a (or inherits from) "GtkWidgetPaintable".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code WidgetPaintable} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkWidgetPaintable", a ClassCastException will be thrown.
     */
    public static WidgetPaintable castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), WidgetPaintable.getType())) {
            return new WidgetPaintable(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkWidgetPaintable");
        }
    }
    
    private static Addressable constructNew(@Nullable org.gtk.gtk.Widget widget) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_widget_paintable_new.invokeExact(
                    (Addressable) (widget == null ? MemoryAddress.NULL : widget.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new widget paintable observing the given widget.
     * @param widget a {@code GtkWidget}
     */
    public WidgetPaintable(@Nullable org.gtk.gtk.Widget widget) {
        super(constructNew(widget), Ownership.FULL);
    }
    
    /**
     * Returns the widget that is observed or {@code null} if none.
     * @return the observed widget.
     */
    public @Nullable org.gtk.gtk.Widget getWidget() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_widget_paintable_get_widget.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(RESULT, Ownership.NONE);
    }
    
    /**
     * Sets the widget that should be observed.
     * @param widget the widget to observe
     */
    public void setWidget(@Nullable org.gtk.gtk.Widget widget) {
        try {
            DowncallHandles.gtk_widget_paintable_set_widget.invokeExact(
                    handle(),
                    (Addressable) (widget == null ? MemoryAddress.NULL : widget.handle()));
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
            RESULT = (long) DowncallHandles.gtk_widget_paintable_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link WidgetPaintable.Build} object constructs a {@link WidgetPaintable} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link WidgetPaintable} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link WidgetPaintable} using {@link WidgetPaintable#castFrom}.
         * @return A new instance of {@code WidgetPaintable} with the properties 
         *         that were set in the Build object.
         */
        public WidgetPaintable construct() {
            return WidgetPaintable.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    WidgetPaintable.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The observed widget or {@code null} if none.
         * @param widget The value for the {@code widget} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setWidget(org.gtk.gtk.Widget widget) {
            names.add("widget");
            values.add(org.gtk.gobject.Value.create(widget));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_widget_paintable_new = Interop.downcallHandle(
            "gtk_widget_paintable_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_paintable_get_widget = Interop.downcallHandle(
            "gtk_widget_paintable_get_widget",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_paintable_set_widget = Interop.downcallHandle(
            "gtk_widget_paintable_set_widget",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_paintable_get_type = Interop.downcallHandle(
            "gtk_widget_paintable_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
