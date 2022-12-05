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
        System.loadLibrary("gstbase-1.0");
    }
    
    @ApiStatus.Internal static void javagi$ensureInitialized() {}
    
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
    public static @NotNull org.gstreamer.base.BitReader bitReaderNew(@NotNull byte[] data, int size) {
        java.util.Objects.requireNonNull(data, "Parameter 'data' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_bit_reader_new.invokeExact(
                    Interop.allocateNativeArray(data, false),
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.base.BitReader(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a new, empty {@link BitWriter} instance.
     * <p>
     * Free-function: gst_bit_writer_free
     * @return a new, empty {@link ByteWriter} instance
     */
    public static @NotNull org.gstreamer.base.BitWriter bitWriterNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_bit_writer_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.base.BitWriter(RESULT, Ownership.FULL);
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
    public static @NotNull org.gstreamer.base.BitWriter bitWriterNewWithData(@NotNull byte[] data, int size, boolean initialized) {
        java.util.Objects.requireNonNull(data, "Parameter 'data' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_bit_writer_new_with_data.invokeExact(
                    Interop.allocateNativeArray(data, false),
                    size,
                    initialized ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.base.BitWriter(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a {@link BitWriter} instance with the given initial data size.
     * <p>
     * Free-function: gst_bit_writer_free
     * @param size Initial size of data in bytes
     * @param fixed If {@code true} the data can't be reallocated
     * @return a new {@link BitWriter} instance
     */
    public static @NotNull org.gstreamer.base.BitWriter bitWriterNewWithSize(int size, boolean fixed) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_bit_writer_new_with_size.invokeExact(
                    size,
                    fixed ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.base.BitWriter(RESULT, Ownership.FULL);
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
    public static @NotNull org.gstreamer.base.ByteReader byteReaderNew(@NotNull byte[] data, int size) {
        java.util.Objects.requireNonNull(data, "Parameter 'data' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_byte_reader_new.invokeExact(
                    Interop.allocateNativeArray(data, false),
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.base.ByteReader(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a new, empty {@link ByteWriter} instance
     * <p>
     * Free-function: gst_byte_writer_free
     * @return a new, empty {@link ByteWriter} instance
     */
    public static @NotNull org.gstreamer.base.ByteWriter byteWriterNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_byte_writer_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.base.ByteWriter(RESULT, Ownership.FULL);
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
    public static @NotNull org.gstreamer.base.ByteWriter byteWriterNewWithData(PointerByte data, int size, boolean initialized) {
        java.util.Objects.requireNonNull(data, "Parameter 'data' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_byte_writer_new_with_data.invokeExact(
                    data.handle(),
                    size,
                    initialized ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.base.ByteWriter(RESULT, Ownership.FULL);
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
    public static @NotNull org.gstreamer.base.ByteWriter byteWriterNewWithSize(int size, boolean fixed) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_byte_writer_new_with_size.invokeExact(
                    size,
                    fixed ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.base.ByteWriter(RESULT, Ownership.FULL);
    }
    
    /**
     * Allocates a new {@link QueueArray} object with an initial
     * queue size of {@code initial_size}.
     * @param initialSize Initial size of the new queue
     * @return a new {@link QueueArray} object
     */
    public static @NotNull org.gstreamer.base.QueueArray queueArrayNew(int initialSize) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_queue_array_new.invokeExact(
                    initialSize);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.base.QueueArray(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Allocates a new {@link QueueArray} object for elements (e.g. structures)
     * of size {@code struct_size}, with an initial queue size of {@code initial_size}.
     * @param structSize Size of each element (e.g. structure) in the array
     * @param initialSize Initial size of the new queue
     * @return a new {@link QueueArray} object
     */
    public static @NotNull org.gstreamer.base.QueueArray queueArrayNewForStruct(long structSize, int initialSize) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_queue_array_new_for_struct.invokeExact(
                    structSize,
                    initialSize);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.base.QueueArray(RESULT, Ownership.UNKNOWN);
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
    public static @Nullable org.gstreamer.gst.Caps typeFindHelper(@NotNull org.gstreamer.gst.Pad src, long size) {
        java.util.Objects.requireNonNull(src, "Parameter 'src' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_type_find_helper.invokeExact(
                    src.handle(),
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Caps(RESULT, Ownership.FULL);
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
    public static @Nullable org.gstreamer.gst.Caps typeFindHelperForBuffer(@Nullable org.gstreamer.gst.Object obj, @NotNull org.gstreamer.gst.Buffer buf, @NotNull Out<org.gstreamer.gst.TypeFindProbability> prob) {
        java.util.Objects.requireNonNull(buf, "Parameter 'buf' must not be null");
        java.util.Objects.requireNonNull(prob, "Parameter 'prob' must not be null");
        MemorySegment probPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_type_find_helper_for_buffer.invokeExact(
                    (Addressable) (obj == null ? MemoryAddress.NULL : obj.handle()),
                    buf.handle(),
                    (Addressable) probPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        prob.set(org.gstreamer.gst.TypeFindProbability.of(probPOINTER.get(Interop.valueLayout.C_INT, 0)));
        return new org.gstreamer.gst.Caps(RESULT, Ownership.FULL);
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
    public static @Nullable org.gstreamer.gst.Caps typeFindHelperForBufferWithExtension(@Nullable org.gstreamer.gst.Object obj, @NotNull org.gstreamer.gst.Buffer buf, @Nullable java.lang.String extension, @NotNull Out<org.gstreamer.gst.TypeFindProbability> prob) {
        java.util.Objects.requireNonNull(buf, "Parameter 'buf' must not be null");
        java.util.Objects.requireNonNull(prob, "Parameter 'prob' must not be null");
        MemorySegment probPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_type_find_helper_for_buffer_with_extension.invokeExact(
                    (Addressable) (obj == null ? MemoryAddress.NULL : obj.handle()),
                    buf.handle(),
                    (Addressable) (extension == null ? MemoryAddress.NULL : Interop.allocateNativeString(extension)),
                    (Addressable) probPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        prob.set(org.gstreamer.gst.TypeFindProbability.of(probPOINTER.get(Interop.valueLayout.C_INT, 0)));
        return new org.gstreamer.gst.Caps(RESULT, Ownership.FULL);
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
    public static @Nullable org.gstreamer.gst.Caps typeFindHelperForData(@Nullable org.gstreamer.gst.Object obj, @NotNull byte[] data, long size, @NotNull Out<org.gstreamer.gst.TypeFindProbability> prob) {
        java.util.Objects.requireNonNull(data, "Parameter 'data' must not be null");
        java.util.Objects.requireNonNull(prob, "Parameter 'prob' must not be null");
        MemorySegment probPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_type_find_helper_for_data.invokeExact(
                    (Addressable) (obj == null ? MemoryAddress.NULL : obj.handle()),
                    Interop.allocateNativeArray(data, false),
                    size,
                    (Addressable) probPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        prob.set(org.gstreamer.gst.TypeFindProbability.of(probPOINTER.get(Interop.valueLayout.C_INT, 0)));
        return new org.gstreamer.gst.Caps(RESULT, Ownership.FULL);
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
    public static @Nullable org.gstreamer.gst.Caps typeFindHelperForDataWithExtension(@Nullable org.gstreamer.gst.Object obj, @NotNull byte[] data, long size, @Nullable java.lang.String extension, @NotNull Out<org.gstreamer.gst.TypeFindProbability> prob) {
        java.util.Objects.requireNonNull(data, "Parameter 'data' must not be null");
        java.util.Objects.requireNonNull(prob, "Parameter 'prob' must not be null");
        MemorySegment probPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_type_find_helper_for_data_with_extension.invokeExact(
                    (Addressable) (obj == null ? MemoryAddress.NULL : obj.handle()),
                    Interop.allocateNativeArray(data, false),
                    size,
                    (Addressable) (extension == null ? MemoryAddress.NULL : Interop.allocateNativeString(extension)),
                    (Addressable) probPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        prob.set(org.gstreamer.gst.TypeFindProbability.of(probPOINTER.get(Interop.valueLayout.C_INT, 0)));
        return new org.gstreamer.gst.Caps(RESULT, Ownership.FULL);
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
    public static @Nullable org.gstreamer.gst.Caps typeFindHelperForExtension(@Nullable org.gstreamer.gst.Object obj, @NotNull java.lang.String extension) {
        java.util.Objects.requireNonNull(extension, "Parameter 'extension' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_type_find_helper_for_extension.invokeExact(
                    (Addressable) (obj == null ? MemoryAddress.NULL : obj.handle()),
                    Interop.allocateNativeString(extension));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Caps(RESULT, Ownership.FULL);
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
     * @param obj A {@link org.gstreamer.gst.Object} that will be passed as first argument to {@code func}
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
    public static @Nullable org.gstreamer.gst.Caps typeFindHelperGetRange(@NotNull org.gstreamer.gst.Object obj, @Nullable org.gstreamer.gst.Object parent, @NotNull org.gstreamer.base.TypeFindHelperGetRangeFunction func, long size, @Nullable java.lang.String extension, @NotNull Out<org.gstreamer.gst.TypeFindProbability> prob) {
        throw new UnsupportedOperationException("Operation not supported yet");
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
     * @param obj A {@link org.gstreamer.gst.Object} that will be passed as first argument to {@code func}
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
    public static @NotNull org.gstreamer.gst.FlowReturn typeFindHelperGetRangeFull(@NotNull org.gstreamer.gst.Object obj, @Nullable org.gstreamer.gst.Object parent, @NotNull org.gstreamer.base.TypeFindHelperGetRangeFunction func, long size, @Nullable java.lang.String extension, @NotNull Out<org.gstreamer.gst.Caps> caps, @NotNull Out<org.gstreamer.gst.TypeFindProbability> prob) {
        throw new UnsupportedOperationException("Operation not supported yet");
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
        
        public static int cbCollectPadsQueryFunction(MemoryAddress pads, MemoryAddress pad, MemoryAddress query, MemoryAddress userData) {
            int HASH = userData.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (CollectPadsQueryFunction) Interop.signalRegistry.get(HASH);
            var RESULT = HANDLER.onCollectPadsQueryFunction(new org.gstreamer.base.CollectPads(pads, Ownership.NONE), new org.gstreamer.base.CollectData(pad, Ownership.NONE), new org.gstreamer.gst.Query(query, Ownership.NONE));
            return RESULT ? 1 : 0;
        }
        
        public static void cbCollectPadsFlushFunction(MemoryAddress pads, MemoryAddress userData) {
            int HASH = userData.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (CollectPadsFlushFunction) Interop.signalRegistry.get(HASH);
            HANDLER.onCollectPadsFlushFunction(new org.gstreamer.base.CollectPads(pads, Ownership.NONE));
        }
        
        public static int cbCollectPadsClipFunction(MemoryAddress pads, MemoryAddress data, MemoryAddress inbuffer, MemoryAddress outbuffer, MemoryAddress userData) {
            int HASH = userData.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (CollectPadsClipFunction) Interop.signalRegistry.get(HASH);
        var outbufferOUT = new Out<PointerProxy<org.gstreamer.gst.Buffer>>(new PointerProxy<org.gstreamer.gst.Buffer>(outbuffer, org.gstreamer.gst.Buffer.class));
            var RESULT = HANDLER.onCollectPadsClipFunction(new org.gstreamer.base.CollectPads(pads, Ownership.NONE), new org.gstreamer.base.CollectData(data, Ownership.NONE), new org.gstreamer.gst.Buffer(inbuffer, Ownership.FULL), outbufferOUT);
            outbuffer.set(Interop.valueLayout.ADDRESS, 0, outbufferOUT.get().handle());
            return RESULT.getValue();
        }
        
        public static int cbCollectPadsBufferFunction(MemoryAddress pads, MemoryAddress data, MemoryAddress buffer, MemoryAddress userData) {
            int HASH = userData.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (CollectPadsBufferFunction) Interop.signalRegistry.get(HASH);
            var RESULT = HANDLER.onCollectPadsBufferFunction(new org.gstreamer.base.CollectPads(pads, Ownership.NONE), new org.gstreamer.base.CollectData(data, Ownership.NONE), new org.gstreamer.gst.Buffer(buffer, Ownership.FULL));
            return RESULT.getValue();
        }
        
        public static int cbCollectPadsCompareFunction(MemoryAddress pads, MemoryAddress data1, long timestamp1, MemoryAddress data2, long timestamp2, MemoryAddress userData) {
            int HASH = userData.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (CollectPadsCompareFunction) Interop.signalRegistry.get(HASH);
            var RESULT = HANDLER.onCollectPadsCompareFunction(new org.gstreamer.base.CollectPads(pads, Ownership.NONE), new org.gstreamer.base.CollectData(data1, Ownership.NONE), new org.gstreamer.gst.ClockTime(timestamp1), new org.gstreamer.base.CollectData(data2, Ownership.NONE), new org.gstreamer.gst.ClockTime(timestamp2));
            return RESULT;
        }
        
        public static void cbDataQueueEmptyCallback(MemoryAddress queue, MemoryAddress checkdata) {
            int HASH = checkdata.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (DataQueueEmptyCallback) Interop.signalRegistry.get(HASH);
            HANDLER.onDataQueueEmptyCallback(new org.gstreamer.base.DataQueue(queue, Ownership.NONE));
        }
        
        public static int cbCollectPadsEventFunction(MemoryAddress pads, MemoryAddress pad, MemoryAddress event, MemoryAddress userData) {
            int HASH = userData.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (CollectPadsEventFunction) Interop.signalRegistry.get(HASH);
            var RESULT = HANDLER.onCollectPadsEventFunction(new org.gstreamer.base.CollectPads(pads, Ownership.NONE), new org.gstreamer.base.CollectData(pad, Ownership.NONE), new org.gstreamer.gst.Event(event, Ownership.NONE));
            return RESULT ? 1 : 0;
        }
        
        public static int cbCollectPadsFunction(MemoryAddress pads, MemoryAddress userData) {
            int HASH = userData.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (CollectPadsFunction) Interop.signalRegistry.get(HASH);
            var RESULT = HANDLER.onCollectPadsFunction(new org.gstreamer.base.CollectPads(pads, Ownership.NONE));
            return RESULT.getValue();
        }
        
        public static void cbDataQueueFullCallback(MemoryAddress queue, MemoryAddress checkdata) {
            int HASH = checkdata.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (DataQueueFullCallback) Interop.signalRegistry.get(HASH);
            HANDLER.onDataQueueFullCallback(new org.gstreamer.base.DataQueue(queue, Ownership.NONE));
        }
        
        public static int cbDataQueueCheckFullFunction(MemoryAddress queue, int visible, int bytes, long time, MemoryAddress checkdata) {
            int HASH = checkdata.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (DataQueueCheckFullFunction) Interop.signalRegistry.get(HASH);
            var RESULT = HANDLER.onDataQueueCheckFullFunction(new org.gstreamer.base.DataQueue(queue, Ownership.NONE), visible, bytes, time);
            return RESULT ? 1 : 0;
        }
    }
}
