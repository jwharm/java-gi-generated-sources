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
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        ContentProviderClass newInstance = new ContentProviderClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gobject.ObjectClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gtk.gobject.ObjectClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gtk.gobject.ObjectClass parentClass) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ContentChangedCallback} callback.
     */
    @FunctionalInterface
    public interface ContentChangedCallback {
    
        void run(org.gtk.gdk.ContentProvider provider);
        
        @ApiStatus.Internal default void upcall(MemoryAddress provider) {
            run((org.gtk.gdk.ContentProvider) Interop.register(provider, org.gtk.gdk.ContentProvider.fromAddress).marshal(provider, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ContentChangedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code content_changed}
     * @param contentChanged The new value of the field {@code content_changed}
     */
    public void setContentChanged(ContentChangedCallback contentChanged) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("content_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (contentChanged == null ? MemoryAddress.NULL : contentChanged.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code AttachClipboardCallback} callback.
     */
    @FunctionalInterface
    public interface AttachClipboardCallback {
    
        void run(org.gtk.gdk.ContentProvider provider, org.gtk.gdk.Clipboard clipboard);
        
        @ApiStatus.Internal default void upcall(MemoryAddress provider, MemoryAddress clipboard) {
            run((org.gtk.gdk.ContentProvider) Interop.register(provider, org.gtk.gdk.ContentProvider.fromAddress).marshal(provider, null), (org.gtk.gdk.Clipboard) Interop.register(clipboard, org.gtk.gdk.Clipboard.fromAddress).marshal(clipboard, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), AttachClipboardCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code attach_clipboard}
     * @param attachClipboard The new value of the field {@code attach_clipboard}
     */
    public void setAttachClipboard(AttachClipboardCallback attachClipboard) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("attach_clipboard"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (attachClipboard == null ? MemoryAddress.NULL : attachClipboard.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code DetachClipboardCallback} callback.
     */
    @FunctionalInterface
    public interface DetachClipboardCallback {
    
        void run(org.gtk.gdk.ContentProvider provider, org.gtk.gdk.Clipboard clipboard);
        
        @ApiStatus.Internal default void upcall(MemoryAddress provider, MemoryAddress clipboard) {
            run((org.gtk.gdk.ContentProvider) Interop.register(provider, org.gtk.gdk.ContentProvider.fromAddress).marshal(provider, null), (org.gtk.gdk.Clipboard) Interop.register(clipboard, org.gtk.gdk.Clipboard.fromAddress).marshal(clipboard, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DetachClipboardCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code detach_clipboard}
     * @param detachClipboard The new value of the field {@code detach_clipboard}
     */
    public void setDetachClipboard(DetachClipboardCallback detachClipboard) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("detach_clipboard"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (detachClipboard == null ? MemoryAddress.NULL : detachClipboard.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code RefFormatsCallback} callback.
     */
    @FunctionalInterface
    public interface RefFormatsCallback {
    
        org.gtk.gdk.ContentFormats run(org.gtk.gdk.ContentProvider provider);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress provider) {
            var RESULT = run((org.gtk.gdk.ContentProvider) Interop.register(provider, org.gtk.gdk.ContentProvider.fromAddress).marshal(provider, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), RefFormatsCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code ref_formats}
     * @param refFormats The new value of the field {@code ref_formats}
     */
    public void setRefFormats(RefFormatsCallback refFormats) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("ref_formats"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (refFormats == null ? MemoryAddress.NULL : refFormats.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code RefStorableFormatsCallback} callback.
     */
    @FunctionalInterface
    public interface RefStorableFormatsCallback {
    
        org.gtk.gdk.ContentFormats run(org.gtk.gdk.ContentProvider provider);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress provider) {
            var RESULT = run((org.gtk.gdk.ContentProvider) Interop.register(provider, org.gtk.gdk.ContentProvider.fromAddress).marshal(provider, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), RefStorableFormatsCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code ref_storable_formats}
     * @param refStorableFormats The new value of the field {@code ref_storable_formats}
     */
    public void setRefStorableFormats(RefStorableFormatsCallback refStorableFormats) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("ref_storable_formats"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (refStorableFormats == null ? MemoryAddress.NULL : refStorableFormats.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code WriteMimeTypeAsyncCallback} callback.
     */
    @FunctionalInterface
    public interface WriteMimeTypeAsyncCallback {
    
        void run(org.gtk.gdk.ContentProvider provider, java.lang.String mimeType, org.gtk.gio.OutputStream stream, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);
        
        @ApiStatus.Internal default void upcall(MemoryAddress provider, MemoryAddress mimeType, MemoryAddress stream, int ioPriority, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gtk.gdk.ContentProvider) Interop.register(provider, org.gtk.gdk.ContentProvider.fromAddress).marshal(provider, null), Marshal.addressToString.marshal(mimeType, null), (org.gtk.gio.OutputStream) Interop.register(stream, org.gtk.gio.OutputStream.fromAddress).marshal(stream, null), ioPriority, (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null), null /* Unsupported parameter type */);
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), WriteMimeTypeAsyncCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code write_mime_type_async}
     * @param writeMimeTypeAsync The new value of the field {@code write_mime_type_async}
     */
    public void setWriteMimeTypeAsync(WriteMimeTypeAsyncCallback writeMimeTypeAsync) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("write_mime_type_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (writeMimeTypeAsync == null ? MemoryAddress.NULL : writeMimeTypeAsync.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code WriteMimeTypeFinishCallback} callback.
     */
    @FunctionalInterface
    public interface WriteMimeTypeFinishCallback {
    
        boolean run(org.gtk.gdk.ContentProvider provider, org.gtk.gio.AsyncResult result);
        
        @ApiStatus.Internal default int upcall(MemoryAddress provider, MemoryAddress result) {
            var RESULT = run((org.gtk.gdk.ContentProvider) Interop.register(provider, org.gtk.gdk.ContentProvider.fromAddress).marshal(provider, null), (org.gtk.gio.AsyncResult) Interop.register(result, org.gtk.gio.AsyncResult.fromAddress).marshal(result, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), WriteMimeTypeFinishCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code write_mime_type_finish}
     * @param writeMimeTypeFinish The new value of the field {@code write_mime_type_finish}
     */
    public void setWriteMimeTypeFinish(WriteMimeTypeFinishCallback writeMimeTypeFinish) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("write_mime_type_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (writeMimeTypeFinish == null ? MemoryAddress.NULL : writeMimeTypeFinish.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetValueCallback} callback.
     */
    @FunctionalInterface
    public interface GetValueCallback {
    
        boolean run(org.gtk.gdk.ContentProvider provider, org.gtk.gobject.Value value);
        
        @ApiStatus.Internal default int upcall(MemoryAddress provider, MemoryAddress value) {
            var RESULT = run((org.gtk.gdk.ContentProvider) Interop.register(provider, org.gtk.gdk.ContentProvider.fromAddress).marshal(provider, null), org.gtk.gobject.Value.fromAddress.marshal(value, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetValueCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_value}
     * @param getValue The new value of the field {@code get_value}
     */
    public void setGetValue(GetValueCallback getValue) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_value"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getValue == null ? MemoryAddress.NULL : getValue.toCallback()));
        }
    }
    
    /**
     * Create a ContentProviderClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ContentProviderClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ContentProviderClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ContentProviderClass(input);
    
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
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
                return this;
            }
        }
        
        public Builder setContentChanged(ContentChangedCallback contentChanged) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("content_changed"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (contentChanged == null ? MemoryAddress.NULL : contentChanged.toCallback()));
                return this;
            }
        }
        
        public Builder setAttachClipboard(AttachClipboardCallback attachClipboard) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("attach_clipboard"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (attachClipboard == null ? MemoryAddress.NULL : attachClipboard.toCallback()));
                return this;
            }
        }
        
        public Builder setDetachClipboard(DetachClipboardCallback detachClipboard) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("detach_clipboard"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (detachClipboard == null ? MemoryAddress.NULL : detachClipboard.toCallback()));
                return this;
            }
        }
        
        public Builder setRefFormats(RefFormatsCallback refFormats) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("ref_formats"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (refFormats == null ? MemoryAddress.NULL : refFormats.toCallback()));
                return this;
            }
        }
        
        public Builder setRefStorableFormats(RefStorableFormatsCallback refStorableFormats) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("ref_storable_formats"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (refStorableFormats == null ? MemoryAddress.NULL : refStorableFormats.toCallback()));
                return this;
            }
        }
        
        public Builder setWriteMimeTypeAsync(WriteMimeTypeAsyncCallback writeMimeTypeAsync) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("write_mime_type_async"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (writeMimeTypeAsync == null ? MemoryAddress.NULL : writeMimeTypeAsync.toCallback()));
                return this;
            }
        }
        
        public Builder setWriteMimeTypeFinish(WriteMimeTypeFinishCallback writeMimeTypeFinish) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("write_mime_type_finish"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (writeMimeTypeFinish == null ? MemoryAddress.NULL : writeMimeTypeFinish.toCallback()));
                return this;
            }
        }
        
        public Builder setGetValue(GetValueCallback getValue) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_value"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getValue == null ? MemoryAddress.NULL : getValue.toCallback()));
                return this;
            }
        }
        
        public Builder setPadding(java.lang.foreign.MemoryAddress[] padding) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("padding"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(padding, false, SCOPE)));
                return this;
            }
        }
    }
}
