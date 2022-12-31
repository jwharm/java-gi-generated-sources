package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Layout managers are delegate classes that handle the preferred size
 * and the allocation of a widget.
 * <p>
 * You typically subclass {@code GtkLayoutManager} if you want to implement a
 * layout policy for the children of a widget, or if you want to determine
 * the size of a widget depending on its contents.
 * <p>
 * Each {@code GtkWidget} can only have a {@code GtkLayoutManager} instance associated
 * to it at any given time; it is possible, though, to replace the layout
 * manager instance using {@link Widget#setLayoutManager}.
 * <p>
 * <strong>Layout properties</strong><br/>
 * A layout manager can expose properties for controlling the layout of
 * each child, by creating an object type derived from {@link LayoutChild}
 * and installing the properties on it as normal {@code GObject} properties.
 * <p>
 * Each {@code GtkLayoutChild} instance storing the layout properties for a
 * specific child is created through the {@link LayoutManager#getLayoutChild}
 * method; a {@code GtkLayoutManager} controls the creation of its {@code GtkLayoutChild}
 * instances by overriding the GtkLayoutManagerClass.create_layout_child()
 * virtual function. The typical implementation should look like:
 * <pre>{@code c
 * static GtkLayoutChild *
 * create_layout_child (GtkLayoutManager *manager,
 *                      GtkWidget        *container,
 *                      GtkWidget        *child)
 * {
 *   return g_object_new (your_layout_child_get_type (),
 *                        "layout-manager", manager,
 *                        "child-widget", child,
 *                        NULL);
 * }
 * }</pre>
 * <p>
 * The {@code Gtk.LayoutChild:layout-manager} and
 * {@code Gtk.LayoutChild:child-widget} properties
 * on the newly created {@code GtkLayoutChild} instance are mandatory. The
 * {@code GtkLayoutManager} will cache the newly created {@code GtkLayoutChild} instance
 * until the widget is removed from its parent, or the parent removes the
 * layout manager.
 * <p>
 * Each {@code GtkLayoutManager} instance creating a {@code GtkLayoutChild} should use
 * {@link LayoutManager#getLayoutChild} every time it needs to query
 * the layout properties; each {@code GtkLayoutChild} instance should call
 * {@link LayoutManager#layoutChanged} every time a property is
 * updated, in order to queue a new size measuring and allocation.
 */
public class LayoutManager extends org.gtk.gobject.GObject {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkLayoutManager";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.GObject.getMemoryLayout().withName("parent_instance")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a LayoutManager proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected LayoutManager(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, LayoutManager> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new LayoutManager(input, ownership);
    
    /**
     * Assigns the given {@code width}, {@code height}, and {@code baseline} to
     * a {@code widget}, and computes the position and sizes of the children of
     * the {@code widget} using the layout management policy of {@code manager}.
     * @param widget the {@code GtkWidget} using {@code manager}
     * @param width the new width of the {@code widget}
     * @param height the new height of the {@code widget}
     * @param baseline the baseline position of the {@code widget}, or -1
     */
    public void allocate(org.gtk.gtk.Widget widget, int width, int height, int baseline) {
        try {
            DowncallHandles.gtk_layout_manager_allocate.invokeExact(
                    handle(),
                    widget.handle(),
                    width,
                    height,
                    baseline);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Retrieves a {@code GtkLayoutChild} instance for the {@code GtkLayoutManager},
     * creating one if necessary.
     * <p>
     * The {@code child} widget must be a child of the widget using {@code manager}.
     * <p>
     * The {@code GtkLayoutChild} instance is owned by the {@code GtkLayoutManager},
     * and is guaranteed to exist as long as {@code child} is a child of the
     * {@code GtkWidget} using the given {@code GtkLayoutManager}.
     * @param child a {@code GtkWidget}
     * @return a {@code GtkLayoutChild}
     */
    public org.gtk.gtk.LayoutChild getLayoutChild(org.gtk.gtk.Widget child) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_layout_manager_get_layout_child.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.LayoutChild) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.LayoutChild.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves the request mode of {@code manager}.
     * @return a {@code GtkSizeRequestMode}
     */
    public org.gtk.gtk.SizeRequestMode getRequestMode() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_layout_manager_get_request_mode.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.SizeRequestMode.of(RESULT);
    }
    
    /**
     * Retrieves the {@code GtkWidget} using the given {@code GtkLayoutManager}.
     * @return a {@code GtkWidget}
     */
    public @Nullable org.gtk.gtk.Widget getWidget() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_layout_manager_get_widget.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.Widget.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Queues a resize on the {@code GtkWidget} using {@code manager}, if any.
     * <p>
     * This function should be called by subclasses of {@code GtkLayoutManager}
     * in response to changes to their layout management policies.
     */
    public void layoutChanged() {
        try {
            DowncallHandles.gtk_layout_manager_layout_changed.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Measures the size of the {@code widget} using {@code manager}, for the
     * given {@code orientation} and size.
     * <p>
     * See the {@link Widget} documentation on layout management for
     * more details.
     * @param widget the {@code GtkWidget} using {@code manager}
     * @param orientation the orientation to measure
     * @param forSize Size for the opposite of {@code orientation}; for instance, if
     *   the {@code orientation} is {@link Orientation#HORIZONTAL}, this is the height
     *   of the widget; if the {@code orientation} is {@link Orientation#VERTICAL}, this
     *   is the width of the widget. This allows to measure the height for the
     *   given width, and the width for the given height. Use -1 if the size
     *   is not known
     * @param minimum the minimum size for the given size and
     *   orientation
     * @param natural the natural, or preferred size for the
     *   given size and orientation
     * @param minimumBaseline the baseline position for the
     *   minimum size
     * @param naturalBaseline the baseline position for the
     *   natural size
     */
    public void measure(org.gtk.gtk.Widget widget, org.gtk.gtk.Orientation orientation, int forSize, Out<Integer> minimum, Out<Integer> natural, Out<Integer> minimumBaseline, Out<Integer> naturalBaseline) {
        MemorySegment minimumPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment naturalPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment minimumBaselinePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment naturalBaselinePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gtk_layout_manager_measure.invokeExact(
                    handle(),
                    widget.handle(),
                    orientation.getValue(),
                    forSize,
                    (Addressable) (minimum == null ? MemoryAddress.NULL : (Addressable) minimumPOINTER.address()),
                    (Addressable) (natural == null ? MemoryAddress.NULL : (Addressable) naturalPOINTER.address()),
                    (Addressable) (minimumBaseline == null ? MemoryAddress.NULL : (Addressable) minimumBaselinePOINTER.address()),
                    (Addressable) (naturalBaseline == null ? MemoryAddress.NULL : (Addressable) naturalBaselinePOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (minimum != null) minimum.set(minimumPOINTER.get(Interop.valueLayout.C_INT, 0));
        if (natural != null) natural.set(naturalPOINTER.get(Interop.valueLayout.C_INT, 0));
        if (minimumBaseline != null) minimumBaseline.set(minimumBaselinePOINTER.get(Interop.valueLayout.C_INT, 0));
        if (naturalBaseline != null) naturalBaseline.set(naturalBaselinePOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_layout_manager_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link LayoutManager.Builder} object constructs a {@link LayoutManager} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link LayoutManager.Builder#build()}. 
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
         * Finish building the {@link LayoutManager} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link LayoutManager}.
         * @return A new instance of {@code LayoutManager} with the properties 
         *         that were set in the Builder object.
         */
        public LayoutManager build() {
            return (LayoutManager) org.gtk.gobject.GObject.newWithProperties(
                LayoutManager.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_layout_manager_allocate = Interop.downcallHandle(
            "gtk_layout_manager_allocate",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_layout_manager_get_layout_child = Interop.downcallHandle(
            "gtk_layout_manager_get_layout_child",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_layout_manager_get_request_mode = Interop.downcallHandle(
            "gtk_layout_manager_get_request_mode",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_layout_manager_get_widget = Interop.downcallHandle(
            "gtk_layout_manager_get_widget",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_layout_manager_layout_changed = Interop.downcallHandle(
            "gtk_layout_manager_layout_changed",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_layout_manager_measure = Interop.downcallHandle(
            "gtk_layout_manager_measure",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_layout_manager_get_type = Interop.downcallHandle(
            "gtk_layout_manager_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
