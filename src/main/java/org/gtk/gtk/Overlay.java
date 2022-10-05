package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkOverlay} is a container which contains a single main child, on top
 * of which it can place “overlay” widgets.
 * <p>
 * <img src="./doc-files/overlay.png" alt="An example GtkOverlay">
 * <p>
 * The position of each overlay widget is determined by its
 * {@code Gtk.Widget:valign}
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
 * <h1>GtkOverlay as GtkBuildable</h1>
 * <p>
 * The {@code GtkOverlay} implementation of the {@code GtkBuildable} interface
 * supports placing a child as an overlay by specifying “overlay” as
 * the “type” attribute of a {@code <child>} element.
 * <p>
 * <h1>CSS nodes</h1>
 * <p>
 * {@code GtkOverlay} has a single CSS node with the name “overlay”. Overlay children
 * whose alignments cause them to be positioned at an edge get the style classes
 * “.left”, “.right”, “.top”, and/or “.bottom” according to their position.
 */
public class Overlay extends Widget implements Accessible, Buildable, ConstraintTarget {

    public Overlay(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Overlay */
    public static Overlay castFrom(org.gtk.gobject.Object gobject) {
        return new Overlay(gobject.refcounted());
    }
    
    static final MethodHandle gtk_overlay_new = Interop.downcallHandle(
        "gtk_overlay_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_overlay_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkOverlay}.
     */
    public Overlay() {
        super(constructNew());
    }
    
    static final MethodHandle gtk_overlay_add_overlay = Interop.downcallHandle(
        "gtk_overlay_add_overlay",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds {@code widget} to {@code overlay}.
     * <p>
     * The widget will be stacked on top of the main widget
     * added with {@link Overlay#setChild}.
     * <p>
     * The position at which {@code widget} is placed is determined
     * from its {@code Gtk.Widget:halign} and
     * {@code Gtk.Widget:valign} properties.
     */
    public void addOverlay(Widget widget) {
        try {
            gtk_overlay_add_overlay.invokeExact(handle(), widget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_overlay_get_child = Interop.downcallHandle(
        "gtk_overlay_get_child",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the child widget of {@code overlay}.
     */
    public Widget getChild() {
        try {
            var RESULT = (MemoryAddress) gtk_overlay_get_child.invokeExact(handle());
            return new Widget(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_overlay_get_clip_overlay = Interop.downcallHandle(
        "gtk_overlay_get_clip_overlay",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether {@code widget} should be clipped within the parent.
     */
    public boolean getClipOverlay(Widget widget) {
        try {
            var RESULT = (int) gtk_overlay_get_clip_overlay.invokeExact(handle(), widget.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_overlay_get_measure_overlay = Interop.downcallHandle(
        "gtk_overlay_get_measure_overlay",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether {@code widget}'s size is included in the measurement of
     * {@code overlay}.
     */
    public boolean getMeasureOverlay(Widget widget) {
        try {
            var RESULT = (int) gtk_overlay_get_measure_overlay.invokeExact(handle(), widget.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_overlay_remove_overlay = Interop.downcallHandle(
        "gtk_overlay_remove_overlay",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes an overlay that was added with gtk_overlay_add_overlay().
     */
    public void removeOverlay(Widget widget) {
        try {
            gtk_overlay_remove_overlay.invokeExact(handle(), widget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_overlay_set_child = Interop.downcallHandle(
        "gtk_overlay_set_child",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the child widget of {@code overlay}.
     */
    public void setChild(Widget child) {
        try {
            gtk_overlay_set_child.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_overlay_set_clip_overlay = Interop.downcallHandle(
        "gtk_overlay_set_clip_overlay",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether {@code widget} should be clipped within the parent.
     */
    public void setClipOverlay(Widget widget, boolean clipOverlay) {
        try {
            gtk_overlay_set_clip_overlay.invokeExact(handle(), widget.handle(), clipOverlay ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_overlay_set_measure_overlay = Interop.downcallHandle(
        "gtk_overlay_set_measure_overlay",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether {@code widget} is included in the measured size of {@code overlay}.
     * <p>
     * The overlay will request the size of the largest child that has
     * this property set to {@code true}. Children who are not included may
     * be drawn outside of {@code overlay}'s allocation if they are too large.
     */
    public void setMeasureOverlay(Widget widget, boolean measure) {
        try {
            gtk_overlay_set_measure_overlay.invokeExact(handle(), widget.handle(), measure ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface GetChildPositionHandler {
        boolean signalReceived(Overlay source, Widget widget, org.gtk.gdk.Rectangle allocation);
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
     */
    public SignalHandle onGetChildPosition(GetChildPositionHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("get-child-position").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Overlay.Callbacks.class, "signalOverlayGetChildPosition",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static boolean signalOverlayGetChildPosition(MemoryAddress source, MemoryAddress widget, MemoryAddress allocation, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Overlay.GetChildPositionHandler) Interop.signalRegistry.get(hash);
            return handler.signalReceived(new Overlay(Refcounted.get(source)), new Widget(Refcounted.get(widget, false)), new org.gtk.gdk.Rectangle(Refcounted.get(allocation, false)));
        }
        
    }
}
