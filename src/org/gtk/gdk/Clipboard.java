package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The `GdkClipboard` object represents data shared between applications or
 * inside an application.
 * 
 * To get a `GdkClipboard` object, use [method@Gdk.Display.get_clipboard] or
 * [method@Gdk.Display.get_primary_clipboard]. You can find out about the data
 * that is currently available in a clipboard using
 * [method@Gdk.Clipboard.get_formats].
 * 
 * To make text or image data available in a clipboard, use
 * [method@Gdk.Clipboard.set_text] or [method@Gdk.Clipboard.set_texture].
 * For other data, you can use [method@Gdk.Clipboard.set_content], which
 * takes a [class@Gdk.ContentProvider] object.
 * 
 * To read textual or image data from a clipboard, use
 * [method@Gdk.Clipboard.read_text_async] or
 * [method@Gdk.Clipboard.read_texture_async]. For other data, use
 * [method@Gdk.Clipboard.read_async], which provides a `GInputStream` object.
 */
public class Clipboard extends org.gtk.gobject.Object {

    public Clipboard(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Clipboard */
    public static Clipboard castFrom(org.gtk.gobject.Object gobject) {
        return new Clipboard(gobject.getReference());
    }
    
    /**
     * Returns the `GdkContentProvider` currently set on @clipboard.
     * 
     * If the @clipboard is empty or its contents are not owned by the
     * current process, %NULL will be returned.
     */
    public ContentProvider getContent() {
        var RESULT = gtk_h.gdk_clipboard_get_content(handle());
        return new ContentProvider(References.get(RESULT, false));
    }
    
    /**
     * Gets the `GdkDisplay` that the clipboard was created for.
     */
    public Display getDisplay() {
        var RESULT = gtk_h.gdk_clipboard_get_display(handle());
        return new Display(References.get(RESULT, false));
    }
    
    /**
     * Gets the formats that the clipboard can provide its current contents in.
     */
    public ContentFormats getFormats() {
        var RESULT = gtk_h.gdk_clipboard_get_formats(handle());
        return new ContentFormats(References.get(RESULT, false));
    }
    
    /**
     * Returns if the clipboard is local.
     * 
     * A clipboard is considered local if it was last claimed
     * by the running application.
     * 
     * Note that [method@Gdk.Clipboard.get_content] may return %NULL
     * even on a local clipboard. In this case the clipboard is empty.
     */
    public boolean isLocal() {
        var RESULT = gtk_h.gdk_clipboard_is_local(handle());
        return (RESULT != 0);
    }
    
    /**
     * Finishes an asynchronous clipboard read.
     * 
     * See [method@Gdk.Clipboard.read_async].
     */
    public org.gtk.gio.InputStream readFinish(org.gtk.gio.AsyncResult result, java.lang.String[] outMimeType) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = gtk_h.gdk_clipboard_read_finish(handle(), result.handle(), Interop.allocateNativeArray(outMimeType).handle(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return new org.gtk.gio.InputStream(References.get(RESULT, true));
    }
    
    /**
     * Finishes an asynchronous clipboard read.
     * 
     * See [method@Gdk.Clipboard.read_text_async].
     */
    public java.lang.String readTextFinish(org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = gtk_h.gdk_clipboard_read_text_finish(handle(), result.handle(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Finishes an asynchronous clipboard read.
     * 
     * See [method@Gdk.Clipboard.read_texture_async].
     */
    public Texture readTextureFinish(org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = gtk_h.gdk_clipboard_read_texture_finish(handle(), result.handle(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return new Texture(References.get(RESULT, true));
    }
    
    /**
     * Finishes an asynchronous clipboard read.
     * 
     * See [method@Gdk.Clipboard.read_value_async].
     */
    public org.gtk.gobject.Value readValueFinish(org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = gtk_h.gdk_clipboard_read_value_finish(handle(), result.handle(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return new org.gtk.gobject.Value(References.get(RESULT, false));
    }
    
    /**
     * Sets a new content provider on @clipboard.
     * 
     * The clipboard will claim the `GdkDisplay`'s resources and advertise
     * these new contents to other applications.
     * 
     * In the rare case of a failure, this function will return %FALSE. The
     * clipboard will then continue reporting its old contents and ignore
     * @provider.
     * 
     * If the contents are read by either an external application or the
     * @clipboard's read functions, @clipboard will select the best format to
     * transfer the contents and then request that format from @provider.
     */
    public boolean setContent(ContentProvider provider) {
        var RESULT = gtk_h.gdk_clipboard_set_content(handle(), provider.handle());
        return (RESULT != 0);
    }
    
    /**
     * Puts the given @text into the clipboard.
     */
    public void setText(java.lang.String text) {
        gtk_h.gdk_clipboard_set_text(handle(), Interop.allocateNativeString(text).handle());
    }
    
    /**
     * Puts the given @texture into the clipboard.
     */
    public void setTexture(Texture texture) {
        gtk_h.gdk_clipboard_set_texture(handle(), texture.handle());
    }
    
    /**
     * Sets the clipboard to contain the value collected from the given @args.
     */
    public void setValist(Type type, VaList args) {
        gtk_h.gdk_clipboard_set_valist(handle(), type.getValue(), args);
    }
    
    /**
     * Sets the @clipboard to contain the given @value.
     */
    public void setValue(org.gtk.gobject.Value value) {
        gtk_h.gdk_clipboard_set_value(handle(), value.handle());
    }
    
    /**
     * Finishes an asynchronous clipboard store.
     * 
     * See [method@Gdk.Clipboard.store_async].
     */
    public boolean storeFinish(org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = gtk_h.gdk_clipboard_store_finish(handle(), result.handle(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    @FunctionalInterface
    public interface ChangedHandler {
        void signalReceived(Clipboard source);
    }
    
    /**
     * Emitted when the clipboard changes ownership.
     */
    public void onChanged(ChangedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalClipboardChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(this.handle(), Interop.allocateNativeString("changed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
