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

    public Scanner(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle g_scanner_cur_line = Interop.downcallHandle(
        "g_scanner_cur_line",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the current line in the input stream (counting
     * from 1). This is the line of the last token parsed via
     * g_scanner_get_next_token().
     */
    public int curLine() {
        int RESULT;
        try {
            RESULT = (int) g_scanner_cur_line.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_scanner_cur_position = Interop.downcallHandle(
        "g_scanner_cur_position",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the current position in the current line (counting
     * from 0). This is the position of the last token parsed via
     * g_scanner_get_next_token().
     */
    public int curPosition() {
        int RESULT;
        try {
            RESULT = (int) g_scanner_cur_position.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_scanner_cur_token = Interop.downcallHandle(
        "g_scanner_cur_token",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the current token type. This is simply the {@code token}
     * field in the {@link Scanner} structure.
     */
    public @NotNull TokenType curToken() {
        int RESULT;
        try {
            RESULT = (int) g_scanner_cur_token.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new TokenType(RESULT);
    }
    
    private static final MethodHandle g_scanner_destroy = Interop.downcallHandle(
        "g_scanner_destroy",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees all memory used by the {@link Scanner}.
     */
    public @NotNull void destroy() {
        try {
            g_scanner_destroy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_scanner_eof = Interop.downcallHandle(
        "g_scanner_eof",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns {@code true} if the scanner has reached the end of
     * the file or text buffer.
     */
    public boolean eof() {
        int RESULT;
        try {
            RESULT = (int) g_scanner_eof.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_scanner_get_next_token = Interop.downcallHandle(
        "g_scanner_get_next_token",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Parses the next token just like g_scanner_peek_next_token()
     * and also removes it from the input stream. The token data is
     * placed in the {@code token}, {@code value}, {@code line}, and {@code position} fields of
     * the {@link Scanner} structure.
     */
    public @NotNull TokenType getNextToken() {
        int RESULT;
        try {
            RESULT = (int) g_scanner_get_next_token.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new TokenType(RESULT);
    }
    
    private static final MethodHandle g_scanner_input_file = Interop.downcallHandle(
        "g_scanner_input_file",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Prepares to scan a file.
     */
    public @NotNull void inputFile(@NotNull int inputFd) {
        try {
            g_scanner_input_file.invokeExact(handle(), inputFd);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_scanner_input_text = Interop.downcallHandle(
        "g_scanner_input_text",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Prepares to scan a text buffer.
     */
    public @NotNull void inputText(@NotNull java.lang.String text, @NotNull int textLen) {
        try {
            g_scanner_input_text.invokeExact(handle(), Interop.allocateNativeString(text), textLen);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_scanner_lookup_symbol = Interop.downcallHandle(
        "g_scanner_lookup_symbol",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Looks up a symbol in the current scope and return its value.
     * If the symbol is not bound in the current scope, {@code null} is
     * returned.
     */
    public @Nullable java.lang.foreign.MemoryAddress lookupSymbol(@NotNull java.lang.String symbol) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_scanner_lookup_symbol.invokeExact(handle(), Interop.allocateNativeString(symbol));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_scanner_peek_next_token = Interop.downcallHandle(
        "g_scanner_peek_next_token",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
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
     */
    public @NotNull TokenType peekNextToken() {
        int RESULT;
        try {
            RESULT = (int) g_scanner_peek_next_token.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new TokenType(RESULT);
    }
    
    private static final MethodHandle g_scanner_scope_add_symbol = Interop.downcallHandle(
        "g_scanner_scope_add_symbol",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a symbol to the given scope.
     */
    public @NotNull void scopeAddSymbol(@NotNull int scopeId, @NotNull java.lang.String symbol, @Nullable java.lang.foreign.MemoryAddress value) {
        try {
            g_scanner_scope_add_symbol.invokeExact(handle(), scopeId, Interop.allocateNativeString(symbol), value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_scanner_scope_foreach_symbol = Interop.downcallHandle(
        "g_scanner_scope_foreach_symbol",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Calls the given function for each of the symbol/value pairs
     * in the given scope of the {@link Scanner}. The function is passed
     * the symbol and value of each pair, and the given {@code user_data}
     * parameter.
     */
    public @NotNull void scopeForeachSymbol(@NotNull int scopeId, @NotNull HFunc func) {
        try {
            g_scanner_scope_foreach_symbol.invokeExact(handle(), scopeId, 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbHFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_scanner_scope_lookup_symbol = Interop.downcallHandle(
        "g_scanner_scope_lookup_symbol",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Looks up a symbol in a scope and return its value. If the
     * symbol is not bound in the scope, {@code null} is returned.
     */
    public @Nullable java.lang.foreign.MemoryAddress scopeLookupSymbol(@NotNull int scopeId, @NotNull java.lang.String symbol) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_scanner_scope_lookup_symbol.invokeExact(handle(), scopeId, Interop.allocateNativeString(symbol));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_scanner_scope_remove_symbol = Interop.downcallHandle(
        "g_scanner_scope_remove_symbol",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes a symbol from a scope.
     */
    public @NotNull void scopeRemoveSymbol(@NotNull int scopeId, @NotNull java.lang.String symbol) {
        try {
            g_scanner_scope_remove_symbol.invokeExact(handle(), scopeId, Interop.allocateNativeString(symbol));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_scanner_set_scope = Interop.downcallHandle(
        "g_scanner_set_scope",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the current scope.
     */
    public int setScope(@NotNull int scopeId) {
        int RESULT;
        try {
            RESULT = (int) g_scanner_set_scope.invokeExact(handle(), scopeId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_scanner_sync_file_offset = Interop.downcallHandle(
        "g_scanner_sync_file_offset",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Rewinds the filedescriptor to the current buffer position
     * and blows the file read ahead buffer. This is useful for
     * third party uses of the scanners filedescriptor, which hooks
     * onto the current scanning position.
     */
    public @NotNull void syncFileOffset() {
        try {
            g_scanner_sync_file_offset.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_scanner_unexp_token = Interop.downcallHandle(
        "g_scanner_unexp_token",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Outputs a message through the scanner's msg_handler,
     * resulting from an unexpected token in the input stream.
     * Note that you should not call g_scanner_peek_next_token()
     * followed by g_scanner_unexp_token() without an intermediate
     * call to g_scanner_get_next_token(), as g_scanner_unexp_token()
     * evaluates the scanner's current token (not the peeked token)
     * to construct part of the message.
     */
    public @NotNull void unexpToken(@NotNull TokenType expectedToken, @NotNull java.lang.String identifierSpec, @NotNull java.lang.String symbolSpec, @NotNull java.lang.String symbolName, @NotNull java.lang.String message, @NotNull int isError) {
        try {
            g_scanner_unexp_token.invokeExact(handle(), expectedToken.getValue(), Interop.allocateNativeString(identifierSpec), Interop.allocateNativeString(symbolSpec), Interop.allocateNativeString(symbolName), Interop.allocateNativeString(message), isError);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_scanner_new = Interop.downcallHandle(
        "g_scanner_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new {@link Scanner}.
     * <p>
     * The {@code config_templ} structure specifies the initial settings
     * of the scanner, which are copied into the {@link Scanner}
     * {@code config} field. If you pass {@code null} then the default settings
     * are used.
     */
    public static @NotNull Scanner new_(@NotNull ScannerConfig configTempl) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_scanner_new.invokeExact(configTempl.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Scanner(Refcounted.get(RESULT, false));
    }
    
}
