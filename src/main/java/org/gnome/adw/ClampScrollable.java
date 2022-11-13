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
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ClampScrollable(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to ClampScrollable if its GType is a (or inherits from) "AdwClampScrollable".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code ClampScrollable} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "AdwClampScrollable", a ClassCastException will be thrown.
     */
    public static ClampScrollable castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("AdwClampScrollable"))) {
            return new ClampScrollable(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of AdwClampScrollable");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
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
        super(constructNew(), Ownership.NONE);
    }
    
    /**
     * Gets the child widget of {@code self}.
     * @return the child widget of {@code self}
     */
    public @Nullable org.gtk.gtk.Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_clamp_scrollable_get_child.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the maximum size allocated to the child.
     * @return the maximum size to allocate to the child
     */
    public int getMaximumSize() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_clamp_scrollable_get_maximum_size.invokeExact(
                    handle());
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
            RESULT = (int) DowncallHandles.adw_clamp_scrollable_get_tightening_threshold.invokeExact(
                    handle());
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
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_clamp_scrollable_new = Interop.downcallHandle(
            "adw_clamp_scrollable_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_clamp_scrollable_get_child = Interop.downcallHandle(
            "adw_clamp_scrollable_get_child",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_clamp_scrollable_get_maximum_size = Interop.downcallHandle(
            "adw_clamp_scrollable_get_maximum_size",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_clamp_scrollable_get_tightening_threshold = Interop.downcallHandle(
            "adw_clamp_scrollable_get_tightening_threshold",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_clamp_scrollable_set_child = Interop.downcallHandle(
            "adw_clamp_scrollable_set_child",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_clamp_scrollable_set_maximum_size = Interop.downcallHandle(
            "adw_clamp_scrollable_set_maximum_size",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle adw_clamp_scrollable_set_tightening_threshold = Interop.downcallHandle(
            "adw_clamp_scrollable_set_tightening_threshold",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
    }
}
