package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkViewport} implements scrollability for widgets that lack their
 * own scrolling capabilities.
 * <p>
 * Use {@code GtkViewport} to scroll child widgets such as {@code GtkGrid},
 * {@code GtkBox}, and so on.
 * <p>
 * The {@code GtkViewport} will start scrolling content only if allocated
 * less than the child widget’s minimum size in a given orientation.
 * <p>
 * <strong>CSS nodes</strong><br/>
 * {@code GtkViewport} has a single CSS node with name {@code viewport}.
 * <p>
 * <strong>Accessibility</strong><br/>
 * {@code GtkViewport} uses the {@link AccessibleRole#GROUP} role.
 */
public class Viewport extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Scrollable {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkViewport";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a Viewport proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Viewport(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Viewport> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Viewport(input);
    
    private static MemoryAddress constructNew(@Nullable org.gtk.gtk.Adjustment hadjustment, @Nullable org.gtk.gtk.Adjustment vadjustment) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_viewport_new.invokeExact(
                    (Addressable) (hadjustment == null ? MemoryAddress.NULL : hadjustment.handle()),
                    (Addressable) (vadjustment == null ? MemoryAddress.NULL : vadjustment.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkViewport}.
     * <p>
     * The new viewport uses the given adjustments, or default
     * adjustments if none are given.
     * @param hadjustment horizontal adjustment
     * @param vadjustment vertical adjustment
     */
    public Viewport(@Nullable org.gtk.gtk.Adjustment hadjustment, @Nullable org.gtk.gtk.Adjustment vadjustment) {
        super(constructNew(hadjustment, vadjustment));
        this.refSink();
        this.takeOwnership();
    }
    
    /**
     * Gets the child widget of {@code viewport}.
     * @return the child widget of {@code viewport}
     */
    public @Nullable org.gtk.gtk.Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_viewport_get_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) Interop.register(RESULT, org.gtk.gtk.Widget.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets whether the viewport is scrolling to keep the focused
     * child in view.
     * @return {@code true} if the viewport keeps the focus child scrolled to view
     */
    public boolean getScrollToFocus() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_viewport_get_scroll_to_focus.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets the child widget of {@code viewport}.
     * @param child the child widget
     */
    public void setChild(@Nullable org.gtk.gtk.Widget child) {
        try {
            DowncallHandles.gtk_viewport_set_child.invokeExact(
                    handle(),
                    (Addressable) (child == null ? MemoryAddress.NULL : child.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the viewport should automatically scroll
     * to keep the focused child in view.
     * @param scrollToFocus whether to keep the focus widget scrolled to view
     */
    public void setScrollToFocus(boolean scrollToFocus) {
        try {
            DowncallHandles.gtk_viewport_set_scroll_to_focus.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(scrollToFocus, null).intValue());
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
            RESULT = (long) DowncallHandles.gtk_viewport_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link Viewport.Builder} object constructs a {@link Viewport} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Viewport.Builder#build()}. 
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
         * Finish building the {@link Viewport} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Viewport}.
         * @return A new instance of {@code Viewport} with the properties 
         *         that were set in the Builder object.
         */
        public Viewport build() {
            return (Viewport) org.gtk.gobject.GObject.newWithProperties(
                Viewport.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The child widget.
         * @param child The value for the {@code child} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setChild(org.gtk.gtk.Widget child) {
            names.add("child");
            values.add(org.gtk.gobject.Value.create(child));
            return this;
        }
        
        /**
         * Whether to scroll when the focus changes.
         * <p>
         * Before 4.6.2, this property was mistakenly defaulting to FALSE, so if your
         * code needs to work with older versions, consider setting it explicitly to
         * TRUE.
         * @param scrollToFocus The value for the {@code scroll-to-focus} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setScrollToFocus(boolean scrollToFocus) {
            names.add("scroll-to-focus");
            values.add(org.gtk.gobject.Value.create(scrollToFocus));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_viewport_new = Interop.downcallHandle(
                "gtk_viewport_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_viewport_get_child = Interop.downcallHandle(
                "gtk_viewport_get_child",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_viewport_get_scroll_to_focus = Interop.downcallHandle(
                "gtk_viewport_get_scroll_to_focus",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_viewport_set_child = Interop.downcallHandle(
                "gtk_viewport_set_child",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_viewport_set_scroll_to_focus = Interop.downcallHandle(
                "gtk_viewport_set_scroll_to_focus",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_viewport_get_type = Interop.downcallHandle(
                "gtk_viewport_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_viewport_get_type != null;
    }
}
