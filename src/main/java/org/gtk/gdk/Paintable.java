package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GdkPaintable} is a simple interface used by GTK to represent content that
 * can be painted.
 * <p>
 * The content of a {@code GdkPaintable} can be painted anywhere at any size
 * without requiring any sort of layout. The interface is inspired by
 * similar concepts elsewhere, such as
 * <a href="https://developer.gnome.org/clutter/stable/ClutterContent.html">ClutterContent</a>,
 * <a href="https://www.w3.org/TR/css-images-4/#paint-source">HTML/CSS Paint Sources</a>,
 * or <a href="https://www.w3.org/TR/SVG2/pservers.html">SVG Paint Servers</a>.
 * <p>
 * A {@code GdkPaintable} can be snapshot at any time and size using
 * {@link Paintable#snapshot}. How the paintable interprets that size and
 * if it scales or centers itself into the given rectangle is implementation
 * defined, though if you are implementing a {@code GdkPaintable} and don't know what
 * to do, it is suggested that you scale your paintable ignoring any potential
 * aspect ratio.
 * <p>
 * The contents that a {@code GdkPaintable} produces may depend on the {@code GdkSnapshot}
 * passed to it. For example, paintables may decide to use more detailed images
 * on higher resolution screens or when OpenGL is available. A {@code GdkPaintable}
 * will however always produce the same output for the same snapshot.
 * <p>
 * A {@code GdkPaintable} may change its contents, meaning that it will now produce
 * a different output with the same snapshot. Once that happens, it will call
 * {@link Paintable#invalidateContents} which will emit the
 * {@code GdkPaintable::invalidate-contents} signal. If a paintable is known
 * to never change its contents, it will set the {@link PaintableFlags#CONTENTS}
 * flag. If a consumer cannot deal with changing contents, it may call
 * {@link Paintable#getCurrentImage} which will return a static
 * paintable and use that.
 * <p>
 * A paintable can report an intrinsic (or preferred) size or aspect ratio it
 * wishes to be rendered at, though it doesn't have to. Consumers of the interface
 * can use this information to layout thepaintable appropriately. Just like the
 * contents, the size of a paintable can change. A paintable will indicate this
 * by calling {@link Paintable#invalidateSize} which will emit the
 * {@code GdkPaintable::invalidate-size} signal. And just like for contents,
 * if a paintable is known to never change its size, it will set the
 * {@link PaintableFlags#SIZE} flag.
 * <p>
 * Besides API for applications, there are some functions that are only
 * useful for implementing subclasses and should not be used by applications:
 * {@link Paintable#invalidateContents},
 * {@link Paintable#invalidateSize},
 * {@link Paintable#newEmpty}.
 */
public interface Paintable extends io.github.jwharm.javagi.Proxy {
    
    /**
     * Cast object to Paintable if its GType is a (or inherits from) "GdkPaintable".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "Paintable" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GdkPaintable", a ClassCastException will be thrown.
     */
    public static Paintable castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GdkPaintable"))) {
            return new PaintableImpl(gobject.handle(), gobject.refcounted().getOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GdkPaintable");
        }
    }
    
    /**
     * Compute a concrete size for the {@code GdkPaintable}.
     * <p>
     * Applies the sizing algorithm outlined in the
     * <a href="https://drafts.csswg.org/css-images-3/#default-sizing">CSS Image spec</a>
     * to the given {@code paintable}. See that link for more details.
     * <p>
     * It is not necessary to call this function when both {@code specified_width}
     * and {@code specified_height} are known, but it is useful to call this
     * function in GtkWidget:measure implementations to compute the
     * other dimension when only one dimension is given.
     * @param specifiedWidth the width {@code paintable} could be drawn into or
     *   0.0 if unknown
     * @param specifiedHeight the height {@code paintable} could be drawn into or
     *   0.0 if unknown
     * @param defaultWidth the width {@code paintable} would be drawn into if
     *   no other constraints were given
     * @param defaultHeight the height {@code paintable} would be drawn into if
     *   no other constraints were given
     * @param concreteWidth will be set to the concrete width computed
     * @param concreteHeight will be set to the concrete height computed
     */
    default void computeConcreteSize(double specifiedWidth, double specifiedHeight, double defaultWidth, double defaultHeight, Out<Double> concreteWidth, Out<Double> concreteHeight) {
        java.util.Objects.requireNonNull(concreteWidth, "Parameter 'concreteWidth' must not be null");
        java.util.Objects.requireNonNull(concreteHeight, "Parameter 'concreteHeight' must not be null");
        MemorySegment concreteWidthPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_DOUBLE);
        MemorySegment concreteHeightPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_DOUBLE);
        try {
            DowncallHandles.gdk_paintable_compute_concrete_size.invokeExact(
                    handle(),
                    specifiedWidth,
                    specifiedHeight,
                    defaultWidth,
                    defaultHeight,
                    (Addressable) concreteWidthPOINTER.address(),
                    (Addressable) concreteHeightPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        concreteWidth.set(concreteWidthPOINTER.get(ValueLayout.JAVA_DOUBLE, 0));
        concreteHeight.set(concreteHeightPOINTER.get(ValueLayout.JAVA_DOUBLE, 0));
    }
    
    /**
     * Gets an immutable paintable for the current contents displayed by {@code paintable}.
     * <p>
     * This is useful when you want to retain the current state of an animation,
     * for example to take a screenshot of a running animation.
     * <p>
     * If the {@code paintable} is already immutable, it will return itself.
     * @return An immutable paintable for the current
     *   contents of {@code paintable}
     */
    default @NotNull org.gtk.gdk.Paintable getCurrentImage() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_paintable_get_current_image.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Paintable.PaintableImpl(RESULT, Ownership.FULL);
    }
    
    /**
     * Get flags for the paintable.
     * <p>
     * This is oftentimes useful for optimizations.
     * <p>
     * See {@code Gdk.PaintableFlags} for the flags and what they mean.
     * @return The {@code GdkPaintableFlags} for this paintable
     */
    default @NotNull org.gtk.gdk.PaintableFlags getFlags() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_paintable_get_flags.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.PaintableFlags(RESULT);
    }
    
    /**
     * Gets the preferred aspect ratio the {@code paintable} would like to be displayed at.
     * <p>
     * The aspect ratio is the width divided by the height, so a value of 0.5
     * means that the {@code paintable} prefers to be displayed twice as high as it
     * is wide. Consumers of this interface can use this to preserve aspect
     * ratio when displaying the paintable.
     * <p>
     * This is a purely informational value and does not in any way limit the
     * values that may be passed to {@link Paintable#snapshot}.
     * <p>
     * Usually when a {@code paintable} returns nonzero values from
     * {@link Paintable#getIntrinsicWidth} and
     * {@link Paintable#getIntrinsicHeight} the aspect ratio
     * should conform to those values, though that is not required.
     * <p>
     * If the {@code paintable} does not have a preferred aspect ratio,
     * it returns 0. Negative values are never returned.
     * @return the intrinsic aspect ratio of {@code paintable} or 0 if none.
     */
    default double getIntrinsicAspectRatio() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gdk_paintable_get_intrinsic_aspect_ratio.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the preferred height the {@code paintable} would like to be displayed at.
     * <p>
     * Consumers of this interface can use this to reserve enough space to draw
     * the paintable.
     * <p>
     * This is a purely informational value and does not in any way limit the
     * values that may be passed to {@link Paintable#snapshot}.
     * <p>
     * If the {@code paintable} does not have a preferred height, it returns 0.
     * Negative values are never returned.
     * @return the intrinsic height of {@code paintable} or 0 if none.
     */
    default int getIntrinsicHeight() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_paintable_get_intrinsic_height.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the preferred width the {@code paintable} would like to be displayed at.
     * <p>
     * Consumers of this interface can use this to reserve enough space to draw
     * the paintable.
     * <p>
     * This is a purely informational value and does not in any way limit the
     * values that may be passed to {@link Paintable#snapshot}.
     * <p>
     * If the {@code paintable} does not have a preferred width, it returns 0.
     * Negative values are never returned.
     * @return the intrinsic width of {@code paintable} or 0 if none.
     */
    default int getIntrinsicWidth() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_paintable_get_intrinsic_width.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Called by implementations of {@code GdkPaintable} to invalidate their contents.
     * <p>
     * Unless the contents are invalidated, implementations must guarantee that
     * multiple calls of {@link Paintable#snapshot} produce the same output.
     * <p>
     * This function will emit the {@code Gdk.Paintable::invalidate-contents}
     * signal.
     * <p>
     * If a {@code paintable} reports the {@link PaintableFlags#CONTENTS} flag,
     * it must not call this function.
     */
    default void invalidateContents() {
        try {
            DowncallHandles.gdk_paintable_invalidate_contents.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Called by implementations of {@code GdkPaintable} to invalidate their size.
     * <p>
     * As long as the size is not invalidated, {@code paintable} must return the same
     * values for its intrinsic width, height and aspect ratio.
     * <p>
     * This function will emit the {@code Gdk.Paintable::invalidate-size}
     * signal.
     * <p>
     * If a {@code paintable} reports the {@link PaintableFlags#SIZE} flag,
     * it must not call this function.
     */
    default void invalidateSize() {
        try {
            DowncallHandles.gdk_paintable_invalidate_size.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Snapshots the given paintable with the given {@code width} and {@code height}.
     * <p>
     * The paintable is drawn at the current (0,0) offset of the {@code snapshot}.
     * If {@code width} and {@code height} are not larger than zero, this function will
     * do nothing.
     * @param snapshot a {@code GdkSnapshot} to snapshot to
     * @param width width to snapshot in
     * @param height height to snapshot in
     */
    default void snapshot(@NotNull org.gtk.gdk.Snapshot snapshot, double width, double height) {
        java.util.Objects.requireNonNull(snapshot, "Parameter 'snapshot' must not be null");
        try {
            DowncallHandles.gdk_paintable_snapshot.invokeExact(
                    handle(),
                    snapshot.handle(),
                    width,
                    height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns a paintable that has the given intrinsic size and draws nothing.
     * <p>
     * This is often useful for implementing the
     * {@link Paintable#getCurrentImage} virtual function
     * when the paintable is in an incomplete state (like a
     * {@link org.gtk.gtk.MediaStream} before receiving the first frame).
     * @param intrinsicWidth The intrinsic width to report. Can be 0 for no width.
     * @param intrinsicHeight The intrinsic height to report. Can be 0 for no height.
     * @return a {@code GdkPaintable}
     */
    public static @NotNull org.gtk.gdk.Paintable newEmpty(int intrinsicWidth, int intrinsicHeight) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_paintable_new_empty.invokeExact(
                    intrinsicWidth,
                    intrinsicHeight);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Paintable.PaintableImpl(RESULT, Ownership.FULL);
    }
    
    @FunctionalInterface
    public interface InvalidateContents {
        void signalReceived(Paintable source);
    }
    
    /**
     * Emitted when the contents of the {@code paintable} change.
     * <p>
     * Examples for such an event would be videos changing to the next frame or
     * the icon theme for an icon changing.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public default Signal<Paintable.InvalidateContents> onInvalidateContents(Paintable.InvalidateContents handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("invalidate-contents"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Paintable.Callbacks.class, "signalPaintableInvalidateContents",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Paintable.InvalidateContents>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface InvalidateSize {
        void signalReceived(Paintable source);
    }
    
    /**
     * Emitted when the intrinsic size of the {@code paintable} changes.
     * <p>
     * This means the values reported by at least one of
     * {@link Paintable#getIntrinsicWidth},
     * {@link Paintable#getIntrinsicHeight} or
     * {@link Paintable#getIntrinsicAspectRatio}
     * has changed.
     * <p>
     * Examples for such an event would be a paintable displaying
     * the contents of a toplevel surface being resized.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public default Signal<Paintable.InvalidateSize> onInvalidateSize(Paintable.InvalidateSize handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("invalidate-size"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Paintable.Callbacks.class, "signalPaintableInvalidateSize",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Paintable.InvalidateSize>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle gdk_paintable_compute_concrete_size = Interop.downcallHandle(
            "gdk_paintable_compute_concrete_size",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gdk_paintable_get_current_image = Interop.downcallHandle(
            "gdk_paintable_get_current_image",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gdk_paintable_get_flags = Interop.downcallHandle(
            "gdk_paintable_get_flags",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gdk_paintable_get_intrinsic_aspect_ratio = Interop.downcallHandle(
            "gdk_paintable_get_intrinsic_aspect_ratio",
            FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gdk_paintable_get_intrinsic_height = Interop.downcallHandle(
            "gdk_paintable_get_intrinsic_height",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gdk_paintable_get_intrinsic_width = Interop.downcallHandle(
            "gdk_paintable_get_intrinsic_width",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gdk_paintable_invalidate_contents = Interop.downcallHandle(
            "gdk_paintable_invalidate_contents",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gdk_paintable_invalidate_size = Interop.downcallHandle(
            "gdk_paintable_invalidate_size",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gdk_paintable_snapshot = Interop.downcallHandle(
            "gdk_paintable_snapshot",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gdk_paintable_new_empty = Interop.downcallHandle(
            "gdk_paintable_new_empty",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT),
            false
        );
    }
    
    @ApiStatus.Internal
    static class Callbacks {
        
        public static void signalPaintableInvalidateContents(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (Paintable.InvalidateContents) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Paintable.PaintableImpl(source, Ownership.UNKNOWN));
        }
        
        public static void signalPaintableInvalidateSize(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (Paintable.InvalidateSize) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Paintable.PaintableImpl(source, Ownership.UNKNOWN));
        }
    }
    
    class PaintableImpl extends org.gtk.gobject.Object implements Paintable {
        
        static {
            Gdk.javagi$ensureInitialized();
        }
        
        public PaintableImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
