package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The data structure representing a lexical scanner.
 * <p>
 * You should set {@code input_name} after creating the scanner, since
 * it is used by the default message handler when displaying
 * warnings and errors. If you are scanning a file, the filename
 * would be a good choice.
 * <p>
 * The {@code user_data} and {@code max_parse_errors} fields are not used.
 * If you need to associate extra data with the scanner you
 * can place them here.
 * <p>
 * If you want to use your own message handler you can set the
 * {@code msg_handler} field. The type of the message handler function
 * is declared by {@link ScannerMsgFunc}.
 */
public class Scanner extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GScanner";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("user_data"),
        ValueLayout.JAVA_INT.withName("max_parse_errors"),
        ValueLayout.JAVA_INT.withName("parse_errors"),
        Interop.valueLayout.ADDRESS.withName("input_name"),
        Interop.valueLayout.ADDRESS.withName("qdata"),
        Interop.valueLayout.ADDRESS.withName("config"),
        Interop.valueLayout.C_INT.withName("token"),
        MemoryLayout.paddingLayout(32),
        org.gtk.glib.TokenValue.getMemoryLayout().withName("value"),
        ValueLayout.JAVA_INT.withName("line"),
        ValueLayout.JAVA_INT.withName("position"),
        Interop.valueLayout.C_INT.withName("next_token"),
        MemoryLayout.paddingLayout(32),
        org.gtk.glib.TokenValue.getMemoryLayout().withName("next_value"),
        ValueLayout.JAVA_INT.withName("next_line"),
        ValueLayout.JAVA_INT.withName("next_position"),
        Interop.valueLayout.ADDRESS.withName("symbol_table"),
        ValueLayout.JAVA_INT.withName("input_fd"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("text"),
        Interop.valueLayout.ADDRESS.withName("text_end"),
        Interop.valueLayout.ADDRESS.withName("buffer"),
        ValueLayout.JAVA_INT.withName("scope_id"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("msg_handler")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static Scanner allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Scanner newInstance = new Scanner(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code user_data}
     * @return The value of the field {@code user_data}
     */
    public java.lang.foreign.MemoryAddress user_data$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("user_data"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code user_data}
     * @param user_data The new value of the field {@code user_data}
     */
    public void user_data$set(java.lang.foreign.MemoryAddress user_data) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("user_data"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), user_data);
    }
    
    /**
     * Get the value of the field {@code max_parse_errors}
     * @return The value of the field {@code max_parse_errors}
     */
    public int max_parse_errors$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("max_parse_errors"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code max_parse_errors}
     * @param max_parse_errors The new value of the field {@code max_parse_errors}
     */
    public void max_parse_errors$set(int max_parse_errors) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("max_parse_errors"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), max_parse_errors);
    }
    
    /**
     * Get the value of the field {@code parse_errors}
     * @return The value of the field {@code parse_errors}
     */
    public int parse_errors$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parse_errors"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code parse_errors}
     * @param parse_errors The new value of the field {@code parse_errors}
     */
    public void parse_errors$set(int parse_errors) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parse_errors"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), parse_errors);
    }
    
    /**
     * Get the value of the field {@code input_name}
     * @return The value of the field {@code input_name}
     */
    public java.lang.String input_name$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("input_name"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code input_name}
     * @param input_name The new value of the field {@code input_name}
     */
    public void input_name$set(java.lang.String input_name) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("input_name"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(input_name));
    }
    
    /**
     * Get the value of the field {@code config}
     * @return The value of the field {@code config}
     */
    public org.gtk.glib.ScannerConfig config$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("config"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.glib.ScannerConfig(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code config}
     * @param config The new value of the field {@code config}
     */
    public void config$set(org.gtk.glib.ScannerConfig config) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("config"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), config.handle());
    }
    
    /**
     * Get the value of the field {@code token}
     * @return The value of the field {@code token}
     */
    public org.gtk.glib.TokenType token$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("token"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.glib.TokenType(RESULT);
    }
    
    /**
     * Change the value of the field {@code token}
     * @param token The new value of the field {@code token}
     */
    public void token$set(org.gtk.glib.TokenType token) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("token"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), token.getValue());
    }
    
    /**
     * Get the value of the field {@code value}
     * @return The value of the field {@code value}
     */
    public org.gtk.glib.TokenValue value$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.glib.TokenValue(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code value}
     * @param value The new value of the field {@code value}
     */
    public void value$set(org.gtk.glib.TokenValue value) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), value.handle());
    }
    
    /**
     * Get the value of the field {@code line}
     * @return The value of the field {@code line}
     */
    public int line$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("line"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code line}
     * @param line The new value of the field {@code line}
     */
    public void line$set(int line) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("line"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), line);
    }
    
    /**
     * Get the value of the field {@code position}
     * @return The value of the field {@code position}
     */
    public int position$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("position"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code position}
     * @param position The new value of the field {@code position}
     */
    public void position$set(int position) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("position"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), position);
    }
    
    /**
     * Get the value of the field {@code next_token}
     * @return The value of the field {@code next_token}
     */
    public org.gtk.glib.TokenType next_token$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("next_token"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.glib.TokenType(RESULT);
    }
    
    /**
     * Change the value of the field {@code next_token}
     * @param next_token The new value of the field {@code next_token}
     */
    public void next_token$set(org.gtk.glib.TokenType next_token) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("next_token"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), next_token.getValue());
    }
    
    /**
     * Get the value of the field {@code next_value}
     * @return The value of the field {@code next_value}
     */
    public org.gtk.glib.TokenValue next_value$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("next_value"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.glib.TokenValue(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code next_value}
     * @param next_value The new value of the field {@code next_value}
     */
    public void next_value$set(org.gtk.glib.TokenValue next_value) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("next_value"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), next_value.handle());
    }
    
    /**
     * Get the value of the field {@code next_line}
     * @return The value of the field {@code next_line}
     */
    public int next_line$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("next_line"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code next_line}
     * @param next_line The new value of the field {@code next_line}
     */
    public void next_line$set(int next_line) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("next_line"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), next_line);
    }
    
    /**
     * Get the value of the field {@code next_position}
     * @return The value of the field {@code next_position}
     */
    public int next_position$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("next_position"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code next_position}
     * @param next_position The new value of the field {@code next_position}
     */
    public void next_position$set(int next_position) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("next_position"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), next_position);
    }
    
    /**
     * Get the value of the field {@code msg_handler}
     * @return The value of the field {@code msg_handler}
     */
    public org.gtk.glib.ScannerMsgFunc msg_handler$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("msg_handler"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Create a Scanner proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Scanner(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Returns the current line in the input stream (counting
     * from 1). This is the line of the last token parsed via
     * g_scanner_get_next_token().
     * @return the current line
     */
    public int curLine() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_scanner_cur_line.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the current position in the current line (counting
     * from 0). This is the position of the last token parsed via
     * g_scanner_get_next_token().
     * @return the current position on the line
     */
    public int curPosition() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_scanner_cur_position.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the current token type. This is simply the {@code token}
     * field in the {@link Scanner} structure.
     * @return the current token type
     */
    public @NotNull org.gtk.glib.TokenType curToken() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_scanner_cur_token.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.TokenType(RESULT);
    }
    
    /**
     * Gets the current token value. This is simply the {@code value}
     * field in the {@link Scanner} structure.
     * @return the current token value
     */
    public @NotNull org.gtk.glib.TokenValue curValue() {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Frees all memory used by the {@link Scanner}.
     */
    public void destroy() {
        try {
            DowncallHandles.g_scanner_destroy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns {@code true} if the scanner has reached the end of
     * the file or text buffer.
     * @return {@code true} if the scanner has reached the end of
     *     the file or text buffer
     */
    public boolean eof() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_scanner_eof.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Outputs an error message, via the {@link Scanner} message handler.
     * @param format the message format. See the printf() documentation
     * @param varargs the parameters to insert into the format string
     */
    public void error(@NotNull java.lang.String format, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        try {
            DowncallHandles.g_scanner_error.invokeExact(
                    handle(),
                    Interop.allocateNativeString(format),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Parses the next token just like g_scanner_peek_next_token()
     * and also removes it from the input stream. The token data is
     * placed in the {@code token}, {@code value}, {@code line}, and {@code position} fields of
     * the {@link Scanner} structure.
     * @return the type of the token
     */
    public @NotNull org.gtk.glib.TokenType getNextToken() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_scanner_get_next_token.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.TokenType(RESULT);
    }
    
    /**
     * Prepares to scan a file.
     * @param inputFd a file descriptor
     */
    public void inputFile(int inputFd) {
        try {
            DowncallHandles.g_scanner_input_file.invokeExact(
                    handle(),
                    inputFd);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Prepares to scan a text buffer.
     * @param text the text buffer to scan
     * @param textLen the length of the text buffer
     */
    public void inputText(@NotNull java.lang.String text, int textLen) {
        java.util.Objects.requireNonNull(text, "Parameter 'text' must not be null");
        try {
            DowncallHandles.g_scanner_input_text.invokeExact(
                    handle(),
                    Interop.allocateNativeString(text),
                    textLen);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Looks up a symbol in the current scope and return its value.
     * If the symbol is not bound in the current scope, {@code null} is
     * returned.
     * @param symbol the symbol to look up
     * @return the value of {@code symbol} in the current scope, or {@code null}
     *     if {@code symbol} is not bound in the current scope
     */
    public @Nullable java.lang.foreign.MemoryAddress lookupSymbol(@NotNull java.lang.String symbol) {
        java.util.Objects.requireNonNull(symbol, "Parameter 'symbol' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_scanner_lookup_symbol.invokeExact(
                    handle(),
                    Interop.allocateNativeString(symbol));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Parses the next token, without removing it from the input stream.
     * The token data is placed in the {@code next_token}, {@code next_value}, {@code next_line},
     * and {@code next_position} fields of the {@link Scanner} structure.
     * <p>
     * Note that, while the token is not removed from the input stream
     * (i.e. the next call to g_scanner_get_next_token() will return the
     * same token), it will not be reevaluated. This can lead to surprising
     * results when changing scope or the scanner configuration after peeking
     * the next token. Getting the next token after switching the scope or
     * configuration will return whatever was peeked before, regardless of
     * any symbols that may have been added or removed in the new scope.
     * @return the type of the token
     */
    public @NotNull org.gtk.glib.TokenType peekNextToken() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_scanner_peek_next_token.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.TokenType(RESULT);
    }
    
    /**
     * Adds a symbol to the given scope.
     * @param scopeId the scope id
     * @param symbol the symbol to add
     * @param value the value of the symbol
     */
    public void scopeAddSymbol(int scopeId, @NotNull java.lang.String symbol, @Nullable java.lang.foreign.MemoryAddress value) {
        java.util.Objects.requireNonNull(symbol, "Parameter 'symbol' must not be null");
        try {
            DowncallHandles.g_scanner_scope_add_symbol.invokeExact(
                    handle(),
                    scopeId,
                    Interop.allocateNativeString(symbol),
                    (Addressable) (value == null ? MemoryAddress.NULL : value));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Calls the given function for each of the symbol/value pairs
     * in the given scope of the {@link Scanner}. The function is passed
     * the symbol and value of each pair, and the given {@code user_data}
     * parameter.
     * @param scopeId the scope id
     * @param func the function to call for each symbol/value pair
     */
    public void scopeForeachSymbol(int scopeId, @NotNull org.gtk.glib.HFunc func) {
        java.util.Objects.requireNonNull(func, "Parameter 'func' must not be null");
        try {
            DowncallHandles.g_scanner_scope_foreach_symbol.invokeExact(
                    handle(),
                    scopeId,
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.Callbacks.class, "cbHFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(func)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Looks up a symbol in a scope and return its value. If the
     * symbol is not bound in the scope, {@code null} is returned.
     * @param scopeId the scope id
     * @param symbol the symbol to look up
     * @return the value of {@code symbol} in the given scope, or {@code null}
     *     if {@code symbol} is not bound in the given scope.
     */
    public @Nullable java.lang.foreign.MemoryAddress scopeLookupSymbol(int scopeId, @NotNull java.lang.String symbol) {
        java.util.Objects.requireNonNull(symbol, "Parameter 'symbol' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_scanner_scope_lookup_symbol.invokeExact(
                    handle(),
                    scopeId,
                    Interop.allocateNativeString(symbol));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Removes a symbol from a scope.
     * @param scopeId the scope id
     * @param symbol the symbol to remove
     */
    public void scopeRemoveSymbol(int scopeId, @NotNull java.lang.String symbol) {
        java.util.Objects.requireNonNull(symbol, "Parameter 'symbol' must not be null");
        try {
            DowncallHandles.g_scanner_scope_remove_symbol.invokeExact(
                    handle(),
                    scopeId,
                    Interop.allocateNativeString(symbol));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the current scope.
     * @param scopeId the new scope id
     * @return the old scope id
     */
    public int setScope(int scopeId) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_scanner_set_scope.invokeExact(
                    handle(),
                    scopeId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Rewinds the filedescriptor to the current buffer position
     * and blows the file read ahead buffer. This is useful for
     * third party uses of the scanners filedescriptor, which hooks
     * onto the current scanning position.
     */
    public void syncFileOffset() {
        try {
            DowncallHandles.g_scanner_sync_file_offset.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Outputs a message through the scanner's msg_handler,
     * resulting from an unexpected token in the input stream.
     * Note that you should not call g_scanner_peek_next_token()
     * followed by g_scanner_unexp_token() without an intermediate
     * call to g_scanner_get_next_token(), as g_scanner_unexp_token()
     * evaluates the scanner's current token (not the peeked token)
     * to construct part of the message.
     * @param expectedToken the expected token
     * @param identifierSpec a string describing how the scanner's user
     *     refers to identifiers ({@code null} defaults to "identifier").
     *     This is used if {@code expected_token} is {@link TokenType#IDENTIFIER} or
     *     {@link TokenType#IDENTIFIER_NULL}.
     * @param symbolSpec a string describing how the scanner's user refers
     *     to symbols ({@code null} defaults to "symbol"). This is used if
     *     {@code expected_token} is {@link TokenType#SYMBOL} or any token value greater
     *     than {@code G_TOKEN_LAST}.
     * @param symbolName the name of the symbol, if the scanner's current
     *     token is a symbol.
     * @param message a message string to output at the end of the
     *     warning/error, or {@code null}.
     * @param isError if {@code true} it is output as an error. If {@code false} it is
     *     output as a warning.
     */
    public void unexpToken(@NotNull org.gtk.glib.TokenType expectedToken, @NotNull java.lang.String identifierSpec, @NotNull java.lang.String symbolSpec, @NotNull java.lang.String symbolName, @NotNull java.lang.String message, int isError) {
        java.util.Objects.requireNonNull(expectedToken, "Parameter 'expectedToken' must not be null");
        java.util.Objects.requireNonNull(identifierSpec, "Parameter 'identifierSpec' must not be null");
        java.util.Objects.requireNonNull(symbolSpec, "Parameter 'symbolSpec' must not be null");
        java.util.Objects.requireNonNull(symbolName, "Parameter 'symbolName' must not be null");
        java.util.Objects.requireNonNull(message, "Parameter 'message' must not be null");
        try {
            DowncallHandles.g_scanner_unexp_token.invokeExact(
                    handle(),
                    expectedToken.getValue(),
                    Interop.allocateNativeString(identifierSpec),
                    Interop.allocateNativeString(symbolSpec),
                    Interop.allocateNativeString(symbolName),
                    Interop.allocateNativeString(message),
                    isError);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Outputs a warning message, via the {@link Scanner} message handler.
     * @param format the message format. See the printf() documentation
     * @param varargs the parameters to insert into the format string
     */
    public void warn(@NotNull java.lang.String format, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        try {
            DowncallHandles.g_scanner_warn.invokeExact(
                    handle(),
                    Interop.allocateNativeString(format),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link Scanner}.
     * <p>
     * The {@code config_templ} structure specifies the initial settings
     * of the scanner, which are copied into the {@link Scanner}
     * {@code config} field. If you pass {@code null} then the default settings
     * are used.
     * @param configTempl the initial scanner settings
     * @return the new {@link Scanner}
     */
    public static @NotNull org.gtk.glib.Scanner new_(@NotNull org.gtk.glib.ScannerConfig configTempl) {
        java.util.Objects.requireNonNull(configTempl, "Parameter 'configTempl' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_scanner_new.invokeExact(
                    configTempl.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Scanner(RESULT, Ownership.UNKNOWN);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_scanner_cur_line = Interop.downcallHandle(
            "g_scanner_cur_line",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_scanner_cur_position = Interop.downcallHandle(
            "g_scanner_cur_position",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_scanner_cur_token = Interop.downcallHandle(
            "g_scanner_cur_token",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_scanner_cur_value = Interop.downcallHandle(
            "g_scanner_cur_value",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_scanner_destroy = Interop.downcallHandle(
            "g_scanner_destroy",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_scanner_eof = Interop.downcallHandle(
            "g_scanner_eof",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_scanner_error = Interop.downcallHandle(
            "g_scanner_error",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle g_scanner_get_next_token = Interop.downcallHandle(
            "g_scanner_get_next_token",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_scanner_input_file = Interop.downcallHandle(
            "g_scanner_input_file",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle g_scanner_input_text = Interop.downcallHandle(
            "g_scanner_input_text",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle g_scanner_lookup_symbol = Interop.downcallHandle(
            "g_scanner_lookup_symbol",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_scanner_peek_next_token = Interop.downcallHandle(
            "g_scanner_peek_next_token",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_scanner_scope_add_symbol = Interop.downcallHandle(
            "g_scanner_scope_add_symbol",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_scanner_scope_foreach_symbol = Interop.downcallHandle(
            "g_scanner_scope_foreach_symbol",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_scanner_scope_lookup_symbol = Interop.downcallHandle(
            "g_scanner_scope_lookup_symbol",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_scanner_scope_remove_symbol = Interop.downcallHandle(
            "g_scanner_scope_remove_symbol",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_scanner_set_scope = Interop.downcallHandle(
            "g_scanner_set_scope",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle g_scanner_sync_file_offset = Interop.downcallHandle(
            "g_scanner_sync_file_offset",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_scanner_unexp_token = Interop.downcallHandle(
            "g_scanner_unexp_token",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle g_scanner_warn = Interop.downcallHandle(
            "g_scanner_warn",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle g_scanner_new = Interop.downcallHandle(
            "g_scanner_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
    }
}
