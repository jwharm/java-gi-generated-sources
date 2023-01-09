package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkOverlay} is a container which contains a single main child, on top
 * of which it can place “overlay” widgets.
 * <p>
 * <img src="./doc-files/overlay.png" alt="An example GtkOverlay">
 * <p>
 * The position of each overlay widget is determined by its
 * {@code Gtk.Widget:halign} and {@code Gtk.Widget:valign}
 * properties. E.g. a widget with both alignments set to {@link Align#START}
 * will be placed at the top left corner of the {@code GtkOverlay} container,
 * whereas an overlay with halign set to {@link Align#CENTER} and valign set
 * to {@link Align#END} will be placed a the bottom edge of the {@code GtkOverlay},
 * horizontally centered. The position can be adjusted by setting the margin
 * properties of the child to non-zero values.
 * <p>
 * More complicated placement of overlays is possible by connecting
 * to the {@code Gtk.Overlay::get-child-position} signal.
 * <p>
 * An overlay’s minimum and natural sizes are those of its main child.
 * The sizes of overlay children are not considered when measuring these
 * preferred sizes.
 * <p>
 * <strong>GtkOverlay as GtkBuildable</strong><br/>
 * The {@code GtkOverlay} implementation of the {@code GtkBuildable} interface
 * supports placing a child as an overlay by specifying “overlay” as
 * the “type” attribute of a {@code <child>} element.
 * <p>
 * <strong>CSS nodes</strong><br/>
 * {@code GtkOverlay} has a single CSS node with the name “overlay”. Overlay children
 * whose alignments cause them to be positioned at an edge get the style classes
 * “.left”, “.right”, “.top”, and/or “.bottom” according to their position.
 */
public class Overlay extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkOverlay";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a Overlay proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Overlay(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Overlay> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Overlay(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_overlay_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkOverlay}.
     */
    public Overlay() {
        super(constructNew());
        this.refSink();
        this.takeOwnership();
    }
    
    /**
     * Adds {@code widget} to {@code overlay}.
     * <p>
     * The widget will be stacked on top of the main widget
     * added with {@link Overlay#setChild}.
     * <p>
     * The position at which {@code widget} is placed is determined
     * from its {@code Gtk.Widget:halign} and
     * {@code Gtk.Widget:valign} properties.
     * @param widget a {@code GtkWidget} to be added to the container
     */
    public void addOverlay(org.gtk.gtk.Widget widget) {
        try {
            DowncallHandles.gtk_overlay_add_overlay.invokeExact(
                    handle(),
                    widget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the child widget of {@code overlay}.
     * @return the child widget of {@code overlay}
     */
    public @Nullable org.gtk.gtk.Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_overlay_get_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) Interop.register(RESULT, org.gtk.gtk.Widget.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets whether {@code widget} should be clipped within the parent.
     * @param widget an overlay child of {@code GtkOverlay}
     * @return whether the widget is clipped within the parent.
     */
    public boolean getClipOverlay(org.gtk.gtk.Widget widget) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_overlay_get_clip_overlay.invokeExact(
                    handle(),
                    widget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets whether {@code widget}'s size is included in the measurement of
     * {@code overlay}.
     * @param widget an overlay child of {@code GtkOverlay}
     * @return whether the widget is measured
     */
    public boolean getMeasureOverlay(org.gtk.gtk.Widget widget) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_overlay_get_measure_overlay.invokeExact(
                    handle(),
                    widget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Removes an overlay that was added with gtk_overlay_add_overlay().
     * @param widget a {@code GtkWidget} to be removed
     */
    public void removeOverlay(org.gtk.gtk.Widget widget) {
        try {
            DowncallHandles.gtk_overlay_remove_overlay.invokeExact(
                    handle(),
                    widget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the child widget of {@code overlay}.
     * @param child the child widget
     */
    public void setChild(@Nullable org.gtk.gtk.Widget child) {
        try {
            DowncallHandles.gtk_overlay_set_child.invokeExact(
                    handle(),
                    (Addressable) (child == null ? MemoryAddress.NULL : child.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether {@code widget} should be clipped within the parent.
     * @param widget an overlay child of {@code GtkOverlay}
     * @param clipOverlay whether the child should be clipped
     */
    public void setClipOverlay(org.gtk.gtk.Widget widget, boolean clipOverlay) {
        try {
            DowncallHandles.gtk_overlay_set_clip_overlay.invokeExact(
                    handle(),
                    widget.handle(),
                    Marshal.booleanToInteger.marshal(clipOverlay, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether {@code widget} is included in the measured size of {@code overlay}.
     * <p>
     * The overlay will request the size of the largest child that has
     * this property set to {@code true}. Children who are not included may
     * be drawn outside of {@code overlay}'s allocation if they are too large.
     * @param widget an overlay child of {@code GtkOverlay}
     * @param measure whether the child should be measured
     */
    public void setMeasureOverlay(org.gtk.gtk.Widget widget, boolean measure) {
        try {
            DowncallHandles.gtk_overlay_set_measure_overlay.invokeExact(
                    handle(),
                    widget.handle(),
                    Marshal.booleanToInteger.marshal(measure, null).intValue());
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
            RESULT = (long) DowncallHandles.gtk_overlay_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code GetChildPosition} callback.
     */
    @FunctionalInterface
    public interface GetChildPosition {
    
        /**
         * Emitted to determine the position and size of any overlay
         * child widgets.
         * <p>
         * A handler for this signal should fill {@code allocation} with
         * the desired position and size for {@code widget}, relative to
         * the 'main' child of {@code overlay}.
         * <p>
         * The default handler for this signal uses the {@code widget}'s
         * halign and valign properties to determine the position
         * and gives the widget its natural size (except that an
         * alignment of {@link Align#FILL} will cause the overlay to
         * be full-width/height). If the main child is a
         * {@code GtkScrolledWindow}, the overlays are placed relative
         * to its contents.
         */
        boolean run(org.gtk.gtk.Widget widget, org.gtk.gdk.Rectangle allocation);
        
        @ApiStatus.Internal default int upcall(MemoryAddress sourceOverlay, MemoryAddress widget, MemoryAddress allocation) {
            var RESULT = run((org.gtk.gtk.Widget) Interop.register(widget, org.gtk.gtk.Widget.fromAddress).marshal(widget, null), org.gtk.gdk.Rectangle.fromAddress.marshal(allocation, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetChildPosition.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted to determine the position and size of any overlay
     * child widgets.
     * <p>
     * A handler for this signal should fill {@code allocation} with
     * the desired position and size for {@code widget}, relative to
     * the 'main' child of {@code overlay}.
     * <p>
     * The default handler for this signal uses the {@code widget}'s
     * halign and valign properties to determine the position
     * and gives the widget its natural size (except that an
     * alignment of {@link Align#FILL} will cause the overlay to
     * be full-width/height). If the main child is a
     * {@code GtkScrolledWindow}, the overlays are placed relative
     * to its contents.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Overlay.GetChildPosition> onGetChildPosition(Overlay.GetChildPosition handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("get-child-position", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link Overlay.Builder} object constructs a {@link Overlay} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Overlay.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Widget.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link Overlay} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Overlay}.
         * @return A new instance of {@code Overlay} with the properties 
         *         that were set in the Builder object.
         */
        public Overlay build() {
            return (Overlay) org.gtk.gobject.GObject.newWithProperties(
                Overlay.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setChild(org.gtk.gtk.Widget child) {
            names.add("child");
            values.add(org.gtk.gobject.Value.create(child));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_overlay_new = Interop.downcallHandle(
                "gtk_overlay_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_overlay_add_overlay = Interop.downcallHandle(
                "gtk_overlay_add_overlay",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_overlay_get_child = Interop.downcallHandle(
                "gtk_overlay_get_child",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_overlay_get_clip_overlay = Interop.downcallHandle(
                "gtk_overlay_get_clip_overlay",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_overlay_get_measure_overlay = Interop.downcallHandle(
                "gtk_overlay_get_measure_overlay",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_overlay_remove_overlay = Interop.downcallHandle(
                "gtk_overlay_remove_overlay",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_overlay_set_child = Interop.downcallHandle(
                "gtk_overlay_set_child",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_overlay_set_clip_overlay = Interop.downcallHandle(
                "gtk_overlay_set_clip_overlay",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_overlay_set_measure_overlay = Interop.downcallHandle(
                "gtk_overlay_set_measure_overlay",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_overlay_get_type = Interop.downcallHandle(
                "gtk_overlay_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_overlay_get_type != null;
    }
}
