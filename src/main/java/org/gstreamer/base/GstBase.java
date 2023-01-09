package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Constants and functions that are declared in the global GstBase namespace.
 */
public final class GstBase {
    
    static {
        LibLoad.loadLibrary("gstbase-1.0");
        registerTypes();
    }
    
    @ApiStatus.Internal public static void javagi$ensureInitialized() {}
    
public static final int BASE_PARSE_FLAG_DRAINING = 2;
    
public static final int BASE_PARSE_FLAG_LOST_SYNC = 1;
    
/**
 * The name of the templates for the sink pad.
 */
public static final java.lang.String BASE_TRANSFORM_SINK_NAME = "sink";
    
/**
 * The name of the templates for the source pad.
 */
public static final java.lang.String BASE_TRANSFORM_SRC_NAME = "src";

/**
 * Create a new {@link BitReader} instance, which will read from {@code data}.
 * <p>
 * Free-function: gst_bit_reader_free
 * @param data Data from which the {@link BitReader}
 *   should read
 * @param size Size of {@code data} in bytes
 * @return a new {@link BitReader} instance
 */
public static org.gstreamer.base.BitReader bitReaderNew(byte[] data, int size) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_bit_reader_new.invokeExact(
                    Interop.allocateNativeArray(data, false, SCOPE),
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.base.BitReader.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
}

/**
 * Creates a new, empty {@link BitWriter} instance.
 * <p>
 * Free-function: gst_bit_writer_free
 * @return a new, empty {@link ByteWriter} instance
 */
public static org.gstreamer.base.BitWriter bitWriterNew() {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_bit_writer_new.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    var OBJECT = org.gstreamer.base.BitWriter.fromAddress.marshal(RESULT, null);
    OBJECT.takeOwnership();
    return OBJECT;
}

/**
 * Creates a new {@link BitWriter} instance with the given memory area. If
 * {@code initialized} is {@code true} it is possible to read {@code size} bits from the
 * {@link BitWriter} from the beginning.
 * <p>
 * Free-function: gst_bit_writer_free
 * @param data Memory area for writing
 * @param size Size of {@code data} in bytes
 * @param initialized if {@code true} the complete data can be read from the beginning
 * @return a new {@link BitWriter} instance
 */
public static org.gstreamer.base.BitWriter bitWriterNewWithData(byte[] data, int size, boolean initialized) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_bit_writer_new_with_data.invokeExact(
                    Interop.allocateNativeArray(data, false, SCOPE),
                    size,
                    Marshal.booleanToInteger.marshal(initialized, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.base.BitWriter.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
}

/**
 * Creates a {@link BitWriter} instance with the given initial data size.
 * <p>
 * Free-function: gst_bit_writer_free
 * @param size Initial size of data in bytes
 * @param fixed If {@code true} the data can't be reallocated
 * @return a new {@link BitWriter} instance
 */
public static org.gstreamer.base.BitWriter bitWriterNewWithSize(int size, boolean fixed) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_bit_writer_new_with_size.invokeExact(
                size,
                Marshal.booleanToInteger.marshal(fixed, null).intValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    var OBJECT = org.gstreamer.base.BitWriter.fromAddress.marshal(RESULT, null);
    OBJECT.takeOwnership();
    return OBJECT;
}

/**
 * Create a new {@link ByteReader} instance, which will read from {@code data}.
 * <p>
 * Free-function: gst_byte_reader_free
 * @param data data from which the
 *     {@link ByteReader} should read
 * @param size Size of {@code data} in bytes
 * @return a new {@link ByteReader} instance
 */
public static org.gstreamer.base.ByteReader byteReaderNew(byte[] data, int size) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_byte_reader_new.invokeExact(
                    Interop.allocateNativeArray(data, false, SCOPE),
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.base.ByteReader.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
}

/**
 * Creates a new, empty {@link ByteWriter} instance
 * <p>
 * Free-function: gst_byte_writer_free
 * @return a new, empty {@link ByteWriter} instance
 */
public static org.gstreamer.base.ByteWriter byteWriterNew() {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_byte_writer_new.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    var OBJECT = org.gstreamer.base.ByteWriter.fromAddress.marshal(RESULT, null);
    OBJECT.takeOwnership();
    return OBJECT;
}

/**
 * Creates a new {@link ByteWriter} instance with the given
 * memory area. If {@code initialized} is {@code true} it is possible to
 * read {@code size} bytes from the {@link ByteWriter} from the beginning.
 * <p>
 * Free-function: gst_byte_writer_free
 * @param data Memory area for writing
 * @param size Size of {@code data} in bytes
 * @param initialized If {@code true} the complete data can be read from the beginning
 * @return a new {@link ByteWriter} instance
 */
public static org.gstreamer.base.ByteWriter byteWriterNewWithData(PointerByte data, int size, boolean initialized) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_byte_writer_new_with_data.invokeExact(
                data.handle(),
                size,
                Marshal.booleanToInteger.marshal(initialized, null).intValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    var OBJECT = org.gstreamer.base.ByteWriter.fromAddress.marshal(RESULT, null);
    OBJECT.takeOwnership();
    return OBJECT;
}

/**
 * Creates a new {@link ByteWriter} instance with the given
 * initial data size.
 * <p>
 * Free-function: gst_byte_writer_free
 * @param size Initial size of data
 * @param fixed If {@code true} the data can't be reallocated
 * @return a new {@link ByteWriter} instance
 */
public static org.gstreamer.base.ByteWriter byteWriterNewWithSize(int size, boolean fixed) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_byte_writer_new_with_size.invokeExact(
                size,
                Marshal.booleanToInteger.marshal(fixed, null).intValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    var OBJECT = org.gstreamer.base.ByteWriter.fromAddress.marshal(RESULT, null);
    OBJECT.takeOwnership();
    return OBJECT;
}

/**
 * Allocates a new {@link QueueArray} object with an initial
 * queue size of {@code initial_size}.
 * @param initialSize Initial size of the new queue
 * @return a new {@link QueueArray} object
 */
public static org.gstreamer.base.QueueArray queueArrayNew(int initialSize) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_queue_array_new.invokeExact(initialSize);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.base.QueueArray.fromAddress.marshal(RESULT, null);
}

/**
 * Allocates a new {@link QueueArray} object for elements (e.g. structures)
 * of size {@code struct_size}, with an initial queue size of {@code initial_size}.
 * @param structSize Size of each element (e.g. structure) in the array
 * @param initialSize Initial size of the new queue
 * @return a new {@link QueueArray} object
 */
public static org.gstreamer.base.QueueArray queueArrayNewForStruct(long structSize, int initialSize) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_queue_array_new_for_struct.invokeExact(
                structSize,
                initialSize);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.base.QueueArray.fromAddress.marshal(RESULT, null);
}

/**
 * Tries to find what type of data is flowing from the given source {@link org.gstreamer.gst.Pad}.
 * <p>
 * Free-function: gst_caps_unref
 * @param src A source {@link org.gstreamer.gst.Pad}
 * @param size The length in bytes
 * @return the {@link org.gstreamer.gst.Caps} corresponding to the data
 *     stream.  Returns {@code null} if no {@link org.gstreamer.gst.Caps} matches the data stream.
 */
public static @Nullable org.gstreamer.gst.Caps typeFindHelper(org.gstreamer.gst.Pad src, long size) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_type_find_helper.invokeExact(
                src.handle(),
                size);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    var OBJECT = org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, null);
    OBJECT.takeOwnership();
    return OBJECT;
}

/**
 * Tries to find what type of data is contained in the given {@link org.gstreamer.gst.Buffer}, the
 * assumption being that the buffer represents the beginning of the stream or
 * file.
 * <p>
 * All available typefinders will be called on the data in order of rank. If
 * a typefinding function returns a probability of {@link org.gstreamer.gst.TypeFindProbability#MAXIMUM},
 * typefinding is stopped immediately and the found caps will be returned
 * right away. Otherwise, all available typefind functions will the tried,
 * and the caps with the highest probability will be returned, or {@code null} if
 * the content of the buffer could not be identified.
 * <p>
 * Free-function: gst_caps_unref
 * @param obj object doing the typefinding, or {@code null} (used for logging)
 * @param buf a {@link org.gstreamer.gst.Buffer} with data to typefind
 * @param prob location to store the probability of the found
 *     caps, or {@code null}
 * @return the {@link org.gstreamer.gst.Caps} corresponding to the data,
 *     or {@code null} if no type could be found. The caller should free the caps
 *     returned with gst_caps_unref().
 */
public static @Nullable org.gstreamer.gst.Caps typeFindHelperForBuffer(@Nullable org.gstreamer.gst.GstObject obj, org.gstreamer.gst.Buffer buf, @Nullable Out<org.gstreamer.gst.TypeFindProbability> prob) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment probPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_type_find_helper_for_buffer.invokeExact(
                    (Addressable) (obj == null ? MemoryAddress.NULL : obj.handle()),
                    buf.handle(),
                    (Addressable) (prob == null ? MemoryAddress.NULL : (Addressable) probPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                if (prob != null) prob.set(org.gstreamer.gst.TypeFindProbability.of(probPOINTER.get(Interop.valueLayout.C_INT, 0)));
        var OBJECT = org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
}

/**
 * Tries to find what type of data is contained in the given {@link org.gstreamer.gst.Buffer}, the
 * assumption being that the buffer represents the beginning of the stream or
 * file.
 * <p>
 * All available typefinders will be called on the data in order of rank. If
 * a typefinding function returns a probability of {@link org.gstreamer.gst.TypeFindProbability#MAXIMUM},
 * typefinding is stopped immediately and the found caps will be returned
 * right away. Otherwise, all available typefind functions will the tried,
 * and the caps with the highest probability will be returned, or {@code null} if
 * the content of the buffer could not be identified.
 * <p>
 * When {@code extension} is not {@code null}, this function will first try the typefind
 * functions for the given extension, which might speed up the typefinding
 * in many cases.
 * <p>
 * Free-function: gst_caps_unref
 * @param obj object doing the typefinding, or {@code null} (used for logging)
 * @param buf a {@link org.gstreamer.gst.Buffer} with data to typefind
 * @param extension extension of the media, or {@code null}
 * @param prob location to store the probability of the found
 *     caps, or {@code null}
 * @return the {@link org.gstreamer.gst.Caps} corresponding to the data,
 *     or {@code null} if no type could be found. The caller should free the caps
 *     returned with gst_caps_unref().
 */
public static @Nullable org.gstreamer.gst.Caps typeFindHelperForBufferWithExtension(@Nullable org.gstreamer.gst.GstObject obj, org.gstreamer.gst.Buffer buf, @Nullable java.lang.String extension, @Nullable Out<org.gstreamer.gst.TypeFindProbability> prob) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment probPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_type_find_helper_for_buffer_with_extension.invokeExact(
                    (Addressable) (obj == null ? MemoryAddress.NULL : obj.handle()),
                    buf.handle(),
                    (Addressable) (extension == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(extension, SCOPE)),
                    (Addressable) (prob == null ? MemoryAddress.NULL : (Addressable) probPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                if (prob != null) prob.set(org.gstreamer.gst.TypeFindProbability.of(probPOINTER.get(Interop.valueLayout.C_INT, 0)));
        var OBJECT = org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
}

/**
 * Tries to find what type of data is contained in the given {@code data}, the
 * assumption being that the data represents the beginning of the stream or
 * file.
 * <p>
 * All available typefinders will be called on the data in order of rank. If
 * a typefinding function returns a probability of {@link org.gstreamer.gst.TypeFindProbability#MAXIMUM},
 * typefinding is stopped immediately and the found caps will be returned
 * right away. Otherwise, all available typefind functions will the tried,
 * and the caps with the highest probability will be returned, or {@code null} if
 * the content of {@code data} could not be identified.
 * <p>
 * Free-function: gst_caps_unref
 * @param obj object doing the typefinding, or {@code null} (used for logging)
 * @param data * a pointer with data to typefind
 * @param size the size of {@code data}
 * @param prob location to store the probability of the found
 *     caps, or {@code null}
 * @return the {@link org.gstreamer.gst.Caps} corresponding to the data,
 *     or {@code null} if no type could be found. The caller should free the caps
 *     returned with gst_caps_unref().
 */
public static @Nullable org.gstreamer.gst.Caps typeFindHelperForData(@Nullable org.gstreamer.gst.GstObject obj, byte[] data, long size, @Nullable Out<org.gstreamer.gst.TypeFindProbability> prob) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment probPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_type_find_helper_for_data.invokeExact(
                    (Addressable) (obj == null ? MemoryAddress.NULL : obj.handle()),
                    Interop.allocateNativeArray(data, false, SCOPE),
                    size,
                    (Addressable) (prob == null ? MemoryAddress.NULL : (Addressable) probPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                if (prob != null) prob.set(org.gstreamer.gst.TypeFindProbability.of(probPOINTER.get(Interop.valueLayout.C_INT, 0)));
        var OBJECT = org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
}

/**
 * Tries to find what type of data is contained in the given {@code data}, the
 * assumption being that the data represents the beginning of the stream or
 * file.
 * <p>
 * All available typefinders will be called on the data in order of rank. If
 * a typefinding function returns a probability of {@link org.gstreamer.gst.TypeFindProbability#MAXIMUM},
 * typefinding is stopped immediately and the found caps will be returned
 * right away. Otherwise, all available typefind functions will the tried,
 * and the caps with the highest probability will be returned, or {@code null} if
 * the content of {@code data} could not be identified.
 * <p>
 * When {@code extension} is not {@code null}, this function will first try the typefind
 * functions for the given extension, which might speed up the typefinding
 * in many cases.
 * <p>
 * Free-function: gst_caps_unref
 * @param obj object doing the typefinding, or {@code null} (used for logging)
 * @param data * a pointer with data to typefind
 * @param size the size of {@code data}
 * @param extension extension of the media, or {@code null}
 * @param prob location to store the probability of the found
 *     caps, or {@code null}
 * @return the {@link org.gstreamer.gst.Caps} corresponding to the data,
 *     or {@code null} if no type could be found. The caller should free the caps
 *     returned with gst_caps_unref().
 */
public static @Nullable org.gstreamer.gst.Caps typeFindHelperForDataWithExtension(@Nullable org.gstreamer.gst.GstObject obj, byte[] data, long size, @Nullable java.lang.String extension, @Nullable Out<org.gstreamer.gst.TypeFindProbability> prob) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment probPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_type_find_helper_for_data_with_extension.invokeExact(
                    (Addressable) (obj == null ? MemoryAddress.NULL : obj.handle()),
                    Interop.allocateNativeArray(data, false, SCOPE),
                    size,
                    (Addressable) (extension == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(extension, SCOPE)),
                    (Addressable) (prob == null ? MemoryAddress.NULL : (Addressable) probPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                if (prob != null) prob.set(org.gstreamer.gst.TypeFindProbability.of(probPOINTER.get(Interop.valueLayout.C_INT, 0)));
        var OBJECT = org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
}

/**
 * Tries to find the best {@link org.gstreamer.gst.Caps} associated with {@code extension}.
 * <p>
 * All available typefinders will be checked against the extension in order
 * of rank. The caps of the first typefinder that can handle {@code extension} will be
 * returned.
 * <p>
 * Free-function: gst_caps_unref
 * @param obj object doing the typefinding, or {@code null} (used for logging)
 * @param extension an extension
 * @return the {@link org.gstreamer.gst.Caps} corresponding to
 *     {@code extension}, or {@code null} if no type could be found. The caller should free
 *     the caps returned with gst_caps_unref().
 */
public static @Nullable org.gstreamer.gst.Caps typeFindHelperForExtension(@Nullable org.gstreamer.gst.GstObject obj, java.lang.String extension) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_type_find_helper_for_extension.invokeExact(
                    (Addressable) (obj == null ? MemoryAddress.NULL : obj.handle()),
                    Marshal.stringToAddress.marshal(extension, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
}

/**
 * Utility function to do pull-based typefinding. Unlike gst_type_find_helper()
 * however, this function will use the specified function {@code func} to obtain the
 * data needed by the typefind functions, rather than operating on a given
 * source pad. This is useful mostly for elements like tag demuxers which
 * strip off data at the beginning and/or end of a file and want to typefind
 * the stripped data stream before adding their own source pad (the specified
 * callback can then call the upstream peer pad with offsets adjusted for the
 * tag size, for example).
 * <p>
 * When {@code extension} is not {@code null}, this function will first try the typefind
 * functions for the given extension, which might speed up the typefinding
 * in many cases.
 * <p>
 * Free-function: gst_caps_unref
 * @param obj A {@link org.gstreamer.gst.GstObject} that will be passed as first argument to {@code func}
 * @param parent the parent of {@code obj} or {@code null}
 * @param func A generic {@link TypeFindHelperGetRangeFunction} that will
 *        be used to access data at random offsets when doing the typefinding
 * @param size The length in bytes
 * @param extension extension of the media, or {@code null}
 * @param prob location to store the probability of the found
 *     caps, or {@code null}
 * @return the {@link org.gstreamer.gst.Caps} corresponding to the data
 *     stream.  Returns {@code null} if no {@link org.gstreamer.gst.Caps} matches the data stream.
 */
public static @Nullable org.gstreamer.gst.Caps typeFindHelperGetRange(org.gstreamer.gst.GstObject obj, @Nullable org.gstreamer.gst.GstObject parent, org.gstreamer.base.TypeFindHelperGetRangeFunction func, long size, @Nullable java.lang.String extension, @Nullable Out<org.gstreamer.gst.TypeFindProbability> prob) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment probPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_type_find_helper_get_range.invokeExact(
                    obj.handle(),
                    (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()),
                    (Addressable) func.toCallback(),
                    size,
                    (Addressable) (extension == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(extension, SCOPE)),
                    (Addressable) (prob == null ? MemoryAddress.NULL : (Addressable) probPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                if (prob != null) prob.set(org.gstreamer.gst.TypeFindProbability.of(probPOINTER.get(Interop.valueLayout.C_INT, 0)));
        var OBJECT = org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
}

/**
 * Utility function to do pull-based typefinding. Unlike gst_type_find_helper()
 * however, this function will use the specified function {@code func} to obtain the
 * data needed by the typefind functions, rather than operating on a given
 * source pad. This is useful mostly for elements like tag demuxers which
 * strip off data at the beginning and/or end of a file and want to typefind
 * the stripped data stream before adding their own source pad (the specified
 * callback can then call the upstream peer pad with offsets adjusted for the
 * tag size, for example).
 * <p>
 * When {@code extension} is not {@code null}, this function will first try the typefind
 * functions for the given extension, which might speed up the typefinding
 * in many cases.
 * @param obj A {@link org.gstreamer.gst.GstObject} that will be passed as first argument to {@code func}
 * @param parent the parent of {@code obj} or {@code null}
 * @param func A generic {@link TypeFindHelperGetRangeFunction} that will
 *        be used to access data at random offsets when doing the typefinding
 * @param size The length in bytes
 * @param extension extension of the media, or {@code null}
 * @param caps returned caps
 * @param prob location to store the probability of the found
 *     caps, or {@code null}
 * @return the last {@code GstFlowReturn} from pulling a buffer or {@link org.gstreamer.gst.FlowReturn#OK} if
 *          typefinding was successful.
 */
public static org.gstreamer.gst.FlowReturn typeFindHelperGetRangeFull(org.gstreamer.gst.GstObject obj, @Nullable org.gstreamer.gst.GstObject parent, org.gstreamer.base.TypeFindHelperGetRangeFunction func, long size, @Nullable java.lang.String extension, Out<org.gstreamer.gst.Caps> caps, @Nullable Out<org.gstreamer.gst.TypeFindProbability> prob) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment capsPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemorySegment probPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_type_find_helper_get_range_full.invokeExact(
                    obj.handle(),
                    (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()),
                    (Addressable) func.toCallback(),
                    size,
                    (Addressable) (extension == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(extension, SCOPE)),
                    (Addressable) capsPOINTER.address(),
                    (Addressable) (prob == null ? MemoryAddress.NULL : (Addressable) probPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                caps.set(org.gstreamer.gst.Caps.fromAddress.marshal(capsPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                if (prob != null) prob.set(org.gstreamer.gst.TypeFindProbability.of(probPOINTER.get(Interop.valueLayout.C_INT, 0)));
        return org.gstreamer.gst.FlowReturn.of(RESULT);
    }
}
    
    private static class DowncallHandles {

private static final MethodHandle gst_bit_reader_new = Interop.downcallHandle(
        "gst_bit_reader_new",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_bit_writer_new = Interop.downcallHandle(
        "gst_bit_writer_new",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_bit_writer_new_with_data = Interop.downcallHandle(
        "gst_bit_writer_new_with_data",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_bit_writer_new_with_size = Interop.downcallHandle(
        "gst_bit_writer_new_with_size",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_byte_reader_new = Interop.downcallHandle(
        "gst_byte_reader_new",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_byte_writer_new = Interop.downcallHandle(
        "gst_byte_writer_new",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_byte_writer_new_with_data = Interop.downcallHandle(
        "gst_byte_writer_new_with_data",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_byte_writer_new_with_size = Interop.downcallHandle(
        "gst_byte_writer_new_with_size",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_queue_array_new = Interop.downcallHandle(
        "gst_queue_array_new",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_queue_array_new_for_struct = Interop.downcallHandle(
        "gst_queue_array_new_for_struct",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_type_find_helper = Interop.downcallHandle(
        "gst_type_find_helper",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle gst_type_find_helper_for_buffer = Interop.downcallHandle(
        "gst_type_find_helper_for_buffer",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_type_find_helper_for_buffer_with_extension = Interop.downcallHandle(
        "gst_type_find_helper_for_buffer_with_extension",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_type_find_helper_for_data = Interop.downcallHandle(
        "gst_type_find_helper_for_data",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_type_find_helper_for_data_with_extension = Interop.downcallHandle(
        "gst_type_find_helper_for_data_with_extension",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_type_find_helper_for_extension = Interop.downcallHandle(
        "gst_type_find_helper_for_extension",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_type_find_helper_get_range = Interop.downcallHandle(
        "gst_type_find_helper_get_range",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_type_find_helper_get_range_full = Interop.downcallHandle(
        "gst_type_find_helper_get_range_full",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);
    }
    
    @ApiStatus.Internal
    public static class Callbacks {
    }
    
    private static void registerTypes() {
        if (Adapter.isAvailable()) Interop.register(Adapter.getType(), Adapter.fromAddress);
        if (Aggregator.isAvailable()) Interop.register(Aggregator.getType(), Aggregator.fromAddress);
        if (AggregatorPad.isAvailable()) Interop.register(AggregatorPad.getType(), AggregatorPad.fromAddress);
        if (BaseParse.isAvailable()) Interop.register(BaseParse.getType(), BaseParse.fromAddress);
        if (BaseSink.isAvailable()) Interop.register(BaseSink.getType(), BaseSink.fromAddress);
        if (BaseSrc.isAvailable()) Interop.register(BaseSrc.getType(), BaseSrc.fromAddress);
        if (BaseTransform.isAvailable()) Interop.register(BaseTransform.getType(), BaseTransform.fromAddress);
        if (CollectPads.isAvailable()) Interop.register(CollectPads.getType(), CollectPads.fromAddress);
        if (DataQueue.isAvailable()) Interop.register(DataQueue.getType(), DataQueue.fromAddress);
        if (PushSrc.isAvailable()) Interop.register(PushSrc.getType(), PushSrc.fromAddress);
    }
}
