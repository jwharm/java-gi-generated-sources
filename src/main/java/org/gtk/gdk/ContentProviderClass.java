package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Class structure for {@code GdkContentProvider}.
 */
public class ContentProviderClass extends Struct {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkContentProviderClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("content_changed"),
            Interop.valueLayout.ADDRESS.withName("attach_clipboard"),
            Interop.valueLayout.ADDRESS.withName("detach_clipboard"),
            Interop.valueLayout.ADDRESS.withName("ref_formats"),
            Interop.valueLayout.ADDRESS.withName("ref_storable_formats"),
            Interop.valueLayout.ADDRESS.withName("write_mime_type_async"),
            Interop.valueLayout.ADDRESS.withName("write_mime_type_finish"),
            Interop.valueLayout.ADDRESS.withName("get_value"),
            MemoryLayout.sequenceLayout(8, Interop.valueLayout.ADDRESS).withName("padding")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link ContentProviderClass}
     * @return A new, uninitialized @{link ContentProviderClass}
     */
    public static ContentProviderClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ContentProviderClass newInstance = new ContentProviderClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gobject.ObjectClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gtk.gobject.ObjectClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gtk.gobject.ObjectClass parentClass) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
    }
    
    @FunctionalInterface
    public interface ContentChangedCallback {
        void run(org.gtk.gdk.ContentProvider provider);

        @ApiStatus.Internal default void upcall(MemoryAddress provider) {
            run((org.gtk.gdk.ContentProvider) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(provider)), org.gtk.gdk.ContentProvider.fromAddress).marshal(provider, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ContentChangedCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code content_changed}
     * @param contentChanged The new value of the field {@code content_changed}
     */
    public void setContentChanged(ContentChangedCallback contentChanged) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("content_changed"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (contentChanged == null ? MemoryAddress.NULL : contentChanged.toCallback()));
    }
    
    @FunctionalInterface
    public interface AttachClipboardCallback {
        void run(org.gtk.gdk.ContentProvider provider, org.gtk.gdk.Clipboard clipboard);

        @ApiStatus.Internal default void upcall(MemoryAddress provider, MemoryAddress clipboard) {
            run((org.gtk.gdk.ContentProvider) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(provider)), org.gtk.gdk.ContentProvider.fromAddress).marshal(provider, Ownership.NONE), (org.gtk.gdk.Clipboard) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(clipboard)), org.gtk.gdk.Clipboard.fromAddress).marshal(clipboard, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(AttachClipboardCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code attach_clipboard}
     * @param attachClipboard The new value of the field {@code attach_clipboard}
     */
    public void setAttachClipboard(AttachClipboardCallback attachClipboard) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("attach_clipboard"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (attachClipboard == null ? MemoryAddress.NULL : attachClipboard.toCallback()));
    }
    
    @FunctionalInterface
    public interface DetachClipboardCallback {
        void run(org.gtk.gdk.ContentProvider provider, org.gtk.gdk.Clipboard clipboard);

        @ApiStatus.Internal default void upcall(MemoryAddress provider, MemoryAddress clipboard) {
            run((org.gtk.gdk.ContentProvider) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(provider)), org.gtk.gdk.ContentProvider.fromAddress).marshal(provider, Ownership.NONE), (org.gtk.gdk.Clipboard) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(clipboard)), org.gtk.gdk.Clipboard.fromAddress).marshal(clipboard, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DetachClipboardCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code detach_clipboard}
     * @param detachClipboard The new value of the field {@code detach_clipboard}
     */
    public void setDetachClipboard(DetachClipboardCallback detachClipboard) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("detach_clipboard"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (detachClipboard == null ? MemoryAddress.NULL : detachClipboard.toCallback()));
    }
    
    @FunctionalInterface
    public interface RefFormatsCallback {
        org.gtk.gdk.ContentFormats run(org.gtk.gdk.ContentProvider provider);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress provider) {
            var RESULT = run((org.gtk.gdk.ContentProvider) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(provider)), org.gtk.gdk.ContentProvider.fromAddress).marshal(provider, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(RefFormatsCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code ref_formats}
     * @param refFormats The new value of the field {@code ref_formats}
     */
    public void setRefFormats(RefFormatsCallback refFormats) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("ref_formats"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (refFormats == null ? MemoryAddress.NULL : refFormats.toCallback()));
    }
    
    @FunctionalInterface
    public interface RefStorableFormatsCallback {
        org.gtk.gdk.ContentFormats run(org.gtk.gdk.ContentProvider provider);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress provider) {
            var RESULT = run((org.gtk.gdk.ContentProvider) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(provider)), org.gtk.gdk.ContentProvider.fromAddress).marshal(provider, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(RefStorableFormatsCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code ref_storable_formats}
     * @param refStorableFormats The new value of the field {@code ref_storable_formats}
     */
    public void setRefStorableFormats(RefStorableFormatsCallback refStorableFormats) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("ref_storable_formats"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (refStorableFormats == null ? MemoryAddress.NULL : refStorableFormats.toCallback()));
    }
    
    @FunctionalInterface
    public interface WriteMimeTypeAsyncCallback {
        void run(org.gtk.gdk.ContentProvider provider, java.lang.String mimeType, org.gtk.gio.OutputStream stream, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress provider, MemoryAddress mimeType, MemoryAddress stream, int ioPriority, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gdk.ContentProvider) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(provider)), org.gtk.gdk.ContentProvider.fromAddress).marshal(provider, Ownership.NONE), Marshal.addressToString.marshal(mimeType, null), (org.gtk.gio.OutputStream) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(stream)), org.gtk.gio.OutputStream.fromAddress).marshal(stream, Ownership.NONE), ioPriority, (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(WriteMimeTypeAsyncCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code write_mime_type_async}
     * @param writeMimeTypeAsync The new value of the field {@code write_mime_type_async}
     */
    public void setWriteMimeTypeAsync(WriteMimeTypeAsyncCallback writeMimeTypeAsync) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("write_mime_type_async"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (writeMimeTypeAsync == null ? MemoryAddress.NULL : writeMimeTypeAsync.toCallback()));
    }
    
    @FunctionalInterface
    public interface WriteMimeTypeFinishCallback {
        boolean run(org.gtk.gdk.ContentProvider provider, org.gtk.gio.AsyncResult result);

        @ApiStatus.Internal default int upcall(MemoryAddress provider, MemoryAddress result) {
            var RESULT = run((org.gtk.gdk.ContentProvider) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(provider)), org.gtk.gdk.ContentProvider.fromAddress).marshal(provider, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(result)), org.gtk.gio.AsyncResult.fromAddress).marshal(result, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(WriteMimeTypeFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code write_mime_type_finish}
     * @param writeMimeTypeFinish The new value of the field {@code write_mime_type_finish}
     */
    public void setWriteMimeTypeFinish(WriteMimeTypeFinishCallback writeMimeTypeFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("write_mime_type_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (writeMimeTypeFinish == null ? MemoryAddress.NULL : writeMimeTypeFinish.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetValueCallback {
        boolean run(org.gtk.gdk.ContentProvider provider, org.gtk.gobject.Value value);

        @ApiStatus.Internal default int upcall(MemoryAddress provider, MemoryAddress value) {
            var RESULT = run((org.gtk.gdk.ContentProvider) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(provider)), org.gtk.gdk.ContentProvider.fromAddress).marshal(provider, Ownership.NONE), org.gtk.gobject.Value.fromAddress.marshal(value, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetValueCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_value}
     * @param getValue The new value of the field {@code get_value}
     */
    public void setGetValue(GetValueCallback getValue) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_value"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getValue == null ? MemoryAddress.NULL : getValue.toCallback()));
    }
    
    /**
     * Create a ContentProviderClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected ContentProviderClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, ContentProviderClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new ContentProviderClass(input, ownership);
    
    /**
     * A {@link ContentProviderClass.Builder} object constructs a {@link ContentProviderClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link ContentProviderClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final ContentProviderClass struct;
        
        private Builder() {
            struct = ContentProviderClass.allocate();
        }
        
         /**
         * Finish building the {@link ContentProviderClass} struct.
         * @return A new instance of {@code ContentProviderClass} with the fields 
         *         that were set in the Builder object.
         */
        public ContentProviderClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gtk.gobject.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setContentChanged(ContentChangedCallback contentChanged) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("content_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (contentChanged == null ? MemoryAddress.NULL : contentChanged.toCallback()));
            return this;
        }
        
        public Builder setAttachClipboard(AttachClipboardCallback attachClipboard) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("attach_clipboard"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (attachClipboard == null ? MemoryAddress.NULL : attachClipboard.toCallback()));
            return this;
        }
        
        public Builder setDetachClipboard(DetachClipboardCallback detachClipboard) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("detach_clipboard"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (detachClipboard == null ? MemoryAddress.NULL : detachClipboard.toCallback()));
            return this;
        }
        
        public Builder setRefFormats(RefFormatsCallback refFormats) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("ref_formats"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (refFormats == null ? MemoryAddress.NULL : refFormats.toCallback()));
            return this;
        }
        
        public Builder setRefStorableFormats(RefStorableFormatsCallback refStorableFormats) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("ref_storable_formats"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (refStorableFormats == null ? MemoryAddress.NULL : refStorableFormats.toCallback()));
            return this;
        }
        
        public Builder setWriteMimeTypeAsync(WriteMimeTypeAsyncCallback writeMimeTypeAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("write_mime_type_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (writeMimeTypeAsync == null ? MemoryAddress.NULL : writeMimeTypeAsync.toCallback()));
            return this;
        }
        
        public Builder setWriteMimeTypeFinish(WriteMimeTypeFinishCallback writeMimeTypeFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("write_mime_type_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (writeMimeTypeFinish == null ? MemoryAddress.NULL : writeMimeTypeFinish.toCallback()));
            return this;
        }
        
        public Builder setGetValue(GetValueCallback getValue) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_value"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getValue == null ? MemoryAddress.NULL : getValue.toCallback()));
            return this;
        }
        
        public Builder setPadding(java.lang.foreign.MemoryAddress[] padding) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("padding"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(padding, false)));
            return this;
        }
    }
}
