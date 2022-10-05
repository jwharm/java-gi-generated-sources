package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkCenterLayout} is a layout manager that manages up to three children.
 * <p>
 * The start widget is allocated at the start of the layout (left in
 * left-to-right locales and right in right-to-left ones), and the end
 * widget at the end.
 * <p>
 * The center widget is centered regarding the full width of the layout's.
 */
public class CenterLayout extends LayoutManager {

    public CenterLayout(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to CenterLayout */
    public static CenterLayout castFrom(org.gtk.gobject.Object gobject) {
        return new CenterLayout(gobject.refcounted());
    }
    
    static final MethodHandle gtk_center_layout_new = Interop.downcallHandle(
        "gtk_center_layout_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_center_layout_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkCenterLayout}.
     */
    public CenterLayout() {
        super(constructNew());
    }
    
    static final MethodHandle gtk_center_layout_get_baseline_position = Interop.downcallHandle(
        "gtk_center_layout_get_baseline_position",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the baseline position of the layout.
     */
    public BaselinePosition getBaselinePosition() {
        try {
            var RESULT = (int) gtk_center_layout_get_baseline_position.invokeExact(handle());
            return new BaselinePosition(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_center_layout_get_center_widget = Interop.downcallHandle(
        "gtk_center_layout_get_center_widget",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the center widget of the layout.
     */
    public Widget getCenterWidget() {
        try {
            var RESULT = (MemoryAddress) gtk_center_layout_get_center_widget.invokeExact(handle());
            return new Widget(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_center_layout_get_end_widget = Interop.downcallHandle(
        "gtk_center_layout_get_end_widget",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the end widget of the layout.
     */
    public Widget getEndWidget() {
        try {
            var RESULT = (MemoryAddress) gtk_center_layout_get_end_widget.invokeExact(handle());
            return new Widget(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_center_layout_get_orientation = Interop.downcallHandle(
        "gtk_center_layout_get_orientation",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the current orienration of the layout manager.
     */
    public Orientation getOrientation() {
        try {
            var RESULT = (int) gtk_center_layout_get_orientation.invokeExact(handle());
            return new Orientation(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_center_layout_get_start_widget = Interop.downcallHandle(
        "gtk_center_layout_get_start_widget",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the start widget fo the layout.
     */
    public Widget getStartWidget() {
        try {
            var RESULT = (MemoryAddress) gtk_center_layout_get_start_widget.invokeExact(handle());
            return new Widget(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_center_layout_set_baseline_position = Interop.downcallHandle(
        "gtk_center_layout_set_baseline_position",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the new baseline position of {@code self}
     */
    public void setBaselinePosition(BaselinePosition baselinePosition) {
        try {
            gtk_center_layout_set_baseline_position.invokeExact(handle(), baselinePosition.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_center_layout_set_center_widget = Interop.downcallHandle(
        "gtk_center_layout_set_center_widget",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the new center widget of {@code self}.
     * <p>
     * To remove the existing center widget, pass {@code null}.
     */
    public void setCenterWidget(Widget widget) {
        try {
            gtk_center_layout_set_center_widget.invokeExact(handle(), widget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_center_layout_set_end_widget = Interop.downcallHandle(
        "gtk_center_layout_set_end_widget",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the new end widget of {@code self}.
     * <p>
     * To remove the existing center widget, pass {@code null}.
     */
    public void setEndWidget(Widget widget) {
        try {
            gtk_center_layout_set_end_widget.invokeExact(handle(), widget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_center_layout_set_orientation = Interop.downcallHandle(
        "gtk_center_layout_set_orientation",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the orientation of {@code self}.
     */
    public void setOrientation(Orientation orientation) {
        try {
            gtk_center_layout_set_orientation.invokeExact(handle(), orientation.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_center_layout_set_start_widget = Interop.downcallHandle(
        "gtk_center_layout_set_start_widget",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the new start widget of {@code self}.
     * <p>
     * To remove the existing start widget, pass {@code null}.
     */
    public void setStartWidget(Widget widget) {
        try {
            gtk_center_layout_set_start_widget.invokeExact(handle(), widget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}