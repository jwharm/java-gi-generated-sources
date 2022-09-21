package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
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

    public Overlay(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Overlay */
    public static Overlay castFrom(org.gtk.gobject.Object gobject) {
        return new Overlay(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_overlay_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkOverlay}.
     */
    public Overlay() {
        super(constructNew());
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
     */
    public void addOverlay(Widget widget) {
        gtk_h.gtk_overlay_add_overlay(handle(), widget.handle());
    }
    
    /**
     * Gets the child widget of {@code overlay}.
     */
    public Widget getChild() {
        var RESULT = gtk_h.gtk_overlay_get_child(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Gets whether {@code widget} should be clipped within the parent.
     */
    public boolean getClipOverlay(Widget widget) {
        var RESULT = gtk_h.gtk_overlay_get_clip_overlay(handle(), widget.handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets whether {@code widget}'s size is included in the measurement of
     * {@code overlay}.
     */
    public boolean getMeasureOverlay(Widget widget) {
        var RESULT = gtk_h.gtk_overlay_get_measure_overlay(handle(), widget.handle());
        return (RESULT != 0);
    }
    
    /**
     * Removes an overlay that was added with gtk_overlay_add_overlay().
     */
    public void removeOverlay(Widget widget) {
        gtk_h.gtk_overlay_remove_overlay(handle(), widget.handle());
    }
    
    /**
     * Sets the child widget of {@code overlay}.
     */
    public void setChild(Widget child) {
        gtk_h.gtk_overlay_set_child(handle(), child.handle());
    }
    
    /**
     * Sets whether {@code widget} should be clipped within the parent.
     */
    public void setClipOverlay(Widget widget, boolean clipOverlay) {
        gtk_h.gtk_overlay_set_clip_overlay(handle(), widget.handle(), clipOverlay ? 1 : 0);
    }
    
    /**
     * Sets whether {@code widget} is included in the measured size of {@code overlay}.
     * <p>
     * The overlay will request the size of the largest child that has
     * this property set to <code>true</code>. Children who are not included may
     * be drawn outside of {@code overlay}'s allocation if they are too large.
     */
    public void setMeasureOverlay(Widget widget, boolean measure) {
        gtk_h.gtk_overlay_set_measure_overlay(handle(), widget.handle(), measure ? 1 : 0);
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
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalOverlayGetChildPosition", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("get-child-position").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
