package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Standard predefined formats
 */
public class Format extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GstFormat";
    
    /**
     * undefined format
     */
    public static final Format UNDEFINED = new Format(0);
    
    /**
     * the default format of the pad/element. This can be
     *    samples for raw audio, frames/fields for raw video (some, but not all,
     *    elements support this; use {@code GST_FORMAT_TIME} if you don't have a good
     *    reason to query for samples/frames)
     */
    public static final Format DEFAULT = new Format(1);
    
    /**
     * bytes
     */
    public static final Format BYTES = new Format(2);
    
    /**
     * time in nanoseconds
     */
    public static final Format TIME = new Format(3);
    
    /**
     * buffers (few, if any, elements implement this as of
     *     May 2009)
     */
    public static final Format BUFFERS = new Format(4);
    
    /**
     * percentage of stream (few, if any, elements implement
     *     this as of May 2009)
     */
    public static final Format PERCENT = new Format(5);
    
    public Format(int value) {
        super(value);
    }
    
    /**
     * Return the format registered with the given nick.
     * @param nick The nick of the format
     * @return The format with {@code nick} or GST_FORMAT_UNDEFINED
     * if the format was not registered.
     */
    public static @NotNull org.gstreamer.gst.Format getByNick(@NotNull java.lang.String nick) {
        java.util.Objects.requireNonNull(nick, "Parameter 'nick' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_format_get_by_nick.invokeExact(
                    Interop.allocateNativeString(nick));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Format(RESULT);
    }
    
    /**
     * Get details about the given format.
     * @param format The format to get details of
     * @return The {@link FormatDefinition} for {@code format} or {@code null}
     * on failure.
     * <p>
     * MT safe.
     */
    public static @Nullable org.gstreamer.gst.FormatDefinition getDetails(@NotNull org.gstreamer.gst.Format format) {
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_format_get_details.invokeExact(
                    format.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.FormatDefinition(RESULT, Ownership.NONE);
    }
    
    /**
     * Get a printable name for the given format. Do not modify or free.
     * @param format a {@link Format}
     * @return a reference to the static name of the format
     * or {@code null} if the format is unknown.
     */
    public static @Nullable java.lang.String getName(@NotNull org.gstreamer.gst.Format format) {
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_format_get_name.invokeExact(
                    format.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Iterate all the registered formats. The format definition is read
     * only.
     * @return a GstIterator of {@link FormatDefinition}.
     */
    public static @NotNull org.gstreamer.gst.Iterator iterateDefinitions() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_format_iterate_definitions.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Iterator(RESULT, Ownership.FULL);
    }
    
    /**
     * Create a new GstFormat based on the nick or return an
     * already registered format with that nick.
     * @param nick The nick of the new format
     * @param description The description of the new format
     * @return A new GstFormat or an already registered format
     * with the same nick.
     * <p>
     * MT safe.
     */
    public static @NotNull org.gstreamer.gst.Format register(@NotNull java.lang.String nick, @NotNull java.lang.String description) {
        java.util.Objects.requireNonNull(nick, "Parameter 'nick' must not be null");
        java.util.Objects.requireNonNull(description, "Parameter 'description' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_format_register.invokeExact(
                    Interop.allocateNativeString(nick),
                    Interop.allocateNativeString(description));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Format(RESULT);
    }
    
    /**
     * Get the unique quark for the given format.
     * @param format a {@link Format}
     * @return the quark associated with the format or 0 if the format
     * is unknown.
     */
    public static @NotNull org.gtk.glib.Quark toQuark(@NotNull org.gstreamer.gst.Format format) {
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_format_to_quark.invokeExact(
                    format.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_format_get_by_nick = Interop.downcallHandle(
            "gst_format_get_by_nick",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_format_get_details = Interop.downcallHandle(
            "gst_format_get_details",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_format_get_name = Interop.downcallHandle(
            "gst_format_get_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_format_iterate_definitions = Interop.downcallHandle(
            "gst_format_iterate_definitions",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_format_register = Interop.downcallHandle(
            "gst_format_register",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_format_to_quark = Interop.downcallHandle(
            "gst_format_to_quark",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
    }
}
