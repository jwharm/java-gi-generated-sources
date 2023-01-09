package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GdkPopup} is a surface that is attached to another surface.
 * <p>
 * The {@code GdkPopup} is positioned relative to its parent surface.
 * <p>
 * {@code GdkPopup}s are typically used to implement menus and similar popups.
 * They can be modal, which is indicated by the {@code GdkPopup:autohide}
 * property.
 */
public interface Popup extends io.github.jwharm.javagi.Proxy {
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, PopupImpl> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new PopupImpl(input);
    
    /**
     * Returns whether this popup is set to hide on outside clicks.
     * @return {@code true} if {@code popup} will autohide
     */
    default boolean getAutohide() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_popup_get_autohide.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns the parent surface of a popup.
     * @return the parent surface
     */
    default @Nullable org.gtk.gdk.Surface getParent() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_popup_get_parent.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdk.Surface) Interop.register(RESULT, org.gtk.gdk.Surface.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Obtains the position of the popup relative to its parent.
     * @return the X coordinate of {@code popup} position
     */
    default int getPositionX() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_popup_get_position_x.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Obtains the position of the popup relative to its parent.
     * @return the Y coordinate of {@code popup} position
     */
    default int getPositionY() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_popup_get_position_y.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the current popup rectangle anchor.
     * <p>
     * The value returned may change after calling {@link Popup#present},
     * or after the {@code Gdk.Surface::layout} signal is emitted.
     * @return the current rectangle anchor value of {@code popup}
     */
    default org.gtk.gdk.Gravity getRectAnchor() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_popup_get_rect_anchor.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gdk.Gravity.of(RESULT);
    }
    
    /**
     * Gets the current popup surface anchor.
     * <p>
     * The value returned may change after calling {@link Popup#present},
     * or after the {@code Gdk.Surface::layout} signal is emitted.
     * @return the current surface anchor value of {@code popup}
     */
    default org.gtk.gdk.Gravity getSurfaceAnchor() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_popup_get_surface_anchor.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gdk.Gravity.of(RESULT);
    }
    
    /**
     * Present {@code popup} after having processed the {@code GdkPopupLayout} rules.
     * <p>
     * If the popup was previously now showing, it will be showed,
     * otherwise it will change position according to {@code layout}.
     * <p>
     * After calling this function, the result should be handled in response
     * to the {@code GdkSurface::layout} signal being emitted. The resulting
     * popup position can be queried using {@link Popup#getPositionX},
     * {@link Popup#getPositionY}, and the resulting size will be sent as
     * parameters in the layout signal. Use {@link Popup#getRectAnchor}
     * and {@link Popup#getSurfaceAnchor} to get the resulting anchors.
     * <p>
     * Presenting may fail, for example if the {@code popup} is set to autohide
     * and is immediately hidden upon being presented. If presenting failed,
     * the {@code Gdk.Surface::layout} signal will not me emitted.
     * @param width the unconstrained popup width to layout
     * @param height the unconstrained popup height to layout
     * @param layout the {@code GdkPopupLayout} object used to layout
     * @return {@code false} if it failed to be presented, otherwise {@code true}.
     */
    default boolean present(int width, int height, org.gtk.gdk.PopupLayout layout) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_popup_present.invokeExact(
                    handle(),
                    width,
                    height,
                    layout.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gdk_popup_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle gdk_popup_get_autohide = Interop.downcallHandle(
                "gdk_popup_get_autohide",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gdk_popup_get_parent = Interop.downcallHandle(
                "gdk_popup_get_parent",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gdk_popup_get_position_x = Interop.downcallHandle(
                "gdk_popup_get_position_x",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gdk_popup_get_position_y = Interop.downcallHandle(
                "gdk_popup_get_position_y",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gdk_popup_get_rect_anchor = Interop.downcallHandle(
                "gdk_popup_get_rect_anchor",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gdk_popup_get_surface_anchor = Interop.downcallHandle(
                "gdk_popup_get_surface_anchor",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gdk_popup_present = Interop.downcallHandle(
                "gdk_popup_present",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gdk_popup_get_type = Interop.downcallHandle(
                "gdk_popup_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * The PopupImpl type represents a native instance of the Popup interface.
     */
    class PopupImpl extends org.gtk.gobject.GObject implements Popup {
        
        static {
            Gdk.javagi$ensureInitialized();
        }
        
        /**
         * Creates a new instance of Popup for the provided memory address.
         * @param address the memory address of the instance
         */
        public PopupImpl(Addressable address) {
            super(address);
        }
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gdk_popup_get_type != null;
    }
}
