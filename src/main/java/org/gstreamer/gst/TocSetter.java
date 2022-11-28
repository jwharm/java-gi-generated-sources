package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Element interface that allows setting of the TOC.
 * <p>
 * Elements that support some kind of chapters or editions (or tracks like in
 * the FLAC cue sheet) will implement this interface.
 * <p>
 * If you just want to retrieve the TOC in your application then all you
 * need to do is watch for TOC messages on your pipeline's bus (or you can
 * perform TOC query). This interface is only for setting TOC data, not for
 * extracting it. To set TOC from the application, find proper tocsetter element
 * and set TOC using gst_toc_setter_set_toc().
 * <p>
 * Elements implementing the {@link TocSetter} interface can extend existing TOC
 * by getting extend UID for that (you can use gst_toc_find_entry() to retrieve it)
 * with any TOC entries received from downstream.
 */
public interface TocSetter extends io.github.jwharm.javagi.Proxy {
    
    /**
     * Cast object to TocSetter if its GType is a (or inherits from) "GstTocSetter".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code TocSetter} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstTocSetter", a ClassCastException will be thrown.
     */
    public static TocSetter castFrom(org.gtk.gobject.Object gobject) {
            return new TocSetterImpl(gobject.handle(), gobject.yieldOwnership());
    }
    
    /**
     * Return current TOC the setter uses. The TOC should not be
     * modified without making it writable first.
     * @return TOC set, or {@code null}. Unref with
     *     gst_toc_unref() when no longer needed
     */
    default @Nullable org.gstreamer.gst.Toc getToc() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_toc_setter_get_toc.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Toc(RESULT, Ownership.FULL);
    }
    
    /**
     * Reset the internal TOC. Elements should call this from within the
     * state-change handler.
     */
    default void reset() {
        try {
            DowncallHandles.gst_toc_setter_reset.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the given TOC on the setter. Previously set TOC will be
     * unreffed before setting a new one.
     * @param toc a {@link Toc} to set.
     */
    default void setToc(@Nullable org.gstreamer.gst.Toc toc) {
        try {
            DowncallHandles.gst_toc_setter_set_toc.invokeExact(
                    handle(),
                    (Addressable) (toc == null ? MemoryAddress.NULL : toc.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_toc_setter_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle gst_toc_setter_get_toc = Interop.downcallHandle(
            "gst_toc_setter_get_toc",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_toc_setter_reset = Interop.downcallHandle(
            "gst_toc_setter_reset",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_toc_setter_set_toc = Interop.downcallHandle(
            "gst_toc_setter_set_toc",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_toc_setter_get_type = Interop.downcallHandle(
            "gst_toc_setter_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    class TocSetterImpl extends org.gtk.gobject.Object implements TocSetter {
        
        static {
            Gst.javagi$ensureInitialized();
        }
        
        public TocSetterImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
