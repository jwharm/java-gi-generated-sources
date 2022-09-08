package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The data structure representing a lexical scanner.
 * 
 * You should set @input_name after creating the scanner, since
 * it is used by the default message handler when displaying
 * warnings and errors. If you are scanning a file, the filename
 * would be a good choice.
 * 
 * The @user_data and @max_parse_errors fields are not used.
 * If you need to associate extra data with the scanner you
 * can place them here.
 * 
 * If you want to use your own message handler you can set the
 * @msg_handler field. The type of the message handler function
 * is declared by #GScannerMsgFunc.
 */
public class Scanner extends io.github.jwharm.javagi.interop.ResourceBase {

    public Scanner(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Returns the current line in the input stream (counting
     * from 1). This is the line of the last token parsed via
     * g_scanner_get_next_token().
     */
    public int curLine() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_scanner_cur_line(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns the current position in the current line (counting
     * from 0). This is the position of the last token parsed via
     * g_scanner_get_next_token().
     */
    public int curPosition() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_scanner_cur_position(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the current token type. This is simply the @token
     * field in the #GScanner structure.
     */
    public TokenType curToken() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_scanner_cur_token(HANDLE());
        return TokenType.fromValue(RESULT);
    }
    
    /**
     * Frees all memory used by the #GScanner.
     */
    public void destroy() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_scanner_destroy(HANDLE());
    }
    
    /**
     * Returns %TRUE if the scanner has reached the end of
     * the file or text buffer.
     */
    public boolean eof() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_scanner_eof(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Parses the next token just like g_scanner_peek_next_token()
     * and also removes it from the input stream. The token data is
     * placed in the @token, @value, @line, and @position fields of
     * the #GScanner structure.
     */
    public TokenType getNextToken() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_scanner_get_next_token(HANDLE());
        return TokenType.fromValue(RESULT);
    }
    
    /**
     * Prepares to scan a file.
     */
    public void inputFile(int inputFd) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_scanner_input_file(HANDLE(), inputFd);
    }
    
    /**
     * Prepares to scan a text buffer.
     */
    public void inputText(java.lang.String text, int textLen) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_scanner_input_text(HANDLE(), Interop.allocateNativeString(text).HANDLE(), textLen);
    }
    
    /**
     * Looks up a symbol in the current scope and return its value.
     * If the symbol is not bound in the current scope, %NULL is
     * returned.
     */
    public jdk.incubator.foreign.MemoryAddress lookupSymbol(java.lang.String symbol) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_scanner_lookup_symbol(HANDLE(), Interop.allocateNativeString(symbol).HANDLE());
        return RESULT;
    }
    
    /**
     * Parses the next token, without removing it from the input stream.
     * The token data is placed in the @next_token, @next_value, @next_line,
     * and @next_position fields of the #GScanner structure.
     * 
     * Note that, while the token is not removed from the input stream
     * (i.e. the next call to g_scanner_get_next_token() will return the
     * same token), it will not be reevaluated. This can lead to surprising
     * results when changing scope or the scanner configuration after peeking
     * the next token. Getting the next token after switching the scope or
     * configuration will return whatever was peeked before, regardless of
     * any symbols that may have been added or removed in the new scope.
     */
    public TokenType peekNextToken() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_scanner_peek_next_token(HANDLE());
        return TokenType.fromValue(RESULT);
    }
    
    /**
     * Adds a symbol to the given scope.
     */
    public void scopeAddSymbol(int scopeId, java.lang.String symbol, jdk.incubator.foreign.MemoryAddress value) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_scanner_scope_add_symbol(HANDLE(), scopeId, Interop.allocateNativeString(symbol).HANDLE(), value);
    }
    
    /**
     * Looks up a symbol in a scope and return its value. If the
     * symbol is not bound in the scope, %NULL is returned.
     */
    public jdk.incubator.foreign.MemoryAddress scopeLookupSymbol(int scopeId, java.lang.String symbol) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_scanner_scope_lookup_symbol(HANDLE(), scopeId, Interop.allocateNativeString(symbol).HANDLE());
        return RESULT;
    }
    
    /**
     * Removes a symbol from a scope.
     */
    public void scopeRemoveSymbol(int scopeId, java.lang.String symbol) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_scanner_scope_remove_symbol(HANDLE(), scopeId, Interop.allocateNativeString(symbol).HANDLE());
    }
    
    /**
     * Sets the current scope.
     */
    public int setScope(int scopeId) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_scanner_set_scope(HANDLE(), scopeId);
        return RESULT;
    }
    
    /**
     * Rewinds the filedescriptor to the current buffer position
     * and blows the file read ahead buffer. This is useful for
     * third party uses of the scanners filedescriptor, which hooks
     * onto the current scanning position.
     */
    public void syncFileOffset() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_scanner_sync_file_offset(HANDLE());
    }
    
    /**
     * Outputs a message through the scanner's msg_handler,
     * resulting from an unexpected token in the input stream.
     * Note that you should not call g_scanner_peek_next_token()
     * followed by g_scanner_unexp_token() without an intermediate
     * call to g_scanner_get_next_token(), as g_scanner_unexp_token()
     * evaluates the scanner's current token (not the peeked token)
     * to construct part of the message.
     */
    public void unexpToken(TokenType expectedToken, java.lang.String identifierSpec, java.lang.String symbolSpec, java.lang.String symbolName, java.lang.String message, int isError) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_scanner_unexp_token(HANDLE(), expectedToken.getValue(), Interop.allocateNativeString(identifierSpec).HANDLE(), Interop.allocateNativeString(symbolSpec).HANDLE(), Interop.allocateNativeString(symbolName).HANDLE(), Interop.allocateNativeString(message).HANDLE(), isError);
    }
    
}
