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

    @ApiStatus.Internal static final MethodHandle gdk_popup_get_autohide = Interop.downcallHandle(
        "gdk_popup_get_autohide",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether this popup is set to hide on outside clicks.
     */
    default boolean getAutohide() {
        int RESULT;
        try {
            RESULT = (int) gdk_popup_get_autohide.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    @ApiStatus.Internal static final MethodHandle gdk_popup_get_parent = Interop.downcallHandle(
        "gdk_popup_get_parent",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the parent surface of a popup.
     */
    default @Nullable Surface getParent() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gdk_popup_get_parent.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Surface(Refcounted.get(RESULT, false));
    }
    
    @ApiStatus.Internal static final MethodHandle gdk_popup_get_position_x = Interop.downcallHandle(
        "gdk_popup_get_position_x",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Obtains the position of the popup relative to its parent.
     */
    default int getPositionX() {
        int RESULT;
        try {
            RESULT = (int) gdk_popup_get_position_x.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    @ApiStatus.Internal static final MethodHandle gdk_popup_get_position_y = Interop.downcallHandle(
        "gdk_popup_get_position_y",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Obtains the position of the popup relative to its parent.
     */
    default int getPositionY() {
        int RESULT;
        try {
            RESULT = (int) gdk_popup_get_position_y.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    @ApiStatus.Internal static final MethodHandle gdk_popup_get_rect_anchor = Interop.downcallHandle(
        "gdk_popup_get_rect_anchor",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the current popup rectangle anchor.
     * <p>
     * The value returned may change after calling {@link Popup#present},
     * or after the {@code Gdk.Surface::layout} signal is emitted.
     */
    default @NotNull Gravity getRectAnchor() {
        int RESULT;
        try {
            RESULT = (int) gdk_popup_get_rect_anchor.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Gravity(RESULT);
    }
    
    @ApiStatus.Internal static final MethodHandle gdk_popup_get_surface_anchor = Interop.downcallHandle(
        "gdk_popup_get_surface_anchor",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the current popup surface anchor.
     * <p>
     * The value returned may change after calling {@link Popup#present},
     * or after the {@code Gdk.Surface::layout} signal is emitted.
     */
    default @NotNull Gravity getSurfaceAnchor() {
        int RESULT;
        try {
            RESULT = (int) gdk_popup_get_surface_anchor.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Gravity(RESULT);
    }
    
    @ApiStatus.Internal static final MethodHandle gdk_popup_present = Interop.downcallHandle(
        "gdk_popup_present",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
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
     */
    default boolean present(@NotNull int width, @NotNull int height, @NotNull PopupLayout layout) {
        int RESULT;
        try {
            RESULT = (int) gdk_popup_present.invokeExact(handle(), width, height, layout.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    class PopupImpl extends org.gtk.gobject.Object implements Popup {
        public PopupImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
