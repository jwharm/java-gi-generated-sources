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
    protected CenterLayout(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, CenterLayout> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new CenterLayout(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
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
    public org.gtk.gtk.BaselinePosition getBaselinePosition() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_center_layout_get_baseline_position.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.BaselinePosition.of(RESULT);
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
        return (org.gtk.gtk.Widget) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.Widget.fromAddress).marshal(RESULT, Ownership.NONE);
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
        return (org.gtk.gtk.Widget) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.Widget.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the current orienration of the layout manager.
     * @return The current orientation of {@code self}
     */
    public org.gtk.gtk.Orientation getOrientation() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_center_layout_get_orientation.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.Orientation.of(RESULT);
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
        return (org.gtk.gtk.Widget) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.Widget.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Sets the new baseline position of {@code self}
     * @param baselinePosition the new baseline position
     */
    public void setBaselinePosition(org.gtk.gtk.BaselinePosition baselinePosition) {
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
    public void setOrientation(org.gtk.gtk.Orientation orientation) {
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
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_center_layout_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link CenterLayout.Builder} object constructs a {@link CenterLayout} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link CenterLayout.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.LayoutManager.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link CenterLayout} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link CenterLayout}.
         * @return A new instance of {@code CenterLayout} with the properties 
         *         that were set in the Builder object.
         */
        public CenterLayout build() {
            return (CenterLayout) org.gtk.gobject.GObject.newWithProperties(
                CenterLayout.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_center_layout_new = Interop.downcallHandle(
            "gtk_center_layout_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_center_layout_get_baseline_position = Interop.downcallHandle(
            "gtk_center_layout_get_baseline_position",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_center_layout_get_center_widget = Interop.downcallHandle(
            "gtk_center_layout_get_center_widget",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_center_layout_get_end_widget = Interop.downcallHandle(
            "gtk_center_layout_get_end_widget",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_center_layout_get_orientation = Interop.downcallHandle(
            "gtk_center_layout_get_orientation",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_center_layout_get_start_widget = Interop.downcallHandle(
            "gtk_center_layout_get_start_widget",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_center_layout_set_baseline_position = Interop.downcallHandle(
            "gtk_center_layout_set_baseline_position",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_center_layout_set_center_widget = Interop.downcallHandle(
            "gtk_center_layout_set_center_widget",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_center_layout_set_end_widget = Interop.downcallHandle(
            "gtk_center_layout_set_end_widget",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_center_layout_set_orientation = Interop.downcallHandle(
            "gtk_center_layout_set_orientation",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_center_layout_set_start_widget = Interop.downcallHandle(
            "gtk_center_layout_set_start_widget",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_center_layout_get_type = Interop.downcallHandle(
            "gtk_center_layout_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
