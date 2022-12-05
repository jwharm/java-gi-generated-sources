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
     * <p>
     * Because Overlay is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Overlay(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to Overlay if its GType is a (or inherits from) "GtkOverlay".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code Overlay} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkOverlay", a ClassCastException will be thrown.
     */
    public static Overlay castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), Overlay.getType())) {
            return new Overlay(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkOverlay");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
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
        super(constructNew(), Ownership.NONE);
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
    public void addOverlay(@NotNull org.gtk.gtk.Widget widget) {
        java.util.Objects.requireNonNull(widget, "Parameter 'widget' must not be null");
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
            RESULT = (MemoryAddress) DowncallHandles.gtk_overlay_get_child.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets whether {@code widget} should be clipped within the parent.
     * @param widget an overlay child of {@code GtkOverlay}
     * @return whether the widget is clipped within the parent.
     */
    public boolean getClipOverlay(@NotNull org.gtk.gtk.Widget widget) {
        java.util.Objects.requireNonNull(widget, "Parameter 'widget' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_overlay_get_clip_overlay.invokeExact(
                    handle(),
                    widget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets whether {@code widget}'s size is included in the measurement of
     * {@code overlay}.
     * @param widget an overlay child of {@code GtkOverlay}
     * @return whether the widget is measured
     */
    public boolean getMeasureOverlay(@NotNull org.gtk.gtk.Widget widget) {
        java.util.Objects.requireNonNull(widget, "Parameter 'widget' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_overlay_get_measure_overlay.invokeExact(
                    handle(),
                    widget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Removes an overlay that was added with gtk_overlay_add_overlay().
     * @param widget a {@code GtkWidget} to be removed
     */
    public void removeOverlay(@NotNull org.gtk.gtk.Widget widget) {
        java.util.Objects.requireNonNull(widget, "Parameter 'widget' must not be null");
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
    public void setClipOverlay(@NotNull org.gtk.gtk.Widget widget, boolean clipOverlay) {
        java.util.Objects.requireNonNull(widget, "Parameter 'widget' must not be null");
        try {
            DowncallHandles.gtk_overlay_set_clip_overlay.invokeExact(
                    handle(),
                    widget.handle(),
                    clipOverlay ? 1 : 0);
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
    public void setMeasureOverlay(@NotNull org.gtk.gtk.Widget widget, boolean measure) {
        java.util.Objects.requireNonNull(widget, "Parameter 'widget' must not be null");
        try {
            DowncallHandles.gtk_overlay_set_measure_overlay.invokeExact(
                    handle(),
                    widget.handle(),
                    measure ? 1 : 0);
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
            RESULT = (long) DowncallHandles.gtk_overlay_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface GetChildPosition {
        boolean signalReceived(Overlay sourceOverlay, @NotNull org.gtk.gtk.Widget widget, @NotNull org.gtk.gdk.Rectangle allocation);
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
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("get-child-position"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Overlay.Callbacks.class, "signalOverlayGetChildPosition",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Overlay.GetChildPosition>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.Widget.Build {
        
         /**
         * A {@link Overlay.Build} object constructs a {@link Overlay} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link Overlay} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Overlay} using {@link Overlay#castFrom}.
         * @return A new instance of {@code Overlay} with the properties 
         *         that were set in the Build object.
         */
        public Overlay construct() {
            return Overlay.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    Overlay.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        public Build setChild(org.gtk.gtk.Widget child) {
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
    
    private static class Callbacks {
        
        public static boolean signalOverlayGetChildPosition(MemoryAddress sourceOverlay, MemoryAddress widget, MemoryAddress allocation, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Overlay.GetChildPosition) Interop.signalRegistry.get(HASH);
            return HANDLER.signalReceived(new Overlay(sourceOverlay, Ownership.NONE), new org.gtk.gtk.Widget(widget, Ownership.NONE), new org.gtk.gdk.Rectangle(allocation, Ownership.NONE));
        }
    }
}
