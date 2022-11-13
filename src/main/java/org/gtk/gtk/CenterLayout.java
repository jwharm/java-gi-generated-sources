package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkCenterLayout} is a layout manager that manages up to three children.
 * <p>
 * The start widget is allocated at the start of the layout (left in
 * left-to-right locales and right in right-to-left ones), and the end
 * widget at the end.
 * <p>
 * The center widget is centered regarding the full width of the layout's.
 */
public class CenterLayout extends org.gtk.gtk.LayoutManager {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkCenterLayout";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a CenterLayout proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public CenterLayout(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to CenterLayout if its GType is a (or inherits from) "GtkCenterLayout".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code CenterLayout} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkCenterLayout", a ClassCastException will be thrown.
     */
    public static CenterLayout castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkCenterLayout"))) {
            return new CenterLayout(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkCenterLayout");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_center_layout_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkCenterLayout}.
     */
    public CenterLayout() {
        super(constructNew(), Ownership.FULL);
    }
    
    /**
     * Returns the baseline position of the layout.
     * @return The current baseline position of {@code self}.
     */
    public @NotNull org.gtk.gtk.BaselinePosition getBaselinePosition() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_center_layout_get_baseline_position.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.BaselinePosition(RESULT);
    }
    
    /**
     * Returns the center widget of the layout.
     * @return the current center widget of {@code self}
     */
    public @Nullable org.gtk.gtk.Widget getCenterWidget() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_center_layout_get_center_widget.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the end widget of the layout.
     * @return the current end widget of {@code self}
     */
    public @Nullable org.gtk.gtk.Widget getEndWidget() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_center_layout_get_end_widget.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the current orienration of the layout manager.
     * @return The current orientation of {@code self}
     */
    public @NotNull org.gtk.gtk.Orientation getOrientation() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_center_layout_get_orientation.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Orientation(RESULT);
    }
    
    /**
     * Returns the start widget fo the layout.
     * @return The current start widget of {@code self}
     */
    public @Nullable org.gtk.gtk.Widget getStartWidget() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_center_layout_get_start_widget.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(RESULT, Ownership.NONE);
    }
    
    /**
     * Sets the new baseline position of {@code self}
     * @param baselinePosition the new baseline position
     */
    public void setBaselinePosition(@NotNull org.gtk.gtk.BaselinePosition baselinePosition) {
        java.util.Objects.requireNonNull(baselinePosition, "Parameter 'baselinePosition' must not be null");
        try {
            DowncallHandles.gtk_center_layout_set_baseline_position.invokeExact(
                    handle(),
                    baselinePosition.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the new center widget of {@code self}.
     * <p>
     * To remove the existing center widget, pass {@code null}.
     * @param widget the new center widget
     */
    public void setCenterWidget(@Nullable org.gtk.gtk.Widget widget) {
        try {
            DowncallHandles.gtk_center_layout_set_center_widget.invokeExact(
                    handle(),
                    (Addressable) (widget == null ? MemoryAddress.NULL : widget.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the new end widget of {@code self}.
     * <p>
     * To remove the existing center widget, pass {@code null}.
     * @param widget the new end widget
     */
    public void setEndWidget(@Nullable org.gtk.gtk.Widget widget) {
        try {
            DowncallHandles.gtk_center_layout_set_end_widget.invokeExact(
                    handle(),
                    (Addressable) (widget == null ? MemoryAddress.NULL : widget.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the orientation of {@code self}.
     * @param orientation the new orientation
     */
    public void setOrientation(@NotNull org.gtk.gtk.Orientation orientation) {
        java.util.Objects.requireNonNull(orientation, "Parameter 'orientation' must not be null");
        try {
            DowncallHandles.gtk_center_layout_set_orientation.invokeExact(
                    handle(),
                    orientation.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the new start widget of {@code self}.
     * <p>
     * To remove the existing start widget, pass {@code null}.
     * @param widget the new start widget
     */
    public void setStartWidget(@Nullable org.gtk.gtk.Widget widget) {
        try {
            DowncallHandles.gtk_center_layout_set_start_widget.invokeExact(
                    handle(),
                    (Addressable) (widget == null ? MemoryAddress.NULL : widget.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_center_layout_new = Interop.downcallHandle(
            "gtk_center_layout_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_center_layout_get_baseline_position = Interop.downcallHandle(
            "gtk_center_layout_get_baseline_position",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_center_layout_get_center_widget = Interop.downcallHandle(
            "gtk_center_layout_get_center_widget",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_center_layout_get_end_widget = Interop.downcallHandle(
            "gtk_center_layout_get_end_widget",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_center_layout_get_orientation = Interop.downcallHandle(
            "gtk_center_layout_get_orientation",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_center_layout_get_start_widget = Interop.downcallHandle(
            "gtk_center_layout_get_start_widget",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_center_layout_set_baseline_position = Interop.downcallHandle(
            "gtk_center_layout_set_baseline_position",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_center_layout_set_center_widget = Interop.downcallHandle(
            "gtk_center_layout_set_center_widget",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_center_layout_set_end_widget = Interop.downcallHandle(
            "gtk_center_layout_set_end_widget",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_center_layout_set_orientation = Interop.downcallHandle(
            "gtk_center_layout_set_orientation",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_center_layout_set_start_widget = Interop.downcallHandle(
            "gtk_center_layout_set_start_widget",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
    }
}
