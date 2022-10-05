package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
 * The contents that a {@code GdkPaintable} produces may depend on the {@link GdkSnapshot}
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
 * {@link Gdk#Paintable}.
 */
public interface Paintable extends io.github.jwharm.javagi.Proxy {

    static final MethodHandle gdk_paintable_compute_concrete_size = Interop.downcallHandle(
        "gdk_paintable_compute_concrete_size",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public default void computeConcreteSize(double specifiedWidth, double specifiedHeight, double defaultWidth, double defaultHeight, PointerDouble concreteWidth, PointerDouble concreteHeight) {
        try {
            gdk_paintable_compute_concrete_size.invokeExact(handle(), specifiedWidth, specifiedHeight, defaultWidth, defaultHeight, concreteWidth.handle(), concreteHeight.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_paintable_get_current_image = Interop.downcallHandle(
        "gdk_paintable_get_current_image",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets an immutable paintable for the current contents displayed by {@code paintable}.
     * <p>
     * This is useful when you want to retain the current state of an animation,
     * for example to take a screenshot of a running animation.
     * <p>
     * If the {@code paintable} is already immutable, it will return itself.
     */
    public default Paintable getCurrentImage() {
        try {
            var RESULT = (MemoryAddress) gdk_paintable_get_current_image.invokeExact(handle());
            return new Paintable.PaintableImpl(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_paintable_get_flags = Interop.downcallHandle(
        "gdk_paintable_get_flags",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Get flags for the paintable.
     * <p>
     * This is oftentimes useful for optimizations.
     * <p>
     * See {@code Gdk.PaintableFlags} for the flags and what they mean.
     */
    public default PaintableFlags getFlags() {
        try {
            var RESULT = (int) gdk_paintable_get_flags.invokeExact(handle());
            return new PaintableFlags(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_paintable_get_intrinsic_aspect_ratio = Interop.downcallHandle(
        "gdk_paintable_get_intrinsic_aspect_ratio",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
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
     */
    public default double getIntrinsicAspectRatio() {
        try {
            var RESULT = (double) gdk_paintable_get_intrinsic_aspect_ratio.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_paintable_get_intrinsic_height = Interop.downcallHandle(
        "gdk_paintable_get_intrinsic_height",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
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
     */
    public default int getIntrinsicHeight() {
        try {
            var RESULT = (int) gdk_paintable_get_intrinsic_height.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_paintable_get_intrinsic_width = Interop.downcallHandle(
        "gdk_paintable_get_intrinsic_width",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
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
     */
    public default int getIntrinsicWidth() {
        try {
            var RESULT = (int) gdk_paintable_get_intrinsic_width.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_paintable_invalidate_contents = Interop.downcallHandle(
        "gdk_paintable_invalidate_contents",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
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
    public default void invalidateContents() {
        try {
            gdk_paintable_invalidate_contents.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_paintable_invalidate_size = Interop.downcallHandle(
        "gdk_paintable_invalidate_size",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
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
    public default void invalidateSize() {
        try {
            gdk_paintable_invalidate_size.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_paintable_snapshot = Interop.downcallHandle(
        "gdk_paintable_snapshot",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Snapshots the given paintable with the given {@code width} and {@code height}.
     * <p>
     * The paintable is drawn at the current (0,0) offset of the {@code snapshot}.
     * If {@code width} and {@code height} are not larger than zero, this function will
     * do nothing.
     */
    public default void snapshot(Snapshot snapshot, double width, double height) {
        try {
            gdk_paintable_snapshot.invokeExact(handle(), snapshot.handle(), width, height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_paintable_new_empty = Interop.downcallHandle(
        "gdk_paintable_new_empty",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns a paintable that has the given intrinsic size and draws nothing.
     * <p>
     * This is often useful for implementing the
     * {@link Paintable#getCurrentImage} virtual function
     * when the paintable is in an incomplete state (like a
     * {@link org.gtk.gtk.MediaStream} before receiving the first frame).
     */
    public static Paintable newEmpty(int intrinsicWidth, int intrinsicHeight) {
        try {
            var RESULT = (MemoryAddress) gdk_paintable_new_empty.invokeExact(intrinsicWidth, intrinsicHeight);
            return new Paintable.PaintableImpl(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface InvalidateContentsHandler {
        void signalReceived(Paintable source);
    }
    
    /**
     * Emitted when the contents of the {@code paintable} change.
     * <p>
     * Examples for such an event would be videos changing to the next frame or
     * the icon theme for an icon changing.
     */
    public default SignalHandle onInvalidateContents(InvalidateContentsHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("invalidate-contents").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Paintable.Callbacks.class, "signalPaintableInvalidateContents",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface InvalidateSizeHandler {
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
     */
    public default SignalHandle onInvalidateSize(InvalidateSizeHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("invalidate-size").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Paintable.Callbacks.class, "signalPaintableInvalidateSize",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalPaintableInvalidateContents(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Paintable.InvalidateContentsHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Paintable.PaintableImpl(Refcounted.get(source)));
        }
        
        public static void signalPaintableInvalidateSize(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Paintable.InvalidateSizeHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Paintable.PaintableImpl(Refcounted.get(source)));
        }
        
    }
    
    class PaintableImpl extends org.gtk.gobject.Object implements Paintable {
        public PaintableImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}