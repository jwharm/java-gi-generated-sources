package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkCenterBox} arranges three children in a row, keeping the middle child
 * centered as well as possible.
 * <p>
 * <img src="./doc-files/centerbox.png" alt="An example GtkCenterBox">
 * <p>
 * To add children to {@code GtkCenterBox}, use {@link CenterBox#setStartWidget},
 * {@link CenterBox#setCenterWidget} and
 * {@link CenterBox#setEndWidget}.
 * <p>
 * The sizing and positioning of children can be influenced with the
 * align and expand properties of the children.
 * <p>
 * <strong>GtkCenterBox as GtkBuildable</strong><br/>
 * The {@code GtkCenterBox} implementation of the {@code GtkBuildable} interface
 * supports placing children in the 3 positions by specifying “start”, “center”
 * or “end” as the “type” attribute of a &lt;child&gt; element.
 * <p>
 * <strong>CSS nodes</strong><br/>
 * {@code GtkCenterBox} uses a single CSS node with the name “box”,
 * <p>
 * The first child of the {@code GtkCenterBox} will be allocated depending on the
 * text direction, i.e. in left-to-right layouts it will be allocated on the
 * left and in right-to-left layouts on the right.
 * <p>
 * In vertical orientation, the nodes of the children are arranged from top to
 * bottom.
 * <p>
 * <strong>Accessibility</strong><br/>
 * {@code GtkCenterBox} uses the {@link AccessibleRole#GROUP} role.
 */
public class CenterBox extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Orientable {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkCenterBox";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a CenterBox proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected CenterBox(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, CenterBox> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new CenterBox(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_center_box_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkCenterBox}.
     */
    public CenterBox() {
        super(constructNew());
        this.refSink();
        this.takeOwnership();
    }
    
    /**
     * Gets the value set by gtk_center_box_set_baseline_position().
     * @return the baseline position
     */
    public org.gtk.gtk.BaselinePosition getBaselinePosition() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_center_box_get_baseline_position.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.BaselinePosition.of(RESULT);
    }
    
    /**
     * Gets the center widget, or {@code null} if there is none.
     * @return the center widget.
     */
    public @Nullable org.gtk.gtk.Widget getCenterWidget() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_center_box_get_center_widget.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) Interop.register(RESULT, org.gtk.gtk.Widget.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets the end widget, or {@code null} if there is none.
     * @return the end widget.
     */
    public @Nullable org.gtk.gtk.Widget getEndWidget() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_center_box_get_end_widget.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) Interop.register(RESULT, org.gtk.gtk.Widget.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets the start widget, or {@code null} if there is none.
     * @return the start widget.
     */
    public @Nullable org.gtk.gtk.Widget getStartWidget() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_center_box_get_start_widget.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) Interop.register(RESULT, org.gtk.gtk.Widget.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Sets the baseline position of a center box.
     * <p>
     * This affects only horizontal boxes with at least one baseline
     * aligned child. If there is more vertical space available than
     * requested, and the baseline is not allocated by the parent then
     * {@code position} is used to allocate the baseline wrt. the extra space
     * available.
     * @param position a {@code GtkBaselinePosition}
     */
    public void setBaselinePosition(org.gtk.gtk.BaselinePosition position) {
        try {
            DowncallHandles.gtk_center_box_set_baseline_position.invokeExact(
                    handle(),
                    position.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the center widget.
     * <p>
     * To remove the existing center widget, pas {@code null}.
     * @param child the new center widget
     */
    public void setCenterWidget(@Nullable org.gtk.gtk.Widget child) {
        try {
            DowncallHandles.gtk_center_box_set_center_widget.invokeExact(
                    handle(),
                    (Addressable) (child == null ? MemoryAddress.NULL : child.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the end widget.
     * <p>
     * To remove the existing end widget, pass {@code null}.
     * @param child the new end widget
     */
    public void setEndWidget(@Nullable org.gtk.gtk.Widget child) {
        try {
            DowncallHandles.gtk_center_box_set_end_widget.invokeExact(
                    handle(),
                    (Addressable) (child == null ? MemoryAddress.NULL : child.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the start widget.
     * <p>
     * To remove the existing start widget, pass {@code null}.
     * @param child the new start widget
     */
    public void setStartWidget(@Nullable org.gtk.gtk.Widget child) {
        try {
            DowncallHandles.gtk_center_box_set_start_widget.invokeExact(
                    handle(),
                    (Addressable) (child == null ? MemoryAddress.NULL : child.handle()));
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
            RESULT = (long) DowncallHandles.gtk_center_box_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link CenterBox.Builder} object constructs a {@link CenterBox} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link CenterBox.Builder#build()}. 
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
         * Finish building the {@link CenterBox} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link CenterBox}.
         * @return A new instance of {@code CenterBox} with the properties 
         *         that were set in the Builder object.
         */
        public CenterBox build() {
            return (CenterBox) org.gtk.gobject.GObject.newWithProperties(
                CenterBox.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The position of the baseline aligned widget if extra space is available.
         * @param baselinePosition The value for the {@code baseline-position} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setBaselinePosition(org.gtk.gtk.BaselinePosition baselinePosition) {
            names.add("baseline-position");
            values.add(org.gtk.gobject.Value.create(baselinePosition));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_center_box_new = Interop.downcallHandle(
                "gtk_center_box_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_center_box_get_baseline_position = Interop.downcallHandle(
                "gtk_center_box_get_baseline_position",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_center_box_get_center_widget = Interop.downcallHandle(
                "gtk_center_box_get_center_widget",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_center_box_get_end_widget = Interop.downcallHandle(
                "gtk_center_box_get_end_widget",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_center_box_get_start_widget = Interop.downcallHandle(
                "gtk_center_box_get_start_widget",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_center_box_set_baseline_position = Interop.downcallHandle(
                "gtk_center_box_set_baseline_position",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_center_box_set_center_widget = Interop.downcallHandle(
                "gtk_center_box_set_center_widget",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_center_box_set_end_widget = Interop.downcallHandle(
                "gtk_center_box_set_end_widget",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_center_box_set_start_widget = Interop.downcallHandle(
                "gtk_center_box_set_start_widget",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_center_box_get_type = Interop.downcallHandle(
                "gtk_center_box_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_center_box_get_type != null;
    }
}
