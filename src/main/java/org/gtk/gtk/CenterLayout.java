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
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public CenterLayout(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to CenterLayout */
    public static CenterLayout castFrom(org.gtk.gobject.Object gobject) {
        return new CenterLayout(gobject.refcounted());
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_center_layout_new.invokeExact(), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkCenterLayout}.
     */
    public CenterLayout() {
        super(constructNew());
    }
    
    /**
     * Returns the baseline position of the layout.
     * @return The current baseline position of {@code self}.
     */
    public @NotNull org.gtk.gtk.BaselinePosition getBaselinePosition() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_center_layout_get_baseline_position.invokeExact(handle());
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
            RESULT = (MemoryAddress) DowncallHandles.gtk_center_layout_get_center_widget.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns the end widget of the layout.
     * @return the current end widget of {@code self}
     */
    public @Nullable org.gtk.gtk.Widget getEndWidget() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_center_layout_get_end_widget.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the current orienration of the layout manager.
     * @return The current orientation of {@code self}
     */
    public @NotNull org.gtk.gtk.Orientation getOrientation() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_center_layout_get_orientation.invokeExact(handle());
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
            RESULT = (MemoryAddress) DowncallHandles.gtk_center_layout_get_start_widget.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
    }
    
    /**
     * Sets the new baseline position of {@code self}
     * @param baselinePosition the new baseline position
     */
    public void setBaselinePosition(@NotNull org.gtk.gtk.BaselinePosition baselinePosition) {
        java.util.Objects.requireNonNull(baselinePosition, "Parameter 'baselinePosition' must not be null");
        try {
            DowncallHandles.gtk_center_layout_set_baseline_position.invokeExact(handle(), baselinePosition.getValue());
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
        java.util.Objects.requireNonNullElse(widget, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_center_layout_set_center_widget.invokeExact(handle(), widget.handle());
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
        java.util.Objects.requireNonNullElse(widget, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_center_layout_set_end_widget.invokeExact(handle(), widget.handle());
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
            DowncallHandles.gtk_center_layout_set_orientation.invokeExact(handle(), orientation.getValue());
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
        java.util.Objects.requireNonNullElse(widget, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_center_layout_set_start_widget.invokeExact(handle(), widget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_center_layout_new = Interop.downcallHandle(
            "gtk_center_layout_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_center_layout_get_baseline_position = Interop.downcallHandle(
            "gtk_center_layout_get_baseline_position",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_center_layout_get_center_widget = Interop.downcallHandle(
            "gtk_center_layout_get_center_widget",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_center_layout_get_end_widget = Interop.downcallHandle(
            "gtk_center_layout_get_end_widget",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_center_layout_get_orientation = Interop.downcallHandle(
            "gtk_center_layout_get_orientation",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_center_layout_get_start_widget = Interop.downcallHandle(
            "gtk_center_layout_get_start_widget",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_center_layout_set_baseline_position = Interop.downcallHandle(
            "gtk_center_layout_set_baseline_position",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_center_layout_set_center_widget = Interop.downcallHandle(
            "gtk_center_layout_set_center_widget",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_center_layout_set_end_widget = Interop.downcallHandle(
            "gtk_center_layout_set_end_widget",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_center_layout_set_orientation = Interop.downcallHandle(
            "gtk_center_layout_set_orientation",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_center_layout_set_start_widget = Interop.downcallHandle(
            "gtk_center_layout_set_start_widget",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
