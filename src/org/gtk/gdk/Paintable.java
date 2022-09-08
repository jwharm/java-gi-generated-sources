package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GdkPaintable` is a simple interface used by GTK to represent content that
 * can be painted.
 * 
 * The content of a `GdkPaintable` can be painted anywhere at any size
 * without requiring any sort of layout. The interface is inspired by
 * similar concepts elsewhere, such as
 * [ClutterContent](https://developer.gnome.org/clutter/stable/ClutterContent.html),
 * [HTML/CSS Paint Sources](https://www.w3.org/TR/css-images-4/#paint-source),
 * or [SVG Paint Servers](https://www.w3.org/TR/SVG2/pservers.html).
 * 
 * A `GdkPaintable` can be snapshot at any time and size using
 * [method@Gdk.Paintable.snapshot]. How the paintable interprets that size and
 * if it scales or centers itself into the given rectangle is implementation
 * defined, though if you are implementing a `GdkPaintable` and don't know what
 * to do, it is suggested that you scale your paintable ignoring any potential
 * aspect ratio.
 * 
 * The contents that a `GdkPaintable` produces may depend on the [class@GdkSnapshot]
 * passed to it. For example, paintables may decide to use more detailed images
 * on higher resolution screens or when OpenGL is available. A `GdkPaintable`
 * will however always produce the same output for the same snapshot.
 * 
 * A `GdkPaintable` may change its contents, meaning that it will now produce
 * a different output with the same snapshot. Once that happens, it will call
 * [method@Gdk.Paintable.invalidate_contents] which will emit the
 * [signal@GdkPaintable::invalidate-contents] signal. If a paintable is known
 * to never change its contents, it will set the %GDK_PAINTABLE_STATIC_CONTENTS
 * flag. If a consumer cannot deal with changing contents, it may call
 * [method@Gdk.Paintable.get_current_image] which will return a static
 * paintable and use that.
 * 
 * A paintable can report an intrinsic (or preferred) size or aspect ratio it
 * wishes to be rendered at, though it doesn't have to. Consumers of the interface
 * can use this information to layout thepaintable appropriately. Just like the
 * contents, the size of a paintable can change. A paintable will indicate this
 * by calling [method@Gdk.Paintable.invalidate_size] which will emit the
 * [signal@GdkPaintable::invalidate-size] signal. And just like for contents,
 * if a paintable is known to never change its size, it will set the
 * %GDK_PAINTABLE_STATIC_SIZE flag.
 * 
 * Besides API for applications, there are some functions that are only
 * useful for implementing subclasses and should not be used by applications:
 * [method@Gdk.Paintable.invalidate_contents],
 * [method@Gdk.Paintable.invalidate_size],
 * [func@Gdk.Paintable.new_empty].
 */
public interface Paintable extends io.github.jwharm.javagi.interop.NativeAddress {

    /**
     * Gets an immutable paintable for the current contents displayed by @paintable.
     * 
     * This is useful when you want to retain the current state of an animation,
     * for example to take a screenshot of a running animation.
     * 
     * If the @paintable is already immutable, it will return itself.
     */
    public default Paintable getCurrentImage() {
        var RESULT = gtk_h.gdk_paintable_get_current_image(handle());
        return new Paintable.PaintableImpl(References.get(RESULT, true));
    }
    
    /**
     * Get flags for the paintable.
     * 
     * This is oftentimes useful for optimizations.
     * 
     * See [flags@Gdk.PaintableFlags] for the flags and what they mean.
     */
    public default int getFlags() {
        var RESULT = gtk_h.gdk_paintable_get_flags(handle());
        return RESULT;
    }
    
    /**
     * Gets the preferred aspect ratio the @paintable would like to be displayed at.
     * 
     * The aspect ratio is the width divided by the height, so a value of 0.5
     * means that the @paintable prefers to be displayed twice as high as it
     * is wide. Consumers of this interface can use this to preserve aspect
     * ratio when displaying the paintable.
     * 
     * This is a purely informational value and does not in any way limit the
     * values that may be passed to [method@Gdk.Paintable.snapshot].
     * 
     * Usually when a @paintable returns nonzero values from
     * [method@Gdk.Paintable.get_intrinsic_width] and
     * [method@Gdk.Paintable.get_intrinsic_height] the aspect ratio
     * should conform to those values, though that is not required.
     * 
     * If the @paintable does not have a preferred aspect ratio,
     * it returns 0. Negative values are never returned.
     */
    public default double getIntrinsicAspectRatio() {
        var RESULT = gtk_h.gdk_paintable_get_intrinsic_aspect_ratio(handle());
        return RESULT;
    }
    
    /**
     * Gets the preferred height the @paintable would like to be displayed at.
     * 
     * Consumers of this interface can use this to reserve enough space to draw
     * the paintable.
     * 
     * This is a purely informational value and does not in any way limit the
     * values that may be passed to [method@Gdk.Paintable.snapshot].
     * 
     * If the @paintable does not have a preferred height, it returns 0.
     * Negative values are never returned.
     */
    public default int getIntrinsicHeight() {
        var RESULT = gtk_h.gdk_paintable_get_intrinsic_height(handle());
        return RESULT;
    }
    
    /**
     * Gets the preferred width the @paintable would like to be displayed at.
     * 
     * Consumers of this interface can use this to reserve enough space to draw
     * the paintable.
     * 
     * This is a purely informational value and does not in any way limit the
     * values that may be passed to [method@Gdk.Paintable.snapshot].
     * 
     * If the @paintable does not have a preferred width, it returns 0.
     * Negative values are never returned.
     */
    public default int getIntrinsicWidth() {
        var RESULT = gtk_h.gdk_paintable_get_intrinsic_width(handle());
        return RESULT;
    }
    
    /**
     * Called by implementations of `GdkPaintable` to invalidate their contents.
     * 
     * Unless the contents are invalidated, implementations must guarantee that
     * multiple calls of [method@Gdk.Paintable.snapshot] produce the same output.
     * 
     * This function will emit the [signal@Gdk.Paintable::invalidate-contents]
     * signal.
     * 
     * If a @paintable reports the %GDK_PAINTABLE_STATIC_CONTENTS flag,
     * it must not call this function.
     */
    public default void invalidateContents() {
        gtk_h.gdk_paintable_invalidate_contents(handle());
    }
    
    /**
     * Called by implementations of `GdkPaintable` to invalidate their size.
     * 
     * As long as the size is not invalidated, @paintable must return the same
     * values for its intrinsic width, height and aspect ratio.
     * 
     * This function will emit the [signal@Gdk.Paintable::invalidate-size]
     * signal.
     * 
     * If a @paintable reports the %GDK_PAINTABLE_STATIC_SIZE flag,
     * it must not call this function.
     */
    public default void invalidateSize() {
        gtk_h.gdk_paintable_invalidate_size(handle());
    }
    
    /**
     * Snapshots the given paintable with the given @width and @height.
     * 
     * The paintable is drawn at the current (0,0) offset of the @snapshot.
     * If @width and @height are not larger than zero, this function will
     * do nothing.
     */
    public default void snapshot(Snapshot snapshot, double width, double height) {
        gtk_h.gdk_paintable_snapshot(handle(), snapshot.handle(), width, height);
    }
    
    @FunctionalInterface
    public interface InvalidateContentsHandler {
        void signalReceived(Paintable source);
    }
    
    /**
     * Emitted when the contents of the @paintable change.
     * 
     * Examples for such an event would be videos changing to the next frame or
     * the icon theme for an icon changing.
     */
    public default void onInvalidateContents(InvalidateContentsHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalPaintableInvalidateContents", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(this.handle(), Interop.allocateNativeString("invalidate-contents").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface InvalidateSizeHandler {
        void signalReceived(Paintable source);
    }
    
    /**
     * Emitted when the intrinsic size of the @paintable changes.
     * 
     * This means the values reported by at least one of
     * [method@Gdk.Paintable.get_intrinsic_width],
     * [method@Gdk.Paintable.get_intrinsic_height] or
     * [method@Gdk.Paintable.get_intrinsic_aspect_ratio]
     * has changed.
     * 
     * Examples for such an event would be a paintable displaying
     * the contents of a toplevel surface being resized.
     */
    public default void onInvalidateSize(InvalidateSizeHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalPaintableInvalidateSize", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(this.handle(), Interop.allocateNativeString("invalidate-size").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    class PaintableImpl extends org.gtk.gobject.Object implements Paintable {
        public PaintableImpl(io.github.jwharm.javagi.interop.Reference reference) {
            super(reference);
        }
    }
}
