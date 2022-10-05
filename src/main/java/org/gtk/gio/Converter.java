package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@link Converter} is implemented by objects that convert
 * binary data in various ways. The conversion can be
 * stateful and may fail at any place.
 * <p>
 * Some example conversions are: character set conversion,
 * compression, decompression and regular expression
 * replace.
 */
public interface Converter extends io.github.jwharm.javagi.Proxy {

    static final MethodHandle g_converter_convert = Interop.downcallHandle(
        "g_converter_convert",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public default ConverterResult convert(byte[] inbuf, long inbufSize, byte[] outbuf, long outbufSize, ConverterFlags flags, PointerLong bytesRead, PointerLong bytesWritten) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_converter_convert.invokeExact(handle(), Interop.allocateNativeArray(inbuf).handle(), inbufSize, Interop.allocateNativeArray(outbuf).handle(), outbufSize, flags.getValue(), bytesRead.handle(), bytesWritten.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new ConverterResult(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_converter_reset = Interop.downcallHandle(
        "g_converter_reset",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Resets all internal state in the converter, making it behave
     * as if it was just created. If the converter has any internal
     * state that would produce output then that output is lost.
     */
    public default void reset() {
        try {
            g_converter_reset.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    class ConverterImpl extends org.gtk.gobject.Object implements Converter {
        public ConverterImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
