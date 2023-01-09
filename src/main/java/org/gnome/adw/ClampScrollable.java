package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A scrollable {@link Clamp}.
 * <p>
 * {@code AdwClampScrollable} is a variant of {@link Clamp} that implements the
 * {@code Gtk.Scrollable} interface.
 * <p>
 * The primary use case for {@code AdwClampScrollable} is clamping
 * {@link org.gtk.gtk.ListView}.
 * @version 1.0
 */
public class ClampScrollable extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Orientable, org.gtk.gtk.Scrollable {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "AdwClampScrollable";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a ClampScrollable proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ClampScrollable(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ClampScrollable> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ClampScrollable(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_clamp_scrollable_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwClampScrollable}.
     */
    public ClampScrollable() {
        super(constructNew());
        this.refSink();
        this.takeOwnership();
    }
    
    /**
     * Gets the child widget of {@code self}.
     * @return the child widget of {@code self}
     */
    public @Nullable org.gtk.gtk.Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_clamp_scrollable_get_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) Interop.register(RESULT, org.gtk.gtk.Widget.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets the maximum size allocated to the child.
     * @return the maximum size to allocate to the child
     */
    public int getMaximumSize() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_clamp_scrollable_get_maximum_size.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the size above which the child is clamped.
     * @return the size above which the child is clamped
     */
    public int getTighteningThreshold() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_clamp_scrollable_get_tightening_threshold.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Sets the child widget of {@code self}.
     * @param child the child widget
     */
    public void setChild(@Nullable org.gtk.gtk.Widget child) {
        try {
            DowncallHandles.adw_clamp_scrollable_set_child.invokeExact(
                    handle(),
                    (Addressable) (child == null ? MemoryAddress.NULL : child.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the maximum size allocated to the child.
     * <p>
     * It is the width if the clamp is horizontal, or the height if it is vertical.
     * @param maximumSize the maximum size
     */
    public void setMaximumSize(int maximumSize) {
        try {
            DowncallHandles.adw_clamp_scrollable_set_maximum_size.invokeExact(
                    handle(),
                    maximumSize);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the size above which the child is clamped.
     * <p>
     * Starting from this size, the clamp will tighten its grip on the child, slowly
     * allocating less and less of the available size up to the maximum allocated
     * size. Below that threshold and below the maximum width, the child will be
     * allocated all the available size.
     * <p>
     * If the threshold is greater than the maximum size to allocate to the child,
     * the child will be allocated all the width up to the maximum. If the threshold
     * is lower than the minimum size to allocate to the child, that size will be
     * used as the tightening threshold.
     * <p>
     * Effectively, tightening the grip on the child before it reaches its maximum
     * size makes transitions to and from the maximum size smoother when resizing.
     * @param tighteningThreshold the tightening threshold
     */
    public void setTighteningThreshold(int tighteningThreshold) {
        try {
            DowncallHandles.adw_clamp_scrollable_set_tightening_threshold.invokeExact(
                    handle(),
                    tighteningThreshold);
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
            RESULT = (long) DowncallHandles.adw_clamp_scrollable_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link ClampScrollable.Builder} object constructs a {@link ClampScrollable} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link ClampScrollable.Builder#build()}. 
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
         * Finish building the {@link ClampScrollable} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ClampScrollable}.
         * @return A new instance of {@code ClampScrollable} with the properties 
         *         that were set in the Builder object.
         */
        public ClampScrollable build() {
            return (ClampScrollable) org.gtk.gobject.GObject.newWithProperties(
                ClampScrollable.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The child widget of the {@code AdwClampScrollable}.
         * @param child The value for the {@code child} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setChild(org.gtk.gtk.Widget child) {
            names.add("child");
            values.add(org.gtk.gobject.Value.create(child));
            return this;
        }
        
        /**
         * The maximum size allocated to the child.
         * <p>
         * It is the width if the clamp is horizontal, or the height if it is vertical.
         * @param maximumSize The value for the {@code maximum-size} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMaximumSize(int maximumSize) {
            names.add("maximum-size");
            values.add(org.gtk.gobject.Value.create(maximumSize));
            return this;
        }
        
        /**
         * The size above which the child is clamped.
         * <p>
         * Starting from this size, the clamp will tighten its grip on the child,
         * slowly allocating less and less of the available size up to the maximum
         * allocated size. Below that threshold and below the maximum width, the child
         * will be allocated all the available size.
         * <p>
         * If the threshold is greater than the maximum size to allocate to the child,
         * the child will be allocated all the width up to the maximum.
         * If the threshold is lower than the minimum size to allocate to the child,
         * that size will be used as the tightening threshold.
         * <p>
         * Effectively, tightening the grip on the child before it reaches its maximum
         * size makes transitions to and from the maximum size smoother when resizing.
         * @param tighteningThreshold The value for the {@code tightening-threshold} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTighteningThreshold(int tighteningThreshold) {
            names.add("tightening-threshold");
            values.add(org.gtk.gobject.Value.create(tighteningThreshold));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_clamp_scrollable_new = Interop.downcallHandle(
                "adw_clamp_scrollable_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle adw_clamp_scrollable_get_child = Interop.downcallHandle(
                "adw_clamp_scrollable_get_child",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle adw_clamp_scrollable_get_maximum_size = Interop.downcallHandle(
                "adw_clamp_scrollable_get_maximum_size",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle adw_clamp_scrollable_get_tightening_threshold = Interop.downcallHandle(
                "adw_clamp_scrollable_get_tightening_threshold",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle adw_clamp_scrollable_set_child = Interop.downcallHandle(
                "adw_clamp_scrollable_set_child",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle adw_clamp_scrollable_set_maximum_size = Interop.downcallHandle(
                "adw_clamp_scrollable_set_maximum_size",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle adw_clamp_scrollable_set_tightening_threshold = Interop.downcallHandle(
                "adw_clamp_scrollable_set_tightening_threshold",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle adw_clamp_scrollable_get_type = Interop.downcallHandle(
                "adw_clamp_scrollable_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.adw_clamp_scrollable_get_type != null;
    }
}
