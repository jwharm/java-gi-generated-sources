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
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, TocSetterImpl> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new TocSetterImpl(input);
    
    /**
     * Return current TOC the setter uses. The TOC should not be
     * modified without making it writable first.
     * @return TOC set, or {@code null}. Unref with
     *     gst_toc_unref() when no longer needed
     */
    default @Nullable org.gstreamer.gst.Toc getToc() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_toc_setter_get_toc.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Toc.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Reset the internal TOC. Elements should call this from within the
     * state-change handler.
     */
    default void reset() {
        try {
            DowncallHandles.gst_toc_setter_reset.invokeExact(handle());
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
    public static org.gtk.glib.Type getType() {
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
    
    /**
     * The TocSetterImpl type represents a native instance of the TocSetter interface.
     */
    class TocSetterImpl extends org.gtk.gobject.GObject implements TocSetter {
        
        static {
            Gst.javagi$ensureInitialized();
        }
        
        /**
         * Creates a new instance of TocSetter for the provided memory address.
         * @param address the memory address of the instance
         */
        public TocSetterImpl(Addressable address) {
            super(address);
        }
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_toc_setter_get_type != null;
    }
}
