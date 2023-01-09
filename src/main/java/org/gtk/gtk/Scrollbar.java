package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code GtkScrollbar} widget is a horizontal or vertical scrollbar.
 * <p>
 * <img src="./doc-files/scrollbar.png" alt="An example GtkScrollbar">
 * <p>
 * Its position and movement are controlled by the adjustment that is passed to
 * or created by {@link Scrollbar#Scrollbar}. See {@link Adjustment} for more
 * details. The {@code Gtk.Adjustment:value} field sets the position of the
 * thumb and must be between {@code Gtk.Adjustment:lower} and
 * {@code Gtk.Adjustment:upper} - {@code Gtk.Adjustment:page-size}.
 * The {@code Gtk.Adjustment:page-size} represents the size of the visible
 * scrollable area.
 * <p>
 * The fields {@code Gtk.Adjustment:step-increment} and
 * {@code Gtk.Adjustment:page-increment} fields are added to or subtracted
 * from the {@code Gtk.Adjustment:value} when the user asks to move by a step
 * (using e.g. the cursor arrow keys) or by a page (using e.g. the Page Down/Up
 * keys).
 * <p>
 * <strong>CSS nodes</strong><br/>
 * <pre>{@code 
 * scrollbar
 * ╰── range[.fine-tune]
 *     ╰── trough
 *         ╰── slider
 * }</pre>
 * <p>
 * {@code GtkScrollbar} has a main CSS node with name scrollbar and a subnode for its
 * contents. The main node gets the .horizontal or .vertical style classes applied,
 * depending on the scrollbar's orientation.
 * <p>
 * The range node gets the style class .fine-tune added when the scrollbar is
 * in 'fine-tuning' mode.
 * <p>
 * Other style classes that may be added to scrollbars inside
 * {@link ScrolledWindow} include the positional classes (.left, .right,
 * .top, .bottom) and style classes related to overlay scrolling (.overlay-indicator,
 * .dragging, .hovering).
 * <p>
 * <strong>Accessibility</strong><br/>
 * {@code GtkScrollbar} uses the {@link AccessibleRole#SCROLLBAR} role.
 */
public class Scrollbar extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Orientable {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkScrollbar";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a Scrollbar proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Scrollbar(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Scrollbar> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Scrollbar(input);
    
    private static MemoryAddress constructNew(org.gtk.gtk.Orientation orientation, @Nullable org.gtk.gtk.Adjustment adjustment) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_scrollbar_new.invokeExact(
                    orientation.getValue(),
                    (Addressable) (adjustment == null ? MemoryAddress.NULL : adjustment.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new scrollbar with the given orientation.
     * @param orientation the scrollbar’s orientation.
     * @param adjustment the {@link Adjustment} to use, or {@code null}
     *   to create a new adjustment.
     */
    public Scrollbar(org.gtk.gtk.Orientation orientation, @Nullable org.gtk.gtk.Adjustment adjustment) {
        super(constructNew(orientation, adjustment));
        this.refSink();
        this.takeOwnership();
    }
    
    /**
     * Returns the scrollbar's adjustment.
     * @return the scrollbar's adjustment
     */
    public org.gtk.gtk.Adjustment getAdjustment() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_scrollbar_get_adjustment.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Adjustment) Interop.register(RESULT, org.gtk.gtk.Adjustment.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Makes the scrollbar use the given adjustment.
     * @param adjustment the adjustment to set
     */
    public void setAdjustment(@Nullable org.gtk.gtk.Adjustment adjustment) {
        try {
            DowncallHandles.gtk_scrollbar_set_adjustment.invokeExact(
                    handle(),
                    (Addressable) (adjustment == null ? MemoryAddress.NULL : adjustment.handle()));
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
            RESULT = (long) DowncallHandles.gtk_scrollbar_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link Scrollbar.Builder} object constructs a {@link Scrollbar} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Scrollbar.Builder#build()}. 
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
         * Finish building the {@link Scrollbar} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Scrollbar}.
         * @return A new instance of {@code Scrollbar} with the properties 
         *         that were set in the Builder object.
         */
        public Scrollbar build() {
            return (Scrollbar) org.gtk.gobject.GObject.newWithProperties(
                Scrollbar.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The {@code GtkAdjustment} controlled by this scrollbar.
         * @param adjustment The value for the {@code adjustment} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAdjustment(org.gtk.gtk.Adjustment adjustment) {
            names.add("adjustment");
            values.add(org.gtk.gobject.Value.create(adjustment));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_scrollbar_new = Interop.downcallHandle(
                "gtk_scrollbar_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_scrollbar_get_adjustment = Interop.downcallHandle(
                "gtk_scrollbar_get_adjustment",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_scrollbar_set_adjustment = Interop.downcallHandle(
                "gtk_scrollbar_set_adjustment",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_scrollbar_get_type = Interop.downcallHandle(
                "gtk_scrollbar_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_scrollbar_get_type != null;
    }
}
