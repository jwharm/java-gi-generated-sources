package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Standard predefined formats
 */
public enum Format implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * undefined format
     */
    UNDEFINED(0),
    
    /**
     * the default format of the pad/element. This can be
     *    samples for raw audio, frames/fields for raw video (some, but not all,
     *    elements support this; use {@code GST_FORMAT_TIME} if you don't have a good
     *    reason to query for samples/frames)
     */
    DEFAULT(1),
    
    /**
     * bytes
     */
    BYTES(2),
    
    /**
     * time in nanoseconds
     */
    TIME(3),
    
    /**
     * buffers (few, if any, elements implement this as of
     *     May 2009)
     */
    BUFFERS(4),
    
    /**
     * percentage of stream (few, if any, elements implement
     *     this as of May 2009)
     */
    PERCENT(5);
    
    private static final java.lang.String C_TYPE_NAME = "GstFormat";
    
    private final int value;
    
    /**
     * Create a new Format for the provided value
     * @param numeric value the enum value
     */
    Format(int value) {
        this.value = value;
    }
    
    /**
     * Get the numeric value of this enum
     * @return the enum value
     */
    @Override
    public int getValue() {
        return value;
    }
    
    /**
     * Create a new Format for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static Format of(int value) {
        return switch (value) {
            case 0 -> UNDEFINED;
            case 1 -> DEFAULT;
            case 2 -> BYTES;
            case 3 -> TIME;
            case 4 -> BUFFERS;
            case 5 -> PERCENT;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    /**
     * Return the format registered with the given nick.
     * @param nick The nick of the format
     * @return The format with {@code nick} or GST_FORMAT_UNDEFINED
     * if the format was not registered.
     */
    public static org.gstreamer.gst.Format getByNick(java.lang.String nick) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_format_get_by_nick.invokeExact(Marshal.stringToAddress.marshal(nick, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return org.gstreamer.gst.Format.of(RESULT);
        }
    }
    
    /**
     * Get details about the given format.
     * @param format The format to get details of
     * @return The {@link FormatDefinition} for {@code format} or {@code null}
     * on failure.
     * <p>
     * MT safe.
     */
    public static @Nullable org.gstreamer.gst.FormatDefinition getDetails(org.gstreamer.gst.Format format) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_format_get_details.invokeExact(format.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.FormatDefinition.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Get a printable name for the given format. Do not modify or free.
     * @param format a {@link Format}
     * @return a reference to the static name of the format
     * or {@code null} if the format is unknown.
     */
    public static @Nullable java.lang.String getName(org.gstreamer.gst.Format format) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_format_get_name.invokeExact(format.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Iterate all the registered formats. The format definition is read
     * only.
     * @return a GstIterator of {@link FormatDefinition}.
     */
    public static org.gstreamer.gst.Iterator iterateDefinitions() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_format_iterate_definitions.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Iterator.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
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
    public static org.gstreamer.gst.Format register(java.lang.String nick, java.lang.String description) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_format_register.invokeExact(
                        Marshal.stringToAddress.marshal(nick, SCOPE),
                        Marshal.stringToAddress.marshal(description, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return org.gstreamer.gst.Format.of(RESULT);
        }
    }
    
    /**
     * Get the unique quark for the given format.
     * @param format a {@link Format}
     * @return the quark associated with the format or 0 if the format
     * is unknown.
     */
    public static org.gtk.glib.Quark toQuark(org.gstreamer.gst.Format format) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_format_to_quark.invokeExact(format.getValue());
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
