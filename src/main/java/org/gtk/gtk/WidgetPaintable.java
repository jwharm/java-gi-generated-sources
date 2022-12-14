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
public class WidgetPaintable extends org.gtk.gobject.GObject implements org.gtk.gdk.Paintable {
    
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
     */
    protected WidgetPaintable(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, WidgetPaintable> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new WidgetPaintable(input);
    
    private static MemoryAddress constructNew(@Nullable org.gtk.gtk.Widget widget) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_widget_paintable_new.invokeExact((Addressable) (widget == null ? MemoryAddress.NULL : widget.handle()));
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
        super(constructNew(widget));
        this.takeOwnership();
    }
    
    /**
     * Returns the widget that is observed or {@code null} if none.
     * @return the observed widget.
     */
    public @Nullable org.gtk.gtk.Widget getWidget() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_widget_paintable_get_widget.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) Interop.register(RESULT, org.gtk.gtk.Widget.fromAddress).marshal(RESULT, null);
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
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_widget_paintable_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link WidgetPaintable.Builder} object constructs a {@link WidgetPaintable} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link WidgetPaintable.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link WidgetPaintable} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link WidgetPaintable}.
         * @return A new instance of {@code WidgetPaintable} with the properties 
         *         that were set in the Builder object.
         */
        public WidgetPaintable build() {
            return (WidgetPaintable) org.gtk.gobject.GObject.newWithProperties(
                WidgetPaintable.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The observed widget or {@code null} if none.
         * @param widget The value for the {@code widget} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setWidget(org.gtk.gtk.Widget widget) {
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_widget_paintable_get_type != null;
    }
}
