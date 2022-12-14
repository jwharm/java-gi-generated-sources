package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link Converter} is implemented by objects that convert
 * binary data in various ways. The conversion can be
 * stateful and may fail at any place.
 * <p>
 * Some example conversions are: character set conversion,
 * compression, decompression and regular expression
 * replace.
 * @version 2.24
 */
public interface Converter extends io.github.jwharm.javagi.Proxy {
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ConverterImpl> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ConverterImpl(input);
    
    /**
     * This is the main operation used when converting data. It is to be called
     * multiple times in a loop, and each time it will do some work, i.e.
     * producing some output (in {@code outbuf}) or consuming some input (from {@code inbuf}) or
     * both. If its not possible to do any work an error is returned.
     * <p>
     * Note that a single call may not consume all input (or any input at all).
     * Also a call may produce output even if given no input, due to state stored
     * in the converter producing output.
     * <p>
     * If any data was either produced or consumed, and then an error happens, then
     * only the successful conversion is reported and the error is returned on the
     * next call.
     * <p>
     * A full conversion loop involves calling this method repeatedly, each time
     * giving it new input and space output space. When there is no more input
     * data after the data in {@code inbuf}, the flag {@link ConverterFlags#INPUT_AT_END} must be set.
     * The loop will be (unless some error happens) returning {@link ConverterResult#CONVERTED}
     * each time until all data is consumed and all output is produced, then
     * {@link ConverterResult#FINISHED} is returned instead. Note, that {@link ConverterResult#FINISHED}
     * may be returned even if {@link ConverterFlags#INPUT_AT_END} is not set, for instance
     * in a decompression converter where the end of data is detectable from the
     * data (and there might even be other data after the end of the compressed data).
     * <p>
     * When some data has successfully been converted {@code bytes_read} and is set to
     * the number of bytes read from {@code inbuf}, and {@code bytes_written} is set to indicate
     * how many bytes was written to {@code outbuf}. If there are more data to output
     * or consume (i.e. unless the {@link ConverterFlags#INPUT_AT_END} is specified) then
     * {@link ConverterResult#CONVERTED} is returned, and if no more data is to be output
     * then {@link ConverterResult#FINISHED} is returned.
     * <p>
     * On error {@link ConverterResult#ERROR} is returned and {@code error} is set accordingly.
     * Some errors need special handling:
     * <p>
     * {@link IOErrorEnum#NO_SPACE} is returned if there is not enough space
     * to write the resulting converted data, the application should
     * call the function again with a larger {@code outbuf} to continue.
     * <p>
     * {@link IOErrorEnum#PARTIAL_INPUT} is returned if there is not enough
     * input to fully determine what the conversion should produce,
     * and the {@link ConverterFlags#INPUT_AT_END} flag is not set. This happens for
     * example with an incomplete multibyte sequence when converting text,
     * or when a regexp matches up to the end of the input (and may match
     * further input). It may also happen when {@code inbuf_size} is zero and
     * there is no more data to produce.
     * <p>
     * When this happens the application should read more input and then
     * call the function again. If further input shows that there is no
     * more data call the function again with the same data but with
     * the {@link ConverterFlags#INPUT_AT_END} flag set. This may cause the conversion
     * to finish as e.g. in the regexp match case (or, to fail again with
     * {@link IOErrorEnum#PARTIAL_INPUT} in e.g. a charset conversion where the
     * input is actually partial).
     * <p>
     * After g_converter_convert() has returned {@link ConverterResult#FINISHED} the
     * converter object is in an invalid state where its not allowed
     * to call g_converter_convert() anymore. At this time you can only
     * free the object or call g_converter_reset() to reset it to the
     * initial state.
     * <p>
     * If the flag {@link ConverterFlags#FLUSH} is set then conversion is modified
     * to try to write out all internal state to the output. The application
     * has to call the function multiple times with the flag set, and when
     * the available input has been consumed and all internal state has
     * been produced then {@link ConverterResult#FLUSHED} (or {@link ConverterResult#FINISHED} if
     * really at the end) is returned instead of {@link ConverterResult#CONVERTED}.
     * This is somewhat similar to what happens at the end of the input stream,
     * but done in the middle of the data.
     * <p>
     * This has different meanings for different conversions. For instance
     * in a compression converter it would mean that we flush all the
     * compression state into output such that if you uncompress the
     * compressed data you get back all the input data. Doing this may
     * make the final file larger due to padding though. Another example
     * is a regexp conversion, where if you at the end of the flushed data
     * have a match, but there is also a potential longer match. In the
     * non-flushed case we would ask for more input, but when flushing we
     * treat this as the end of input and do the match.
     * <p>
     * Flushing is not always possible (like if a charset converter flushes
     * at a partial multibyte sequence). Converters are supposed to try
     * to produce as much output as possible and then return an error
     * (typically {@link IOErrorEnum#PARTIAL_INPUT}).
     * @param inbuf the buffer
     *         containing the data to convert.
     * @param inbufSize the number of bytes in {@code inbuf}
     * @param outbuf a buffer to write
     *    converted data in.
     * @param outbufSize the number of bytes in {@code outbuf}, must be at least one
     * @param flags a {@link ConverterFlags} controlling the conversion details
     * @param bytesRead will be set to the number of bytes read from {@code inbuf} on success
     * @param bytesWritten will be set to the number of bytes written to {@code outbuf} on success
     * @return a {@link ConverterResult}, {@link ConverterResult#ERROR} on error.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default org.gtk.gio.ConverterResult convert(byte[] inbuf, long inbufSize, byte[] outbuf, long outbufSize, org.gtk.gio.ConverterFlags flags, Out<Long> bytesRead, Out<Long> bytesWritten) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment bytesReadPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            MemorySegment bytesWrittenPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_converter_convert.invokeExact(
                        handle(),
                        Interop.allocateNativeArray(inbuf, false, SCOPE),
                        inbufSize,
                        Interop.allocateNativeArray(outbuf, false, SCOPE),
                        outbufSize,
                        flags.getValue(),
                        (Addressable) bytesReadPOINTER.address(),
                        (Addressable) bytesWrittenPOINTER.address(),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
                    bytesRead.set(bytesReadPOINTER.get(Interop.valueLayout.C_LONG, 0));
                    bytesWritten.set(bytesWrittenPOINTER.get(Interop.valueLayout.C_LONG, 0));
            return org.gtk.gio.ConverterResult.of(RESULT);
        }
    }
    
    /**
     * Resets all internal state in the converter, making it behave
     * as if it was just created. If the converter has any internal
     * state that would produce output then that output is lost.
     */
    default void reset() {
        try {
            DowncallHandles.g_converter_reset.invokeExact(handle());
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
            RESULT = (long) DowncallHandles.g_converter_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle g_converter_convert = Interop.downcallHandle(
                "g_converter_convert",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_converter_reset = Interop.downcallHandle(
                "g_converter_reset",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_converter_get_type = Interop.downcallHandle(
                "g_converter_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * The ConverterImpl type represents a native instance of the Converter interface.
     */
    class ConverterImpl extends org.gtk.gobject.GObject implements Converter {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        /**
         * Creates a new instance of Converter for the provided memory address.
         * @param address the memory address of the instance
         */
        public ConverterImpl(Addressable address) {
            super(address);
        }
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.g_converter_get_type != null;
    }
}
