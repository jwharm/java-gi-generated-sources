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
public class Scanner extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GScanner";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("user_data"),
            Interop.valueLayout.C_INT.withName("max_parse_errors"),
            Interop.valueLayout.C_INT.withName("parse_errors"),
            Interop.valueLayout.ADDRESS.withName("input_name"),
            Interop.valueLayout.ADDRESS.withName("qdata"),
            Interop.valueLayout.ADDRESS.withName("config"),
            Interop.valueLayout.C_INT.withName("token"),
            MemoryLayout.paddingLayout(32),
            org.gtk.glib.TokenValue.getMemoryLayout().withName("value"),
            Interop.valueLayout.C_INT.withName("line"),
            Interop.valueLayout.C_INT.withName("position"),
            Interop.valueLayout.C_INT.withName("next_token"),
            MemoryLayout.paddingLayout(32),
            org.gtk.glib.TokenValue.getMemoryLayout().withName("next_value"),
            Interop.valueLayout.C_INT.withName("next_line"),
            Interop.valueLayout.C_INT.withName("next_position"),
            Interop.valueLayout.ADDRESS.withName("symbol_table"),
            Interop.valueLayout.C_INT.withName("input_fd"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("text"),
            Interop.valueLayout.ADDRESS.withName("text_end"),
            Interop.valueLayout.ADDRESS.withName("buffer"),
            Interop.valueLayout.C_INT.withName("scope_id"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("msg_handler")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Scanner}
     * @return A new, uninitialized @{link Scanner}
     */
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
    public java.lang.foreign.MemoryAddress getUserData() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("user_data"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code user_data}
     * @param userData The new value of the field {@code user_data}
     */
    public void setUserData(java.lang.foreign.MemoryAddress userData) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("user_data"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (userData == null ? MemoryAddress.NULL : (Addressable) userData));
    }
    
    /**
     * Get the value of the field {@code max_parse_errors}
     * @return The value of the field {@code max_parse_errors}
     */
    public int getMaxParseErrors() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("max_parse_errors"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code max_parse_errors}
     * @param maxParseErrors The new value of the field {@code max_parse_errors}
     */
    public void setMaxParseErrors(int maxParseErrors) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("max_parse_errors"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), maxParseErrors);
    }
    
    /**
     * Get the value of the field {@code parse_errors}
     * @return The value of the field {@code parse_errors}
     */
    public int getParseErrors() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parse_errors"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code parse_errors}
     * @param parseErrors The new value of the field {@code parse_errors}
     */
    public void setParseErrors(int parseErrors) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parse_errors"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), parseErrors);
    }
    
    /**
     * Get the value of the field {@code input_name}
     * @return The value of the field {@code input_name}
     */
    public java.lang.String getInputName() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("input_name"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Change the value of the field {@code input_name}
     * @param inputName The new value of the field {@code input_name}
     */
    public void setInputName(java.lang.String inputName) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("input_name"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (inputName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(inputName, null)));
    }
    
    /**
     * Get the value of the field {@code config}
     * @return The value of the field {@code config}
     */
    public org.gtk.glib.ScannerConfig getConfig() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("config"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gtk.glib.ScannerConfig.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code config}
     * @param config The new value of the field {@code config}
     */
    public void setConfig(org.gtk.glib.ScannerConfig config) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("config"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (config == null ? MemoryAddress.NULL : config.handle()));
    }
    
    /**
     * Get the value of the field {@code token}
     * @return The value of the field {@code token}
     */
    public org.gtk.glib.TokenType getToken() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("token"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gtk.glib.TokenType.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code token}
     * @param token The new value of the field {@code token}
     */
    public void setToken(org.gtk.glib.TokenType token) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("token"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (token == null ? MemoryAddress.NULL : token.getValue()));
    }
    
    /**
     * Get the value of the field {@code value}
     * @return The value of the field {@code value}
     */
    public org.gtk.glib.TokenValue getValue() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gtk.glib.TokenValue.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code value}
     * @param value The new value of the field {@code value}
     */
    public void setValue(org.gtk.glib.TokenValue value) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (value == null ? MemoryAddress.NULL : value.handle()));
    }
    
    /**
     * Get the value of the field {@code line}
     * @return The value of the field {@code line}
     */
    public int getLine() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("line"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code line}
     * @param line The new value of the field {@code line}
     */
    public void setLine(int line) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("line"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), line);
    }
    
    /**
     * Get the value of the field {@code position}
     * @return The value of the field {@code position}
     */
    public int getPosition() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("position"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code position}
     * @param position The new value of the field {@code position}
     */
    public void setPosition(int position) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("position"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), position);
    }
    
    /**
     * Get the value of the field {@code next_token}
     * @return The value of the field {@code next_token}
     */
    public org.gtk.glib.TokenType getNextToken_() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("next_token"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gtk.glib.TokenType.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code next_token}
     * @param nextToken The new value of the field {@code next_token}
     */
    public void setNextToken(org.gtk.glib.TokenType nextToken) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("next_token"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (nextToken == null ? MemoryAddress.NULL : nextToken.getValue()));
    }
    
    /**
     * Get the value of the field {@code next_value}
     * @return The value of the field {@code next_value}
     */
    public org.gtk.glib.TokenValue getNextValue() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("next_value"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gtk.glib.TokenValue.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code next_value}
     * @param nextValue The new value of the field {@code next_value}
     */
    public void setNextValue(org.gtk.glib.TokenValue nextValue) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("next_value"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (nextValue == null ? MemoryAddress.NULL : nextValue.handle()));
    }
    
    /**
     * Get the value of the field {@code next_line}
     * @return The value of the field {@code next_line}
     */
    public int getNextLine() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("next_line"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code next_line}
     * @param nextLine The new value of the field {@code next_line}
     */
    public void setNextLine(int nextLine) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("next_line"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), nextLine);
    }
    
    /**
     * Get the value of the field {@code next_position}
     * @return The value of the field {@code next_position}
     */
    public int getNextPosition() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("next_position"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code next_position}
     * @param nextPosition The new value of the field {@code next_position}
     */
    public void setNextPosition(int nextPosition) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("next_position"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), nextPosition);
    }
    
    /**
     * Get the value of the field {@code msg_handler}
     * @return The value of the field {@code msg_handler}
     */
    public org.gtk.glib.ScannerMsgFunc getMsgHandler() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("msg_handler"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Change the value of the field {@code msg_handler}
     * @param msgHandler The new value of the field {@code msg_handler}
     */
    public void setMsgHandler(org.gtk.glib.ScannerMsgFunc msgHandler) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("msg_handler"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (msgHandler == null ? MemoryAddress.NULL : (Addressable) msgHandler.toCallback()));
    }
    
    /**
     * Create a Scanner proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected Scanner(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, Scanner> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new Scanner(input, ownership);
    
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
    public org.gtk.glib.TokenType curToken() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_scanner_cur_token.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.TokenType.of(RESULT);
    }
    
    /**
     * Gets the current token value. This is simply the {@code value}
     * field in the {@link Scanner} structure.
     * @return the current token value
     */
    public org.gtk.glib.TokenValue curValue() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_scanner_cur_value.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.TokenValue.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Outputs an error message, via the {@link Scanner} message handler.
     * @param format the message format. See the printf() documentation
     * @param varargs the parameters to insert into the format string
     */
    public void error(java.lang.String format, java.lang.Object... varargs) {
        try {
            DowncallHandles.g_scanner_error.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(format, null),
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
    public org.gtk.glib.TokenType getNextToken() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_scanner_get_next_token.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.TokenType.of(RESULT);
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
    public void inputText(java.lang.String text, int textLen) {
        try {
            DowncallHandles.g_scanner_input_text.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(text, null),
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
    public @Nullable java.lang.foreign.MemoryAddress lookupSymbol(java.lang.String symbol) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_scanner_lookup_symbol.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(symbol, null));
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
    public org.gtk.glib.TokenType peekNextToken() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_scanner_peek_next_token.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.TokenType.of(RESULT);
    }
    
    /**
     * Adds a symbol to the given scope.
     * @param scopeId the scope id
     * @param symbol the symbol to add
     * @param value the value of the symbol
     */
    public void scopeAddSymbol(int scopeId, java.lang.String symbol, @Nullable java.lang.foreign.MemoryAddress value) {
        try {
            DowncallHandles.g_scanner_scope_add_symbol.invokeExact(
                    handle(),
                    scopeId,
                    Marshal.stringToAddress.marshal(symbol, null),
                    (Addressable) (value == null ? MemoryAddress.NULL : (Addressable) value));
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
    public void scopeForeachSymbol(int scopeId, org.gtk.glib.HFunc func) {
        try {
            DowncallHandles.g_scanner_scope_foreach_symbol.invokeExact(
                    handle(),
                    scopeId,
                    (Addressable) func.toCallback(),
                    (Addressable) MemoryAddress.NULL);
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
    public @Nullable java.lang.foreign.MemoryAddress scopeLookupSymbol(int scopeId, java.lang.String symbol) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_scanner_scope_lookup_symbol.invokeExact(
                    handle(),
                    scopeId,
                    Marshal.stringToAddress.marshal(symbol, null));
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
    public void scopeRemoveSymbol(int scopeId, java.lang.String symbol) {
        try {
            DowncallHandles.g_scanner_scope_remove_symbol.invokeExact(
                    handle(),
                    scopeId,
                    Marshal.stringToAddress.marshal(symbol, null));
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
    public void unexpToken(org.gtk.glib.TokenType expectedToken, java.lang.String identifierSpec, java.lang.String symbolSpec, java.lang.String symbolName, java.lang.String message, int isError) {
        try {
            DowncallHandles.g_scanner_unexp_token.invokeExact(
                    handle(),
                    expectedToken.getValue(),
                    Marshal.stringToAddress.marshal(identifierSpec, null),
                    Marshal.stringToAddress.marshal(symbolSpec, null),
                    Marshal.stringToAddress.marshal(symbolName, null),
                    Marshal.stringToAddress.marshal(message, null),
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
    public void warn(java.lang.String format, java.lang.Object... varargs) {
        try {
            DowncallHandles.g_scanner_warn.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(format, null),
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
    public static org.gtk.glib.Scanner new_(org.gtk.glib.ScannerConfig configTempl) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_scanner_new.invokeExact(
                    configTempl.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Scanner.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_scanner_cur_line = Interop.downcallHandle(
            "g_scanner_cur_line",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_scanner_cur_position = Interop.downcallHandle(
            "g_scanner_cur_position",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_scanner_cur_token = Interop.downcallHandle(
            "g_scanner_cur_token",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_scanner_cur_value = Interop.downcallHandle(
            "g_scanner_cur_value",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_scanner_destroy = Interop.downcallHandle(
            "g_scanner_destroy",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_scanner_eof = Interop.downcallHandle(
            "g_scanner_eof",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_scanner_error = Interop.downcallHandle(
            "g_scanner_error",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle g_scanner_get_next_token = Interop.downcallHandle(
            "g_scanner_get_next_token",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_scanner_input_file = Interop.downcallHandle(
            "g_scanner_input_file",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_scanner_input_text = Interop.downcallHandle(
            "g_scanner_input_text",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_scanner_lookup_symbol = Interop.downcallHandle(
            "g_scanner_lookup_symbol",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_scanner_peek_next_token = Interop.downcallHandle(
            "g_scanner_peek_next_token",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_scanner_scope_add_symbol = Interop.downcallHandle(
            "g_scanner_scope_add_symbol",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_scanner_scope_foreach_symbol = Interop.downcallHandle(
            "g_scanner_scope_foreach_symbol",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_scanner_scope_lookup_symbol = Interop.downcallHandle(
            "g_scanner_scope_lookup_symbol",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_scanner_scope_remove_symbol = Interop.downcallHandle(
            "g_scanner_scope_remove_symbol",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_scanner_set_scope = Interop.downcallHandle(
            "g_scanner_set_scope",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_scanner_sync_file_offset = Interop.downcallHandle(
            "g_scanner_sync_file_offset",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_scanner_unexp_token = Interop.downcallHandle(
            "g_scanner_unexp_token",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_scanner_warn = Interop.downcallHandle(
            "g_scanner_warn",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle g_scanner_new = Interop.downcallHandle(
            "g_scanner_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    /**
     * A {@link Scanner.Builder} object constructs a {@link Scanner} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link Scanner.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final Scanner struct;
        
        private Builder() {
            struct = Scanner.allocate();
        }
        
         /**
         * Finish building the {@link Scanner} struct.
         * @return A new instance of {@code Scanner} with the fields 
         *         that were set in the Builder object.
         */
        public Scanner build() {
            return struct;
        }
        
        /**
         * unused
         * @param userData The value for the {@code userData} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setUserData(java.lang.foreign.MemoryAddress userData) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("user_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (userData == null ? MemoryAddress.NULL : (Addressable) userData));
            return this;
        }
        
        /**
         * unused
         * @param maxParseErrors The value for the {@code maxParseErrors} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMaxParseErrors(int maxParseErrors) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("max_parse_errors"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), maxParseErrors);
            return this;
        }
        
        /**
         * g_scanner_error() increments this field
         * @param parseErrors The value for the {@code parseErrors} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParseErrors(int parseErrors) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parse_errors"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), parseErrors);
            return this;
        }
        
        /**
         * name of input stream, featured by the default message handler
         * @param inputName The value for the {@code inputName} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setInputName(java.lang.String inputName) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("input_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (inputName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(inputName, null)));
            return this;
        }
        
        /**
         * quarked data
         * @param qdata The value for the {@code qdata} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setQdata(org.gtk.glib.Data qdata) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("qdata"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (qdata == null ? MemoryAddress.NULL : qdata.handle()));
            return this;
        }
        
        /**
         * link into the scanner configuration
         * @param config The value for the {@code config} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setConfig(org.gtk.glib.ScannerConfig config) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("config"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (config == null ? MemoryAddress.NULL : config.handle()));
            return this;
        }
        
        /**
         * token parsed by the last g_scanner_get_next_token()
         * @param token The value for the {@code token} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setToken(org.gtk.glib.TokenType token) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("token"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (token == null ? MemoryAddress.NULL : token.getValue()));
            return this;
        }
        
        /**
         * value of the last token from g_scanner_get_next_token()
         * @param value The value for the {@code value} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setValue(org.gtk.glib.TokenValue value) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("value"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (value == null ? MemoryAddress.NULL : value.handle()));
            return this;
        }
        
        /**
         * line number of the last token from g_scanner_get_next_token()
         * @param line The value for the {@code line} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLine(int line) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("line"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), line);
            return this;
        }
        
        /**
         * char number of the last token from g_scanner_get_next_token()
         * @param position The value for the {@code position} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPosition(int position) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("position"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), position);
            return this;
        }
        
        /**
         * token parsed by the last g_scanner_peek_next_token()
         * @param nextToken The value for the {@code nextToken} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNextToken(org.gtk.glib.TokenType nextToken) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("next_token"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (nextToken == null ? MemoryAddress.NULL : nextToken.getValue()));
            return this;
        }
        
        /**
         * value of the last token from g_scanner_peek_next_token()
         * @param nextValue The value for the {@code nextValue} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNextValue(org.gtk.glib.TokenValue nextValue) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("next_value"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (nextValue == null ? MemoryAddress.NULL : nextValue.handle()));
            return this;
        }
        
        /**
         * line number of the last token from g_scanner_peek_next_token()
         * @param nextLine The value for the {@code nextLine} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNextLine(int nextLine) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("next_line"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), nextLine);
            return this;
        }
        
        /**
         * char number of the last token from g_scanner_peek_next_token()
         * @param nextPosition The value for the {@code nextPosition} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNextPosition(int nextPosition) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("next_position"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), nextPosition);
            return this;
        }
        
        public Builder setSymbolTable(org.gtk.glib.HashTable symbolTable) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("symbol_table"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (symbolTable == null ? MemoryAddress.NULL : symbolTable.handle()));
            return this;
        }
        
        public Builder setInputFd(int inputFd) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("input_fd"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), inputFd);
            return this;
        }
        
        public Builder setText(java.lang.String text) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("text"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (text == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(text, null)));
            return this;
        }
        
        public Builder setTextEnd(java.lang.String textEnd) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("text_end"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (textEnd == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(textEnd, null)));
            return this;
        }
        
        public Builder setBuffer(java.lang.String buffer) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("buffer"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (buffer == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(buffer, null)));
            return this;
        }
        
        public Builder setScopeId(int scopeId) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("scope_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), scopeId);
            return this;
        }
        
        /**
         * handler function for _warn and _error
         * @param msgHandler The value for the {@code msgHandler} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMsgHandler(org.gtk.glib.ScannerMsgFunc msgHandler) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("msg_handler"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (msgHandler == null ? MemoryAddress.NULL : (Addressable) msgHandler.toCallback()));
            return this;
        }
    }
}
